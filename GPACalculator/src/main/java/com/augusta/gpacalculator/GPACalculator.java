/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.augusta.gpacalculator;

import java.util.Scanner;
import Models.Student;
    
/**
 *
 * @author Augusta Oseh
 */
public class GPACalculator {

    public static void main(String[] args) {
        Student student = null;
        //Defining object of the scanner class
        
        Scanner InputFromUser= new Scanner(System.in);
        
       
        
        System.out.println("Welcome to GPA Calculator");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("press any key to start and 'N' to stop");

        String welcome = InputFromUser.nextLine();
        while(!welcome.equalsIgnoreCase("n")){
          System.out.println("Enter Student Coursecode");
          String Coursecode = InputFromUser.nextLine();
          
          System.out.println("Enter Student Score ");
          int Score = InputFromUser.nextInt();
          
           System.out.println("Enter Student Courseunit");
          int Courseunit = InputFromUser.nextInt();
          
        
          
           System.out.println("Enter Student Grade unit ");
          int Gradeunit = InputFromUser.nextInt();
          
          //Defing object of the student class
         student = new Student(Coursecode,Score,Courseunit,Gradeunit);
          System.out.println("press any key to continue and 'N' to stop");

         welcome = InputFromUser.nextLine();
         if (welcome.equalsIgnoreCase("n")) break;
        }
        
       
        
    }
}
