package simulateur_robot;

public abstract class Component {
	private String id;

	private int xcoord;

	private int ycoord;
	
	private Dimension dimension;



public String getId() {

return id;

}
public int getxcoord() {

return xcoord;

}
public void setxcoord(int xcoord) {
	this.xcoord = xcoord;
	
}
public int getycoord() {

return ycoord;

}
public void setycoord(int ycoord) {
	this.ycoord = ycoord;
}

}
