package simulateur_robot;

public class Test {

	public static void main(String[] args) {
		RectanDimension RectanDimension = new RectanDimension(100, 200);
		Factory myFactory = new Factory("Tesla", 0, 0,RectanDimension);
		myFactory.add(new Robot("1",10,10,new CircleDimension(5) ) );
		myFactory.add(new Robot("2",10,20,new CircleDimension(5) ) );
		myFactory.add(new Robot("3",10,40,new CircleDimension(5) ) );
		myFactory.add(new ChargingPoint("1",10,10,new CircleDimension(5) ) );
		myFactory.add(new Machine("1",30,20,new RectanDimension(5, 12) ));
		myFactory.add(new Machine("2",50,20,new RectanDimension(5, 12) ) );
		myFactory.add(new Puck("1",15,30,new CircleDimension(1) ) );
		myFactory.add(new Puck("2",17,30,new CircleDimension(1) ) );
		myFactory.add(new Puck("3",19,30,new CircleDimension(1) ) );
	
	System.out.println(myFactory);
	}}
