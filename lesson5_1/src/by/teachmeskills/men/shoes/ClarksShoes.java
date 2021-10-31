package by.teachmeskills.men.shoes;

public class ClarksShoes implements IShoes {
    @Override
    public void putOn() { System.out.println("Надел ботинки Clarks"); }
    @Override
    public void takeOff() { System.out.println("Снял ботинки Clarks"); }
}
