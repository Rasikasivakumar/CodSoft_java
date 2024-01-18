import java.util.Scanner;
import java.lang.*;
public class Grade_Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	Grade_Calculator obj = new Grade_Calculator();
	int marks[]=new int[10];
	System.out.print("Enter the no.of subjects: ");
	int n=in.nextInt();
	System.out.println("Enter the marks obtained in "+n+" subjects out of 100");
	int sum=0;
	double avg;
	for(int i=0;i<n;i++){
		marks[i]=in.nextInt();
		sum+=marks[i];
          }  
	avg=sum/n;
	System.out.println("Results:");
	System.out.println("Total Marks out of "+n*100+": "+sum);
	System.out.println("Average Percentage: " + avg + "%");
	System.out.println("Grade: " +obj.calculate_grade(avg));
    }
    String calculate_grade(double avg){
        if(avg>90){
            return "O";
        }
        else if((avg>80) && (avg<=90)){
            return "A+";
        }
        else if((avg>70) && (avg<=80)){
            return "A";
        }
        else if((avg>60) && (avg<=70)){
            return "B+";
        }
        else if((avg>50) && (avg<=60)){
            return "B";
        }
        else if((avg>=45) && (avg<=50)){
            return "C";
        }
        else{
            return "U";
        }
    }
}
