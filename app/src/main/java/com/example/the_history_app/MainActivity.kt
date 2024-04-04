package com.example.the_history_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.the_history_app.R.id.editTextText2
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Famous people used for this program:
        //Nelson mandela(95), Betty White(99),Heath Ledger(28), John F. Kennedy(46), Amy Whinehouse(27),
        // Abraham Lincon(56), Theodore Roosevelt(60), Kobe Bryant(41),
        //Chita Rivera(91), Æthelstan(45).

        //Declaring variables

        val theAge = findViewById<EditText>(editTextText2)
        val button = findViewById<Button>(R.id.button)
        val clears = findViewById<Button>(R.id.button2)
        val topic = findViewById<TextView>(R.id.textView2)

        //doing the Generative Calculations
            button?.setOnClickListener {
                val age = theAge.text.toString().toInt()

                if (age == 95) {
                    topic.text =
                        "You are 95 years old ,Nelson Mandela was and president of South Africa "
                } else
                    if (age == 99) {
                        topic.text =
                            "You are 99 years old , Betty White was a famous American actress"
                    } else
                        if (age == 28) {
                            topic.text =
                                "You are 28 years old ,Heath Ledger was a famous Australian actor and died in 2008 "
                        } else
                            if (age == 46) {
                                topic.text =
                                    "You are 46 years old ,John F. Kennedy was 35th president of Untied States and was assassinated in 1963"
                            } else
                                if (age == 27) {
                                    topic.text =
                                        "You are 27 years old ,Amy Whinhouse was a popular british singer and died in 2011 of a drug overdose "
                                } else
                                    if (age == 56) {
                                        topic.text =
                                            "You are 56 years old ,Abraham Lincoln was the 16th president of the United States and was assassinated on 16th April 1865"
                                    } else
                                        if (age == 60) {
                                            topic.text =
                                                "You are 60 years old ,Theodore Roosevelt was the 26th president of United States from 1901-1909 "
                                        } else
                                            if (age == 41) {
                                                topic.text =
                                                    "You are 41 years old ,Kobe Bryant was a professional basketball player and died in 2020 in a helicopter crash  "
                                            } else
                                                if (age == 91) {
                                                    topic.text =
                                                        "You are 91 years old Chita Rivera was a famous american actress and died in 2024 "
                                                } else
                                                    if (age == 45) {
                                                        topic.text =
                                                            "You are 45 years old ,Æthelstan was the first king of England and ruled from 924AD-927AD "
                                                    }
                                                    //Invalid age
                                                    else {
                                                        topic.text =
                                                            "The age you put in does not match anyone in our database "
                                                    }


                if (age >= 1 && age <= 20) {
                    topic.text = "You can only enter ages between 20 and 100 Please try again"
                }


                //invalid age anything over 100
                if (age > 100) {
                    topic.text = "Only enter ages between 20 and 100 years old "

                }


                //Clears theAge(editabletext) and topic(textview) when button is pressed
                clears?.setOnClickListener {
                    topic.text = ""
                    theAge.setText("")
                }


            }
        }
    }
