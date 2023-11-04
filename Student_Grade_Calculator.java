import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking User Input for Number of Subjects
        System.out.println("Enter the Number of Subjects");
        int n=sc.nextInt();
        //Creating an Array for Marks of n Subjects
        int marks[]=new int[n];
        //Taking Marks as Input from User
        for(int i=0;i<n;i++){
            System.out.println("Enter the Marks of Subject "+(i+1));
            marks[i]=sc.nextInt();
        }
        //Calculating Sum of all Marks entered by User
        //Using the Concept of Sum of all Elements of Array
        int Total_Marks=0;
        for(int i=0;i<n;i++){
            Total_Marks+=marks[i];
        }
        //Dividing Total Marks by Number of Subjects to find Average Percentage
        double avg=(double)Total_Marks/n;
        //Conditions to determine Grade based on Average Percentage
        /*Starting Range    Ending Range   Grade
         *    90                100          A+
         *    80                89           A
         *    70                79           B
         *    60                69           C
         *    50                59           D
         *    40                49           E
         *    0                 39           F
         */
        if(avg>=90 && avg<=100){
            System.out.println("Grade = A+ Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=80 && avg<90){
            System.out.println("Grade = A Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=70 && avg<80){
            System.out.println("Grade = B Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=60 && avg<70){
            System.out.println("Grade = C Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=50 && avg<60){
            System.out.println("Grade = D Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=40 && avg<50){
            System.out.println("Grade = E  Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        else if(avg>=0 && avg<40){
            System.out.println("Grade = F Total Marks = "+Total_Marks+" Average Percentage = "+avg);
        }
        //Condition for Invalid input where Marks entered is Above 100 
        else{
            System.out.println("Invalid!! Marks entered is not Correct");
        }
        sc.close();
    }
}
