package com.mycompany.mathsqrttest;

public class mathSqrt {
   
    public static int sqrt(int num){
       int counter = 0;
       int result = -1;
       while(counter != num)
       {
           if((counter * counter) == num)
           {
               result = counter;
               return result;
           }
           if((counter * counter) > num)
           {
               result = counter -1;
               return result;
           }
           counter ++;
       }
       
       return result;
   } 
    
    public static void main(String[] args) {
        System.out.println(sqrt(18));
    }
 
    
}
