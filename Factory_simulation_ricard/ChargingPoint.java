package simulateur_robot;
import fr.tp.inf112.projects.canvas.model.FigureStyle;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;

public class ChargingPoint extends Component implements RectangleFigure{

	public ChargingPoint(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public String toString() {
		return "ChargingPoint [Puck [id="+ this.getId() + ", x="+ this.getxcoord() +", y="+ this.getycoord() +", dimension="+ this.getDimension() +"]\n";
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
	public int getWidth() {
		// TODO Auto-generated method stub
		return getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return getHeight();
	}

	@Override
	public FigureStyle getStyle() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
 