import java.util.Scanner;

public class leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		
		do {
		
		System.out.print("년도를 입력(0보다 작은 수 입력시 프로그램 종료) : ");
		year = scan.nextInt();
		
		if(year < 0) {
			System.out.println("종료 되었습니다.");
			i = 0;
		}
		else {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("입력하신 년도는 윤년입니다.");
			}
			else {
				System.out.println("입력하신 년도는 평년입니다.");
			}
		}
		
		}while(i != 0);

	}

}