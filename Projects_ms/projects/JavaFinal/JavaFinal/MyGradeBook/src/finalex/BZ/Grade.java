/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.BZ;

import com.sun.org.apache.bcel.internal.generic.Type;

/**
 *
 * @author lcotti
 */
public class Grade {
    private String CourseID ;
    private Integer Grade ; // grade is set to integer object instead of primitive int so as to store even null instead of zero.

    public Integer getGrade() { //getter for grade
        return Grade;
    }

    public void setGrade(Integer Grade) { //setter
        this.Grade = Grade;
    }

    
    private int AssigmentId;
    private String date;

    public void setCourseID(String CourseID) {//setter
        this.CourseID = CourseID;
    }

   

    public void setAssigmentId(int AssigmentId) {//setter
        this.AssigmentId = AssigmentId;
    }
//setter
    public void setDate(String date) {
        this.date = date;
    }
    

    public String getCourseID() { //getter
        return CourseID;
    }

   
//getter
    public int getAssigmentId() {
        return AssigmentId;
    }

    public String getDate() { //getter
        return date;
    }
}
