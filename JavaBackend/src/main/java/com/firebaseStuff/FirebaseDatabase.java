package com.firebaseStuff;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.Food;
import com.Inventory;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import javax.annotation.Nullable;



/**
 * FirebaseDatabase is the database class that will communicate with the frontend.
 * As a singleton class, you must instantiate it like so:
 * <p>
 * {@code FirebaseDatabase fbdb = FirebaseDatabase.fbdbGetInstance();}
 * </p>
 * @author Ollie
 */
public class FirebaseDatabase {

    //this is the singleton root and the firestore database
    private static FirebaseDatabase fbdb = null;
    private static Firestore db;
    private Map<String, Object> docData = new HashMap<>();
    //------------------------------------------------------------------------
    /**
     * This initialises the connection to the database
     * @author Ollie
    */
    private FirebaseDatabase() {
        System.out.println("Database: INIT");
            try {
                FileInputStream serviceAccount =
                    new FileInputStream("ServiceAccountKey.json");
                
                FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

                FirebaseApp app = FirebaseApp.initializeApp(options);
                db = com.google.firebase.cloud.FirestoreClient
                    .getFirestore(app);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }
    //------------------------------------------------------------------------
    /**
     * This initialises the connection to the database
     * @author Ollie
     * @return fdbd (singleton instantiation of {@code FirebaseDatabase})
    */
    public static FirebaseDatabase fbdbGetInstance() {
        if (fbdb == null)
            fbdb = new FirebaseDatabase();
        return fbdb;
    }
    //------------------------------------------------------------------------
    /**
     * This adds/updates an item in the database
     * @author Ollie
     * @param collection the collection in the database (e.g "user")
     * @param id the ID of the document in the database
     * @param object the object that's being transferred to the database
    */
    public void setItems(String collection, String id, Object object) {
        try {
            ApiFuture<WriteResult> collectionsApiFuture =
                db.collection(collection).document(id).set(object);
            System.out.println("Set "+id+
                " from "+collection+" at "+
                collectionsApiFuture.get().getUpdateTime().toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------------------
    /**
     * This deletes an item from the database
     * @author Ollie
     * @param collection the collection in the database (e.g "user")
     * @param id the ID of the document in the database
    */
    public void deleteItems(String collection, String id) {
        try {
            ApiFuture<WriteResult> collectionsApiFuture =
                db.collection(collection).document(id).delete();
            System.out.println("Deleted "+id+
                " from "+collection+" at "+
                collectionsApiFuture.get().getUpdateTime().toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------------------
    /**
     * This gets an item from the database. With the returned value, you 
     * will need to use the following line of code to get the new class:
     * <p>
     * {@code RandomClass randomObject = document.toObject(RandomClass.class);}
     * </p>
     * @author Ollie
     * @param collection the collection in the database (e.g "user")
     * @param id the ID of the document in the database
     * @param object the object that's being transferred to the database
    */
    public DocumentSnapshot getItems(String collection, String id) {
        try {
            ApiFuture<DocumentSnapshot> collectionsApiFuture =
                db.collection(collection).document(id).get();            
            System.out.println("Got "+id+
                " from "+collection+" at "+
                collectionsApiFuture.get().getUpdateTime().toString());
            DocumentSnapshot document = collectionsApiFuture.get();
            if (document.exists()) {
                return document;
            } else {
                System.out.println("No such document!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }  
        return null;
    }

    public void eventTrigger() throws InterruptedException{
        db.collection("communications")
            .whereEqualTo("start", true)
            .addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot snapshots,
                                @Nullable FirestoreException e) {
                if (e != null) {
                    System.err.println("Listen failed:" + e);
                    return;
                }

                for (DocumentSnapshot doc : snapshots.getDocuments()) {
                    if (doc.getId() != null) {
                        System.out.println("Current comms happening: " + doc.getId());
                        Inventory inventory;
                        try {
                            inventory = Inventory.getInstance();
                            inventory.setCurrentTask(doc.getId());
                            break;
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
            });
    }

    public void addToResponse(String field, Object item) {
        this.docData.put(field, item);
    }

    public void sendResponse() {
        ApiFuture<WriteResult> future = db.collection("communications").document("response").set(this.docData);
        try {
            System.out.println("Sent "+this.docData+" response to backend at " + future.get().getUpdateTime());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        this.docData = new HashMap<>();
    }

    public void updateStartFalse(String doc) {
        DocumentReference docRef = db.collection("communications").document(doc);
        docRef.update("start", false);
    }

    public String findEmployeeEmail(String username) {
        Query query = db.collection("employees").whereEqualTo("userName", username);
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        try {
            for(DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                return document.getString("email");
              }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void downloadFoodData(){
        ApiFuture<QuerySnapshot> future = db.collection("food").get();
        List<QueryDocumentSnapshot> documents;
        try {
            documents = future.get().getDocuments();
            Inventory inventory = Inventory.getInstance();
            for (QueryDocumentSnapshot document : documents) {
                inventory.addNewFood(document.toObject(Food.class));
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}   