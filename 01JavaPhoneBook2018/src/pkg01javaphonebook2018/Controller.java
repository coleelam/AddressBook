/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01javaphonebook2018;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class Controller {
    
    private ArrayList<Contact> contacte = new ArrayList();
    Scanner in = new Scanner(System.in);
    
    public void adaugaContact(){
        String nume, adresa;
        long telefon;
        
        System.out.println("Introduceti numele si prenumele contactului: ");
        nume = in.nextLine();
        System.out.println("Introduceti numarul de telefon: ");
        telefon = in.nextLong();
        System.out.println("Introduceti adresa: ");
        adresa = in.nextLine();
        
        try {
            contacte.add(new Contact(nume,telefon, adresa));
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void test1(){
        Controller contr = new Controller();
        contr.adaugaContact();
    }
}
