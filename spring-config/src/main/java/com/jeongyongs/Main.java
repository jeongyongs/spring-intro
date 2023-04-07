package com.jeongyongs;

import com.jeongyongs.member.config.AssembleConfig;
import com.jeongyongs.member.service.MemberRegistrationService;
import com.jeongyongs.member.service.MemberSearchService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AssembleConfig.class);

        MemberRegistrationService memberRegistrationService = ctx.getBean("memberRegistrationService", MemberRegistrationService.class);
        MemberSearchService memberSearchService = ctx.getBean("memberSearchService", MemberSearchService.class);

        memberRegistrationService.register();
        memberRegistrationService.register();
        memberSearchService.findById();
        memberSearchService.findById();
        memberSearchService.findAll();
    }
}
