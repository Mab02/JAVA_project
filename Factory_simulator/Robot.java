
public class Robot extends Component{
	private Battery battery; /*reference bidirectionnelle avec le robot */
	private ChargingPoint chargingPoint; 
	private Point destination;
	private Puck puck;

	public Robot(int xcoord, int ycoord, Dimension dimension, ChargingPoint chargingPoint, Point destination ){
		super(xcoord, ycoord, dimension);
		this.id = "r" + super.compteur;
		this.battery = new Battery();
		this.chargingPoint = chargingPoint; 
		this.destination = destination;
		this.puck = null;
	
		
	}

	public Robot(int xcoord, int ycoord, ChargingPoint chargingPoint, Point destination ){  // Setting robot dimension by default 
		this( xcoord, ycoord, new Dimension(10,10),  chargingPoint,  destination );
	}


	public void prendrePuck(Area area){
		//prendre le puck
		if (area.hasPuck()){
			//prendre le puck
			this.puck = area.removePuck();
		}
	}
	 public void deposerPuck (Component component){
		
	 }


	public String toString(){
		return id+"\t"+"batteryLevel" +": " + battery;
	}
	

}
