/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.BZ;

import java.util.*;

/**
 *
 * @author lcotti
 */
public class Course {
    private int courseID;
    private List<Grade> AllGrades = new ArrayList<Grade>();

    public int getCourseID() { //getter
        return courseID;
    }

    public List<Grade> getAllGrades() { //getter
        return AllGrades;
    }

    public void setCourseID(int courseID) { //setter
        this.courseID = courseID;
    }

    public void setAllGrades(List<Grade> AllGrades) { //setter
        this.AllGrades = AllGrades;
    }
    
}
