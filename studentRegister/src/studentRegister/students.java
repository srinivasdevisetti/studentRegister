package studentRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
	student student=new student(null, null, 0, 0);
	List<student> students=new ArrayList<>();
	
	public void AddStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name=");
		String name=sc.next();
		System.out.println("branch=");
		String branch=sc.next();
		System.out.println("year=");
		int year=sc.nextInt();
		System.out.println("rollnumber");
		int rollnumber=sc.nextInt();
		
		students.add(new student(name, branch,year, rollnumber));
	}
	
	public void Rmovestudent(String name) {
	
		for(student s:students) {
			if(s.getName().compareTo(name)==0)
				students.remove(s);
				break;
		}
	}
	public void printstudentlist() {
		for(student s:students) {
			System.out.println("name="+s.getName()+", branch="+s.getBranch()+", year="+s.getYear()+", rollnumber"+s.getRollnumber());
		}
	}

}
