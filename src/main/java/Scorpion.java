//package main.java;

import java.io.FileWriter;
import java.net.URL;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Scorpion extends Creature{
    public Scorpion(int x, int y, Field field) {
        super(x, y, field);
        blood = 4;
        direction = Direction.LEFT;
        URL loc = this.getClass().getClassLoader().getResource("蝎子.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
        loc = this.getClass().getClassLoader().getResource("die.png");
        iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setDieImage(image);
    }
    public void  writedown()
    {
        try {
            this.field.fw.write(3+" ");
            super.writedown();
            this.field.fw.write("\n");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    		
    }
    public void printdie() {
    		super.printdie(3);
    }
}
