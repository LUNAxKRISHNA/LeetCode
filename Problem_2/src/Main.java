import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=  scanner.nextInt();
        int num=x;
        int rev=0,rem=0;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        if(num==rev)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
