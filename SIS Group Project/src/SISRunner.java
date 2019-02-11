
import java.util.*;
import java.io.*;
import java.text.*;


public class SISRunner
	{
		static Scanner userInput = new Scanner(System.in);
		static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
		
		public static void fillList() throws IOException
		{
			Scanner file = new Scanner(new File("studentInfo.txt"));
			while(file.hasNext())
				{
					String firstName = file.next();
					String lastName = file.next();
					String course1 = file.next();
					String grade1 = file.next();
					String course2 = file.next();
					String grade2 = file.next();
					String course3 = file.next();
					String grade3 = file.next();
					double gpa = 0.0;
					double temp = 0.0;
					
					switch(grade1)
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
					
					switch(grade2)
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
					
					switch(grade3)
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
					
					Format decimal = new DecimalFormat("0.00");
					gpa = temp / 3;
					String GPA = decimal.format(gpa);
					
					
					students.add(new StudentInfo(firstName + " " + lastName, course1, grade1, course2, grade2, course3, grade3, GPA));
					
				}
			
		}
		
		public static void main(String[] args) throws IOException
			{

				fillList();
				mainMenu();
				
			}

		private static void mainMenu()
			{
				boolean choosing = true;
				System.out.println("Welcome to the Student Information System"
						+ "\nWhat would you like to do?");
				do
					{
				System.out.println("[1] Add or delete student"
						+ "\n[2] Change student grades/schedule"
						+ "\n[3] Sort students");
				
				int option = userInput.nextInt();
				
					if(option == 1)
						{
							choosing = false;
						}
					else if(option == 2)
						{
						changegradeandclass.changegradeandclass();
							choosing = false;
						}
					else if(option == 3)
						{
							sortStudent.addingStudents();
							sortStudent.howToSort();
							choosing = false;
						}
					else
						{
							System.out.println("That was not a valid choice. Please choose again");
						}
				
					}
				while(choosing);
				
//				for(StudentInfo s: students)
//					{
//						System.out.println(s.getGpa());
//					}
				

			}

	}
