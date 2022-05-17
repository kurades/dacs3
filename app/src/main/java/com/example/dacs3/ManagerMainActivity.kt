package com.example.dacs3

import android.app.SearchManager
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.Switch
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.zxing.integration.android.IntentIntegrator

class ManagerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigatin_view1)
        val navController = findNavController(R.id.nav_fragment1)
        bottomNavigationView.setupWithNavController(navController)

//        val layout : RelativeLayout = findViewById(R.id.topNav)
//        LayoutInflater.from(this).inflate(R.layout.top_navbar,layout,true)
//
//        val qrButton:FloatingActionButton = findViewById(R.id.fab)
//        qrButton.setOnClickListener {
//            val intentIntegrator = IntentIntegrator(this)
//            intentIntegrator.setDesiredBarcodeFormats(listOf(IntentIntegrator.QR_CODE))
//            intentIntegrator.initiateScan()
//        }

    }




}