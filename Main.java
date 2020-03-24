import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] a = {
				new Student(14069, "박**", "수학", 3),  new Student(12051, "황**", "경영" ,4),
				new Student(14069, "백**", "디자인", 2), new Student(12051, "박**", "수학" ,4),
				new Student(14069, "장**", "영문", 2),  new Student(12051, "정**", "수학" ,1),
				new Student(14069, "최**", "컴퓨터", 2), new Student(12051, "진**", "경제" ,2),
				new Student(14069, "김**", "컴퓨터", 4), new Student(12051, "강**", "경영" ,3),
				new Student(14069, "김**", "컴퓨터", 1), new Student(12051, "한**", "경영" ,4),
				new Student(14069, "이**", "컴퓨터", 2)
		};
		
		Arrays.sort(a);
		print(a, "ID");
		
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "학과");	
		
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "이름");	
		
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "학년");
	}
	
	public static void print(Student[] student, String sort) {
		System.out.println("[ " + sort + " ] 정렬");
	       for(Student stu : student) {
	    	   System.out.println("ID: " + stu.getID() + " / " + 
	    			   			  "학과: " + stu.getDept() + " / " + 
	    			   			  "이름: " + stu.getName() + " / " + 
	    			   			  "학년: " + stu.getGrade());
	       }
	   }
}
