package fr.tp.inf112.projects.canvas.model;

public interface Observable {
	
	boolean addObserver( Observer observer );

	boolean removeObserver( Observer observer );
}
