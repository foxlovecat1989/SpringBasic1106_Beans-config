package com.mycompany.springbasic1106.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
    
    private String name;
    private List<String> cls;
    private Set<Student> students;
    private Map<String, String> subjects;

    public Teacher() {
    }
    
    public Teacher(String name) {
        this.name = name;
    }
    
    public Teacher(String name, List<String> cls) {
        this.name = name;
        this.cls = cls;
    }

    public Teacher(String name, List<String> cls, Set<Student> students, Map<String, String> subjects) {
        this.name = name;
        this.cls = cls;
        this.students = students;
        this.subjects = subjects;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Map<String, String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, String> subjects) {
        this.subjects = subjects;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", cls=" + cls + ", students=" + students + ", subjects=" + subjects + '}';
    }

    
}
