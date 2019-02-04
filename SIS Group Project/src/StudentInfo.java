
public class StudentInfo
	{
		private String name;
		private String courses;
		private String grade;
		private double gpa;
		private String course2;
		private String course3;
		private String grade2;
		private String grade3;
		
		public StudentInfo(String n, String c, String gr, double gp)
		{
			name = n;
			courses = c;
			grade = gr;
			gpa = gp;
			
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getCourses()
			{
				return courses;
			}

		public void setCourses(String courses)
			{
				this.courses = courses;
			}

		public String getGrade()
			{
				return grade;
			}

		public void setGrade(String grade)
			{
				this.grade = grade;
			}

		public double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}
		
		
	}
