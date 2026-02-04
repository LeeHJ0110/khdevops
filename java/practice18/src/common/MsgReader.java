package common;

import java.io.BufferedReader;
import java.io.IOException;

public class MsgReader extends Thread {
   
   public MsgReader(BufferedReader br) {
      this.br = br;
   }
   
   private BufferedReader br;
   
   @Override
   public void run() {
      try {
         while(true) {
            String str = br.readLine();
            System.out.println("[상대방] : " + str);
         }
      } catch (IOException e) {
         System.out.println("메세지 읽다가 에러발생 ...");
         e.printStackTrace();
      }
   }

}
