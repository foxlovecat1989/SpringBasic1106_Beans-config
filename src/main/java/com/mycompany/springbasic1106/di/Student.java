package com.mycompany.springbasic1106.di;

public class Student {
    
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
     public void start() {
        System.out.println("START...");
    }
    
    public void end() {
        System.out.println("END...");
    }
}
