package com.mycompany.springbasic1106.di;

import java.util.List;

public class Teacher {
    
    private String name;
    private List<String> cls;

    public Teacher() {
    }
    
    public Teacher(String name) {
        this.name = name;
    }
    
    public Teacher(String name, List<String> cls) {
        this.name = name;
        this.cls = cls;
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
        return "Teacher{" + "name=" + name + ", cls=" + cls + '}';
    }

}
