/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
 
    public void plantCross(){
  setup();
  corner();
  end();
  corner();
  end();
    corner();
  end();
    corner();
  end();
  
  
}

public void setup(){
  
  turn(RIGHT);
  hop(6);
  turn(LEFT);
  hop(3);
}

public void plantHop(){
  plant();
  hop();
  
}
public void corner(){
  plantHop();
  plantHop();
  plantHop();
  turn(LEFT);
    plantHop();
  plantHop();
  plantHop();
turn(RIGHT);
}
public void end(){
  
  plantHop();
  plantHop();
  plant();
  turn(RIGHT);
}
   
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
