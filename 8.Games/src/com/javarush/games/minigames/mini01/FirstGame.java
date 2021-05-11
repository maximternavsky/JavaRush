package com.javarush.games.minigames.mini01;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;


public class FirstGame extends Game{

    @Override
    public void initialize() {
        setScreenSize(8, 3);
        String s = "JAVARUSH";
        var d = s.toCharArray();

        for(int i=0; i < d.length; i++) {
            setCellValueEx(i, 1, Color.ORANGE, String.valueOf(s.charAt(i)));
        }
    }
}