package com.android.abhishek.jokesjavalibrary;

import java.util.Random;

public class MyJokes {

    private String[] myJokes = new String[] {
            "Q. Who is a programmer?\n" + "Ans - A machine that turns coffee into code",
            "Q. What is algorithm?\n" + "Ans - Word used by programmers when they do not want to explain what they did",
            "Q. What is hardware?\n" + "Ans - The part of a computer that you can kick",
            "Q. What is the object oriented way to get wealthy?\n" + "Ans - Inheritance",
            "Q. Why did the programmer quit his job?\n" + "Ans - Because he did'nt get arrays"
    };

    public String getMyJoke(){
        Random random = new Random();
        return myJokes[random.nextInt(myJokes.length)];   
    }
}
