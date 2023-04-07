package com.jeongyongs.member.config;

import com.jeongyongs.member.repository.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
}
