
package sd3.com.source;


public class Person implements Comparable {
  private Name name;
  private Address address;

  public Person() {
    this(new Name("Liam", 'D', "Frawley"),
      new Address("101 High St", "Limerick", "Limerick", "Ireland"));
  }

  public Person(Name name, Address address) {
    this.name = name;
    this.address = address;
  }

  public Name getName() { return name; }

  public void setName(Name name) { this.name = name; }

  public Address getAddress() { return address; }

  public void setAddress(Address address) { this.address = address; }

  public String toString() {
    return '\n' + name.getFullName() + '\n' +
      address.getFullAddress();
  }

  public int compareTo(Object o) {
    return name.compareTo(((Person)o).name);
  }
} 