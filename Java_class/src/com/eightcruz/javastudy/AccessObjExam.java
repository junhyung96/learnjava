package com.eightcruz.javastudy;

import javaStudy.AccessObj;

public class AccessObjExam extends AccessObj {

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p); 
		System.out.println(obj.p2); // protected ��ӹ��������� ���ٺҰ�
//		System.out.println(obj.k); default �ٸ���Ű������ ���ٺҰ�
//		System.out.println(obj.i); private�� ���ٺҰ�
	}

}
