package operator.sec01_operator_1.EX03;

public class ShiftOperator {
	public static void main(String[] args) {
		
		//#1. 산술 쉬프트(	부호변화가 없음) *2, /2의 효과
		//@ << Left shift
		System.out.println(3<<1); //6 왼쪽으로 1칸가면 2의 1승 곱하기
		System.out.println(-3<<1); // -6
		System.out.println(3<<2); // 12 왼쪽으로 2칸가면 2의 2승 곱하기
		System.out.println(-3<<2); // -12
		System.out.println();

		//@ >> Right shift
		System.out.println(5>>1); // 2값은 나누기의 몫이 나옴, 나머지는 버 왼쪽으로 1칸가면 2의 1승 나누기
		System.out.println(-5>>1); // -2에서 음수는 소숫점을 올림 해야하니 -2.5에서 -3으
		System.out.println(5>>2); // 1 소숫 0.25는 버려짐
		System.out.println(-5>>2); // -2 , -1.25에서 소숫점 올림돼서 -2
		System.out.println();
		
		//#2. 논리 쉬프트 (>>>)
		System.out.println(3>>>1); // 1, 0000...0011 -> 0000....0001 오른쪽으로 한칸 가게됨으로 >>와 똑같은 값이나옴
		System.out.println(-3>>>31); // 1111...1101 -> 2진법 최대 표기 수 32개중 오른쪽으로 32칸 가면 0000...0001이 됨으로 값은 1
			
	}

}
