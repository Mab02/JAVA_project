package simulateur_robot;

import java.util.ArrayList;

public class Room extends Component { 

    public Room (int xcoord, int ycoord, Dimension dimension){
        super(xcoord, ycoord, dimension);
    }

	private ArrayList<Door> doorList;
	private ArrayList<Area> areaList;
	private ArrayList<Puck> puckList;
}