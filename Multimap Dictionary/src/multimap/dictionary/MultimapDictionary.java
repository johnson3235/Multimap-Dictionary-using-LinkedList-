/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimap.dictionary;

import java.util.Scanner;

/**
 *
 * @author johny
 */
public class MultimapDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner sca= new Scanner(System.in);
        System.out.println("Hello This Multimap Dictionary Project ");
        char y = 'y';
        while(y == 'Y' || y == 'y')
        {
        System.out.println("Please Choose Operation : ");
        System.out.println("1 - Add pairs to the collection. ");
        System.out.println("2 - Remove pairs from the collection");
        System.out.println("3 - Modify the values of existing pairs");
        System.out.println("4 - Print values associated with a particular key.");
        System.out.println("5 - Print all linked list keys and  values .");
        System.out.println("");
        System.out.println("Enter Number Of Operation :");
        int choose = sc.nextInt();
        System.out.println("");

        int Key ;
        String Value ;

        switch(choose)
            {
            case 1:
                System.out.println("Please Enter Key : ");
                Key = sc.nextInt();
                System.out.println("");
                System.out.println("Please Enter Value : ");
                Value = sc.next(); 
                L.insert(Key, Value);
                L.printList();
                System.out.println("");
                break;
            case 2:
                System.out.println("Please Enter Key : ");
                Key = sc.nextInt();
                System.out.println("");
                System.out.println("Please Enter Value : ");
                Value = sc.next();
                L.delete(Key, Value);
                System.out.println("");
                break;
            case 3:
                System.out.println("Please Enter Key : ");
                Key = sc.nextInt();
                System.out.println("");
                System.out.println("Please Enter Value : ");
                Value = sc.next(); 
                System.out.println("");
                System.out.println("Enter New Value : ");
                String newValue = sc.next();
                L.modify(Key, Value, newValue);
                System.out.println("");
                break;
            case 4:
                System.out.println("Please Enter Key : ");
                Key = sc.nextInt();
                System.out.println("");
                L.printByKey(Key);
                System.out.println("");
                break;
            case 5:
                L.printList();
                System.out.println("");
                break;
            default:
                System.out.println("Sorry you Entered Not Valid Value");
                System.out.println("");
            }
          System.out.println("Do you Want Containue ? (Y/N)");
          y= sc.next().charAt(0);
        }
 
           
    }
    
}
