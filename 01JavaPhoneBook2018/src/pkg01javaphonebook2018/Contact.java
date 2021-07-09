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
     * Constructor
     * @param name
     * @param number
     * @param address 
     * @throws java.lang.Exception 
     */
    public Contact(String name, long number, String address)
            throws Exception{
        if(!contactOk(name, number, address)) 
            throw new Exception("Nume, numar si adresa incorecte!");
        this.name = name;
        this.number = number;
        this.address = address;
        nrCrt++;
    }
    /**
     * Verificare input
     * @param name
     * @param number
     * @param address
     * @return 
     */
    private static boolean contactOk(String name, long number, 
            String address){
        return name != null && name.length()>0 && number != 0
                && number > 0 && address != null 
                && address.length()>0;
    }
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name 
     */
    public void setName(String name) throws Exception{
        if(name == null || name.length() == 0 )
            throw new Exception("Nume incorect");
        this.name = name;
    }
    /**
     * 
     * @return 
     */
    public long getNumber() {
        return number;
    }
    /**
     * 
     * @param number
     * @throws Exception 
     */
    public void setNumber(long number) throws Exception {
        if(number == 0 || number < 0) 
            throw new Exception("Numar de telefon incorect!");
        this.number = number;
    }
    /**
     * 
     * @return 
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception {
        if(address == null || address.length() == 0 )
            throw new Exception("Adresa incorecta!");
        this.address = address;
    }
    /**
     * 
     * @param contact
     * @return 
     */
    public boolean equals(Contact contact) {
        if (getName().equalsIgnoreCase(contact.name)) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * 
     * @param t
     * @return 
     */
    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return nrCrt+". "+name+" "+number+" "+address;
    }
    
    public static void test1(){
        try{
            Contact cont = new Contact("mihai cornel");
            System.out.println(cont);
            cont.setNumber(722270796);
            System.out.println(cont);
            cont.setAddress("Str:Prevederii, Nr:23");
            System.out.println(cont);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
