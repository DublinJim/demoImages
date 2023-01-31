package com.example.demoimages;
import java.awt.GraphicsEnvironment;
public class GetAllFonts {

    public void getList() {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String font : fonts) {
            System.out.println(font);

        }
        int noFonts = fonts.length;
        System.out.println("---------------------------------------");
        System.out.println("Total of "+noFonts+" fonts available,");
        System.out.println("---------------------------------------");
    }
}
