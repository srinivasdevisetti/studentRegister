package studentRegister;

import java.util.Scanner;

public class ui {
	students s=new students();
	
	
	public void menu() {
		startmenu();
		int a=userinput();
		switch (a) {
		case 1 :
			displaystudentlist();
			backtohome();
			break;
		case 2 :
			addstudent();
			backtohome();
			break;
			case 3 :
				removestudent();
				backtohome();
				break;
		
		}
		
	}

	public void backtohome() {
		System.out.println("enter 0 to go home");
		int a=userinput();
		switch (a) {
		case 0 :
			menu();
			break;
		}
	}

	public int userinput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter=");
		int a=sc.nextInt();
		return a;
		
	}
	public void startmenu() {
		System.out.println("select folling options:");
		System.out.println("1.display students list");
		System.out.println("2.add student to list");
		System.out.println("3.remove student from list");
	}
	public void displaystudentlist() {
		s.printstudentlist();
	}
	public void addstudent() {
		s.AddStudent();
	}
	public void removestudent() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name to remove=");
		String name=sc.next();
		s. Rmovestudent( name);
	}

}
