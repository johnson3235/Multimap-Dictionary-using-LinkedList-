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
        // first != null 
        if(!isEmpty())     
        {         
          Node last = this.first;
          Node Current = this.first;
          
          while( key >= Current.key)
          {
              if(Current.nextLink != null)
              {
                last=Current;
                Current=Current.nextLink;
              }
              else
              {
                  break;
              }
          }
          if(Current.key <= link.key)
              {
                 //Next node Will Be Link 
                 Current.nextLink=link;  
              }
          else
              {
                  // current (key) > Link (key)
                  //check last == first
                  if(last.key == this.first.key && last.value.equals(this.first.value))
                  {
                      // If last == first
                      // Link < first
                      //check if fisrt key < key or first.key > Key
                      if(key < last.key)
                      {
                          System.out.println("33");
                        Current=this.first;
                        this.first=link;
                        this.first.nextLink=Current;
                      }
                      // Link > first
                      else
                      {
                          this.first.nextLink=link;
                          link.nextLink=Current;
                      }
                  }
                  else
                  {    
                      // If last != first
                      //check if fisrt key < key or first.key > Key
                      last.nextLink=link;
                      link.nextLink=Current;
                  }
                  }
              }
          
        // first = null LinkedList => SIZE = 0
        else
        { 
            first = link;
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
        Node Last = this.first;
        int count = 0;
        if(first == null){
         return false;
        }
        while(temp != null)
        {
             if (temp.key == key &&  value.equals(temp.value) )
        {
            if(temp.key == first.key && temp.value.equals(first.value))
            {
               if (temp.nextLink == null)
               {
               this.first = null;
               }
               else
               {
                   this.first = temp.nextLink;
               }     
            }
            else
            {
                if (temp.nextLink == null)
               {
                Last.nextLink = null;
               }
               else
               {
                   Last.nextLink = temp.nextLink;
               }    

            }
            count ++;
        }
             Last = temp;
             temp = temp.nextLink;
        
         }
        if(count ==0)
        {
            return false;
        }
        else
        {
            return true;
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
        Node Last = this.first;
        int count = 0;
        if(first == null){
         return false;
        }
        while(temp != null)
        {
             if (temp.key == key && temp.value.equals(Oldvalue) )
        {
            if(temp.key == first.key && temp.value.equals(first.value))
            {
            this.first.value = Newvalue;
            }
            else
            {
            temp.value = Newvalue;
            }
            count++;
            
        }
             Last = temp;
             temp = temp.nextLink;
        
         }
        if(count ==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        
  }
    

     public void printByKey(int key) {
         System.out.println("");
         if(!isEmpty())
         {
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
     }

    //Prints list data
    public void printList() {
                 if(!isEmpty())
         {
        Node currentLink = first;
        System.out.print("List: ");
        System.out.println("");
        int key = currentLink.key;
        System.out.print("{ "+Integer.toString(currentLink.key)+" : ");
        while(currentLink != null) {
            if(currentLink.key == key)
            {

            }
            else
            {
                System.out.print("}");
                key = currentLink.key;
                System.out.println("");
                System.out.print("{ "+Integer.toString(currentLink.key)+" : ");

            }
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.print("}");
        
    }
    }


  
}
