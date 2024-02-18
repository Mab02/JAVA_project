package simulateur_robot;

public class Battery {
	private Robot robot;/*reference bidirectionnelle avec le robot */

	private float power;
	private float voltage; 
	private float capacity;
	@Override
	public String toString() {
		return "Battery [robot=" + robot + ", power=" + power + ", voltage=" + voltage + ", capacity=" + capacity + "]";
	}
	
	
}
