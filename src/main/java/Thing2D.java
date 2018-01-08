//package main.java;

import java.awt.Image;
import java.io.FileWriter;

public class Thing2D {

    private final int SPACE = 20;

    private int x;
    private int y;
    private Image image;
    private Image dieImage;
    
    public Thing2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image img) {
        image = img;
    }
    
    public void setDieImage(Image img)
    {
        dieImage = img;
    }
    
    public Image getDieImage() { 
		return this.dieImage;
	}
    
    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void writedown(FileWriter fw)
    {
        try {
            fw.write(x+" ");
            fw.write(y+" ");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public boolean samePlace(Thing2D t2)
    {
        if((this.x==t2.x)&&(this.y==t2.y))
            return true;
        else
            return false;
    }
    public boolean ishit(Thing2D t2)
    {
        if((this.x-t2.x)>=-100&&(this.x-t2.x)<=100&&(this.y-t2.y)>=-100&&(this.y-t2.y)<=100)
            return true;
        else
            return false;
    }
} 