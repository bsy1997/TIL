import java.util.Scanner;

public class BOJ1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("합칠 정수 A와 B를 한칸 띄어 입력하세요");
		System.out.println("(0<A, B<10)");
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int C = A + B;
		
		System.out.println("A + B = " + C);
	}

}
