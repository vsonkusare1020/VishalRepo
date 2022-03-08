package prac;

public class Student {
 int rollno;
 String name;
 Address add;
 
 public static void main(String[] args) {
	Address ad=new Address();
	ad.city="Pune";
	ad.area="Karve nagar";
	
	Student s=new Student();
	s.rollno=121;
	s.name="vishal";
	s.add=ad;
	System.out.println(s.rollno);
	System.out.println(s.name);
	System.out.println(s.add.city);
	System.out.println(s.add.area);
			
}
}
