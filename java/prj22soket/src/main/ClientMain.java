package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) throws Exception {
		System.out.println("=== 클라이언트 메인 메서드 ===");
		
		Scanner sc = new Scanner(System.in);
		
		Socket socket = new Socket("127.0.0.1", 12345);
		System.out.println("연결 성공");
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os);
		
		System.out.print("전송할 메세지 : ");
		String input = sc.nextLine();
		pw.println(input);
		pw.flush();
		
		String msg = br.readLine();
		System.out.println("서버 : " + msg);
	}
}
