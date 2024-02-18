package simulateur_robot;
import fr.tp.inf112.projects.canvas.model.FigureStyle;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;
public class Door extends Component  implements RectangleFigure{ /* egalement reference de room*/

	public Door(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	}

	private boolean state ;

	@Override
	public String toString() {
		return "Door [state=" + state + "]";
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
