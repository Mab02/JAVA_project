// package simulateur_robot;

public abstract class Component {
	protected static int compteur = 0;
	public  String id;
	private Point point;
	public final Dimension dimension;

public Component( int xcoord, int ycoord, Dimension dimension) {
	compteur++;
	this.point = new Point(xcoord, ycoord);
	this.dimension = dimension;
}




}

