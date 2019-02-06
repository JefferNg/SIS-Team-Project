import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortStudent
	{
		static Scanner userInput = new Scanner(System.in);
		static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
		
		public static void addingStudents()
		{
			for(StudentInfo s: SISRunner.students)
				{
					students.add(s);					
				}
			
		}
		
		public static void howToSort()
		{
			boolean choosing = true;
			System.out.println("How would you like to sort the students?");
			do
				{
					System.out.println("[1] By first name"
							+ "\n[2] By last name"
							+ "\n[3] By GPA"
							+ "\n[4] By Courses");
					int choice = userInput.nextInt();
					if(choice == 1)
						{
							for(int i = 0; i < students.size(); i++)
								{
									for(int j = i + 1; j < students.size(); j++)
										{
											String name1 = students.get(i).getName().substring(0, 4);
											String name2 = students.get(j).getName().substring(0, 4);
											char first1 = name1.charAt(0);
											char second1 = name2.charAt(0);
											char first2 = name1.charAt(1);
											char second2 = name2.charAt(1);
											char first3 = name1.charAt(2);
											char second3 = name2.charAt(2);
											char first4 = name1.charAt(3);
											char second4 = name2.charAt(3);
											int num1 = (int) first1;
											int num2 = (int) second1;
											
											if(num1 > num2)
												{
													StudentInfo temp = students.get(i);
													students.set(i, students.get(j));
													students.set(j, temp);
													
												}
											else if(num1 == num2)
												{
													if(first2 > second2)
														{
															StudentInfo temp = students.get(i);
															students.set(i, students.get(j));
															students.set(j, temp);
														}
													else if(first2 == second2)
														{
															if(first3 > second3)
																{
																	StudentInfo temp = students.get(i);
																	students.set(i, students.get(j));
																	students.set(j, temp);
																}
															else if(first3 == second3)
																{
																	if(first4 > second4)
																		{
																			StudentInfo temp = students.get(i);
																			students.set(i, students.get(j));
																			students.set(j, temp);
																		}
																}
															
														}
													
												}
											
										}
									
								}
							
							for(StudentInfo i: students)
								System.out.println(i.getName());
							
							choosing = false;
						}
					else if(choice == 2)
						{
							for(int i = 0; i < students.size(); i++)
								{
									for(int j = i + 1; j < students.size(); j++)
										{
											String[] names1 = students.get(i).getName().split(" ");
											String[] names2 = students.get(j).getName().split(" ");
											char first1 = names1[1].charAt(0);
											char second1 = names2[1].charAt(0);
											char first2 = names1[1].charAt(1);
											char second2 = names2[1].charAt(1);
//											char first3 = names1[1].charAt(2);
//											char second3 = names2[1].charAt(2);
//											char first4 = names1[1].charAt(3);
//											char second4 = names2[1].charAt(3);
											int num1 = (int) first1;
											int num2 = (int) second1;
											if(num1 > num2)
												{
													StudentInfo temp = students.get(i);
													students.set(i, students.get(j));
													students.set(j, temp);
													
												}
											else if(num1 == num2)
												{
													if(first2 > second2)
														{
															StudentInfo temp = students.get(i);
															students.set(i, students.get(j));
															students.set(j, temp);
														}
													
												}
											
										}
									
								}
							
							for(StudentInfo i: students)
								System.out.println(i.getName() + " " + i.getGpa());
							
							
							choosing = false;
						}
					else if(choice == 3)
						{
							for(int i = 0; i < students.size(); i++)
								{
									for(int j = i + 1; j < students.size(); j++)
										{
											double num1 = Double.parseDouble(students.get(i).getGpa());
											double num2 = Double.parseDouble(students.get(j).getGpa());
											if(num2 > num1)
												{
													StudentInfo temp = students.get(i);
													students.set(i, students.get(j));
													students.set(j, temp);
													
												}
											
										}
									
								}
							
							for(StudentInfo i: students)
								System.out.println(i.getName() + " " + i.getGpa());
									
							choosing = false;
						}
					else if(choice == 4)
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