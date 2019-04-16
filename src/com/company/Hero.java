package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on 15.04.2019.
 */
public class Hero {
    public int x = 100;
    public int y = 200;
    public int speed = 20;
    public Image img = new ImageIcon("res/car2.png").getImage();
    public void upDate(){

    }
    public void paint (Graphics graphics){
        graphics.drawImage(img,x,y,img.getWidth(null)/2,img.getHeight(null)/2,null);

    }
}
