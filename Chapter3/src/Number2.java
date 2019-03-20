import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 10개 입력>>");
		
		int n[] = new int[10];
		

		for(int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt();
			
			if(n[i]%3 == 0)
				System.out.print(n[i]+" ");
			
		}
	}

}
