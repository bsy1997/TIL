import java.util.Scanner;
public class Number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<100; i++) {
			if(i<10) {
			if(i%3 == 0)
				System.out.println(i + " �ڼ� �ѹ� ");
			}
			if (i >= 10) {
				int f = i / 10;
				int s = i % 10;
					
				if (f % 3 == 0) {
					if (s % 3 == 0)

						System.out.println(i + " �ڼ� �� ��");

					else

						System.out.println(i + " �ڼ� �� �� ");
					}

				else if (s % 3 == 0)

					System.out.println(i + " �ڼ� �� ��");
			 	}

		 }

	}
}