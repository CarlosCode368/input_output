//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double subtotal=22.87;
    double tax = subtotal * 0.0825;
    double totalDue= subtotal+tax;
        System.out.println("Total due is: "+totalDue);
        System.out.println("Total due is: "+String.format("%.2f", totalDue));// we want 2 decimals for precision
        // user printf for formatted printing but must add newline manually
        System.out.printf("Total due is: %.2f \n", totalDue);
        System.out.printf("Total due is: %.2f \n", totalDue);

        int id = 10135;
        String name= "Carlos Players";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);

    }

    }
