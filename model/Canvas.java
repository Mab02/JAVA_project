package fr.tp.inf112.projects.canvas.model;

import java.util.Collection;

/**
 * Represents a model for the canvas of the user interface into which 2D figures will be displayed.
 * 
 * @author Dominique Blouin
 *
 */
public interface Canvas {
	
	/**
	 * Returns the name of this canvas.
	 * @return A non null non empty <code>String</code> name.
	 */
	String getName();
	
	/**
	 * Returns the width of this canvas.
	 * 
	 * @return A positive <code>int</code> value for the with in pixels of this canvas.
	 */
	int getWidth();
	
	/**
	 * Returns the height of this canvas.
	 * 
	 * @return A positive <code>int</code> value for the height in pixels of this canvas.
	 */
	int getHeight();
	
	/**
	 * Returns the 2D geometric figures of this canvas.
	 * @return A <code>Collection</code> of <code>Figure</code> objects.
	 */
	Collection<Figure> getFigures();
}
