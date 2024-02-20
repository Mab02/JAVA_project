package factory_simulator;
import java.util.ArrayList;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;

public class Room extends Component implements RectangleFigure{
    private  String name;

    public Room (int xcoord, int ycoord, Dimension dimension , String name){
        super(xcoord, ycoord, dimension);
        this.id = "r" + super.compteur;
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }


	private ArrayList<Door> doorList;
	private ArrayList<Area> areaList;
	private ArrayList<Puck> puckList;
    public int getWidth(){
        return dimension.width;
    }
    public int getHeight(){
        return dimension.height;
    }

}