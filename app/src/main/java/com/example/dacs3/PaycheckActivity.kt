package com.example.dacs3

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter

class PaycheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paycheck)

        val content = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
        try {
            val bitMatrix = QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, 512, 512)
            val bmp = Bitmap.createBitmap(512,512,Bitmap.Config.RGB_565)
            for(i in 0 until  512){
                for(j in 0 until 512){
                    bmp.setPixel(i,j,if (bitMatrix[i, j]) Color.BLACK else Color.WHITE)
                }
            }

            findViewById<ImageView>(R.id.qrHolder).setImageBitmap(bmp)
        }catch (e : Exception){}

        val actionBar : ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            androidx.appcompat.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }

}