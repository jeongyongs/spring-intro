package com.jeongyongs.member.service;

import com.jeongyongs.member.domain.Member;
import com.jeongyongs.member.repository.MemberRepository;
import com.jeongyongs.member.repository.ArrayListMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final MemberRepository memberRepository;

    @Autowired
    public LoginService(ArrayListMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String login(String id, String pw) {
        Member member = memberRepository.findByUsername(id);
        if (member == null) {
            return "No user";
        }
        if (member.getPassword().equals(pw)) {
            return "Hi, " + member.getName();
        }
        return "Password does not match.";
    }
}
