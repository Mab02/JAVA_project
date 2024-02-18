package simulateur_robot;

public class RectanDimension  extends Dimension{
	private float width;
	private float lenght;
	public float getWidth() 
	
	
	{
		return width;
	}
	public RectanDimension(float width, float lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	

}
