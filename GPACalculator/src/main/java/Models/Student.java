package Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Augusta Oseh
 */
public class Student {
    public String[] CourseCode;
    public int[] CourseUnit;
    public String CourseGrade;
    public int GradeUnit;
    public int[] Score;

    public Student() {
    }

    
    public Student(String[] CourseCode, int[] CourseUnit, int[] Score) {
        this.CourseCode = CourseCode;
        this.CourseUnit = CourseUnit;
        this.Score = Score;
    }

    public String getCourseGrade() {
        return CourseGrade;
    }

    public void setCourseGrade(String CourseGrade) {
        this.CourseGrade = CourseGrade;
    }

    public int getGradeUnit() {
        return GradeUnit;
    }

    public void setGradeUnit(int GradeUnit) {
        this.GradeUnit = GradeUnit;
    }
    
    

    
}
