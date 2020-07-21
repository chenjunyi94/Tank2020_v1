package com.chenjunyi.demo;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.chenjunyi.demo.Tank.SPEED;

//继承frame，内部类：class的内部,内部类:原则：高内聚，低耦合
public class TankFrame extends Frame {
    Tank myTank;
    public TankFrame(){
        this.setTitle("tank war");
        this.setLocation(400,100);
        this.setSize(800,600);
        this.addKeyListener(new TankKeyListener());  //设计模式：观察者模式,  添加键盘的监听器
        myTank = new Tank(100,400,Dir.R);
    }

    @Override
    public void paint(Graphics g) {  //系统传递过来的一支画笔
        myTank.paint(g);
    }

    private class TankKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {   //键盘按下
            myTank.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {   //键盘抬起来
            myTank.keyReleased(e);
        }
    }
}
