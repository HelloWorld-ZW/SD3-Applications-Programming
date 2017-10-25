package sd3.com.source;


public class Address {
  private final String street;
  private final String city;
  private final String county;
  private final String country;


  public Address(String street, String city,String county, String country) {
    this.street = street;
    this.city = city;
    this.county = county;
    this.country = country;
  }

  public Address() {
    this.street = "123 Fake St";
    this.city = "Limerick";
    this.county = "Limerick";
    this.country = "Ireland";
  }

  public String getStreet() { return street; }

  public String getCity() { return city; }

  public String getCounty() { return county; }

  public String getCountry() { return country; }

  public String getFullAddress() {
    return street + '\n' + city + ", " + county + ' ' + country + '\n';
  }
}

