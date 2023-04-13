import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz : ");
        n = input.nextInt();

        int i =1;
        int j=1;

        while (i<=n && j<=n){
            System.out.println(i + " -- "+ j);
            i*=4;
            j*=5;
        }


    }
}