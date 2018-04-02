package com.mainserver.march31.domain;

public class Student {
    private int id;
    private String firstName;
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", course=" + course +
                '}';
    }
}
