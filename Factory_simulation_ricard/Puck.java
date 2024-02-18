package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.FigureStyle;

public class Puck extends Component{

	public Puck(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	} /*egalement refer room*/

	@Override
	public String toString() {
		return "Puck [id="+ this.getId() + ", x="+ this.getxcoord() +", y="+ this.getycoord() +", dimension="+ this.getDimension() +"]\n";
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
