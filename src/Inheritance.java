
public class Inheritance {
	public void animalSound() {
		System.out.println("The Animal makes Sound");
	}
}
class Pig extends Inheritance{
	public void animalSound() {
		System.out.println("oink oink");
	}
	}
class Dog extends Inheritance{
	public void animalSound() {
		System.out.println("wowfwowf");
	}
	}
class Cat extends Inheritance{
	public void animalSound() {
		System.out.println("meowmeow");
	}
	}
class Main{
	public static void main(String[] args) {
		Inheritance Ani =new Inheritance();
		Inheritance Pig1=new Pig();
		Inheritance Dog1=new Dog();
		Inheritance Cat1=new Cat();
		
		Ani.animalSound();
		Pig1.animalSound();
		Dog1.animalSound();
		Cat1.animalSound();

	}

}
