import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String s = new String(scanner1.nextLine());
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int result =0;
        for(int j=0;j<s.length();j++){
            char next = (j + 1 < s.length()) ? s.charAt(j + 1) : ' ';
            if (s.charAt(j) == 'I') {
                if (next == 'V') {
                    result = result + (V - I);
                    j++;
                } else if (next == 'X') {
                    result = result + (X - I);
                    j++;
                } else {
                    result = result + I;
                }
            } else if (s.charAt(j) == 'X') {
                if (next == 'L') {
                    result = result + (L - X);
                    j++;
                } else if (next == 'C') {
                    result = result + (C - X);
                    j++;
                } else {
                    result = result + X;
                }
            } else if (s.charAt(j) == 'C') {
                if (next == 'D') {
                    result = result + (D - C);
                    j++;
                } else if (next == 'M') {
                    result = result + (M - C);
                    j++;
                } else {
                    result = result + C;
                }
            } else if (s.charAt(j) == 'V') {
                result = result + V;
            } else if (s.charAt(j) == 'L') {
                result = result + L;
            } else if (s.charAt(j) == 'D') {
                result = result + D;
            } else if (s.charAt(j) == 'M') {
                result = result + M;
            }
        }
        System.out.println(result);
    }
}