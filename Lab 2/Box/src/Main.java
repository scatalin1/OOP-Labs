public class Main {

    public static void main(String[] args) {

        Box FirstBox = new Box();
        System.out.println("The first box parameters are default: " + FirstBox.getDepth()+" x "+FirstBox.getWidth()+" x "+FirstBox.getHeight());

        Box SecondBox = new Box(3);
        System.out.println("Second box parameters are: " + SecondBox.getDepth() + " x " + SecondBox.getHeight()+ " x " + SecondBox.getWidth());

        Box ThirdBox = new Box(2, 3, 5);
        System.out.println("Third box parameters are: " +ThirdBox.getHeight()+" x "+ ThirdBox.getWidth()+" x "+ThirdBox.getDepth());
        System.out.println("Third box surface area is " + ThirdBox.calculateArea());
        System.out.println("Third box volume is " + ThirdBox.calculateVolume());
    }
}
