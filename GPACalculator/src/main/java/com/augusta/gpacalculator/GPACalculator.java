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
        String[] Coursecode= new String[5] ;
        int[] Score =new int[5];
        int[] Courseunit = new int[5];
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
              for(int i =0; i<conter ; i++){
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
              ex.printStackTrace();
          }
          
          totalcount = conter;
          System.out.println("press any key to continue and 'N' to stop");
          InputFromUser.nextLine();
          welcome = InputFromUser.nextLine();
          if (welcome.equalsIgnoreCase("n")) break;
          
          //Defing object of the student class
          student = new Student(Coursecode,Score,Courseunit);
        }
          // get Print the  statement
        try{
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");
            System.out.println("");
            System.out.println("");
            System.out.println("| COURSE & CODE  \t| COURSE UNIT  \t| GRADE \t| GRADE-UNIT |");
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");
            
            for(int i=0; i<totalcount; i++){
                System.out.println("|"+ Coursecode[i] + "\t\t\t|" + Courseunit[i] + "\t\t\t|" +_Studentresult.getGrades(Score[i]) +"\t\t\t|" + _Studentresult.getGradeUnit(Score[i] ));
            } 
        }
        catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
            System.out.print("Your GPA is = ");
            System.out.printf("%,.2f",_Studentresult.calculateGPA(Score, Courseunit,totalcount));
        
    }
}
