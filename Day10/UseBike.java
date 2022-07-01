package Day10;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="HONDA";
		bike1.price=80000;
		bike1.isWarranty=true;
		bike1.taxPercentage=10;
		bike1.discountPercentage=8;
		Bike bike2=new Bike();
		bike2.brand="TVS";
		bike2.price=100000;
		bike2.isWarranty=true;
		bike2.taxPercentage=11;
		bike2.discountPercentage=10;
		Bike bike3=new Bike();
		bike3.brand="Hero";
		bike3.price=90000;
		bike3.isWarranty=false;
		bike3.taxPercentage=8;
		bike3.discountPercentage=10;
		Bike[] bike= {bike1,bike2,bike3};
		int total=0;
		int count=0;
		for(Bike i:bike) {
			i.discountAmount=i.price+i.price*i.discountPercentage/100;
			i.taxAmount=i.price+i.price*i.taxPercentage/100;
			i.netPrice=i.price+i.taxAmount-i.discountAmount;
		//System.out.println("BRAND : "+i.brand+"\n"+"NET PRICE : "+i.netPrice);
			total=total+i.netPrice;
			count=count+1;
		}
		//System.out.println("PRICE AVERAGE = "+total/count);
		for(Bike i:bike) {
		//	System.out.println(i.brand.charAt(0));
		}
		for(int i=0;i<bike.length;i++) {
				System.out.println(bike[i].brand.charAt(i));
		}
	}

}
