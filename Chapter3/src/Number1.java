import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(char i='a'; i<=c; i++) {
			for(char j=i; j<=c; j++) {
				System.out.print(j);
			}
			System.out.println();
		
		}
		scanner.close();

	}

}
