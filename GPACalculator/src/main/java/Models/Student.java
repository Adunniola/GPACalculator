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
    public String CourseCode;
    public int CourseUnit;
    public String CourseGrade;
    public int GradeUnit;
    public int Score;
    
    public Student(String CourseCode,int Score, int CourseUnit,int GradeUnit) {
        this.CourseCode = CourseCode;
        this.CourseUnit = CourseUnit;
        this.Score = Score;
        this.GradeUnit = GradeUnit;
    }

    public String getCourseGrade() {
        return CourseGrade;
    }

    public void setCourseGrade(String CourseGrade) {
        this.CourseGrade = CourseGrade;
    }

    
}
