import java.util.ArrayList;
import java.util.Scanner;

public class addstudent
{
static Scanner userInput = new Scanner(System.in);
static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
		public static void addingstudents()
			{
				Scanner question = new Scanner (System.in);
				for(StudentInfo s: SISRunner.students)
					{
						students.add(s);
					}
				System.out.println("1) add student 2) delete student");
				int answer = question.nextInt();
				if(answer == 1)
					{
				Scanner question1 = new Scanner (System.in);
				System.out.println("what's the student's name you want to add?");
				String answer1 = question1.nextLine();
			    System.out.println("what's the three classes this student want to take?");
				String answer2 = question1.nextLine();
				String [] courses = answer2.split(" ");
				System.out.println("what's the grade in each the classes in order?");
				String answer3 = question1.nextLine();
				String [] grades = answer3.split(" ");
				students.add(new StudentInfo(answer1,courses[0],grades[0],courses[1],grades[1],courses[2],grades[2], "0.0"));
				System.out.println(students.get(0).getCourse2());
					}
				
				if(answer == 2)
					{
				Scanner question2 = new Scanner (System.in);
			    System.out.println("what's the student's name you want to delete?");
				//String answer3 = question1.nextLine();
					}

			}

	}
