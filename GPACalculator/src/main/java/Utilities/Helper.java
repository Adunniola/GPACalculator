/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import Models.Student;
/**
 *
 * @author Augusta Oseh
 */
public class Helper {
    
    
    // To Calculate GPA
    public double calculateGPA(int[] Score,int[] CourseUnit, int count){
        //Student infoStudent = new Student();
        int qualitypoints = 0, totalGradeunits = 0;
        try{
            
            for (int i =0; i< count; i++){
                var getgradeunit = getGradeUnit(Score[i]);
                qualitypoints += CourseUnit[i] * getgradeunit;
                totalGradeunits += CourseUnit[i];
            }
            return qualitypoints/ totalGradeunits;
        }catch(Exception ex){
            System.out.println("Something went wrong");
            ex.printStackTrace();
            return 0.0;
        }
    }
   public String getGrades(int score){  
       // Getting the Grades of the user
       
        Student infoStudent = new Student();
        if(score >=70&&score<=100){
                infoStudent.setCourseGrade("A");
                infoStudent.setGradeUnit(5);
            }
            else if(score >=60&&score<=69){
                infoStudent.setCourseGrade("B");
                infoStudent.setGradeUnit(4);
            }
            else if(score >=50&&score <=59){
                infoStudent.setCourseGrade("C");
                infoStudent.setGradeUnit(3);
            } 
            else if(score >=45&& score <=49){
                infoStudent.setCourseGrade("D");
                infoStudent.setGradeUnit(2);
            }
            else if(score >=44&& score <=40){
                infoStudent.setCourseGrade("E");
                infoStudent.setGradeUnit(1);
            }
            else if( score <=39){
                infoStudent.setCourseGrade("F");
                infoStudent.setGradeUnit(0);
            }else {
                infoStudent.setCourseGrade("");
            }
       
       
       
        return infoStudent.getCourseGrade();
   }
   
   public int getGradeUnit(int score){ 
       // Getting the GradeUnit of the user
        Student infoStudent = new Student();
        
         if(score >=70&&score<=100){
                //infoStudent.setCourseGrade("A");
                infoStudent.setGradeUnit(5);
            }
            else if(score >=60&&score<=69){
                //infoStudent.setCourseGrade("B");
                infoStudent.setGradeUnit(4);
            }
            else if(score >=50&&score <=59){
                //infoStudent.setCourseGrade("C");
                infoStudent.setGradeUnit(3);
            } 
            else if(score >=45&& score <=49){
                //infoStudent.setCourseGrade("D");
                infoStudent.setGradeUnit(2);
            }
            else if(score >=44&& score <=40){
                //infoStudent.setCourseGrade("E");
                infoStudent.setGradeUnit(1);
            }
            else if( score <=39){
                //infoStudent.setCourseGrade("F");
                infoStudent.setGradeUnit(0);
            }else {
                infoStudent.setCourseGrade("");
            }
       
       
        return infoStudent.getGradeUnit();
   }
}
