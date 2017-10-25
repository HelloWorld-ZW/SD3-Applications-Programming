package sd3.com.source;


public class BorrowLoan {
  public static void main(String[] args) {

    Name n1 = new Name("Patrick", 'N', "Considine");
    Address a1 = new Address("54 Seaview Terrace", "Adare", "Limerick", "Ireland");
    Loan l1 = new Loan(3.6,33,350000);
    Borrower b1 = new Borrower(n1, a1);
    b1.setLoan(l1);

    Name n2 = new Name();
    Address a2 = new Address();
    Loan l2 = new Loan();
    Borrower b2 =  new Borrower(n2, a2);
    b2.setLoan(l2);

    Borrower b3 = new Borrower();
    b3.setLoan(new Loan());
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    
    System.out.println();

    
    if (l1.compareTo(l2) == 0) 
          System.out.println("Both L1 and L2 are equal");
    else if (l1.compareTo(l2) < 0) 
          System.out.println("Loan Amount for L1 is less than Loan Amount for L2");     
    else
        System.out.println("Loan Amount for L1 is greater than Loan Amount for L2");   
   
    
    
    if (n2.compareTo(n1) == 1)
          System.out.println("Customers have the same name");
    else
        System.out.println("Customers do not have same name");


  }
} 
 

