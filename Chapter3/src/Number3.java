import java.util.InputMismatchException;
import java.util.Scanner ;
public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>");
		
		try {
			int n = scanner.nextInt();
			if(n%2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
		catch(InputMismatchException n) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
			
		}
		scanner.close();

	}

}
