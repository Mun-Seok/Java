package day23;

public class Constructor2 {

	public static void main(String[] args) {
		Cellphone myphone=new Cellphone();
		System.out.println(myphone.model);
	}

}
class Cellphone{
	String model="Galaxy 8";
	String color="red";
	int capacity=60;
	Cellphone(){
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}