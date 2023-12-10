/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.augusta.gpacalculator;

import java.util.Scanner;
import Models.Student;
import Utilities.Helper;
    
/**
 *
 * @author Augusta Oseh
 */
public class GPACalculator {

    public static void main(String[] args) {
        // temp variable
        Student student = null;
        String[] Coursecode= new String[20] ;
        int[] Score =new int[20];
        int[] Courseunit = new int[20];
        int conter =0, totalcount =0;
        Helper _Studentresult = new Helper();
        //Defining object of the scanner class
        Scanner InputFromUser= new Scanner(System.in);
        
        System.out.println("Welcome to GPA Calculator");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("press any key to start and 'N' to stop");
        String welcome = InputFromUser.nextLine();
        
        while(!welcome.equalsIgnoreCase("n")){
          try{
              conter ++;
              for(int i =0; i< conter; i++){
                  System.out.println("Enter Student Coursecode");
                Coursecode[i] = InputFromUser.nextLine();
           
                System.out.println("Enter Student Score ");
                Score[i] = InputFromUser.nextInt();
          
                System.out.println("Enter Student Courseunit");
                Courseunit[i] = InputFromUser.nextInt();
                
                System.out.println("press any key to continue and 'N' to stop");
                welcome = InputFromUser.nextLine();
                if (welcome.equalsIgnoreCase("n")) break;
              }
              
          }
          catch(Exception ex){
              System.out.println("Invalid Parameter");
              ex.printStackTrace();
          }
          
          //Defing object of the student class
          student = new Student(Coursecode,Score,Courseunit);
          
          totalcount = conter;
        }
        
        // get Print the  statement
        try{
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");
            System.out.println("");
            System.out.println("");
            System.out.println("| COURSE & CODE  | COURSE UNIT  | GRADE | GRADE-UNIT |");
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");

            for(int i=0; i<totalcount; i++){
                var result = _Studentresult.getGrades(student);
                System.out.println("|"+ Coursecode[i] + "|" + Courseunit[i] + "|" +result.getCourseGrade() +"|" +result.getGradeUnit() );
            }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        System.out.print("Your GPA is = ");
        System.out.printf("\"%,.2f",_Studentresult.calculateGPA(student));
        
    }
}
