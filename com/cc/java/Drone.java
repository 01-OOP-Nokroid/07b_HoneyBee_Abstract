package com.cc.java;

public class Drone extends HoneyBee{

    public String doYourJob(){
        return "I'm a drone, I'm going to date our Queen!";
    }

    @Override
    public String fly() // Rechstklick > Quelleaktion > Override
    {
        return "I can fly at 12mph!";
    }

    

}
