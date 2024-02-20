package factory_simulator;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;


public class ChargingPoint extends Component implements RectangleFigure{
   private Boolean isAvailable;

   public ChargingPoint (int xcoord, int ycoord, Dimension dimension) {
         super(xcoord, ycoord, dimension);
		   this.id = "c" + super.compteur;
         this.isAvailable = true;

   }
   public ChargingPoint (int xcoord, int ycoord ) {
      this(xcoord, ycoord, new Dimension(15,15)); // Setting ChargingPoint dimension by default 
   }

   public boolean setisAvailable (){
      if (isAvailable) { isAvailable = false ; //  robot verifying if chargingPoint is Available
         return true;
      }
      return false;
   }
   public String toString() {
      return "Charging Point " + id +" is " + (isAvailable ? "available" : "not available");
   }
   public int getWidth(){
      return dimension.width;
  }
   public int getHeight(){
        return dimension.height;
    }


}
