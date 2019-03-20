import java.util.Scanner;
public class Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 10개 입력>>");
		
		int n[] = new int[10];
		
		for(int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt();
		}
		
		for(int i=n.length-1; i>=0; i--) {

			for(int j=0;j<i;j++)

			if(n[j] > n[j+1]){

				int temp = n[j];

				n[j] = n[j+1];

				n[j+1] = temp;

			}

		}

		for(int i=0; i<n.length; i++)

			System.out.print(n[i] + " ");

		System.out.println();

		scanner.close();

	}

}