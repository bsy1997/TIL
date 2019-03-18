import java.util.Scanner;

public class BOJ1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("나눠질 정수 A와 나눌 정수 B 를 한 칸 띄어 입력하세요");
		System.out.println("(0<A, B<10)");
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int C = A / B ;
		
		System.out.println("A / B 는" +  C );
	}

}