//Maintains the records of students
class students{
	int rollno;
	String name;
	void insertRecord(int r,String n){   //creating record
		rollno=r;
		name=n;
	}
	void displayInformation(){System.out.println(rollno+" "+name);}  //Displays all the values in record
	public static void main(String args[]){
		students s1=new students();
		students s2=new students();
		s1.insertRecord(101,"clint");	  //insert values in record		
		s2.insertRecord(102,"parker");
		s1.displayInformation();
		s2.displayInformation();
	}
}