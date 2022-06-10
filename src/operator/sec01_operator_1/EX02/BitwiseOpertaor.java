package operator.sec01_operator_1.EX02;

public class BitwiseOpertaor {
	public static void main(String[] args) {
		
		//#0. 자바코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); // 2진 1101
		System.out.println(Integer.toOctalString(data)); // 8진수 15
		System.out.println(Integer.toHexString(data)); //  16진수 d 
		System.out.println();
		

		System.out.println(Integer.parseInt("1101", 2)); //13 , string 이 있기 때문에 문자열로 숫자들을 적어주고 그 뒤에 진법을 써줘야 한다.
		System.out.println(Integer.parseInt("15", 8)); //13
		System.out.println(Integer.parseInt("0d", 16)); //13
		
		//#1. 다양한 진법 표현
		System.out.println(13); //13
		System.out.println(0b1101); //13
		System.out.println(015); //13
		System.out.println(0x0d); //13
		System.out.println();
		//#2. 비트 연산자
		//@ And 비트 연산
		System.out.println(3 & 10); //2
		System.out.println(0b0011 & 0b1010); // 0b0010 -> 2
		System.out.println(0x03 & 0x0a); //2
		System.out.println();
		
		//@ Or 비트 연산자
		System.out.println(3 | 10); // 11
		System.out.println(0b0011 | 0b1010); // 0b1011 -> 11
		System.out.println(0x03 | 0x0a); // 11
		System.out.println();
		
		//@ Xor 비트 연산자
		System.out.println(3 ^ 10); // 9
		System.out.println(0b0011 ^ 0b1010); // 0b1001 -> 9
		System.out.println(0x03 ^ 0x0a); // 9
		System.out.println();
		
		//@ Not 비트 연산자	
		System.out.println(~3); // -4
		System.out.println(~0b0011); // 0b11111.........1100 -> 0을 기준으로 읽어서 3인데 거기서 +1해서 4이고 첫자리가 1이니 음수인 -4가 됨
		System.out.println(~0x03); // -4
		System.out.println();
			
		
		}
}
