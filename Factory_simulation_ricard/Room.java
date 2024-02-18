package simulateur_robot;

import java.util.ArrayList;

import fr.tp.inf112.projects.canvas.model.FigureStyle;

public class Room extends Component { 
	public Room(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Door> doorList;
	private ArrayList<Area> areaList;
	private ArrayList<Puck> puckList;
	@Override
	
	public String toString() {
		return "Room [doorList=" + doorList + ", areaList=" + areaList + ", puckList=" + puckList + "]";
	}
	@Override
	public int getxCoordinate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getyCoordinate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FigureStyle getStyle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}