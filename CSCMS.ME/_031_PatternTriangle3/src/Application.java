import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        int i,j,k;
        for (i = 1; i <= numin ; i++) {
            for (j = numin; j > i ; j--){
                System.out.print("-");
            }
            for (k = 1; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}