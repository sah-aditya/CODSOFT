import java.util.*;

 
class StudentGradeCalculator
{
  
public static void main (String args[])
  {
    
System.out.print ("Please enter the name of the student: ");
    
Scanner sc = new Scanner (System.in);
    
String name = sc.nextLine ();
    
System.out.println ("Please enter the number of Total Subjects: ");
    
int subjects = sc.nextInt ();
    
 
      // Consume the newline character left by nextInt()
      sc.nextLine ();
    
 
System.out.
      println ("Please enter the marks only out of 100 one by one: ");
    
double sumofmarks = 0.0;
    
double marks;
    
for (int i = 1; i <= subjects; i++)
      {
	
marks = sc.nextDouble ();
	
sumofmarks += marks;
      
} 
System.out.println ("Name of Student: " + name);
    
System.out.println ("Total Marks: " + sumofmarks + " Out of: " +
			 (100 * subjects));
    
double percentage = (sumofmarks) / (subjects * 100) * 100;
    
System.out.println ("Percentage: " + percentage);
    
if (percentage >= 90.00)
      {
	
System.out.println ("Grade: A+");
      
}
    else if (percentage >= 80.00 && percentage < 90.00)
      {
	
System.out.println ("Grade: A");
      
}
    else if (percentage >= 70.00 && percentage < 80.00)
      {
	
System.out.println ("Grade: B+");
      
}
    else if (percentage >= 60.00 && percentage < 70.00)
      {
	
System.out.println ("Grade: B");
      
}
    else if (percentage >= 55.00 && percentage < 60.00)
      {
	
System.out.println ("Grade: C+");
      
}
    else if (percentage >= 45.00 && percentage < 55.00)
      {
	
System.out.println ("Grade: C");
      
}
    else if (percentage >= 40.00 && percentage < 45.00)
      {
	
System.out.println ("Grade: D");
      
}
    else if (percentage < 40.00)
      {
	
System.out.println ("Grade: E");
      
}
  
}

}


