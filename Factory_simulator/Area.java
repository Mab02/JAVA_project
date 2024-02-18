package simulateur_robot;

public class Area extends Component{ 

// TODO ajouter un tableau des elements dans l'area

	

    public Area (int xcoord, int ycoord, Dimension dimension ){
		super( xcoord, ycoord, dimension);
		this.id = "r" + super.compteur;
    }


}
