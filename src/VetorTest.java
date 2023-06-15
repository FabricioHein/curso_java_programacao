import java.util.Locale;
import java.util.Scanner;

public class VetorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			System.out.println(sc.nextDouble());


		}
//		for (double i : vect) {
//			System.out.println(i);
//
//		}
		sc.close();

	}

}
