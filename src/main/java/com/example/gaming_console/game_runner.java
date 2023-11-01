package com.example.gaming_console;

import com.example.gaming_console.game.*;

public class game_runner {
    private gamingconsole game;
    public game_runner(gamingconsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
