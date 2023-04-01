package com.jeongyongs.student;

import java.util.Scanner;

public class StudentManagement {
    private StudentDao studentDao;

    // constructor
    public StudentManagement(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    // DAO setter
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    // print student list
    public void studentList() {
        for (int i = 0; i < studentDao.getSize(); i++) {
            Student student = studentDao.get(i);
            System.out.println(i + ". " + student.getName() + " / " + student.getAge() + " / " + student.getGender() +
                    " / " + student.getMajor());
        }
    }

    // create new student
    public void newStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1/4) Name: ");
        String name = scanner.nextLine();
        System.out.print("(2/4) Age: ");
        int age;
        try {
            age = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Please enter number only");
            return;
        }
        System.out.print("(3/4) Gender: ");
        String gender = scanner.nextLine();

        System.out.print("(4/4) Major: ");
        String major = scanner.nextLine();

        studentDao.add(new Student(name, age, gender, major));
        System.out.println("Create student done.");
    }

    // remove student by index
    public void remove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student index: ");
        int index = scanner.nextInt();

        try {
            studentDao.remove(index);
            System.out.println("Remove student done.");
        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}
