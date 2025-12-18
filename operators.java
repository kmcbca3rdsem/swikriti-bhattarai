import java.util.Scanner;

public class operators {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int choice;




        do{
            System.out.println("\n-----------CHOOSE OPERATOR------------");
            System.out.println("1. Arithmetic Operators");
            System.out.println("2. Logical Operators");
            System.out.println("3. Relational Operators");
            System.out.println("4. Assignment Operators");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                {
                    System.out.print("Enter first number:");
                    int a = sc.nextInt();
                    System.out.print("Enter second number:");
                    int b=sc.nextInt();
                    System.out.println("\n---Arithmetic Operators---");
                    System.out.println("a+b="+(a+b));
                    System.out.println("a-b="+(a-b));
                    System.out.println("a*b="+(a*b));

                    if(b!=0){

                    System.out.println("a/b="+(a/b));
                    }else{
                        System.out.println("!a/b Zero le divide hunna");
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Enter first boolean:");
                    boolean x = sc.nextBoolean();
                    System.out.print("Enter second boolean:");
                    boolean y=sc.nextBoolean();
                    System.out.println("\n---Logical Operators---");
                    System.out.println("a && b="+(x &&y ));
                    System.out.println("a || b="+(x||y));
                    System.out.println("!a="+(!x));
                    break;

                }
                case 3:
                {
                    System.out.print("Enter first number:");
                    int a = sc.nextInt();
                    System.out.print("Enter second number:");
                    int b=sc.nextInt();
                    System.out.println("\n--- Relational Operators ---");
                    System.out.println("a > b  = " + (a > b));
                    System.out.println("a < b  = " + (a < b));
                    System.out.println("a == b = " + (a == b));
                    System.out.println("a != b = " + (a != b));
                    System.out.println("a >= b = " + (a >= b));
                    System.out.println("a <= b = " + (a <= b));
                    break;
                }
                case 4:
                {
                    System.out.print("Enter first number:");
                    int a = sc.nextInt();
                    System.out.print("Enter second number:");
                    int b=sc.nextInt();
                    System.out.println("\n--- Assignment Operators ---");
                    System.out.println("a = " + a + " b = " + b);

                    a += 6;
                    System.out.println("a += 6 -> " + a);

                    b -= 4;
                    System.out.println("b -= 4 -> " + b);

                    a *= 8;
                    System.out.println("a *= 8 -> " + a);

                    b /= 5;
                    System.out.println("b /= 5 -> " + b);

                    a %= 3;
                    System.out.println("a %= 3 -> " + a);
                    break;
                }
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!!! Try Again...");

            }


        }while(choice!=5);
    
    }
}