package composite_pattern_example;

public class ExpensesClient {
  public static void main(String[] args) {
    Manager jane = new Manager("Jane");
    SalesPerson bob = new SalesPerson("Bob", jane);
    SalesPerson sue = new SalesPerson("Sue", jane);

    SalesTeam team = new SalesTeam();
    team.addPayee(jane);
    team.addPayee(bob);
    team.addPayee(sue);

    payPayee(jane, 100);
    payPayee(bob, 300);
    payPayee(team, 200);
  }

  private static void payPayee(Payee payee, int amount) {
    System.out.println("Expenses have been requested");
    payee.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }
}
