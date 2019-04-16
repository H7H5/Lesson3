package com.company;

import javax.swing.*;                //подключаем библиотеку
import java.awt.*;                   //подключаем библиотеку
import java.awt.event.ActionEvent;   //подключаем библиотеку
import java.awt.event.ActionListener;//подключаем библиотеку
import java.awt.event.KeyAdapter;    //подключаем библиотеку
import java.awt.event.KeyEvent;      //подключаем библиотеку

/**
 * Created by admin on 15.03.2019.//коментарий
 */
public class Space  extends JPanel implements ActionListener {//обявляем класс Space насленик JPanel
    public int roadX = 0;
    public int roadX1 = 1280;
    public Image img = new ImageIcon("res/road2.png").getImage();
    public Hero hero = new Hero();
    public Luke luke = new Luke();
    // который должен реализовать методы из ActionListener
    Timer t = new Timer(20,this);//создаем обект Timer
    public Space(){ // конструктор который создает обект  Space
        t.start();//запускаем таймер
        addKeyListener(new MyKeyAdapter());// создаем об'ект типа MyKeyAdapter
        setFocusable(true); // устанавливаем фокус окна
    }
    private class MyKeyAdapter extends KeyAdapter { // встроеный класс MyKeyAdapter для работы с кнопками
        public void keyPressed(KeyEvent e){//событие на нажатие кнопки

        }
        public void keyReleased(KeyEvent e){//событие на отжатие кнопки

        }
    }
    public void upDate(){
        roadX = roadX - hero.speed;
        roadX1 = roadX1 -hero.speed;
        if(roadX1<=0){
            roadX = 0;
            roadX1 = 1280;
        }
        luke.upDate(hero.speed);
    }
    public void paint (Graphics graphics){//здесь рисуем
        graphics.drawImage(img,roadX,0,img.getWidth(null),500,null);
        graphics.drawImage(img,roadX1,0,img.getWidth(null),500,null);
        luke.paint(graphics);
        hero.paint(graphics);
        //graphics.drawLine(0,70,1200,70);
        //graphics.drawLine(0,450,1200,450);



    }
    @Override
    public void actionPerformed(ActionEvent e) {//этот метод будет работать по таймеру
        upDate();
        repaint();
    }
}
