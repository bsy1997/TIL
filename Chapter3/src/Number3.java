import java.util.InputMismatchException;
import java.util.Scanner ;
public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>");
		
		try {
			int n = scanner.nextInt();
			if(n%2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
		}
		catch(InputMismatchException n) {
			System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
			
		}
		scanner.close();

	}

}
