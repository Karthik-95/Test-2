package Day10;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="Lenovo";
		lap1.price=35000;
		lap1.model="L250";
		lap1.isTouchscreen=false;
		lap1.taxPercentage=10;
		Laptop lap2=new Laptop();
		lap2.brand="HP";
		lap2.price=30000;
		lap2.model="H35";
		lap2.isTouchscreen=false;
		lap2.taxPercentage=8;
		Laptop lap3=new Laptop();
		lap3.brand="Acer";
		lap3.price=25000;
		lap3.model="A65";
		lap3.taxPercentage=12;
		lap3.isTouchscreen=true;
		Laptop lap4=new Laptop();
		lap4.brand="Sony";
		lap4.price=35000;
		lap4.model="XP25";
		lap4.isTouchscreen=true;
		lap4.taxPercentage=13;
		Laptop[] lap= {lap1,lap2,lap3,lap4};
		for(int i=0;i<lap.length;i++) {
			System.out.println("LAPTOP Brand : "+lap[i].brand+", Net Price : "+(lap[i].price+(lap[i].price*lap[i].taxPercentage/100)));
		}
	}

}
