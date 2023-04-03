package com.jeongyongs.keyword;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String context = "classpath:keywordContext.xml";
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(context);
        Register register = ctx.getBean("register", Register.class);
        Searcher searcher = ctx.getBean("searcher", Searcher.class);

        register.newKeyword("New key", "New value");
        register.newKeyword("New key", "New value");

        System.out.println("{ New key : " + searcher.search("New key") + " }");

        ctx.close();
    }
}
