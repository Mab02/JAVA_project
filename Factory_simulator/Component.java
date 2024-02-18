package simulateur_robot;

public abstract class Component {
	private static int compteur = 0;
	public final String id;
	private Point point;
	public final Dimension dimension;

public Component( int xcoord, int ycoord, Dimension dimension) {
	compteur++;
	this.xcoord = xcoord;
	this.ycoord = ycoord;
	this.dimension = dimension;
}




}
}
