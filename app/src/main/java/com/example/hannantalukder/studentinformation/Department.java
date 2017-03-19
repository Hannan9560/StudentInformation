package com.example.hannantalukder.studentinformation;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 3/19/2017.
 */

public class Department {
    private String depName;
    private String depLocation;
    ArrayList<Course>courseList;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}
