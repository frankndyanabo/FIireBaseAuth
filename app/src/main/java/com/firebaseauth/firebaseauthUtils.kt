package com.firebaseauth

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object firebaseauthUtils {
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser

}