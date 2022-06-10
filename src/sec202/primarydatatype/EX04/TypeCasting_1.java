package sec202.primarydatatype.EX04;

public class TypeCasting_1 {
	public static void main(String[] args) {
		
		//#1. 캐스팅 방법
		//#1-1. 캐스팅 방법 1 (데이터 타입)
		int value1 = (int)5.3; // 오른쪽 5.3 은 double로 인식돼서 오류가 나지만 (int)를 붙어서 다운캐스팅을 시킨 것, 값은 int로 나오니 소숫점은 삭제되고 5만 출력
		long value2 = (long)10;
		float value3 = (float)5.8; // 실수는 기본적으로 double로 인식
		double value4 = (double)16; // 값이 double 로 나옴으로 소숫점이 생성돼서 나옴 16.0
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//#1-2. 캐스팅 방법 2 (L, F)
		long value5 = 10L; 
		long value6 = 10l; //소문자 l 도 가능하지만 1과 비교하기 힘드니대 문자로 쓰기
		float value7 = 5.8F; 
		float value8 = 5.8f;
		
		double v = 5.8d; // 잘 쓰진 않지만 double로도 캐스팅이 가능
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);

	}

}
