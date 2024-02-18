package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.FigureStyle;

public class Machine extends Component {

	public Machine(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "Machine [id="+ this.getId() + ", x="+ this.getxcoord() +", y="+ this.getycoord() +", dimension="+ this.getDimension() +"]\n";
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

	@Override
	public FigureStyle getStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
