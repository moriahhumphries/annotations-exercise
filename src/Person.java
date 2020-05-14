/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
public class Person {
    protected String firstName;
    protected String lastName;
    @SuppressWarnings({"{all", "deprecation","unchecked"})
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @SuppressWarnings({"{all", "deprecation","unchecked"})
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
