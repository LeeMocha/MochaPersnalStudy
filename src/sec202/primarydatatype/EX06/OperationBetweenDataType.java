package sec202.primarydatatype.EX06;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		//#1. 같은 자료형간의 연산
		int value1 = 3+5;
		int value2 = 8/5; 
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byate value5 = data1 + data2;
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//#2. 다른 자료형간의 연산
		//int value6 = 5 + 3.5; // int + double 이 돼서 int가 컴파일러에서 자동으로 업캐스팅을 해주지만 왼쪽 value6의 값은 int 임으로 오류가 생
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4; // byte나 short의 저장된 값의 출력 값은 항상 int로 나
		double value10 = data3 + data4;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
	}

}
