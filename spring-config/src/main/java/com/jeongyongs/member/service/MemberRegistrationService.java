package com.jeongyongs.member.service;

import com.jeongyongs.member.domain.Member;
import com.jeongyongs.member.repository.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MemberRegistrationService {
    @Autowired
    private MemberDao memberDao;

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill out the form below.");
        System.out.print("(1/2). Name: ");
        String name = scanner.nextLine();
        System.out.print("(2/2). Sex(M/F): ");
        String sex = scanner.nextLine();

        long id = generateId();
        memberDao.save(new Member(id, name, sex));
        System.out.println("*-------------------*");
        System.out.printf("Id: %d\nName: %s\nSex: %s\n", id, name, sex);
        System.out.println("*-------------------*");
    }

    private long generateId() { // get random number and verify that number can be used
        long id;
        while (true) {
            id = (long) (Math.random() * 10000 + 1);
            if (memberDao.findById(id) == null) {
                break;
            }
        }
        return id;
    }
}
