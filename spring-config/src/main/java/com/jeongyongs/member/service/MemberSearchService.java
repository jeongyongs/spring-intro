package com.jeongyongs.member.service;

import com.jeongyongs.member.domain.Member;
import com.jeongyongs.member.repository.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSearchService {
    @Autowired
    private MemberDao memberDao;

    public void findById() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id to find from below.");
        System.out.print("(1/1) ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        Member member = memberDao.findById(id);

        if (member == null) {
            System.out.println("┌───────────┐");
            System.out.println("│ No result │");
            System.out.println("└───────────┘");
            return;
        }
        System.out.println("┌────────┬────────────────┬──────┐");
        System.out.println("│ Id     │ Name           │ Sex  │");
        System.out.println("├────────┴────────────────┴──────┤");
        System.out.printf("│ %-7d│ %-15s│ %-5s│\n", member.getId(), member.getName(), member.getSex());
        System.out.println("└────────┴────────────────┴──────┘");
    }

    public void findAll() {
        ArrayList<Member> list = memberDao.findAll();
        System.out.println("┌────────┬────────────────┬──────┐");
        System.out.println("│ Id     │ Name           │ Sex  │");
        System.out.println("├────────┴────────────────┴──────┤");
        for (Member member : list) {
            System.out.printf("│ %-7d│ %-15s│ %-5s│\n", member.getId(), member.getName(),
                    member.getSex());
        }
        System.out.println("└────────┴────────────────┴──────┘");
    }
}
