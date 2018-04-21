package pkg01javaphonebook2018;

import java.io.Serializable;

/**
 * <b>Contact.</b>
 *
 * models a directory of Contacts
 * @file Contact.java
 * @author mihai cornel
 * @version 21/04/2018
 */
public class Contact implements Serializable, Comparable {
    //Variabile
    private static int nrCrt;
    private String name;
    private long number;
    private String address;
    /**
     * Constructor
     * @param name 
     * @throws java.lang.Exception 
     */
    public Contact(String name) throws Exception {
        if(name == null || name.length() == 0) 
            throw new Exception("Nume nevalid");
        this.name = name;
        nrCrt++;
    }
    /**
     * Constructor
     * @param name
     * @param number 
     */
    public Contact(String name, long number) throws Exception{
        if(!contactOk(name, number)) 
            throw new Exception("Nume si numar incorecte!");
        this.name = name;
        this.number = number;
        nrCrt++;
    }
    /**
     * 
     * @param name
     * @param number
     * @return 
     */
    private static boolean contactOk(String name, long number){
        return name != null && name.length()>0 && number != 0
                && number > 0;
    }
    /**
     * 
     * @param name
     * @param number
     * @param address 
     */
    public Contact(String name, long number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
        nrCrt++;
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

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
