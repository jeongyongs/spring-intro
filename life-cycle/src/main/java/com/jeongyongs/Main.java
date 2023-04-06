package com.jeongyongs;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("context.xml");

        Life life = ctx.getBean("life", Life.class);
        life.say();

        ctx.close();
    }
}
