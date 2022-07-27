package com.cc.java;

import com.cc.java.birds.*;
import com.cc.java.bees.*;

public class App {
    
    public static void main(String[] args) {
     
        Worker worker = new Worker();
        Queen queen = new Queen();
        Drone drone = new Drone();
        
        Bird bird = new Bird();

        output("-----  Bees  -----");
        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());
        
        output("-----  Bird(s)  -----");
        output(bird.hasFeathers());


        output("-----  Birds & Bees  -----");
        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(bird.fly());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

