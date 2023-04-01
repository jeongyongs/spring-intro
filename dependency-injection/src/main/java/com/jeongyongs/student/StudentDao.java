package com.jeongyongs.student;

import java.util.ArrayList;

public class StudentDao {
    private final ArrayList<Student> db = new ArrayList<>();

    public StudentDao() {
        // sample data
        db.add(new Student("Jenny", 21, "Female", "Computer Science"));
        db.add(new Student("Alex", 24, "Male", "Mathematics"));
        db.add(new Student("Sara", 20, "Female", "Biology"));
        db.add(new Student("Mark", 22, "Male", "History"));
        db.add(new Student("Emily", 23, "Female", "English"));
    }

    // add data
    public void add(Student student) {
        db.add(student);
    }

    // remove data
    public void remove(int index) {
        db.remove(index);
    }

    // get data by index
    public Student get(int index) {
        return db.get(index);
    }

    // get db size
    public int getSize() {
        return db.size();
    }
}
