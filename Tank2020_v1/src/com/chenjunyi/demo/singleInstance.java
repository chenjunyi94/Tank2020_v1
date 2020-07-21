package com.chenjunyi.demo;

public class singleInstance {
    private static final singleInstance INSTANCE = new singleInstance();
    private singleInstance(){};
    public static singleInstance getInstance(){return INSTANCE;}

}
