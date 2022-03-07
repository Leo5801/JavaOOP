package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.talk();

        Cat cat2 = new Cat(5,"Vaska");
        cat2.talk();

        Cat cat3 = new Cat(8,"Murzik");
        cat3.talk();

        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();

       Log.i("count " , "" + Cat.count);

       Cat.CountResetter countResetter = new Cat.CountResetter();

        Log.i("count " , "" + Cat.count);


    }
}