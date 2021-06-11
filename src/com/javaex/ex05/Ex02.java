package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println("====================");
		
		a = a.concat(b); //문자열 붙이기
		System.out.println(a);
		
		a = a.trim(); //공백을 삭제
		System.out.println(a);
		System.out.println("-------"+a+"------");

		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("====================");
		
		a.split(",");
		
		System.out.println(a);
		
		System.out.println("--------배열---------");
		
		String[] sArray = a.split("d");
		
		for(int i=0; i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("------------------------");
		
		String str = "Hello java!";
		
		System.out.println(str.charAt(6));
		
		String result = str.substring(3);
		
		System.out.println(result);
		
		String result2 = str.substring(3,9);
		
		System.out.println(result2);
		
	}

}
