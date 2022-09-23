package com.example.madpractical2_20012021013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "onCreate: function called")
        Toast.makeText(this, "onCreate: function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"_", Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: function called")
        Toast.makeText(this, "onStart: function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart: function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart:OnRestart method is called ")
        Toast.makeText(this,"OnRestart:OnRestart method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            mycl,
            "onRestart:OnRestart method is called ",

            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume:onResume method is called ")
        Toast.makeText(this,"onResume:onResume method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            mycl,
            "onResume:onResume method is called ",

            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy:onDestroy method is called ")
        Toast.makeText(this,"onDestroy:onDestroy method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            mycl,
            "onDestroy:onDestroy method is called ",
            Snackbar.LENGTH_SHORT
        ).show()
    }

}