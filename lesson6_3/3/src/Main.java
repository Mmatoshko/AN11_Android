public class Main {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getInfo());
        System.out.println(Colors.GREEN.getInfo());
        System.out.println(Colors.BLUE.getInfo());
    }
}
enum Colors{
    RED(255,0,0),GREEN(0,255,0),BLUE(0,0,255);
    private final int firstValue;
    private final int secondValue;
    private final int thirdValue;

    Colors(int firstValue,int secondValue,int thirdValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public String getInfo(){
        if( firstValue == 255 & secondValue == 0 & thirdValue == 0 ){
            System.out.println("Color - Red");
            return "Brightness level values - (" + firstValue + "," + secondValue + "," + thirdValue + ")";
        }
        else if ( firstValue == 0 & secondValue == 255 & thirdValue == 0 ) {
            System.out.println("Color - Green");
            return "Brightness level values - (" + firstValue + "," + secondValue + "," + thirdValue + ")";
        }
        else {
            System.out.println("Color - Blue");
            return "Brightness level values - (" + firstValue + "," + secondValue + "," + thirdValue + ")";
        }
    }
}
