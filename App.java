
import java.text.DecimalFormat;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ){

    Scanner scan = new Scanner(System.in);
    double a =0;
    double b =0;
    String homeA, homeB;
    String choice;

    System.out.println ("\n------------------------------------------------------------------------------");
    System.out.println("Chavvi Calculator:");
    DecimalFormat _numberFormat= new DecimalFormat("#0.000");
    homeA = _numberFormat.format(a);
    homeB = _numberFormat.format(b);
        

//public static void menu(){
        System.out.println("\na \t enter a value for A");
        System.out.println("b \t enter a value for B");
        System.out.println("+ \t add");
        System.out.println("- \t subtract");
        System.out.println("* \t multiply");
        System.out.println("/ \t divide");
        System.out.println("c \t clear ");
        System.out.println("q \t quit \n");
        System.out.println ("------------------------------------------------------------------------------");
    

    programs:
    while (true) {
        homeA = _numberFormat.format(a);
        homeB = _numberFormat.format(b);
        System.out.println ("------------------------------------------------------------------------------");
        System.out.println(String.format("A = %s \t B = %s ",homeA, homeB));
        System.out.println ("------------------------------------------------------------------------------");
        //home;
        System.out.print("Enter your choice : ");
        choice = scan.next();
       System.out.println("A becomes your output when calculated! You can then hit an operation to perform b on a!");



        switches:
        switch (choice) {
            case "a":
                a = A(scan);
                System.out.println("\n");
                continue programs;
            case "b":
                b = B(scan);
                System.out.println("\n");
                break switches;
            case "+":
                a = add(a, b);
                System.out.println("\n");
                break switches;
            case "-":
                a = subtract(a, b);
                System.out.println("\n");
                break switches;
            case "*":
                a = multiply(a, b);
                System.out.println("\n");
                break switches;
            case "/":
            if (a == 0) {
                System.out.println("please change b to another number which is not 0");
                break switches;
            }
                a = divide(a, b);
                System.out.println("\n");
                break switches;
            case "c":
                System.out.println("\n");
                a = 0;
               b = 0;
                break switches;
            case "q":
            System.out.println("Thank you for using the chavviCalculator ");
                break programs;
            default:
                System.out.println("Invalid choice");
                break switches;
            }
           
            

        System.out.println("Thank you for using the chavviCalculator \n"); }
       
        
    }

  

    public static double A (Scanner scanner){
        System.out.print("Enter A : ");
        return getNum(scanner);
        
    }
    public static double B (Scanner scanner){
        System.out.print("Enter B : ");
        return getNum(scanner);
    }
    
    public static double add (double rawA, double rawB){
        return rawA+rawB;
    }
    public static double subtract (double rawA, double rawB){
        return rawA-rawB;
    }
    public static double multiply(double rawA, double rawB){
        return rawA*rawB;
    }
    public static double divide(double rawA, double rawB){
        return rawA/rawB;
    }

    public static double getNum(Scanner scanner){
        String r;
        double Num;
        while (true){
            r = scanner.next();

            try {
            Num= Double.parseDouble(r);
          }catch (NumberFormatException e) {
            System.out.println("Enter a Number not a string!");
            continue;
            }
            break;
        }
        return Num;
    
}}