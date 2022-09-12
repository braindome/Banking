import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account acct1 = new Account();
        acct1.inputBalance(20000.00);
        acct1.setName("Gustav Vasa");
        acct1.toString();
    }
}