package project;


class Node{
    Node next;
    int data;
    
    public Node(int data) {
    
        this.data = data;
        next = null;
    }
    
}
   


class LinkedList{
    Node head;
  
    LinkedList(){
        head = null;
    }
    public void addHead(int a){
            
      
        Node t = new Node(a);
        t.next = head;
        head = t;                
    
        
    }
    
    public void deleteHead()
    {
        if(head!=null)
            head = head.next;
    }
    
    public void addTail(int v)
    {
        Node t = new Node(v);
        if(head==null)
        {
            head = t;
            return;
        }
        Node h = head;
        while(h.next!=null)
            h = h.next;
        h.next = t;
    }
    
    public void deleteTail()
    {
        Node h = head;
        if(head == null)
        {
       System.out.println("There is no node to delete from the list..........");
            return;
        }
        
        while(h.next.next!=null)
            h = h.next;
        h.next = null;
    }
    
    
    public Node find(int v)
    {
        Node h = head;
        while(h != null)
        {
            if(h.data == v) return h;
            h = h.next;
        }
        
        return h;
    }
     public int countN(){
    
        int count  = 0;
        Node h = head;
        while(h!=null)
        {
            Node h1 = h.next;
            while(h1!=null)
            {
                if(h.data==h1.data)
                   count++;
                h1 = h1.next;
            }
            h = h.next;
            
        }
        return count;
    }
    
    public void addAfter(int after, int v)
    {
        Node h = find(after);
        if(h==null) return;
        Node t = new Node(v);
        t.next = h.next;
        h.next = t;
    }
     public int greater(LinkedList l)
    {
        Node h1 = this.head;
        Node h2 = l.head;
        while(h1!=null && h2!=null)
        {
            h1 = h1.next;
            h2 = h2.next;
        }
        if(h1==null && h2==null) return 0;
        else if(h2==null) return 1;
        else return -1;
    }
     public int length()
    {
        int count = 0;
        Node h = head;
        while(h != null)
        {
            count++;
            h = h.next;
        }
        
        return count;
    }
    
    public void generatePrime(int a, int b)
    {
        
        
        while(length()<b)    
       { 		  	  
          int counter=0; 
          int num=a;
          while(num>=1)
	  {
             if(a%num==0)
	     {
 		counter++;
	     }
             num--;
	  }
	  if (counter ==2)
	  {
	     this.addTail(a);
             
	  }
          a++;
                
       }
    }
    
       public int sum(){
           
           int sum = 0;
           Node h = this.head;
           while (h!=null)
           {
               sum+= h.data;
               
               h=h.next;
               
           }
             
         return sum;
     
     }
       
     
      public int substraction(){
             
         int substraction = 0;
           Node h = this.head;
           while (h!=null)
           {
               substraction-= h.data;
               
               h=h.next;
               
           }
             
         return substraction;
      }
      
       public void removeDuplicate()
    {
        
           
           Node temp = null; 
           Node h = head; 
  
       
        while (h != null && h.next != null) { 
            Node h1 = h; 
  
            
            while (h1.next != null) { 
  
               
                if (h.data == h1.next.data) { 
  
                   
                    temp = h1.next; 
                    h1.next = h1.next.next; 
               
                } else  
                  h1 = h1.next; 
                 
            } 
            h = h.next; 
        } 
    } 
       
       public Node join(Node h1) 
     {
    
         

    Node h = head; 
      

    
    Node result = new Node(0); 
      
    
    Node temp = result; 
    while(true)  
    { 
          
     
        if(h == null) 
        { 
            temp.next = h1; 
            break; 
        } 
        if(h1 == null) 
        { 
            temp.next = h; 
            break; 
        } 
          
            temp.next = h; 
            h = h.next; 

           temp = temp.next; 
    } 
    return result.next; 
         
       }
    
      
    
    @Override
     public String toString()
    {
        String str = "";
        Node h = head;
        while(h != null)
        {
            str += "->"+h.data + " ";
            h = h.next;
        }
        
        return str;
    }
    
}


public class Project_201700343{

    public static void main(String[] args) {
       
     
       LinkedList list1 = new LinkedList();
       
       list1.generatePrime(10, 5);
       LinkedList list2 = new LinkedList();
       
       list2.generatePrime(10, 3);
       LinkedList list3 = new LinkedList();
       
       list3.generatePrime(5, 10);
       LinkedList list4 = new LinkedList();
       
       list4.generatePrime(10, 15);
       

       System.out.println("List 1 : " + list1);
        
 
       
       System.out.println("List 2 : " + list2);
       
       
       System.out.println("List 3 : " + list3);
       
       
       System.out.println("List 4 : " + list4);
       
       
       System.out.println("The sum of list 1 and list 2 is: " + (list1.sum()+list2.sum()));
        
        
       System.out.println("The substraction of list 3 and list 4 is: " + (list3.substraction()-list4.substraction()));
        
       LinkedList joined1 = new LinkedList();
        
       joined1.head = list1.join(list2.head);
        
        
       LinkedList joined2 = new LinkedList();
        
       joined2.head = list3.join(list4.head);
        
       LinkedList TotalJoined = new LinkedList();
        
       TotalJoined.head = joined1.join(joined2.head);
       
        
       System.out.println("The 4 LinkedLists joined: " + TotalJoined);
        
        
        TotalJoined.removeDuplicate();
        
        System.out.println("After removing duplicates vaules..... " );
        System.out.println(TotalJoined);
        

        
        
        
    }
    
}
