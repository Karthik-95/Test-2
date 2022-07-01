package Day10;

public class UseBag{
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.bagType="school";
		bag1.color="Black";
		bag1.noOfzip=4;
		Bag bag2=new Bag();
		bag2.bagType="Travel";
		bag2.color="Red";
		bag2.noOfzip=3;
		Bag bag3=new Bag();
		bag3.bagType="School";
		bag3.color="Blue";
		bag3.noOfzip=5;
		Bag[] bag= {bag1,bag2,bag3};
		for(Bag i:bag) {
			System.out.println("BAG TYPE : "+i.bagType+"\n"+"BAG COLOR : "+i.color+"\n"+"NO OF ZIP : "+i.noOfzip);
		}
	}

}
