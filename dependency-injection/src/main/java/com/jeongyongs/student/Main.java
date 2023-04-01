package com.jeongyongs.student;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create spring container
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        // get bean
        StudentManagement studentManagement = ctx.getBean("studentManagement", StudentManagement.class);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // print system function
            System.out.println("*-----------------------------*");
            System.out.println("1. Student List");
            System.out.println("2. Create New Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.println("*-----------------------------*");
            System.out.print("> ");
            int input = scanner.nextInt();

            if (input == 1) {
                // print student list
                studentManagement.studentList();
                continue;
            }

            if (input == 2) {
                // create new student
                studentManagement.newStudent();
                continue;
            }

            if (input == 3) {
                // remove student by index
                studentManagement.remove();
                continue;
            }

            if (input == 4) {
                // system exit
                System.out.println("System exit..");
                break;
            }
        }

        // return resources
        ctx.close();
    }
}
