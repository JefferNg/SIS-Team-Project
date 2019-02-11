import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class addstudent
{
static Scanner userInput = new Scanner(System.in);
static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
static double temp;
static String[] grades;
static String GPA;
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
				System.out.println("which student you want to add?");
				String answer1 = question1.nextLine();
			    System.out.println("what's the three classes this student want to take?");
				String answer2 = question1.nextLine();
				String [] courses = answer2.split(" ");
				System.out.println("what's the grade in each the classes in order?");
				String answer3 = question1.nextLine();
				grades = answer3.split(" ");
				calculateGPA();
				Format decimal = new DecimalFormat("0.00");
				double gpa = temp / 3;
				GPA = decimal.format(gpa);
				students.add(new StudentInfo(answer1,courses[0],grades[0],courses[1],grades[1],courses[2],grades[2],GPA));
				for(StudentInfo s: students)
					{
					System.out.println(s.getName());
					}
					}

				
				if(answer == 2)
					{
				Scanner question2 = new Scanner (System.in);
			    System.out.println("which student you want to delete?");
			    int delete = question2.nextInt();
			    System.out.println(students.get(delete-1).getName() + " has been deleted.");
			    students.remove(delete-1);
				for(StudentInfo s: students)
					{
					System.out.println(s.getName());
					}
				
					}

			}
		private static void calculateGPA()
			{
				switch(grades[0])
				{
					case "A":
							{
								temp += 4.0;
								break;
							}
					case "A-":
							{
								temp += 3.7;
								break;
							}
					case "B+":
							{
								temp += 3.3;
								break;
							}
					case "B":
							{
								temp += 3.0;
								break;
							}
					case "B-":
							{
								temp += 2.7;
								break;
							}
					case "C+":
							{
								temp += 2.3;
								break;
							}
					case "C":
							{
								temp += 2.0;
								break;
							}
					case "C-":
							{
								temp += 1.7;
								break;
							}
					case "D+":
							{
								temp += 1.3;
								break;
							}
					case "D":
							{
								temp += 1.0;
								break;
							}
					case "D-":
							{
								temp += 0.7;
								break;
							}
					case "F":
							{
								temp += 0.0;
								break;
							}
					
				}
				
				switch(grades[1])
				{
					case "A":
							{
								temp += 4.0;
								break;
							}
					case "A-":
							{
								temp += 3.7;
								break;
							}
					case "B+":
							{
								temp += 3.3;
								break;
							}
					case "B":
							{
								temp += 3.0;
								break;
							}
					case "B-":
							{
								temp += 2.7;
								break;
							}
					case "C+":
							{
								temp += 2.3;
								break;
							}
					case "C":
							{
								temp += 2.0;
								break;
							}
					case "C-":
							{
								temp += 1.7;
								break;
							}
					case "D+":
							{
								temp += 1.3;
								break;
							}
					case "D":
							{
								temp += 1.0;
								break;
							}
					case "D-":
							{
								temp += 0.7;
								break;
							}
					case "F":
							{
								temp += 0.0;
								break;
							}
					
				}
				
				switch(grades[2])
				{
					case "A":
							{
								temp += 4.0;
								break;
							}
					case "A-":
							{
								temp += 3.7;
								break;
							}
					case "B+":
							{
								temp += 3.3;
								break;
							}
					case "B":
							{
								temp += 3.0;
								break;
							}
					case "B-":
							{
								temp += 2.7;
								break;
							}
					case "C+":
							{
								temp += 2.3;
								break;
							}
					case "C":
							{
								temp += 2.0;
								break;
							}
					case "C-":
							{
								temp += 1.7;
								break;
							}
					case "D+":
							{
								temp += 1.3;
								break;
							}
					case "D":
							{
								temp += 1.0;
								break;
							}
					case "D-":
							{
								temp += 0.7;
								break;
							}
					case "F":
							{
								temp += 0.0;
								break;
							}
							
					
				}
				
			}

	}
