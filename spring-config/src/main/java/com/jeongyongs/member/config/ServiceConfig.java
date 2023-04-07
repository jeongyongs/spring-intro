package com.jeongyongs.member.config;

import com.jeongyongs.member.service.MemberRegistrationService;
import com.jeongyongs.member.service.MemberSearchService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public MemberRegistrationService memberRegistrationService() {
        return new MemberRegistrationService();
    }

    @Bean
    public MemberSearchService memberSearchService() {
        return new MemberSearchService();
    }
}
