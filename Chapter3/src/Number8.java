import java.util.Scanner;
public class Number8 {
	
	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner scan = new Scanner(System.in);
		String str [] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scan.next();
			
			int n = (int)(Math.random()*3);
			int usernum = 0;
			
			if(user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				System.exit(0);
				break;
			}
			
			if(user.equals("가위")){usernum = 0;}
			if(user.equals("바위")){usernum = 1;}
			if(user.equals("보")){ usernum = 2;}
   
				System.out.print("사용자 = " + user + " , " + "컴퓨터 = " + str[n] + ", ");
				
			if((usernum + 2) % 3 == n)
				System.out.println("사용자가 이겼습니다.");
			else if(usernum == n)
				System.out.println("비겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}  
		scan.close();
	}
}