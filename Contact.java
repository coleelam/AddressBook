/**
 * Contact
 *
 * models a directory of Contacts
 *
 * @author elamc, Cole Elam, Section 814
 * @version 10/07/15
 */
public class Contact {
    private String name;
    private long number;
    private String address;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public Contact(String name, long number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Contact contact) {
        if (getName().equalsIgnoreCase(contact.name)) {
            return false;
        }
        else {
            return true;
        }
    }
}
