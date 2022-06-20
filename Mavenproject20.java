/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanydaretodream.mavenproject20;

/**
 *
 * @author Swiki
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Mavenproject20 {

    public static void main(String[] args) {
        
           

       int TOP = 0; int personl; int TaskF;  int LA;
       int person1; int person2; int person3; int person4;
      int ListOp;
      do{       
      ListOp =  JOptionPane.showOptionDialog(
                null,
                "Do you want to see the task lists?",
                "List Option",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                0);
   
      String[] Options = {
          "Completed Tasks",
          "Longest Task",
          "Search Task",
          "Search Developer",
          "Delete Task",
          "Display Report",
          "Cancel"};
    //This displays the option for the use to manipulate the task arrays
    
    int LA  = JOptionPane.showOptionDialog(
              null, 
              "Please select Option", 
              "List App", 
              JOptionPane.YES_NO_CANCEL_OPTION, 
              JOptionPane.PLAIN_MESSAGE, 
              null, 
              Options, 
              0);
    
     //these are the user information in Arrays
              String[] person1 = {"Mike Smith", "Create Login", "5","To Do"};
              String[] person2 = {"Edward Harrison","Create Add Features","8","Doing"};
              String[] person3 = {"Samantha Paulson","Create Reports","2","Done"};
              String[] person4 = {"Glenda Oberholzer","Add Arrays","11","To Do"};
              
     //This displays the completed tasks
     if(LA == 0 ){ ///A
         
         if(Arrays.asList(person3).contains("Done")){
            
             for(String a : person3){
                 System.out.println(a);
             }
         
     }
       if(LA == 0){
      
      
      
      }
       //This displays the day with the longest task
      if(LA == 1){
          
         if(Arrays.asList(person4).contains("11")){
           
             for(String b : person4){
                 
                 System.out.println(b);
             }
         } 
             
      }}
     //This line of code allows the user to search for the task by name
      if(LA == 2){
        
      String Task  = JOptionPane.showInputDialog("Please Enter the Task Name:");
      
      if(Arrays.asList(person1).contains(TaskF)){ //1
          
          for(String c : person1){
      
              System.out.println(c);
          
           if(Arrays.asList(person2).contains(TaskF)){ //2
          
          for(String c : person3){
      
              System.out.println(c);
              
               if(Arrays.asList(person3).contains(TaskF)){ //3
          
          for(String c : person3){
      
              System.out.println(c);
           if(Arrays.asList(person4).contains(TaskF)){ //4
          
          for(String c : person4){
      
              System.out.println(c);
          
              
          }}
           
           
           
           
          //this line allows you to find the tasks assigned to the developer 
      if(LA == 3){
          
        String Dev = JOptionPane.showInputDialog("please enter developer name:")
         
            if(Arrrays.asList(person1).contains(Dev)){
               
                for(String d : person1){
                    
                    System.out.println(d);
                }
            }
            if(Arrrays.asList(person2).contains(Dev)){
               
                for(String d : person2){
                    
                    System.out.println(d);
                }
            }
            if(Arrrays.asList(person3).contains(Dev)){
               
                for(String d : person3){
                    
                    System.out.println(d);
                }
            }
            if(Arrrays.asList(person4).contains(Dev)){
               
                for(String d : person4){
                    
                    System.out.println(d);
                }
            }
          
          
      }}
      if(LA == 4){
          
          String TaskD = JOptionPane.showInputDialog("please enter Task Name :");
          
          if(Arrays.asList(person1).contains(TaskD)){
                
                 person1[0] = null,
                 person1[1] = null;
                 person1[2] = null,
                 person1[3] = null,
                 person1[4] = null,
                 
                 System.out.println("Your task has been deleted");
                 
                 
          }
          
          
      }}
      if(LA == 5){
          
          for(String f: person1){
              System.out.println(i);
          }
          System.out.println("                     " );
          for(String f : person2){
              System.out.println("i");
          }
          System.out.println("                     ");
          for(String f: person3){
              System.out.println("i");
          }
          System.out.println("                       " );
          for(String f : person4){
              System.out.println("i");
          }
          
          
      
      
      //This line of code ends the program
      if(LA == 6){
      
      JOptionPane.showMessageDialog(null, "Have a nice day");
          break; 
               
      
      
      
      }}
      
       }while(ListOp != 1);
       
       
       
    

    
  
      
        
         
         
         

       
    
       
       
    
  
      
     
    

