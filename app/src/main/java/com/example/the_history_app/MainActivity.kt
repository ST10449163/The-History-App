package com.example.the_history_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.the_history_app.R.id.editTextText2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Famous people used for this program:
        //Joyce Randolph(99), Cleopatra(39),Heath Ledger(28),Naya Rivera (33), Alexander the Great(32),
        //Chadwick Boseman (43), Theodore Roosevelt(60), Kobe Bryant(41),
        //Chita Rivera(91), Æthelstan(45).

        //Declaring variables used for the program

        val theAge = findViewById<EditText>(editTextText2)
        val button = findViewById<Button>(R.id.button)  //Finding "ViewById" linked the name that you gave the strings to a new name or variable so that they can be used in the program.
        val clears = findViewById<Button>(R.id.button2)
        val topic = findViewById<TextView>(R.id.textView2)


        //doing the calculations for the program that will allow the program to do its purpose
            button?.setOnClickListener {
                val age = theAge.text.toString().toInt() //This line of code converts "theAge" variable from a string to a Integer since the program is about entering whole numbers or ages
                

                if (age == 99 ) {         //Using 'if' statements allow the certain conditions to be met in order to display the right output
                    topic.text = "You are 99 years old,Joyce Randolph was a famous actress and died in 2024 at age 99." //These are the outputs that will be displayed in the "textview" section of the program when an age(input) is given
                } else
                    if (age == 39) {
                        topic.text = "You are 39 years old,Cleopatra was the last Queen of Ancient Egypt before its fall,she reigned from 51 to 30 BC."
                    } else
                        if (age == 28) {
                            topic.text = "You are 28 years old,Heath Ledger was a famous Australian actor and died in 2008."
                        } else
                            if (age == 43 ) {
                                topic.text = "You are 43 years old,Chadwick Bose was famous for playing the lead in Black Panther."
                            } else
                                if (age == 32) {
                                    topic.text = "You are 32 years old,Alexander the great was king of the ancient kingdom of Macedon."
                                } else
                                    if (age == 33) {
                                        topic.text = "You are 33 years old, Naya Rivera was famous for her role in the show Glee."
                                    } else
                                        if (age == 60) {
                                            topic.text = "You are 60 years old,Theodore Roosevelt was the 26th president of United States from 1901-1909."
                                        } else
                                            if (age == 41) {
                                                topic.text = "You are 41 years old,Kobe Bryant was a professional basketball player and died in 2020 in a helicopter crash."
                                            } else
                                                if (age == 91) {
                                                    topic.text = "You are 91 years old Chita Rivera was a famous american actress and died in 2024."
                                                } else
                                                    if (age == 45) {
                                                        topic.text = "You are 45 years old,Æthelstan was the first king of England and ruled from 924AD-927AD."
                                                    }
                                                    //Invalid age
                                                    else { //The else statement is used in this program to give the message below if a age is given and it doesn't match anyone in the database.
                                                        topic.text = "The age you put in does not match anyone in our database."
                                                    }


                //This is a range if statement. When a whole number is given within this range it will output the message below. This is due to the rules of the assignment.
                if (age >= 1 && age <= 20) {
                    topic.text = "You can only enter ages between 20 and 100 Please try again."
                }


                //If the user enters any whole number above 100
                if (age > 100) {
                    topic.text = "Only enter whole numbers between 20 and 100 years old."//The ".text. allows the message to be displayed in the textview

                }


                //Clears theAge(editable text) and topic(textview) when button is pressed
                clears?.setOnClickListener {
                    topic.text = ""
                    theAge.setText("")
                }

                }


            }
        }

