import java.util.*;
import java.io.*;

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
					
					
				}
			
		}
		
		public static void main(String[] args)
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
							choosing = false;
						}
					else if(option == 3)
						{
							choosing = false;
						}
					else
						{
							System.out.println("That was not a valid choice. Please choose again");
						}
				
					}
				while(choosing);
			}

	}
