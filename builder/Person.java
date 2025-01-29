package builder;

import java.time.LocalDate;

public class Person {

  private String firstName;
  private String lastName;
  private String email;
  private final LocalDate dateOfBirth;
  private String phone;
  private String city;

  public Person(String firstName, String lastName, String email, LocalDate dateOfBirth, String phone, String city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
    this.phone = phone;
    this.city = city;
    if (firstName == null || lastName == null) {
      throw new IllegalArgumentException("Name and last name are mandatory");
    }
  }

  @Override
  public String toString() {
    return "\t Person { " + "\n" +
        "firstName= '" + firstName + "\n" +
        "lastName= '" + lastName + "\n" +
        "email= '" + email + '\'' + "\n" +
        "dateOfBirth= " + dateOfBirth + "\n" +
        "phone= '" + phone + '\'' + "\n" +
        "city= '" + city + '\'' + "\n" +
        '}';
  }

  public static class PersonBuilder {

    private final String firstName;
    private final String lastName;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
    private String city;

    public PersonBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public PersonBuilder emailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    public PersonBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public PersonBuilder city(String city) {
      this.city = city;
      return this;
    }

    public Person build() {
      return new Person(firstName, lastName,
          emailAddress, dateOfBirth, phoneNumber, city);
    }

  }

}