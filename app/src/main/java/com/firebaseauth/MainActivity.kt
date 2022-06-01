package com.firebaseauth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firebaseauth.Extensions.toast
import com.firebaseauth.firebaseauthUtils.firebaseAuth
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_main.*

private var mFirebaseAnalytics: FirebaseAnalytics? = null
class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
            btnSignOut.setOnClickListener {
                firebaseAuth.signOut()
                startActivity(Intent(this, activity_register::class.java))
                toast("signed out")
                finish()
            }


        }


    }