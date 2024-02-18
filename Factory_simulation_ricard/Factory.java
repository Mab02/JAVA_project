package simulateur_robot;
import java.util.ArrayList;

import fr.tp.inf112.projects.canvas.model.FigureStyle;

public class Factory extends Component{
	public Factory(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		componentList = new ArrayList<Component>();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getxCoordinate() {
		// TODO Auto-generated method stub
		return getxCoordinate();
	}

	@Override
	public int getyCoordinate() {
		// TODO Auto-generated method stub
		return getyCoordinate();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return getName();
	}

	private ArrayList<Component> componentList; /*reference à component*/

	public String add(Component component) {
		componentList.add(component);
		return component.getId();
	}

	@Override
	public String toString() {
		return "Factory [id="+ this.getId() + ", x="+ this.getxcoord() +", y="+ this.getycoord() +", dimension="+ this.getDimension() +", componentList=" +"\n"+ componentList + "]\n";
	}


	@Override
	public FigureStyle getStyle() {
		// TODO Auto-generated method stub
		return null;
	}
}
