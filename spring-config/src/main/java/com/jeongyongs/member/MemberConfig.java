package com.jeongyongs.member;

import com.jeongyongs.member.repository.MemberDao;
import com.jeongyongs.member.service.MemberRegistrationService;
import com.jeongyongs.member.service.MemberSearchService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberRegistrationService memberRegistrationService() {
        return new MemberRegistrationService();
    }

    @Bean
    public MemberSearchService memberSearchService() {
        return new MemberSearchService();
    }
}
