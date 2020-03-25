import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 단 입력 : ");
		i = scan.nextInt();
		
		for(int j = 1; j <= 9; j++) {
			result = i * j;
			System.out.println(i + " X " + j + " = " + result);
		}
		
	}

}