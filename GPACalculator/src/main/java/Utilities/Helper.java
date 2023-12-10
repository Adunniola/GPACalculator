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
    public double calculateGPA(Student info){
        //Student infoStudent = new Student();
        int qualitypoints = 0, totalGradeunits = 0;
        try{
            
            for (int i =0; i< info.Score.length; i++){
                var getgradeunit = getGrades(info);
                qualitypoints += info.CourseUnit[i] *getgradeunit.getGradeUnit();
                totalGradeunits += getgradeunit.getGradeUnit();
            }
        }catch(Exception ex){
            System.out.println("Something went wrong");
        }
        
        double totalGPA = qualitypoints/ totalGradeunits;        
        
        return totalGPA;
   
    }
   public Student getGrades(Student info){     // Getting the Grades of the user
        Student infoStudent = new Student();
        for (int i =0; i< info.Score.length; i++){
            if(info.Score[i] >=70&&info.Score[i]<=100){
                info.setCourseGrade("A");
                info.setGradeUnit(5);
            }
            else if(info.Score[i] >=60&&info.Score[i]<=69){
                info.setCourseGrade("B");
                info.setGradeUnit(4);
            }
            else if(info.Score[i] >=50&&info.Score[i] <=59){
                info.setCourseGrade("C");
                info.setGradeUnit(3);
            } 
            else if(info.Score[i] >=45&&info.Score[i] <=49){
                info.setCourseGrade("D");
                info.setGradeUnit(2);
            }
            else if(info.Score[i] >=44&&info.Score[i] <=40){
                info.setCourseGrade("E");
                info.setGradeUnit(1);
            }
            else if(info.Score[i] >=0&&info.Score[i] <=39){
                info.setCourseGrade("F");
                info.setGradeUnit(0);
            }else {
                info.setCourseGrade("");
            }
        }
       
       infoStudent = info;
       
        return infoStudent;
   }
}
