import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("press y for open\npress n for exits");
        char res=abc.next().charAt(0);
        while(res=='y'){
            System.out.println("-------WELCOME TO JAVA CALCULATOR --------");
            System.out.println("Enter First No");
            Scanner obj=new Scanner(System.in);
            int fno=obj.nextInt();
            System.out.println("Enter Second No");
            int sno=obj.nextInt();

            System.out.println("PRESS THE GIVEN OPTION FOR YOUR OPERATION");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n");
            int a=obj.nextInt();

            switch(a){


                case 1:
                System.out.println("The Addition Is: ");
                int sum=fno+sno;
                System.out.print(sum);
                break;
                case 2:
                System.out.println("The substaction Is: ");
                int sub=fno-sno;
                System.out.print(sub);
                break;
                case 3:
                System.out.println("The multiplication Is: ");
                int mul=fno+sno;
                System.out.print(mul);
                break;
                case 4:
                System.out.println("The division Is: ");
                Float div=(float)fno/sno;
                System.out.print(div);
                break;
                default :
                System.out.println("you have enter wrong input");
        

            }
        // System.out.println("want to calculate again press y/n");
        // Scanner abc=new Scanner(System.in);
        // char res=abc.next().charAt(0);


        // while(res=='n'){
        // // System.out.println("want to calculate again press y/n");
        // break;
        break;

        }
        
        


    }
    
}
