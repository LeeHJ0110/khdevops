package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) throws IOException {
		System.out.println("=== 서버 메인 메서드 ===");
		
		
		ServerSocket ss = new ServerSocket(12345);
		
		System.out.println("서버소켓이 수신 대기중...");
		Socket socket = ss.accept();
		
		System.out.println(socket.getInetAddress() + "연결됨");
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		PrintWriter pw = new PrintWriter(os);
		
		String msg = br.readLine();
		System.out.println("클라이언트한테 받은 메세지 : " + msg);
		
		pw.println(msg);
		pw.flush();
	}
}
