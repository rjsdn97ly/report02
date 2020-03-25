import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도를 입력 : ");
		year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("입력하신 년도는 윤년입니다.");
		}
		else {
			System.out.println("입력하신 년도는 평년입니다.");
		}

	}

}
