package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import common.MsgReader;
import common.MsgSender;

public class ClientMain {
   
   public static void main(String[] args) throws Exception {
      System.out.println("===== client =====");
      
      String ip = "192.168.20.149";
      int port = 12345;
      
      Socket socket = new Socket(ip , port);
      
      System.out.println("연결 완료 ~ ! 채팅 시작 !");
      
      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();
      
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      PrintWriter pw = new PrintWriter(os);
      
      new MsgReader(br).start();
      new MsgSender(pw).start();
      
   }

}
