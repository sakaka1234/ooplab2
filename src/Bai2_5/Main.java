package Bai2_5;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Alice", 10);
        Customer c2 = new Customer(2, "Bob", 20);

        // 1. Test constructors
        Account a1 = new Account(101, c1, 1000.0);
        Account a2 = new Account(102, c2);

        System.out.println("===== CONSTRUCTOR & GETTERS =====");
        System.out.println(a1.getId());           // Expected: 101
        System.out.println(a1.getCustomer());     // Expected: Alice(1)
        System.out.println(a1.getBalance());      // Expected: 1000.0
        System.out.println(a2.getId());           // Expected: 102
        System.out.println(a2.getCustomer());     // Expected: Bob(2)
        System.out.println(a2.getBalance());      // Expected: 0.0

        // 2. Test getCustomerName()
        System.out.println("\n===== GET CUSTOMER NAME =====");
        System.out.println(a1.getCustomerName()); // Expected: Alice
        System.out.println(a2.getCustomerName()); // Expected: Bob

        // 3. Test setBalance()
        System.out.println("\n===== SET BALANCE =====");
        a1.setBalance(500.75);
        System.out.println(a1.getBalance());      // Expected: 500.75

        a1.setBalance(0.0);
        System.out.println(a1.getBalance());      // Expected: 0.0

        // 4. Test deposit()
        System.out.println("\n===== DEPOSIT =====");
        a1.deposit(100.0);
        System.out.println(a1.getBalance());      // Expected: 100.0

        a1.deposit(50.25);
        System.out.println(a1.getBalance());      // Expected: 150.25

        // 5. Test withdraw() with sufficient balance
        System.out.println("\n===== WITHDRAW =====");
        a1.withdraw(50.0);
        System.out.println(a1.getBalance());      // Expected: 100.25

        // Withdraw the exact balance
        a1.withdraw(100.25);
        System.out.println(a1.getBalance());      // Expected: 0.0

        // 6. Test withdraw() with insufficient balance
        System.out.println("\n===== INSUFFICIENT BALANCE =====");
        a1.deposit(100.0);
        a1.withdraw(150.0);
        System.out.println(a1.getBalance());      // Expected: 100.0
        // Expected message:
        // amount withdrawn exceeds the current balance!

        // 7. Test method chaining (return type Account)
        System.out.println("\n===== METHOD CHAINING =====");
        a2.deposit(200.0).withdraw(50.0);
        System.out.println(a2.getBalance());      // Expected: 150.0

        // 8. Test toString()
        System.out.println("\n===== TO STRING =====");
        Account a3 = new Account(103, c1, 1234.567);
        System.out.println(a3);
        // Expected: Alice(1) balance=$1234.57
    }
}
