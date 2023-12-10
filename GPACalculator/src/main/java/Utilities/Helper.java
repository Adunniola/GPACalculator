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
    public float calculateGPA(Student info){
    
        return 0;
   
    }
   public String getGrade(Student info){     // Getting the GPA of the user
        if(info.Score >=70&&info.Score<=100){
            info.setCourseGrade("A");
        }
        else if(info.Score >=60&&info.Score<=69){
            info.setCourseGrade("B"); 
        }
        else if(info.Score >=50&&info.Score<=59){
            info.setCourseGrade("C");
        } 
         else if(info.Score >=45&&info.Score<=49){
            info.setCourseGrade("D");
        }
         else if(info.Score >=44&&info.Score<=40){
            info.setCourseGrade("E");
        }
         else if(info.Score >=0&&info.Score<=39){
            info.setCourseGrade("F");
        }else info.setCourseGrade("");
        return info.getCourseGrade();
   }
}
