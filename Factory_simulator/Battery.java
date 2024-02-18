package simulateur_robot;

public class Battery {
	private Robot robot; /* bidirectional reference with the robot */
	private int level; 

	public Battery (Robot robot){
		this.robot= robot; 
		this.level = 100; 
	}

	public int getlevel() {
		return level; 
	}

	public void setlevel(int level) throws IllegalArgumentException{
		if (this.level + level) >=0 and (this.level + level )<=100{ // verification of the battery level before updating
			this.level += level; 
		}
		else {
			throw new IllegalArgumentException("Battery level must be between 0 and 100");
		}

	}
}
