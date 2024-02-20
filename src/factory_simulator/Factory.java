package factory_simulator;
import java.util.ArrayList;
import java.util.Collection;

import fr.tp.inf112.projects.canvas.model.Canvas;
import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.Observable;
import fr.tp.inf112.projects.canvas.model.Observer;


public class Factory implements Canvas, Observable {
	private ArrayList<Component> components; /*reference à component*/

	private ArrayList<Observer> observers;

	private String name;

	private Dimension dimension;

	
	public Factory(String name , Dimension dimension) {
		this.components = new ArrayList<Component>();
		this.observers = new ArrayList<Observer>();
		this.name = name;
		this.dimension = dimension;
	}
	public Factory(String name) {
		this(name, new Dimension(50, 20));
	}
	public void addComponent(Component component) {
		components.add(component);
	}
	public  int getWidth() {
		return dimension.width;
	}
	public int getHeight() {
		return dimension.height;
	}
	public String getName() {
		return name;
	}
	public Collection<Figure> getFigures() {
		return (Collection) components;
	}
	
	public boolean addObserver(Observer observer) {
    if (!observers.contains(observer)) {
        observers.add(observer);
        return true;
    } 
    return false; 
	}
	public	boolean removeObserver( Observer observer ){
		if (observers.contains(observer)) {
			observers.remove(observer);
			return true;
		}
		return false;
	}




}
// plein de trucs