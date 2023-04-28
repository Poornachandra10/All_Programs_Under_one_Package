package Obj_programs;

public class Obj3 {
int Rno;
String Name;
String School ="Brks Matric School";
Obj3(int Rno1, String Name1){
	Rno=Rno1;
	Name=Name1;
	
}
void display()
{
	System.out.println( Rno+"  "+Name+"  "+School);
}
	public static void main(String[] args) {
		Obj3 a =new Obj3(1, "akila");
		Obj3 b=new Obj3(2, "Poorna");
		Obj3 c=new Obj3(3, "Pooja");
		a.display();
		b.display();
		c.display();
		

	}

}
