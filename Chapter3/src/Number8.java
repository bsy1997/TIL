import java.util.Scanner;
public class Number8 {
	
	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		Scanner scan = new Scanner(System.in);
		String str [] = {"����", "����", "��"};
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = scan.next();
			
			int n = (int)(Math.random()*3);
			int usernum = 0;
			
			if(user.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				System.exit(0);
				break;
			}
			
			if(user.equals("����")){usernum = 0;}
			if(user.equals("����")){usernum = 1;}
			if(user.equals("��")){ usernum = 2;}
   
				System.out.print("����� = " + user + " , " + "��ǻ�� = " + str[n] + ", ");
				
			if((usernum + 2) % 3 == n)
				System.out.println("����ڰ� �̰���ϴ�.");
			else if(usernum == n)
				System.out.println("�����ϴ�.");
			else
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}  
		scan.close();
	}
}