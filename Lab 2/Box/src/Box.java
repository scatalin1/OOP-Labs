public class Box{

//    Create a program, where you should instantiate 3
//    objects of Box type (which should have the following
//    instance variables -> height, width and depth),
//    via its constructor in 3 different ways:
//    Without parameters (all the instance variables should
//       have default value 1)
//    With 1 parameter (all the instance variables
//       should have same value)
//    With 3 parameters (for each instance variable)
     private double height;
     private double width;
     private double depth;

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getDepth() {
        return this.depth;
    }

    public Box(){
        this(1,1,1);
    }

    public Box(double depth) {
        this(depth, depth, depth);
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double calculateArea(){
        return (2*( height*width + height*depth + width*depth));
    }

    public double calculateVolume(){
        return (height*width*depth);
    }





}
