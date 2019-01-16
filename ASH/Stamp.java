import java.util.Scanner;

public class Stamp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		while(n<0) {
			n = scanner.nextInt();
		}
		
		while(n != 0) {
			System.out.print("#");
			n--;
		}
	}

}
