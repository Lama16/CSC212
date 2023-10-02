
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Contact> l = new LinkedList<Contact>();
		Contact c1 = new Contact("Lama","lamah1");
		Contact c2=new Contact("munirah","lamah1");
		
		l.insertSorted(c1);
		l.insertSorted(c2);
		
		LinkedList<Contact> m = l.searchEmail("lamah1");
		System.out.println(l);
		
		
		

	}

}
