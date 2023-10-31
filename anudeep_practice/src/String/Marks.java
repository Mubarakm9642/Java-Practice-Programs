package String;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NoSchools = 3;
		int[] NoClasses = {5,4,3};
		int[][] NoStudents = {{3,4,2,1,5},{1,3,4,2},{2,3,4}};
		
		// Creating the 3D array to store marks of students
        int[][][] marks = new int[NoSchools][][];
        
        Scanner sc = new Scanner(System.in);
        
     // Collecting marks of students for each school, class, and student
        for (int school = 0; school < NoSchools; school++) {
            marks[school] = new int[NoClasses[school]][];
            System.out.println("School " + (school + 1) + ":");
            for (int classNo = 0; classNo < NoClasses[school]; classNo++) {
                marks[school][classNo] = new int[NoStudents[school][classNo]];
                System.out.println("Class " + (classNo + 1) + ":");
                for (int student = 0; student < NoStudents[school][classNo]; student++) {
                    System.out.print("Enter marks for student " + (student + 1) + ": ");
                    marks[school][classNo][student] = sc.nextInt();
                }
            }
            

        }
        
     // Display the collected marks
        System.out.println("\nMarks of students in each school:");
        for (int school = 0; school < NoSchools; school++) {
            System.out.println("\nSchool " + (school + 1) + ":");
            for (int classNo = 0; classNo < NoClasses[school]; classNo++) {
                System.out.print("Class " + (classNo + 1) + ": ");
                for (int student = 0; student < NoStudents[school][classNo]; student++) {
                    System.out.print(marks[school][classNo][student] + " ");
                }
                System.out.println();

            }
	
        }
	}
}
