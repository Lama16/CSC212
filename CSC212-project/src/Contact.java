
public class Contact implements Comparable<Contact> {

		public String name;
		public String phonenumber; 
		public String email;
		public String address;
		public String birthday;
		public String notes;
		
		public Contact() {
			
		}
		public Contact(String name, String phonenumber, String email, String address, String birthday, String notes) {
			
			this.name = name;
			this.phonenumber = phonenumber;
			this.email = email;
			this.address = address;
			this.birthday = birthday;
			this.notes = notes;
		}


		@Override
		public String toString() {
			return "Name:" + name + "\nPhone Number:" + phonenumber + "\nEmail Address:" + email + "\nAddress:" + address
					+ "\nBirthday:" + birthday + "\nNotes:" + notes ;
		}
		
		public int compareTo(Contact c) {
			// TODO Auto-generated method stub
			return name.compareTo(c.name);
		}
		
		

	}


