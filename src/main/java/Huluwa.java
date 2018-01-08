//package main.java;

import java.awt.Image;
import java.io.FileWriter;
import java.net.URL;
import javax.swing.ImageIcon;
public class Huluwa extends Creature {
    int no;
    public Huluwa(int x, int y, Field field,int n)
    {
        super(x,y,field);
        no=n;
        URL loc;
        URL dieloc;
        blood = 500;
        direction = Direction.RIGHT;
        switch (no)
        {
            case 1:loc = this.getClass().getClassLoader().getResource("红娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 2:loc = this.getClass().getClassLoader().getResource("橙娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 3:loc = this.getClass().getClassLoader().getResource("黄娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 4:loc = this.getClass().getClassLoader().getResource("绿娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 5:loc = this.getClass().getClassLoader().getResource("蓝娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 6:loc = this.getClass().getClassLoader().getResource("靛娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            case 7:loc = this.getClass().getClassLoader().getResource("紫娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");break;
            default:loc = this.getClass().getClassLoader().getResource("红娃.png");
                dieloc = this.getClass().getClassLoader().getResource("die.png");
        }
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
        iia = new ImageIcon(dieloc);
        image = iia.getImage();
        this.setDieImage(image);
    }
    public void  writedown()
    {
        try {
            this.field.fw.write(0+" ");
            this.field.fw.write(no+" ");
            super.writedown();
            this.field.fw.write("\n");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void printdie() {
    		super.printdie(0,no);
    }
}
