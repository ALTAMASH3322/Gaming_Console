package com.example.gaming_console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.gaming_console.game.*;

@SpringBootApplication
public class GamingConsoleApplication {

    public static void main(String[] args) {

       // var game = new super_contra();
        var game = new mario();
        var gamerunner = new game_runner(game);
        gamerunner.run();

    }

}
