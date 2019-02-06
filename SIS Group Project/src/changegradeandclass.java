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
		System.out.println(" 1) Change Grade   2) Switch Classes");
		int answer = ask.nextInt();
		if(answer == 1) {
			Scanner ask2 = new Scanner(System.in);
			System.out.println(" Whose grade do you want to change?");
			String answer2 = ask2.nextLine();
			Scanner ask3 = new Scanner(System.in);
            System.out.println(" What grade do you want to change to?");
			String answer3 = ask3.nextLine();
			for(int i = 0; i < students.size(); i++) {
				
				
				
			}
			
	}
}
}