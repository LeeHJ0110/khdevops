package main;

import member.MemberVo;

public class Main {
	
	public static MemberVo loginMemberVo = null;

	public static void main(String[] args) {
		new DispatcherController().process();

	}

}
