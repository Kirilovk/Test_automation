import java.util.Scanner;

public class EligibleToWork {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter day number- ");
        int i= sc.nextInt();
        switch(i)
        {
            case 1:
                System.out.println("day "+i+" of the week is Monday");
                break;
            default:
                System.out.println("Add day between 1 and 7");
        }
    }
}

