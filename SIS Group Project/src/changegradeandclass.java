import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;


public class changegradeandclass{
	static Scanner userInput = new Scanner(System.in);
	static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
	public static void addingStudents()
		{
			for(StudentInfo s: SISRunner.students)
				{
					students.add(s);
					
				}
			
		}
	
public static void changegradeandclass()
	{
		
	
        addingStudents();
		Scanner ask = new Scanner(System.in);
		System.out.println(" 1) Switch Classes  2) Change Grade ");
		int answer = ask.nextInt();
		if(answer == 1) {
			Scanner ask2 = new Scanner(System.in);
			for(int i = 0; i<students.size();i++) {
				System.out.print(i+1 + " ");
				System.out.print(students.get(i).getName() + " ");
				System.out.print(students.get(i).getCourses1() + " ");
				System.out.print(students.get(i).getGrade1() + " ");
				System.out.print(students.get(i).getCourse2() + " ");
				System.out.print(students.get(i).getGrade2() + " ");
				System.out.print(students.get(i).getCourse3() + " ");
				System.out.println(students.get(i).getGrade3());
				
			}
			System.out.println();
			System.out.println("Whose class do you want to change? (put in the number)");
			int answer2 = ask2.nextInt();
			System.out.println("1." + students.get(answer2-1).getCourses1());
			System.out.println("2." + students.get(answer2-1).getCourse2());
			System.out.println("3." + students.get(answer2-1).getCourse3());
			Scanner ask3 = new Scanner(System.in);
            System.out.println("Which course do you want to change? (Put in the number)");
			int answer3 = ask3.nextInt();
			Scanner ask4 = new Scanner(System.in);
			System.out.println("What is the class you want to change to?");
		    String answer4 = ask4.nextLine();		  
		    if(answer3 == 1) {
		    	students.get(answer2-1).setCourses1(answer4);
		    	
		    	
		    }
		    else if(answer3 == 2) {
		    	students.get(answer2-1).setCourse2(answer4);
		    	
		    	
		    }	
		    else if (answer3 == 3) {
		    	students.get(answer2-1).setCourse3(answer4);
		    	
		    	
		    }	
		    
		    else{
		    	
		    }
		    for(int i = 0; i<students.size();i++) {
				System.out.print(i+1 + " ");
				System.out.print(students.get(i).getName() + " ");
				System.out.print(students.get(i).getCourses1() + " ");
				System.out.print(students.get(i).getGrade1() + " ");
				System.out.print(students.get(i).getCourse2() + " ");
				System.out.print(students.get(i).getGrade2() + " ");
				System.out.print(students.get(i).getCourse3() + " ");
				System.out.println(students.get(i).getGrade3());
				
			
			}
				
				
			}
		
		
		if(answer==2) {
			
			Scanner ask5 = new Scanner(System.in);
			for(int i = 0; i<students.size();i++) {
				System.out.print(i+1 + " ");
				System.out.print(students.get(i).getName() + " ");
				System.out.print(students.get(i).getCourses1() + " ");
				System.out.print(students.get(i).getGrade1() + " ");
				System.out.print(students.get(i).getCourse2() + " ");
				System.out.print(students.get(i).getGrade2() + " ");
				System.out.print(students.get(i).getCourse3() + " ");
				System.out.println(students.get(i).getGrade3());
				
			}
			System.out.println(" Whose grades do you want to change? (put in the number)");
		    int answer5 = ask5.nextInt();
			System.out.println("1." + students.get(answer5-1).getGrade1());
			System.out.println("2." + students.get(answer5-1).getGrade2());
			System.out.println("3." + students.get(answer5-1).getGrade3());
			Scanner ask6 = new Scanner(System.in);
            System.out.println(" Which grade do you want to change? (put in the number) ?");
			int answer6 = ask6.nextInt();
			Scanner ask7 = new Scanner(System.in);
			System.out.println(" What is the grade you want to change to?");
		    String answer7 = ask7.nextLine();
		    if(answer6 == 1) {
		    	students.get(answer5-1).setGrade1(answer7);
		    	
		    	
		    }
		    if(answer6 == 2) {
		    	students.get(answer5-1).setGrade2(answer7);
		    	
		    	
		    }	
		    if(answer6 == 3) {
		    	students.get(answer5-1).setGrade3(answer7);
		    	
		    	
		    }	
				
			
		    for(int i = 0; i<students.size();i++) {
				System.out.print(i+1 + " ");
				System.out.print(students.get(i).getName() + " ");
				System.out.print(students.get(i).getCourses1() + " ");
				System.out.print(students.get(i).getGrade1() + " ");
				System.out.print(students.get(i).getCourse2() + " ");
				System.out.print(students.get(i).getGrade2() + " ");
				System.out.print(students.get(i).getCourse3() + " ");
				System.out.println(students.get(i).getGrade3());
				
			}
			
			
			
		}
			
	}
}
