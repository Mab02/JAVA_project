package simulateur_robot;

public abstract class Dimension {
private float width; 
private float length;
public float getWidth() {
	return width;
}
public void setWidth(float width) {
	this.width = width;
}
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
@Override
public String toString() {
	return "Dimension [width=" + width + ", length=" + length + "]";
}
}
