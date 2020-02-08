package model;

import java.util.Arrays;

public class Teacher {
    String name;
    Student[] stuList;

    public Teacher() {
    }

    public Teacher(String name, Student[] stuList) {
        this.name = name;
        this.stuList = stuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStuList() {
        return stuList;
    }

    public void setStuList(Student[] stuList) {
        this.stuList = stuList;
    }

    public void addStudent(Student student) {
        this.stuList = Arrays.copyOf(this.stuList, this.stuList.length + 1);
        this.stuList[this.stuList.length - 1] = student;
    }

    public void listStudents() {
        System.out.println(name + "老师管理的学生有: ");
        for (Student stu : stuList) {
            System.out.print(stu.getName() + " ");
        }
        System.out.println("\n======================");
    }
}
