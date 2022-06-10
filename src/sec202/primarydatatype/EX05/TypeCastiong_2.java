package sec202.primarydatatype.EX05;

public class TypeCastiong_2 {
	public static void main(String[] args) {
		
		//#1. 자동 타입 변환 (업 캐스팅)
		float value1 = 3; // 오른쪽 3은 int이니 자동으로 float으로 업 캐스팅해준다
		long value2 = 5; // 오른쪽 5는 int이니 자동으로 long으로 업 캐스팅해준다
		double value3 = 7; // double로 업캐스팅 돼서 값은 7.0이 
		byte value4 = 9; // 저장할 수 있는 값의 범위 값을 byte나 short로 입력하는 경우 정수는 각각 byte나 short로 캐스팅
		short value5 = 11; // 저장할 수 있는 값의 범위 값을 byte나 short로 입력하는 경우 정수는 각각 byte나 short로 캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//#2. 수동 타입 변환
		byte value6 = (byte)128; // -128~127까지 원으로 연결돼 있어서 Byte의 범위 안에서 순환함, 128은 +127을 넘어 -128로 가서 값은 -128(circular form)
		int value7 = (int)3.5; // 정수만 챙기니 값은 3
		float value8 = (float)7.5; // double에서 float으로 다운 캐스

		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}
}
