package sd3.com.source;

import java.text.NumberFormat;

public class Borrower extends Person {
  private Loan loan;
  private NumberFormat format = NumberFormat.getCurrencyInstance();

  public Borrower() {
    super();
  }

  public Borrower(Name name, Address address) {
    super(name, address);
  }

  public Loan getLoan() { return loan; }

  public void setLoan(Loan loan) { this.loan = loan; }

  public String toString() {
    return super.toString() +
      "Monthly payment is " + format.format(loan.getMonthlyPayment()) + '\n' +
      "Total payment is " + format.format(loan.getTotalPayment());
  }
}