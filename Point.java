/**
 * a javabean class for Testpoint
 *
 * @author Yilin Huang (A00475433)
 */
public class Point {
    private int across;
    private int down;
    private String colour;
    private final int pointID;
    public static final String DEFAULT_COLOUR= "Black";
    public static int nextPointID=1;

    public Point(int across, int down, String colour) {
        if(across>0){
            this.across = across;
        }else{
            this.across = 0;
            System.out.println("Coordinate must not be negative.");
        }
        if(down>0){
            this.down = down;
        }else {
            this.down = 0;
            System.out.println("Coordinate must not be negative.");
        }
        this.colour = colour;
        this.pointID = nextPointID;
        nextPointID++;
    }
    public Point(int across, int down) {this(across,down,DEFAULT_COLOUR);}
    public Point(String colour) {this(0,0,colour);}
    public Point() {this(0,0,DEFAULT_COLOUR);}

    /**
     *
     * @return across
     */
    public int getAcross() {
        return across;
    }
    /**
     *
     * @param across
     */
    public void setAcross(int across) {
        if(across>0){
            this.across = across;
        }else{
            System.out.println("Coordinate must not be negative.");
        }
    }
    /**
     *
     * @return down
     */
    public int getDown() {
        return down;
    }
    /**
     *
     * @param down
     */
    public void setDown(int down) {
        if(down>0){
            this.down = down;
        }else{
            System.out.println("Coordinate must not be negative.");
        }
    }
    /**
     *
     * @return colour
     */
    public String getColour() {
        return colour;
    }
    /**
     *
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    /**
     *
     * @return pointID
     */
    public int getPointID() {
        return pointID;
    }
    @Override
    public String toString() {
        return "Point #"+this.pointID+" is a "+this.colour+" point at "+this.across+" across and "+this.down+" down.";
    }
}
