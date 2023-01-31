package com.example.demoimages;

import java.awt.*;
import java.util.ArrayList;

public class GetAllFonts {
    private ArrayList<String> fontArray = new ArrayList<>();



    public void getList() {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String font : fonts) {
            System.out.println(font);
            fontArray.add(font);
        }
        int noFonts = fonts.length;
        System.out.println("---------------------------------------");
        System.out.println("| Total of " + noFonts + " fonts available        |");
        System.out.println("---------------------------------------");
    }
    public ArrayList<String> getFontArray() {
        return fontArray;
    }

}
