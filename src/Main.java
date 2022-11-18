import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter the first no: ");
//        int num1 = sc.nextInt();
//        System.out.print("Please enter the second number: ");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("The addition result is: " + sum);

//        for (int i=1; i<10; i++)
//        {
//            System.out.println("i++ : " + i++);
//            System.out.println("++i : " + ++i);
//            for(int j=0; j<i; j++)
//            {
//                System.out.println("Value of I : " + i + " and the value of J is : " + j);
//            }
        //}
//        int[] arr = new int[10];
//        for(int i=0; i<arr.length; i++)
//        {
//            arr[i] = i;
//        }
//        System.out.println(Arrays.toString(arr));
        Employee emp = new Employee();
        emp.DisplayEmpDetails();
        emp.DisplayEmpDetails(true);
    }
}
