// package simulateur_robot;

public class Robot extends Component{
	private Battery battery; /*reference bidirectionnelle avec le robot */
	//private ChargingPoint chargingPoint; 

	public Robot(int xcoord, int ycoord, Dimension dimension /*ChargingPoint chargingPoint*/ ){
		super(xcoord, ycoord, dimension);
		this.id = "r" + super.compteur;
		this.battery = new Battery(this);
		//this. chargingPoint = new chargingPoint(); 
	
		
	}
	public String toString(){
		return id+"\t"+"batteryLevel" +": " + battery;
	}

}
