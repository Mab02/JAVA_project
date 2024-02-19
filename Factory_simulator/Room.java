
import java.util.ArrayList;

public class Room extends Component { 
    private name String;

    public Room (int xcoord, int ycoord, Dimension dimension , String name){
        super(xcoord, ycoord, dimension);
    }


	private ArrayList<Door> doorList;
	private ArrayList<Area> areaList;
	private ArrayList<Puck> puckList;
}