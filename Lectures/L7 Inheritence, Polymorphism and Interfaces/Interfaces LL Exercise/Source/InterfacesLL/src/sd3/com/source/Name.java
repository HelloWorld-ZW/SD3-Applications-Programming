package sd3.com.source;


public class Name implements Comparable {

  private String firstName;
  private char mi;
  private String lastName;

  public Name(String firstName, char mi, String lastName) {
    this.firstName = firstName;
    this.mi = mi;
    this.lastName = lastName;
  }

  public Name() {

    this.firstName = "Greg";
    this.mi = 'B';
    this.lastName = "Halford";
  }


  public String getFirstName() { return firstName;}

  public char getMi() { return mi;}

  public String getLastname() { return lastName; }

  public String getFullName() {
  	return firstName + ' ' + mi + ' ' + lastName;
  }

  public int compareTo(Object o) {
    
    if ((lastName.equals(((Name)o).lastName)) && (firstName.equals(((Name)o).firstName)) && (mi == ((Name)o).getMi())) {
        return 1;
    }
    else if ((!lastName.equals(((Name)o).lastName)) && (!firstName.equals(((Name)o).firstName))) {
        return -1;
    }
    else
        return 0; //shouldn't get here
  }
} 