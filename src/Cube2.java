
public class Cube2 {
    private Cube basicCube;
    private String color;


    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }
    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }
    public Cube2(int side, String color){
        basicCube = new Cube(side);
        this.color = color;
    }

    public void setSide(int side){
        basicCube.setSide(side) ;
    }

    public int getSide() {
        return basicCube.getSide();
    }
    public String getColor(){
        return this.color ;
    }
    public void setColor (String color){
        this.color = color;
    }
    //the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        int side = getSide();
        return side*side*side;
    }
    public int calculateSurfaceArea() {
        int side = getSide();
        return 6* (side * side);
    }

    public Cube2 add(Cube2 otherCube) {
        int sideA = this.getSide();
        int sideB = otherCube.getSide();
        double sideC = Math.sqrt(sideA*sideA + sideB*sideB);
        if (sideC % 1 ==0){
           int C = (int) sideC;
           Cube2 Cube3 = new Cube2(C , this.color);
           return Cube3;
        }
        else{
            throw new IllegalArgumentException("This is not true because it is not an integer.");
        }

    }
    public Cube2 minus(Cube2 otherCube) {
        int sideA = this.getSide();
        int sideB = otherCube.getSide();
        double sideC;
        if (sideA > sideB){
            sideC =Math.sqrt(sideA*sideA - sideB*sideB);
        }
        else{
            sideC = Math.sqrt(sideB*sideB-sideA*sideA);
        }
        if (sideC % 1 ==0){
            int C = (int) sideC;
            Cube2 Cube3 = new Cube2(C , this.color);
            return Cube3;
        }
        else{
            throw new IllegalArgumentException("This is not true");
        }
    }
    public String toString() {
        return "Cube{side="+ getSide()+", color=\""+ this.color+"\"}";
    }

}
