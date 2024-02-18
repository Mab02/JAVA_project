package simulateur_robot;

public abstract class Point {
	private int xcoord;
	private int ycoord;


Point(int x0,int y0) {
xcoord = x0;
ycoord = y0;
}


@Override
public String toString() {
	return "Point [xcoord=" + xcoord + ", ycoord=" + ycoord + "]";
}
}