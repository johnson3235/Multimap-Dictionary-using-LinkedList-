/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimap.dictionary;

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
           L.insert(2, "tina");
           L.insert(0, "marina");
           L.insert(0, "johnY");
           L.insert(1, "johnS");
           L.printList();
           L.delete(1, "johnS");
           L.modify(2, "tina","mirnaa");
           L.printByKey(2);
           
           
    }
    
}
