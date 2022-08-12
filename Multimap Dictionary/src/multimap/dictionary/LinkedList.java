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
public class LinkedList {
   private Node first;
    
   public LinkedList() {
        this.first = null;
    }

  public boolean isEmpty() {
    return first == null;
  }
  

    //Inserts a new Link at the first of the list
    public void insert(int key, String value) {
        Node link = new Node(key,value);
        if(first != null)
        {         
          Node p = this.first;
          Node q = this.first;
          Node Current = this.first;
          while( key > Current.key)
          {
              if(Current.nextLink != null)
              {
                p=Current;
                Current=Current.nextLink;
                q=q.nextLink;
              }
              else
              {
                  break;
              }
          }
          if(q.nextLink != null )
          {
           q=q.nextLink;
          Current.nextLink=link;
          link.nextLink=q;
          }
          else
          {
              if(Current.key <= link.key)
              {
                 Current.nextLink=link;  
              }
              else
              {
                  if(p.key ==   this.first.key && p.value ==   this.first.value)
                  {
                   q=this.first;
                   this.first=link;
                   this.first.nextLink=q;
                  }
                  else
                  {
                      p.nextLink=link;
                      link.nextLink=Current;
                  }
                  }
              }
          }
        
        else
        {
            first =link;
        }
        
    }

    
     public void delete(int key, String value) {
         if(deleteNode(key,value))
         {
             System.out.println("Data deleted Successfully");
                     
         }
         else
         {
             System.out.println("Data Not Found");
         }

         printList();
     }
    
    
    
    private boolean deleteNode(int key, String value) {
        Node temp = first;
        Node p = this.first;
        Node q = this.first;
        if(first == null){
         return false;
        }
        while(temp.key != key || temp.value != value)
        {
            if(temp.nextLink != null)
            {
                p = temp;
                temp = temp.nextLink;
            }
            else
            {
                break;
            }   
        }
        if (temp.key == key && temp.value == value )
        {
            if(temp.key == first.key && temp.value== first.value )
            {
            this.first = temp.nextLink;
            }
            else
            {
            p.nextLink = temp.nextLink;
            }
            return true;
        }
        else
        {
            return false;
        }

    }
    
    
    
    public void modify(int key, String Oldvalue , String Newvalue) {
         if(modifyNode(key,Oldvalue,Newvalue))
         {
             System.out.println("Data Updated Successfully");
                     
         }
         else
         {
             System.out.println("Data Not Found to Modify");
         }

         printList();
     }
    
    
    
    private boolean modifyNode(int key, String Oldvalue ,String Newvalue) {
        Node temp = first;
        Node p = this.first;
        Node q = this.first;
        if(first == null){
         return false;
        }
        while(temp.key != key || temp.value != Oldvalue)
        {
            if(temp.nextLink != null)
            {
                p = temp;
                temp = temp.nextLink;
            }
            else
            {
                break;
            }   
        }
        if (temp.key == key && temp.value == Oldvalue )
        {
            if(temp.key == first.key && temp.value== first.value )
            {
            this.first.value = Newvalue;
            }
            else
            {
            temp.value = Newvalue;
            }
            return true;
        }
        else
        {
            return false;
        }

    }
    
    
    
    
    
     public void printByKey(int key) {
        Node currentLink = first;
        System.out.println("Node: ");
        while(currentLink != null) {
            if(currentLink.key == key)
            {
             currentLink.printLink();
            }
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }


    //Prints list data
    public void printList() {
        Node currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

// public void AddFirst(int key, String value) {
//    Node Second = first;
//    first = new Node(){};
//    first.key = key;
//    first.value = value;
//    first.next = Second;
//    if (last == null) {
//      last = first;
//    }
//  }
    
    
  
}
