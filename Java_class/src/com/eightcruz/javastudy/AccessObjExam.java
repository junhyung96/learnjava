package com.eightcruz.javastudy;

import javaStudy.AccessObj;

public class AccessObjExam extends AccessObj {

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p); 
		System.out.println(obj.p2); // protected 상속받지않으면 접근불가
//		System.out.println(obj.k); default 다른패키지에서 접근불가
//		System.out.println(obj.i); private은 접근불가
	}

}
