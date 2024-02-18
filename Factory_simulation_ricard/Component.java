package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.Figure;

public abstract class Component  implements Figure {
	private String id;

	private int xcoord;

	private int ycoord;
	
	private Dimension dimension;


public Component(String id, int xcoord, int ycoord, Dimension dimension) {
		super();
		this.id = id;
		this.xcoord = xcoord;
		this.ycoord = ycoord;
		this.dimension = dimension;
	}
public String getId() {

return id;

}
public int getxcoord() {

return xcoord;

}
public int getycoord() {

return ycoord;

} 

public Dimension getDimension() {
	return dimension;
}
public void setDimension(Dimension dimension) {
	this.dimension = dimension;
}
@Override
public String toString() {
	return "Component [id=" + id + ", xcoord=" + xcoord + ", ycoord=" + ycoord + ", dimension=" + dimension + "]\n";
}
}
