// modifier isAnimationRunning
package factory_simulator;

import java.util.Collection;

import fr.tp.inf112.projects.canvas.controller.Controller;
import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.Observer;

public class SimulatorController  implements Controller{
    
    private Factory factory;
    public SimulatorController(Factory factory){
        this.factory = factory;
    }
    public String getCanvasName(){
        return factory.getName();
    }
     
    public 	int getCanvasWidth(){
        return factory.getWidth();
    }
    public 	int getCanvasHeight(){
        return factory.getHeight();
    }
    public Collection<Figure> getCanvasFigures(){
        return factory.getFigures();
    }

    public void startAnimation(){};
    public void stopAnimation(){};
	public boolean isAnimationRunning(){return false;};

    public boolean addObserver(Observer observer) {
        return factory.addObserver(observer);
    }

    public boolean removeObserver(Observer observer) {
        return factory.removeObserver(observer);
    }

    

}