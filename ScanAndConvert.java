/*JOHNLEE BAUI
BSIT NETSEC 1-1 */
import java.util.Scanner;

public class ScanAndConvert {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Ask for the final grade in java
        System.out.print("Enter your Java grade: ");
        String javaGrade = input.nextLine();
        
        // Ask for the final grade in C++
        System.out.print("Enter your C++ grade: ");
        String cppGrade = input.nextLine();
        
        // Ask for the final grade in C#
        System.out.print("Enter your C# grade: ");
        String csharpGrade = input.nextLine();
        
        
        // Convert String value into double
        double java = Double.parseDouble(javaGrade);
        double cpp = Double.parseDouble(cppGrade);
        double csharp = Double.parseDouble(csharpGrade);
        
        // Calculate the average
        double average = (java + cpp + csharp) / 3;
        
        System.out.println();
        System.out.println("Java Grade: " + java);
        System.out.println("C++ Grade: " + cpp);
        System.out.println("C# Grade: " + csharp);
        System.out.println("Total Average: " + average);
    }
}
