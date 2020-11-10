package com.company;

import java.util.Scanner;

public class Collage {
   public double programming ;
   public double networking;
   public double web_design;
   public double total;
   public double average;


public Collage(){
   this.programming=0;
   this.networking=0;
   this.web_design=0;
   this.total=0;
   this.average=0;
}
   public  Collage(double programming, double networking,double web_design)
   {
      this.programming = programming;
      this.networking = networking;
      this.web_design = web_design;
   }
 public void data_in(){
         System.out.println("please enter programming marks :");
         Scanner scanner=new Scanner(System.in);
         this.programming=scanner.nextDouble();

         System.out.println("please enter networking marks :");
         Scanner scanner1=new Scanner(System.in);
         this.networking=scanner1.nextDouble();

         System.out.println("please enter web_design marks :");
         Scanner scanner2=new Scanner(System.in);
         this.web_design= scanner2.nextDouble();
      }
 public double compute() {
   this.total=this.programming + this.networking + this.web_design;
    this.average =(this.total)/3;
    return 0;
      }


      public void data_out() {
         this.compute();
         System.out.println("The average is :" + this.average);
         System.out.println("The total  is :" + this.total);
      }
}


