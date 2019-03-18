package com.epam.calculator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/*Calculator program 
 * @param first number
 * @param second number
 * @param option for the operation
 * @return answer
 * 
 */

public class Calculator {
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static Scanner br = new Scanner(System.in);
  
  static {
    try {
      bw.newLine();
      bw.write("calculator");
      bw.write("\nEnter first no :");
      bw.flush();
      float a = br.nextFloat();
      bw.write("\nEnter second no :");
      bw.flush();
      float b = br.nextFloat();
      bw.write("\nNow choose the operation "
          + "\n 1.addition \n 2.multiplication \n 3.division \n enter no. : ");
      bw.flush();
      int c = br.nextInt();
      float res;
      switch (c) {
            
        case 1:
          res = a + b;
          bw.write("\n result : " + res);
          break;
        case 2:
          res = a * b;
          bw.write("\n result : " + res);
          break;
        case 3:
          if (b > 0) {
            res = a / b;
            bw.write("\n result : " + res);
          } else {
            bw.write("\n invalid divisor");
            break;
          } 
        default :
          bw.write("\n invalid entry");
      }
      bw.close();
      br.close();
            
    } catch (IOException ex) {
    
    }
    System.exit(0);
  }
  /*Function of main
   * 
   */
  
  public static void main(String[] args) {
  // TODO Auto-generated method stub

  }

}