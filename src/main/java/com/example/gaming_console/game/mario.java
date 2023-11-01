package com.example.gaming_console.game;

import com.example.gaming_console.gamingconsole;

public class mario implements gamingconsole {
    public void up(){
        System.out.println("JUMP");
    }


    public void down(){
        System.out.println("Duck");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("shoot");
    }
}
