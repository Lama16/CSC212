import java.util.Scanner; //not important?
public class LinkedList<T> {
	
	static Scanner input = new Scanner(System.in); 
	
	private Node<T> head;
	private Node<T> current;
	
	public LinkedList() {
	head = current = null;
	}
	
	public boolean empty() { 
		return head == null;
	}
	
	public boolean last() {
	return current.next == null;
	}


    public boolean full() { 
	return false;
     }
    
    public void findfirst () {
       current = head;
     }
    
      public void findnext () { 
    	current = current.next;
     }
      
      public T retrieve () {
       return current.data; 
       }
      
      public void update (T val) { 
	  current.data = val;
       }
      

  
      public void insertSorted(T c) {
    	  
    	
    	  Node<T> p = new Node<T>(c);
    	  
    	  if(head==null) {
    		  head=current=p;
    		  return;
    	  }
    	  
    	  if(((Contact) c).compareTo((Contact)head.data) < 0 ) {
			  p.next=head;
		      head=p;
		      return;
		  }
    	  
    	  Node<T> temp=head;
    	  Node<T> q= null;
    	  
    	  while(temp != null && ((Contact)temp.data).compareTo((Contact)c) < 0 ) { //revise
    		        q=temp; 
    		        temp=temp.next;
   
    		  }
    		  
    		   q.next=p;
    		  p.next=temp;
    		  
    	   
    		  
    	  }
    	  
    	/*  public boolean isUnique(T c) {
    		  if ( head==null)
    			  return true;
    		  
    		  Node<T> temp=head;
    		  while(temp.next != null) {
    			  if((Contact)temp.data).name.equals((Contact)c.data).name))
    		  }
    			  
    		  
    		  
    		  
    	  }
    */
     
      public void remove () {
    	  
    	  
      }
      
     
      
      public LinkedList<T> searchEmail(String e){
    	  LinkedList<T> nList = new LinkedList<T>();
    	  
    	  Node<T> temp=head;
    	  while(temp!=null) {
    		  if((((Contact)temp.data).email).equals(e)) 
    			  nList.insertSorted(temp.data);
    			  temp=temp.next;
    	  }
    		  return nList;
    	  
    	  
      }

	@Override
	public String toString() {
		Node<T> temp =head;
		
		String s=null;
		while(temp !=null) {
	
			s=s+temp.toString();
			temp=temp.next;
	}
		return s;

	}

      
      
      /*public void search(int n, String s) { // boolean
    	   
    	
    		  System.out.println("Enter search criteria:");
    		  System.out.println("1.Name");
    		  System.out.println("2.Phone Number");
    		  System.out.println("3.Email");
    		  System.out.println("4.Address");
    		  System.out.println("5.Birthday");
    		  int ch=input.nextInt();
    	
    	  
    	      switch(n) {
    	      case 1:
    	    System.out.println("Enter the contact's name:");
    	    String name = input.next();
    	    Node<T> temp =head;
    	    while(temp.next != null) {
    	    	if(temp.data.equals(name))
    	    }
    	  
    	      } 
    	  
      }*/
      
      
}
