package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.FigureStyle;

import java.util.ArrayList;

public  class Area  extends Component implements Figure{ /*egalement refer room*/

	public Area(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getId() {

		return getId();
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

	private ArrayList<Area> componentList;

	@Override
	public String toString() {
		return "Area [componentList=" + componentList + "]";
	}
	@Override
	public FigureStyle getStyle() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
