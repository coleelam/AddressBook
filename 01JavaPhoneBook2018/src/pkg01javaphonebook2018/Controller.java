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
    
    String[] meniu = { "\t\t=====Meniu Agenda Telefonica=====\n",
        "\t1.Adauga contact.", "\t9.Iesire program.",
        "Introduceti o optiune:" };
    
    public void afiseazaMeniu(){
        for(int i = 0; i < meniu.length; i++){
            System.out.println(meniu[i]);
        }
    }
    
    public void adaugaContact(){
        String nume, adresa;
        long telefon;
        
        System.out.println("Introduceti numele si prenumele contactului: ");
        nume = in.nextLine();
        System.out.println("Introduceti numarul de telefon: ");
        telefon = in.nextLong();
        in.nextLine();
        System.out.println("Introduceti adresa: ");
        adresa = in.nextLine();
        
        try {
            contacte.add(new Contact(nume,telefon, adresa));
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void test1(){
        
        boolean check = true;
        Controller contr = new Controller();
        
        while(check){
            contr.afiseazaMeniu();
            int optiune = in.nextInt();
            in.nextLine();
            switch(optiune){
                case 1:
                    contr.adaugaContact();
                    break;
                    
                case 9:
                    System.out.println("Exit program. La revedere!");
                    check = false;
                    break;
                default:
                    System.out.println("Alegerea dumneavoastra este gresita!");
                    break;
            }
        }
        
    }
}
