package factory_simulator;
import fr.tp.inf112.projects.canvas.model.Figure;

public abstract class Component implements Figure {
	protected static int compteur = 0;
	public  String id;
	protected Point point;
	public final Dimension dimension;

public Component( int xcoord, int ycoord, Dimension dimension) {
	compteur++;
	this.point = new Point(xcoord, ycoord);
	this.dimension = dimension;
}

public String getName() {
	return this.id;
}
public 	int getxCoordinate(){
	return this.point.getxcoord();
}
public 	int getyCoordinate(){
	return this.point.getycoord();
}





}

