import java.util.Scanner;

public class prime {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        int count=0;
        int num=3;

        System.out.print("Enter the value of n:");
        n=sc.nextInt();

        System.out.println("First " + n + " prime numbers:");

        while(count<n){
            boolean isPrime=true;

            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        sc.close();
    }
}