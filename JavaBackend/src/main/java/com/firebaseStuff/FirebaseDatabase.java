package com.firebaseStuff;

import java.io.FileInputStream;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


//This is the database object that will communicate with the frontend
/**
 * @author Ollie
 */
public class FirebaseDatabase {

    //this is the real-time database we'll access
    Firestore db;
    //------------------------------------------------------------------------
    /**
    This initialises the connection to the database
    */
    public FirebaseDatabase() {
        System.out.println("Database: INIT");
        try {
            FileInputStream serviceAccount =
                new FileInputStream("ServiceAccountKey.json");
            
            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

            FirebaseApp app = FirebaseApp.initializeApp(options);
            this.db = com.google.firebase.cloud.FirestoreClient
                .getFirestore(app);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------------------
    /**
     * This adds/updates an item in the database
     * @param collection the collection in the database (e.g "user")
     * @param id the ID of the document in the database
     * @param object the object appending
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
}   