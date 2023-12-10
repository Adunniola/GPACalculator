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
        Student student = null;String[] Coursecode= null;int[] Score =null;int[] Courseunit =null;
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
              }
              
          }
          catch(Exception ex){
              System.out.println("Invalid Parameter");
          }
          
          //Defing object of the student class
          student = new Student(Coursecode,Score,Courseunit);
          
          totalcount = conter;
          System.out.println("press any key to continue and 'N' to stop");
          welcome = InputFromUser.nextLine();
          if (welcome.equalsIgnoreCase("n")) break;
            
        }
        
        // get Print the  statement
        try{
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");
            System.out.println("");
            System.out.println("");
            System.out.println("| COURSE & CODE  | COURSE UNIT  | GRADE | GRADE-UNIT |");
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");

            for(int i=0; i<totalcount; i++){
                System.out.println("|"+ Coursecode[i] + "|" + Courseunit[i] );
                //var result = _Studentresult.getGrades(student);
                
            }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
       
        
    }
}
