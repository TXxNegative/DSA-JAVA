
import java.util.Scanner;

public class Sswitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //String fruit=input.next();
        //int day=input.nextInt();
        //normal  switch
        /* 
        switch (fruit) {
            case "mango":
                System.out.println("the king of the fruits");
                break;
            case"litchi":
                System.out.println("red spikey outer cover,seed inside");
                break;
            case"banana":
                System.out.println("most consumed fruit in the world");
                break;
            default:
                System.out.println("fruit is not in store");
        }
        */
        
        //enhanced switch
         /* 
        switch (fruit) {
            case "mango" -> System.out.println("the king of the fruits");
            case"litchi" -> System.out.println("red spikey outer cover,seed inside");
            case"banana" -> System.out.println("most consumed fruit in the world");
            default -> System.out.println("fruit is not in store");
        }
        

        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
        */
        //nested switch
        
        System.out.print("enter the employee number ");
        int employee=input.nextInt();
        System.out.print("enter the employee department ");
        String department=input.next();
        switch(employee){
            case 1-> System.out.println("employee no. "+employee);
            case 2-> System.out.println("employee no. "+employee);
            case 3-> {
                System.out.println("employee no. "+employee);
                switch(department){
                case "IT"->System.out.println("employee of IT");
                case "management"->System.out.println("employee of MANAGEMENT   ");
                default->System.out.println("not of department");
            }}
            case 4-> System.out.println("employee no. "+employee);
            default->System.out.println("not an employee");
        }
    }
}
