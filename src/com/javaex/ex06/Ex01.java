package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		
		//int result = 10 + 7;
		//Integer result = new Integer(10) + new Integer(7);
		
		
		Integer result = i01 + i02;
		
		System.out.println(result);
		
		int i10 = 7; //i10. <--값이 들어있음
		i01.intValue(); // 메소드 사용 할 수 있다.
		
		//박싱
		Integer i11 = 10; //Integer i11 = new Integer(10);
		
		
		//언박싱
		int i101 = i11;
		System.out.println(i101);
		
		System.out.println("----문자열-->정수-----------------");
		
		
		//"12345" --> 12345 예제
		Integer i999 = new Integer(999);
		int num = i999.parseInt("12345");
		System.out.println(num);
		
		// "12345" --> 12345 실제사용
		
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);
		
		// 정수-->문자열로
		
		String str = new String("hi");
		String strResult = str.valueOf(123456); //123456-->"123456"
		System.out.println(strResult);
		
		// 정수-->문자열로 실제사용
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);
		
		// 정수-->문자열로 많이사용
		// 9876 --> "9876"
		
		String yn = "y"; //사용자가 입력한 값
		//String yn = new Stirng("y")
		yn = null;
		
		//nullPoint가 발생 할 수 있다.
		if(yn.equals("y")) {
			
			System.out.println("게임다시시작");
			
		}
		
		//equals() 사용팁 --> nullPoint방지
		if("y".equals(yn)) {
			
			System.out.println("게임다시시작");
			
		}
		
		//다른 기본 자료형
		Byte b = new Byte((byte)1);
		Short s = new Short((short)1);
		
		
	}
	
	
}
