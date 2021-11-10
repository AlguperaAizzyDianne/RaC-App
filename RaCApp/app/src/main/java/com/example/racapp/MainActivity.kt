package com.example.racapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var capture:Button=findViewById(R.id.bt_capture)

        capture.setOnClickListener {
            val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            filePhoto = getPhotoFile(FILE_NAME)
            val providerFile =FileProvider.getUriForFile(this,"com.example.androidcamera.fileprovider", filePhoto)
            takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, providerFile)
        }
    }

}