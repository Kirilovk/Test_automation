import java.util.Scanner;

public class WeekDayes {
            public static void main(String args[]) {
                //int i=5;
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter day number- ");
                int i= sc.nextInt();
                switch(i)
                {
                    case 1:
                        System.out.println("day "+i+" of the week is Monday");
                        break;
                    case 2:
                        System.out.println("day "+i+" of the week is Tuesday");
                        break;
                    case 3:
                        System.out.println("day "+i+" of the week is Wednesday");
                        break;
                    case 4:
                        System.out.println("day "+i+" of the week is Thursday");
                        break;
                    case 5:
                        System.out.println("day "+i+" of the week is Friday");
                        break;
                    case 6:
                        System.out.println("day "+i+" of the week is Saturday");
                        break;
                    case 7:
                        System.out.println("day "+i+" of the week is Sunday");
                        break;
                    default:
                        System.out.println("Add day between 1 and 7");
            }
        }
    }

