package client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import common.Reader;
import common.Sender;

public class Main {
	
	public static String name;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("닉네임 : ");
		Main.name = "[" + sc.nextLine() + "] ";
		
		System.out.print("접속할 ip : ");
		String ip = sc.nextLine();
		
		System.out.print("접속할 port : ");
		String port_ = sc.nextLine();
		int port = Integer.parseInt(port_);
		
		try {
			Socket s = new Socket(ip, port);
			
			new Thread(new Sender(s)).start();
			new Thread(new Reader(s)).start();
			
			System.out.println("===== 연결 완료 =====");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
