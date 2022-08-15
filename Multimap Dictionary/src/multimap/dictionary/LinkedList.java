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
          
          if(q.nextLink != null && q.key <= key )
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
                  if(p.key == this.first.key && p.value.equals(this.first.value))
                  {
                      // If last == first
                      //check if fisrt key < key or first.key > Key
                      if(key < p.key)
                      {
                        q=this.first;
                        this.first=link;
                        this.first.nextLink=q;
                      }
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
                      
                      p.nextLink=link;
                      link.nextLink=Current;
                  }
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
        Node p = this.first;
        Node q = this.first;
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
                p.nextLink = null;
               }
               else
               {
                   p.nextLink = temp.nextLink;
               }    

            }
            count ++;
        }
             p = temp;
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
        Node p = this.first;
        Node q = this.first;
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
             p = temp;
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
