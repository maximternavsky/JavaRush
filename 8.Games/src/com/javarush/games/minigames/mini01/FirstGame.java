package com.javarush.games.minigames.mini01;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Collections;


public class FirstGame extends Game{

    @Override
    public void initialize() {
        setScreenSize(8, 3);
        String s = "JAVARUSH";
        var d = s.toCharArray();
        ArrayList<Color> arr = new ArrayList<>();
        Collections.addAll(arr, Color.AQUA, Color.ALICEBLUE);
        for(int i=0; i < d.length; i++) {
            for (int j = 0; j < 5; j++) {
                
            }
            setCellValueEx(i, 1, Color.ORANGE, String.valueOf(s.charAt(i)));
        }
    }
}