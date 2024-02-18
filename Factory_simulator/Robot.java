package simulateur_robot;

public class Robot extends Component{
	private Battery battery; /*reference bidirectionnelle avec le robot */

	public Robot(int xcoord, int ycoord, Dimension dimension){
		super(xcoord, ycoord, dimension);
		this.id = "r" + super.compteur;
		this.battery = new Battery(100);
		
	}

}
