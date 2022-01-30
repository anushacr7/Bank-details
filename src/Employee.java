import java.util.Scanner;


public class Employee {

    String acc_no;
    String acc_type;
    String balance;



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Account name:");
        String name=sc.nextLine();
        System.out.println(" Account number");
        String acc_no=sc.nextLine();
        System.out.println(" Account type");
        String acc_type=sc.nextLine();
        System.out.println("Account Name:"+name);
        System.out.println("Account number:"+acc_no);
        System.out.println("Account number:"+acc_type);
    }

}
