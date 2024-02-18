package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.FigureStyle;
import fr.tp.inf112.projects.canvas.model.OvalFigure;

public class Robot extends Component  implements OvalFigure{
	public Robot(String id, int xcoord, int ycoord, Dimension dimension) {
		super(id, xcoord, ycoord, dimension);
		// TODO Auto-generated constructor stub
	}

	private Battery battery;/*reference bidirectionnelle avec le robot */

	@Override
	public String toString() {
		return "Robot [battery=" + battery + ", id="+ this.getId() + ", x="+ this.getxcoord() +", y="+ this.getycoord() +", dimension="+ this.getDimension() +"]\n";
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
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Style getStyle() {
		// TODO Auto-generated method stub
		return new Style(60,60,60);
	}
	
}
