package Day10;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1=new Marker();
		marker1.price=20;
		marker1.size=5;
		marker1.isRefillable=true;
		marker1.color="Blue";
		Marker marker2=new Marker();
		marker2.price=25;
		marker2.size=6;
		marker2.isRefillable=false;
		marker2.color="Red";
		Marker marker3=new Marker();
		marker3.price=23;
		marker3.size=4;
		marker3.isRefillable=false;
		marker3.color="Black";
		Marker marker4=new Marker();
		marker4.price=24;
		marker4.size=7;
		marker4.isRefillable=true;
		marker4.color="Blue";
		Marker[] markers=new Marker[4];
		markers[0]=marker1;
		markers[1]=marker2;
		markers[2]=marker3;
		markers[3]=marker4;
		for(int i=0;i<markers.length;i++) {
			System.out.println("Prize = "+markers[i].price+", Size = "+markers[i].size+" ,Refillable = "+markers[i].isRefillable+" ,Color = "+markers[i].color);
		}
		for(int i=0;i<markers.length;i++) {
			markers[i].tax=markers[i].price*10/100;
			markers[i].netAmount=markers[i].price+markers[i].tax;
			System.out.println("NET AMOUNT ="+markers[i].netAmount);
		}
	}

}
