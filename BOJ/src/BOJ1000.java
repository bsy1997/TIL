import java.util.Scanner;

public class BOJ1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ĥ ���� A�� B�� ��ĭ ��� �Է��ϼ���");
		System.out.println("(0<A, B<10)");
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int C = A + B;
		
		System.out.println("A + B = " + C);
	}

}
