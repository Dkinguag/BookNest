package com.booknest.app;

import android.app.Application;
import com.google.firebase.FirebaseApp;

public class BookNestApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}

