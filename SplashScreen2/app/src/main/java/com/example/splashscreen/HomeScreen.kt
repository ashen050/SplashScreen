package com.example.splashscreen
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreen : AppCompatActivity(){
    private lateinit var pizzaButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       pizzaButton = findViewById(R.id.button)
       spanishButton = findViewById(R.id.button2)
        germanButton = findViewById(R.id.button3)
        frenchButton = findViewById(R.id.button4)
        tamilButton = findViewById(R.id.button5)

        pizzaButton.setOnClickListener{
            var intent = Intent (this,HomeScreenItalian::class.java)
            startActivity(intent)
            finish()
        }

    spanishButton.setOnClickListener{
        text.setText(R.string.hello_world_spanish)

    }


        germanButton.setOnClickListener{
            text.setText(R.string.hello_world_german)

        }


        frenchButton.setOnClickListener{
            text.setText(R.string.hello_world_french)

        }


        tamilButton.setOnClickListener{
            text.setText(R.string.hello_world_tamil)

        }

    }
}