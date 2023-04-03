package com.jeongyongs.construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        ConstructDi constructDi = ctx.getBean("constructDi", ConstructDi.class);
        ListObject listObject = ctx.getBean("listObject", ListObject.class);
        MapObject mapObject = ctx.getBean("mapObject", MapObject.class);
        InjectionObject injectionObject = constructDi.getInjectionObject();

        // output
        System.out.println(injectionObject.getName());
        System.out.println();
        for (String str : listObject.getList()) {
            System.out.println(str);
        }
        System.out.println();
        for (String str : mapObject.getMap().keySet()) {
            System.out.println(str + " : " + mapObject.getMap().get(str));
        }

        // return resources
        ctx.close();
    }
}
