package com.example.tatunori.firstapp;

import android.util.Log;

public class Cat {
    String name;
    int age;
    String gender;
    String breed;

    Cat(String name,int age,String gender,String breed){
        this.name = name;
        this.age = age;
        this.gender= gender;
        this.breed = breed;
    }
    void say(String message){
        Log.d("Cat",this.name + " 「" + message + "」");
    }
    void sleep(){
        if(age<2){
            say("zzz");
        }else {
            say("ZZZ");
        }
    }
    void greet(){
        say(name + "の性別は" + gender + "で年齢は" + age +"才で、品種は、" + breed + "だにゃ");
    }
    void talkabout(Cat cat){
        if(cat.age>this.age){
            say("年上の猫なのだにゃ");
        }else{
            say("僕の方が年がうえだびゃ");
        }

    }
}
