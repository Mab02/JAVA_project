package fr.tp.inf112.projects.canvas.model;

/**
 * Represents an oval figure with given width and height.
 * 
 * @author Dominique Blouin
 *
 */
public interface OvalFigure extends Figure {

	/**
	 * Returns the width of this figure.
	 * 
	 * @return A positive <code>int</code> value for the with in pixels of this figure.
	 */
	int getWidth();

	/**
	 * Returns the height of this figure.
	 * 
	 * @return A positive <code>int</code> value for the height in pixels of this figure.
	 */
	int getHeight();
}
