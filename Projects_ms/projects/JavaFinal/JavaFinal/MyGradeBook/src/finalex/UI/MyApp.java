/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.UI;

import finalex.DB.DBException;
import finalex.DB.GradeDB;
import java.util.ArrayList;
import finalex.BZ.Course;
import finalex.BZ.Grade;
import java.awt.TextArea;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lcotti
 */
public class MyApp extends javax.swing.JFrame {

    private boolean gradeZero = false;

    public boolean isGradeZero() {
        return gradeZero;
    }

    public void setGradeZero(boolean gradeZero) {
        this.gradeZero = gradeZero;
    }

    /**
     * Creates new form MyApp
     */
    public MyApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        listOfAllGradesOfAllCourse = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        radGradeDec = new javax.swing.JRadioButton();
        radCourseAss = new javax.swing.JRadioButton();
        radDue = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        lbldate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jButton2.setText("All Grades of a course");

        jButton6.setText("Update a grade ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   My Grade Book");

        listOfAllGradesOfAllCourse.setText(" List all grades of all course ");
        listOfAllGradesOfAllCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfAllGradesOfAllCourseActionPerformed(evt);
            }
        });

        jButton3.setText("Search a Grade");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add a grade");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete a grade ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove a course ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Clear all input data ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radGradeDec);
        radGradeDec.setSelected(true);
        radGradeDec.setText(" sort by grade from highest to lowest");

        buttonGroup1.add(radCourseAss);
        radCourseAss.setText("sort by course ID from smallest to largest then by assignment ID also from smallest to largest");
        radCourseAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCourseAssActionPerformed(evt);
            }
        });

        buttonGroup1.add(radDue);
        radDue.setText("sort by due date from oldest to most recent day");

        jLabel5.setText("Course ID:");

        jLabel6.setText("Assignment ID:");

        jLabel7.setText("Due date:");

        jLabel8.setText("Grades:");

        jButton9.setText("List all grades of a course");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Update a Grade");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setText("OUTPUT");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        lbldate.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel2)))
                .addContainerGap(457, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jButton11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radCourseAss)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radDue)
                                .addGap(72, 72, 72)
                                .addComponent(listOfAllGradesOfAllCourse))
                            .addComponent(radGradeDec))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(radGradeDec)
                .addGap(1, 1, 1)
                .addComponent(radCourseAss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDue)
                    .addComponent(listOfAllGradesOfAllCourse))
                .addGap(40, 40, 40)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton5)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton11))
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radCourseAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCourseAssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCourseAssActionPerformed
    private void getvalues(int sortOrder) {
        List<Grade> listAll = new ArrayList<Grade>();
        try {
            listAll = GradeDB.getAll(sortOrder); // gets the list of all the grades from the get all method of Grade DB

            for (Grade d : listAll) // this for loop will fetch all the grades stored inside the list and prints them on the text area
            {
                txtArea.append("     CourseId: " + d.getCourseID() + "     AssignmentId: " + d.getAssigmentId()
                        + "     Grade:  " + d.getGrade() + "           Due Date: " + d.getDate() + "\n");

            }
        } catch (Exception ex) { // if they are any exceptions in the above try field it is caught inside this catch method.
            jLabel3.setText(ex.getMessage());
        }
    }
    private void listOfAllGradesOfAllCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfAllGradesOfAllCourseActionPerformed

        txtArea.setText("");
        int sortOrder;
        if (radGradeDec.isSelected()) // when first radio button is is ckick the sortorder 1 is sent to get the values
        {
            sortOrder = 1;

            getvalues(sortOrder);

        } else if (radCourseAss.isSelected()) // when second is selected the sortorder becomes 2
        {
            sortOrder = 2;
            getvalues(sortOrder);

        } else if (radDue.isSelected()) // when 3rd button is selected the sortorder becomes 3
        {
            sortOrder = 3;
            getvalues(sortOrder);
            radDue.setSelected(false);
        }

    }//GEN-LAST:event_listOfAllGradesOfAllCourseActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        if (txtCid.getText().equals("")) // validating before fetching the grades.
        {
            jLabel3.setText("Please enter the course ID to get the list of Grades.");
        } else { 
            
            try {

                List<Grade> allgrades;
                allgrades = GradeDB.getAllGradesWithAvg(txtCid.getText()); // fetching grades from GRadeDB folder.
                String k = "";

                double avg = 0.0;
                txtArea.setText("   CourseId:  " + txtCid.getText());
                for (Grade d : allgrades) { // this for loop will fetch all the grades stored inside the list and prints them on the text area
                    txtArea.append("\n" + "    AssignmentId: " + d.getAssigmentId()
                            + "       Grade: " + d.getGrade());
                    if(null != d.getGrade())
                    {
                    avg += d.getGrade(); // calculating average for every grade
                    }

                }

                txtArea.append("\n" + "     Average: " + (avg / allgrades.size())); // dispaying the average on text area
                clearField();
            } catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.
                jLabel3.setText(e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        clearField(); // calls the clearfield method and clears all the text fields.

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        if(txtCid.getText().equals("")) // validating before executing
        {
            jLabel3.setText("Course id must be entered to remove the course sucessfully");
                    
        }
        else
        {
        
        try {
            if (!txtCid.getText().equals("")) {
                boolean b =GradeDB.RemoveCourse(txtCid.getText()); // calling the method removecourse from gradeDB
                if(b == true)
                {
                txtArea.setText("The course is removed sucessfully");
                }
                else
                {
                txtArea.setText("there is no such course in the database");
                }
            }
            clearField();
        } catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.
            jLabel3.setText(e.getMessage());
        }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        if(txtCid.getText().equals("")|| txtAid.getText().equals("")|| txtDate.getText().equals("")) //validating before execution.
        {
            jLabel3.setText("Course ID and AssignmentId and duedate must be entered to  add the course");
        }
        else
        {
        
        try {
            Grade g = new Grade();
            g.setCourseID(txtCid.getText());
            g.setAssigmentId(Integer.parseInt(txtAid.getText()));

            if (!txtGrade.getText().isEmpty()) { 

                setGradeZero((0 == Integer.parseInt(txtGrade.getText())) ? true : false); // aboolean expression is written to check if there is a zero value in the text field.
                g.setGrade(Integer.parseInt(txtGrade.getText()));
            }
            
            g.setDate(txtDate.getText());
            GradeDB.addGrade(g, isGradeZero());
            txtArea.setText("Your Grade has been Added");
            setGradeZero(false);
            clearField();
        } catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.
            jLabel3.setText("MyApp Error --> " + e.getMessage());
            lbldate.setText("YYYY-MM-DD");
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtCid.getText().equals("")||txtAid.getText().equals("")) //validating before executing
        {
            jLabel3.setText("Please enter courseId and Assignment ID to delete a code.");
        }
        else
        {
        txtArea.setText("");
        try {
            String Courseid = txtCid.getText();
            int assignmentID = Integer.parseInt(txtAid.getText());
            if (!GradeDB.nullEvent(Courseid, assignmentID) ) { // checking whether the grade is null
                GradeDB.deleteGrade(Courseid, assignmentID);
                
                txtArea.setText("Courseid: " + Courseid + " has a null grade and has been deleted.");
                clearField();
            } else {
                txtArea.setText(" Cannot delete The CourseId: " + Courseid + ". As it has not null grade value or it doesnt exists in the database");
                clearField();
            }
        } catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.
            jLabel3.setText(e.getMessage());
            clearField();
        }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        if(txtCid.getText().equals("")|| txtAid.getText().equals("")) // checking validations.
        {
            jLabel3.setText("Please enter the Course Id and AssignmentID to Update");
        }
        else{
           
        
        int updateCase = 0;
        boolean nullGrade = false;
        try {
            Grade g = new Grade();
            g.setCourseID(txtCid.getText());
            g.setAssigmentId(Integer.parseInt(txtAid.getText()));
            try { // this try is to see if there is a null grade entered
                g.setGrade(Integer.parseInt(txtGrade.getText()));
            } catch (Exception e) {
                nullGrade = true;
            }
            if (txtDate.getText().isEmpty()) { // if the date is empty 
                if (txtGrade.getText().equals("")) { //if the date is empty and grade is null
                    updateCase = 3;
                } else {
                    updateCase = 1;
                }
               boolean b= GradeDB.update(g, updateCase);
                if(b == true)
                {
                txtArea.setText("Updated Successfully.");
                }
                else
                {
                    txtArea.setText("CourseID:" +txtCid.getText() + " not found in the data base");
                }
               
            } else if (!txtDate.getText().isEmpty()) { // if the date is not null
                if (txtGrade.getText().equals("")) { // if the date is not null and grade is null
                    updateCase = 4;
                } else {
                    updateCase = 2;
                }
                g.setDate(txtDate.getText());
                GradeDB.update(g, updateCase);
                txtArea.setText("Updated Successfully.");
                
            }
            clearField();
        } catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.;
            jLabel3.setText(e.getMessage());
            lbldate.setText("YYYY-MM-DD");
        }
        }


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0); // code to exit the GUI
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
        if(txtCid.getText().equals("")|| txtAid.getText().equals("")) // checking validations.
        {
            jLabel3.setText("Please enter the Course Id and AssignmentID to Search a grade");
        }
        else{
        Grade d;
        try{
            
            d = GradeDB.SearchGrade(txtCid.getText(), Integer.parseInt(txtAid.getText())); // calling search grade method of gradedb class
//          txtArea.setText("Course id = "+d.getCourseID());
            if(null != d && null!=d.getCourseID())
            {
            txtArea.setText("     CourseId: " + d.getCourseID() + "     AssignmentId: " + d.getAssigmentId()
                        + "     Grade:  " + d.getGrade() + "           Due Date: " + d.getDate() + "\n");
            }
            else
            {
               txtArea.setText( "There is no such grade for the given course ID: "+txtCid.getText() +" and assignment id: "+
                       txtAid.getText() +" in the database");
            }
                    
            clearField();
        }
       catch (Exception e) { // if they are any exceptions in the above try field it is caught inside this catch method.;
            jLabel3.setText(e.getMessage());
       }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void clearField()  { // this method is called after every button is clicked so as to clear the fields
        txtAid.setText("");
        jLabel3.setText("");
        txtCid.setText("");
        txtGrade.setText("");
        txtDate.setText("");
        radGradeDec.setSelected(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbldate;
    private javax.swing.JButton listOfAllGradesOfAllCourse;
    private javax.swing.JRadioButton radCourseAss;
    private javax.swing.JRadioButton radDue;
    private javax.swing.JRadioButton radGradeDec;
    private javax.swing.JTextField txtAid;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGrade;
    // End of variables declaration//GEN-END:variables
}