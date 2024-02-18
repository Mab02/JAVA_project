package simulateur_robot;

import fr.tp.inf112.projects.canvas.model.FigureStyle;

public class Style implements FigureStyle{
	private final int RedColor; 
	private final int GreenColor ;
	private final int BlueColor; 
	
	public Style (final int RedColor, final int GreenColor, final int BlueColor){
		this.RedColor = RedColor;
		this.GreenColor = GreenColor;
		this.BlueColor = BlueColor;
		
	}

public int getRedColor() {
	// TODO Auto-generated method stub
	return RedColor;
}

@Override
public int getGreenColor() {
	// TODO Auto-generated method stub
	return GreenColor;
}

@Override
public int getBlueColor() {
	// TODO Auto-generated method stub
	return BlueColor;
}
}
