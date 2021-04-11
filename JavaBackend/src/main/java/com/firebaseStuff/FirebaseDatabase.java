package com.firebaseStuff;

import java.io.FileInputStream;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import com.User;

public class FirebaseDatabase {

    Firestore db;

    public void initialize() {
        System.out.println("INIT");
        try {
            FileInputStream serviceAccount =
                new FileInputStream("ServiceAccountKey.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

            FirebaseApp app = FirebaseApp.initializeApp(options);
            this.db = com.google.firebase.cloud.FirestoreClient.getFirestore(app);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setItems(Object object, String name, String collection) {
        try {
            ApiFuture<WriteResult> collectionsApiFuture = db.collection(collection).document(name).set(object);
            System.out.println(collectionsApiFuture.get().getUpdateTime().toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}