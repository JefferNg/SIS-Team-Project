import java.util.*;
import java.io.*;

public class SISRunner
	{
		static Scanner userInput = new Scanner(System.in);
		
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
