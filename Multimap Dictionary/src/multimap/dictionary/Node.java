/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimap.dictionary;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author johny
 */
public class Node {

    public int key;
    public String value;
    public Node nextLink;

    //Link constructor
    public Node(int d1, String d2) {
        key = d1;
        value = d2;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + Integer.toString( this.key ) + ", " + this.value+ "} ");
    }
}

