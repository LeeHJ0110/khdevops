package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import common.MsgReader;
import common.MsgSender;

public class ServerMain {
   
   public static void main(String[] args) throws Exception {
      System.out.println("===== server =====");
      
      ServerSocket serverSocket = new ServerSocket(12345);
      
      Socket socket = serverSocket.accept();
      
      System.out.println("연결 완료 ~ ! 채팅 시작 !");
      
      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();
      
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      PrintWriter pw = new PrintWriter(os);
      
      new MsgReader(br).start();
      new MsgSender(pw).start();
      
   }

}










