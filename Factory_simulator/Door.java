package simulateur_robot;

public class Door extends Component { 

	private boolean open ; // State of the door (open or close )
	private Room room1;  /* which rooms the door connect */
	private Room room2;

	public Door(String id, int xcoord, int ycoord, Dimension dimension, boolean open, Room room1, Room room2) {
		super(id, xcoord, ycoord, dimension);
		this.open = open;
		this.room1 = room1;
		this.room2 = room2;
	}


	
	public String toString() {
		return "Door [open=" + open + "]";  /*toString method to show the door in the terminal */ 
	}
	
	
}
