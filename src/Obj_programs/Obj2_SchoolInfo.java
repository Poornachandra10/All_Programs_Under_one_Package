package Obj_programs;

public class Obj2_SchoolInfo {
	
	int id;
	String name;

	public static void main(String[] args) {
		Obj2_SchoolInfo a1 = new Obj2_SchoolInfo();
		
		 a1.id=110;
		a1.name= "akila";
		
		Obj2_SchoolInfo a2 = new Obj2_SchoolInfo();
		a2.id =111;
		a2.name="thejal";
		
		System.out.println("id "+ a1.id);
		System.out.println("Name "+ a1.name);
		System.out.println("id "+ a2.id);
		System.out.println("Name "+ a2.name);
		
	
	}

}
