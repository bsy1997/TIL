import java.util.Scanner;
public class Number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String s = scanner.next();
			
			if(s.equals("student"))
				System.out.println("�л�");
		else if(s.equals("love"))
				System.out.println("���");
		else if(s.equals("java"))
				System.out.println("�ڹ�");
		else if(s.equals("happy"))
				System.out.println("�ູ��");
		else if(s.equals("future"))
				System.out.println("�̷�");	
		else if (s.equals("exit")) {

			System.out.println("���α׷� ����");

			break;

		} 
		else

			System.out.println("�׷� ���� �ܾ �����ϴ�");

		}

	}
}

