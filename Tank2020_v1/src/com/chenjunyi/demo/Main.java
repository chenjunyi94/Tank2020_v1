package com.chenjunyi.demo;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

	// write your code here
        TankFrame tf = new TankFrame();
        tf.setVisible(true);
        for(;;){  //不断的paint，
            try {
                Thread.sleep(25);  // TimeUnit.MICROSECONDS.sleep(25);  1s是1000ms，25ms，一秒就是40帧
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tf.repaint();   //无法调用paint，paint(g)，参数我们无法获得
        }

    }
}
