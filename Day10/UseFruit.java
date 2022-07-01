package Day10;

public class UseFruit {
	public static void main(String[] args) {
		Fruits fruit1=new Fruits();
		fruit1.name="Apple";
		fruit1.price=100;
		fruit1.isHybride=true;
		Fruits fruit2=new Fruits();
		fruit2.name="Cherry";
		fruit2.price=250;
		fruit2.isHybride=false;
		Fruits fruit3=new Fruits();
		fruit3.name="Banana";
		fruit3.price=50;
		fruit3.isHybride=false;
		Fruits[] fruit=new Fruits[3];
		fruit[0]=fruit1;
		fruit[1]=fruit2;
		fruit[2]=fruit3;
		for(Fruits i:fruit) {
			System.out.println("Fruits Name:"+i.name+", Fruits Price:"+i.price+",Fruits is Hybride:"+i.isHybride);
		}
	}

}
