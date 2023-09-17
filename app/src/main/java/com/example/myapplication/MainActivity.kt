package com.example.myapplication

import android.os.Bundle

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registrationButton = findViewById<Button>(R.id.registrationButton);
        val registrationEmail = findViewById<TextView>(R.id .registrationEmail);
        val registrationPassword = findViewById<TextView>(R.id .registrationPassword);

        var registrationEmailArray: Array<String> = resources.getStringArray(R.array.email);
        var registrationPasswordArray: Array<String> = resources.getStringArray(R.array.password);

        registrationButton.setOnClickListener{
            for ( i in 0..4) {
                if ( !registrationEmail.text.toString().isEmpty() && !registrationPassword.text.toString().isEmpty() && registrationEmailArray[i] == registrationEmail.text.toString() && registrationPasswordArray[i] == registrationPassword.text.toString()) {
                    val intent = Intent(this, SecondActivity::class.java);
                    startActivity(intent);
                    break;
                }
                else {
                    registrationEmail.setTextColor(Color.parseColor("#ff0000"));
                    registrationPassword.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        }
    }
}