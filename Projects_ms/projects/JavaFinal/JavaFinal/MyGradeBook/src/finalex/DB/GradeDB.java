/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.DB;

import com.sun.org.apache.bcel.internal.generic.Type;
import java.util.*;
import finalex.BZ.Grade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import finalex.UI.MyApp;

/**
 *
 * @author lcotti
 */
public class GradeDB {

    public static List<Grade> getAll(int sortORder) throws DBException {
        String sql=""; 
        if(sortORder == 1)// assigning the sort order according to the radio button checked
        {
        sql = "Select * FROM GRADES ORDER BY Grade desc;";
        }
        else if (sortORder == 2)
        {
            sql ="Select * FROM GRADES ORDER BY courseid asc , assignmentid asc;";
            
        }
        else if(sortORder == 3)
        {
            sql = "Select * FROM GRADES ORDER BY duedate asc; ";
        }
        List<Grade> listOfGrades = new ArrayList<Grade>();
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, sortORder);
//            System.out.println(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {//this block stores the values fetched and stored in the result set
                int assignmentId = rs.getInt("AssignmentID");
                String courseId = rs.getString("CourseID");
                String duedate = rs.getString("DueDate");
                Grade g = new Grade();
                g.setAssigmentId(assignmentId);
                g.setCourseID(courseId);
                g.setDate(duedate);
                g.setGrade(rs.getString("Grade")==null?null:new Integer(rs.getString("Grade"))); // checking whether the grade is null using boolean expression.
                listOfGrades.add(g);
            }
            return listOfGrades;// returning the value to the calling function
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }

    public static List<Grade> getAllGradesWithAvg(String course) throws DBException {
        String sql = "select AssignmentID, grade from grades where courseId = ? order by  AssignmentID;";
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        List<Grade> allGrades = new ArrayList<Grade>();
        try (PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1, course);
            ResultSet rs = ps.executeQuery();
//          int avg =0;
            while (rs.next()) {//this block stores the values fetched and stored in the result set
               int AssignmentID = rs.getInt("AssignmentID");
                Grade g = new Grade();
                g.setAssigmentId(AssignmentID);
                g.setGrade(rs.getString("grade")==null?null:new Integer(rs.getString("grade")));
                allGrades.add(g);
//               System.out.println("CourseID: "+g.getCourseID()+ " AssignmentID: " +g.getAssigmentId()+ " Grade: "+g.getGrade());
//               avg += g.getGrade();
            }
//           Grade av = new Grade();
//           
//           av.setGrade(avg);
//         allGrades.add(av);
            return allGrades;// returning all the grades

        } catch (SQLException e) {
            throw new DBException(e);
        }
    }

    public static Grade get(int myGrade) throws DBException {
        String sql = "SELECT * FROM Grades WHERE grade  = ?";
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, myGrade);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {//this block stores the values fetched and stored in the result set
                int assignmentId = rs.getInt("AssignmentID");
                String courseId = rs.getString("CourseID");
                String duedate = rs.getString("DueDate");
                rs.close();

                Grade g = new Grade();
                g.setAssigmentId(assignmentId);
                g.setCourseID(courseId);
                g.setDate(duedate);
                g.setGrade(myGrade);

                return g;// returning the value to the calling function
            } else {
                rs.close();
                return null;// returning the value to the calling function
            }
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }
    public static Grade SearchGrade(String courseID, int AssignmentId) throws DBException
    {
      String sql = "Select * from grades where courseID = ? and Assignmentid = ?;" ;
      Connection connection = DBUtil.getConnection(); // connecting to my sql database
      try(PreparedStatement ps = connection.prepareStatement(sql)) {
          ps.setString(1, courseID);
                ps.setInt(2, AssignmentId);
                 ResultSet rs = ps.executeQuery();
//                 System.out.println(ps.getUpdateCount());
            if (rs.next() ) { //this block stores the values fetched and stored in the result set
                int assignmentId = rs.getInt("AssignmentID");
                String courseId = rs.getString("CourseID");
                String duedate = rs.getString("DueDate");
                

                Grade g = new Grade();
                g.setAssigmentId(assignmentId);
                g.setCourseID(courseId);
                g.setDate(duedate);
                g.setGrade(null==rs.getString("grade")?null:rs.getInt("grade"));
                rs.close();
                return g;// returning the value to the calling function
            }
            else 
            {
                return null;// returning the value to the calling function
            }
                
      }
      catch (SQLException e) {
            throw new DBException(e);
        }
    }

    public static void addGrade(Grade g, boolean gradeZero) throws DBException {
        if(g.getGrade() != null || gradeZero) // if the grade is not null the following is performed 
        {
            int getgrade = g.getGrade();
            String sql
                    = "INSERT INTO Grades (AssignmentID, CourseID, DueDate, Grade) " // query for insert statement
                    + "VALUES (?, ?, ?,?)";
            Connection connection = DBUtil.getConnection(); // connecting to my sql database
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, g.getAssigmentId());
                ps.setString(2, g.getCourseID());
                ps.setString(3, g.getDate());
                ps.setInt(4, g.getGrade());

                ps.executeUpdate();
            } catch (SQLException e) {
                throw new DBException(e);
            }
        }
        else // this block runs when the grade is null 
        {
            String sql = "INSERT INTO Grades (AssignmentID, CourseID, DueDate) VALUES (?, ?, ?)"; // null grade is by default achieved ffrom the mysql code.
            Connection connection = DBUtil.getConnection(); // connecting to my sql database
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, g.getAssigmentId());
                ps.setString(2, g.getCourseID());
                ps.setString(3, g.getDate());
                ps.executeUpdate();
            } catch (SQLException ex) {
                throw new DBException(ex);
            }
        }

    }

    public static boolean update(Grade g, int updateCase) throws DBException {
        String sql="";
        if(updateCase == 1)
        {
         sql = "UPDATE Grades SET Grade = ? WHERE CourseID = ? and AssignmentID  = ?;";
        }
        else if(updateCase ==2)
        {
            sql = "UPDATE Grades SET Grade = ?,Duedate = ? WHERE CourseID = ? and AssignmentID  = ?; ";
        }
        else if (updateCase == 3)
        {
            sql ="UPDATE Grades SET Grade = null WHERE CourseID = ? and AssignmentID  = ? ;";
        }
        else if (updateCase == 4)
        {
            sql = "UPDATE Grades SET Grade = null,Duedate = ? WHERE CourseID = ? and AssignmentID  = ?; ";
        }
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        boolean b= true;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            
            if(updateCase == 1)
            {
                ps.setInt(1, g.getGrade());
                ps.setString(2, g.getCourseID());
            ps.setInt(3, g.getAssigmentId());
             
            }
            else if(updateCase == 2)
            {
                ps.setInt(1, g.getGrade());
                ps.setString(2, g.getDate());
            ps.setString(3, g.getCourseID());
            ps.setInt(4, g.getAssigmentId());
           
            }
            else if(updateCase == 3)
            {
                 ps.setString(1, g.getCourseID());
            ps.setInt(2, g.getAssigmentId());
            }
            else if(updateCase == 4)
            {
                   ps.setString(1, g.getDate());
            ps.setString(2, g.getCourseID());
            ps.setInt(3, g.getAssigmentId());
           
            }
            ps.executeUpdate();
            if(ps.getUpdateCount() == 0)
            {
                b= false;
            }
            return b;// returning the value to the calling function
           
        } catch (SQLException e) {
            throw new DBException(e);
        }
        
    }

    public static void deleteGrade(String course, int Assignment) throws DBException {
        String sql = "delete from grades where courseid = ? and AssignmentID = ? and grade is null;";
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        
        try {
            String cor = course;
            int Ass = Assignment;
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cor);
            ps.setInt(2, Ass);
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }

    public static boolean RemoveCourse(String courseid) throws DBException {
        String sql = "Delete from grades where courseid = ?;";
        boolean b= true;
        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, courseid);
            ps.executeUpdate();
//            System.out.println(ps.getUpdateCount());
            if(ps.getUpdateCount() ==0)
            {
                b=false;
                return b;// returning the value to the calling function
            }
            else 
            {
                return b;// returning the value to the calling function
            }
            
            
        } catch (Exception e) {
            throw new DBException(e);
        }
    }

    public static boolean nullEvent(String course, int Assignment) throws DBException {
        String sql = "Select  grade from grades where courseId = ? and Assignmentid = ? ; ";

        Connection connection = DBUtil.getConnection(); // connecting to my sql database
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, course);
            ps.setInt(2, Assignment);
            ResultSet rs = ps.executeQuery();
//            Integer k = 0;
               String k;
            boolean b = true;
            if (rs.next()) {//this block stores the values fetched and stored in the result set
                k = rs.getString("grade");
//                System.out.println(k);
// k.equals("null")
                if(null==k)
                {
                b = false;
                }

            }

            return b;// returning the value to the calling function

        } catch (SQLException e) {
            throw new DBException(e);
        }

    }

}
