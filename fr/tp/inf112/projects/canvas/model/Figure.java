package fr.tp.inf112.projects.canvas.model;

public interface Figure {
	
	/**
	 * Returns the coordinate of this figure along the x axis with respect to the top left corner of the canvas containing this figure.
	 * @return A positive <code>int</code> value in pixels.
	 */
	int getxCoordinate();

	/**
	 * Returns the coordinate of this figure along the y axis with respect to the top left corner of the canvas containing this figure.
	 * @return A positive <code>int</code> value in pixels.
	 */
	int getyCoordinate();
	
	/**
	 * Returns the name of this figure.
	 * @return A non null non empty <code>String</code> name.
	 */
	String getName();
	
	FigureStyle getStyle();
}
