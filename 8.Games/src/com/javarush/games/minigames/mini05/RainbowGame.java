package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;
import java.util.ArrayList;
import java.util.Collections;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

   @Override
    public void initialize() {
        setScreenSize(10, 7); 
        
        ArrayList<Color> arr = new ArrayList<>();
            Collections.addAll(arr, Color.RED,
                                    Color.ORANGE,
                                    Color.YELLOW,
                                    Color.GREEN,
                                    Color.BLUE,
                                    Color.INDIGO,
                                    Color.VIOLET);
        
        for(int i=0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                setCellColor(j,i,arr.get(i));
            }
        }
    }
}
