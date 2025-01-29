package builder;

import java.time.LocalDate;

public class SalesLeadTracker {

  public static void main(String[] args) {

    Person person1 = new Person(
        "margarita",
        "jhonson",
        "mj@example.com",
        LocalDate.of(1985, 12, 31),
        null,
        null);

    addPersonToLeadTracker(person1);

    var person2 = new Person.PersonBuilder("Jerome", "Donaldson")
        .phoneNumber("123456789")
        .build();

    addPersonToLeadTracker(person2);

  }

  public static void addPersonToLeadTracker(Person person) {
    System.out.println("A new lead was added to the lead tracker: \n" + person);
  }
}
