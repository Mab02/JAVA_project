
public class ChargingPoint extends Component{
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



}
