package common;

import java.io.PrintWriter;
import java.util.Scanner;

public class MsgSender extends Thread {
   
   public MsgSender(PrintWriter pw) {
      this.pw = pw;
   }
   
   private PrintWriter pw;
   
   @Override
   public void run() {
      
      Scanner sc = new Scanner(System.in);
      while(true) {
         String input = sc.nextLine(); 
         pw.println(input);
         pw.flush();
      }
      
   }

}