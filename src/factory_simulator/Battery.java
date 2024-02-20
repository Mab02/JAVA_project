package factory_simulator;
public class Battery {
	private int level; 

	public Battery (){
		this.level = 100; // Initialisation of battery level  
	}

	public int getlevel() {
		return level; 
	}

	public void setlevel(int level) throws IllegalArgumentException{
		if ((this.level + level) >=0 && (this.level + level )<=100){ // verification of the battery level before updating
			this.level += level; 
		}
		else {
			throw new IllegalArgumentException("Battery level must be between 0 and 100");
		}

	}
	public String toString(){
		return ""+level; // convert level into string
	}
}
