package fr.tp.inf112.projects.canvas.controller;

import java.util.Collection;

import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.Observable;

/**
 * Represents the controller of the canvas viewer.
 * 
 * @author Dominique Blouin
 *
 */
public interface Controller extends Observable {
	
	/**
	 * Returns the name of the canvas model associated with this controller.
	 * @return A non null non empty <code>String</code> name.
	 */
	String getCanvasName();
	
	/**
	 * Return the width of the canvas model associated with this controller. 
	 * This value will be scaled according to the size in pixels of the user interface screen.
	 * @return A positive <code>int</code> value.
	 */
	int getCanvasWidth();

	/**
	 * Return the height of the canvas model associated with this controller. 
	 * This value will be scaled according to the size in pixels of the user interface screen.
	 * @return A positive <code>int</code> value.
	 */
	int getCanvasHeight();
	
	/**
	 * Returns the figures of the canvas model associated with this controller to be displayed 
	 * on the user interface canvas.
	 * @return A <code>Collection</code> of <code>Figure</code> objects.
	 */
	Collection<Figure> getCanvasFigures();
	
	/**
	 * Starts the animation of the canvas model associated with this controller. For example, moving, resizing, 
	 * adding or removing figures.
	 */
	void startAnimation();

	/**
	 * Stops the animation of the canvas model associated with this controller.
	 */
	void stopAnimation();
	
	/**
	 * States if the canvas model associated with this controller is being animated or not.
	 * @return A <code>boolean</code> stating if the canvas is being animated or not
	 */
	boolean isAnimationRunning();
}
