import java.util.InputMismatchException;
import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char day[] = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		
		while(true) {
			int n =0;
			
			System.out.print("������ �Է��ϼ���>>");
			
			try {
				n = scanner.nextInt();
				switch (n % 7) {
				case 0:
				System.out.println("��");
				break;
				case 1:
				System.out.println("��");
				break;
				case 2:
				System.out.println("ȭ");
				break;
				case 3:
				System.out.println("��");
				break;
				case 4:
				System.out.println("��");
				break;
				case 5:
				System.out.println("��");
				break;
				case 6:
				System.out.println("��");
				break;
				}
			}
			catch (InputMismatchException e) {

				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�");
				break;
				}

			if(n < 0){

				System.out.println("���α׷� �����մϴ�...");

				break;

				}

			}
			scanner.close();
	}
}