package simulateur_robot;

public class Point {
	private int xcoord;
	private int ycoord;


Point(int x0, int y0) {
	this.x = x0;
	this.y = y0;
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