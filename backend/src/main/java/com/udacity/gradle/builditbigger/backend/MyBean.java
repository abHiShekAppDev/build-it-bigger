package com.udacity.gradle.builditbigger.backend;


import com.android.abhishek.jokesjavalibrary.MyJokes;

public class MyBean {

    private MyJokes myJoke;

    public MyBean(){
        myJoke = new MyJokes();
    }

    public String getData() {
        return myJoke.getMyJoke();
    }
}
