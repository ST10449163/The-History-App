package com.example.the_history_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Famous people used for this program:
        //Nelson mandela(95), Betty White(99),Heath Ledger(28), John F. Kennedy(46), Amy Whinehouse(27), Abraham Lincon(56), Theodore Roosevelt(60), Kobe Bryant(41),
        //Chita Rivera(91), Æthelstan(45).

        //Declaring variables

        val theAge = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.button)
        val clears = findViewById<Button>(R.id.button2)
        val topic = findViewById<TextView>(R.id.textView2)

        //doing the Generative Calculations

        button?.setOnClickListener {
            val age = theAge.text.toString().toInt()



            if (age == 95) {
                topic.text = "Nelson Mandela was 95 and president of South Africa "
            } else if (age == 99) {
                topic.text =
                    "Betty White was a famous actress and is most famous for her role in Golden Girls"
            } else if (age == 28) {
                topic.text = "Heath Ledger was a famous Australian actor and died in 2008 "
            } else if (age == 46) {
                topic.text =
                    "John F. Kennedy was 35th president of Untied States and was assassinated in 1963"
            } else if (age == 27) {
                topic.text =
                    "Amy Whinhouse was a popular british singer and died in 2011 of a drug overdose "
            } else if (age == 56) {
                topic.text =
                    "Abraham Lincoln was the 16th president of the United States and was assassinated on 16th April 1865"
            } else if (age == 60) {
                topic.text =
                    "Theodore Roosevelt was the 26th president of United States from 1901-1909 "
            } else if (age == 41) {
                topic.text =
                    "Kobe Bryant was a professional basketball player and died in 2020 in a helicopter crash  "
            } else if (age == 91) {
                topic.text =
                    "Chita Rivera was a famous american actress and died in 2024 at the age of 91"
            } else if (age == 45) {
                topic.text = "Æthelstan was the first king of Enfland and ruled from 924AD-927AD "
            }
            //Invalid age
            else {
                topic.text = "The age you put in does not match anyone in our database "
            }

            if(age >= 1 && age <= 20){
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