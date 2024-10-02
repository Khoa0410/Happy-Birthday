// Nguyễn Đức Khoa - 20215599
package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Load the XML layout file (activity_main.xml)
        setContentView(R.layout.activity_main)
    }
}
