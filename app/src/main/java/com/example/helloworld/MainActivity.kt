package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show the layout file activity_main
        setContentView(R.layout.activity_main)
        // Declaring title variable here, so that it can be used for both listeners, because of  the scope
        var title = findViewById<TextView>(R.id.textView);
        // Change Background Color Button
        var bgColorBtn = findViewById<Button>(R.id.bgColorBtn);
        // Change the text of the title button
        var bgTextEdit = findViewById<Button>(R.id.bgTextEdit);
        // The background itself
        var background_field = findViewById<ConstraintLayout>(R.id.backgroundView);
        // Input Field
        var textEdit = findViewById<EditText>(R.id.et_simple);

        // Similar to document.queryselector.on("click", callback())
        findViewById<Button>(R.id.button).setOnClickListener {
             // Handle button tap
             // 2. Change color of the text
            Log.i("Shokrhukh", "Tapped on button");
            // 1. Get a reference to the textView (by ID and tagName)
            // 2. Set the color of the label
            var title = findViewById<TextView>(R.id.textView);
            title.setTextColor(resources.getColor(R.color.black))

        }
        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout
        // 2. Set a logic to know when user has tapped the button
            // 2. Change the color of the label

        // Bonus Features
        // 1. A button that changes background color
        bgColorBtn.setOnClickListener {
            background_field.setBackgroundColor(resources.getColor((R.color.lightBlue)));
        }

        background_field.setOnClickListener {
            background_field.setBackgroundColor(resources.getColor((androidx.cardview.R.color.cardview_dark_background)));
            title.setTextColor(resources.getColor(R.color.white))

        }

        bgTextEdit.setOnClickListener {
            var strValue = textEdit.text.toString();
            title.text = strValue;
        }

       // background_field.setOnClickListener {

      //  }


    }
}
