package by.teachmeskills.men.shoes;

public class DrMartensShoes implements IShoes {
    @Override
    public void putOn() { System.out.println("Надел ботинки Dr.Martens"); }
    @Override
    public void takeOff() { System.out.println("Снял ботинки Dr.Martens"); }
}