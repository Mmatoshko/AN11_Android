package by.teachmeskills.men.pants;

public class WranglerPants implements IPants {
    @Override
    public void putOn() { System.out.println("Надел штаны Wrangler"); }
    @Override
    public void takeOff() { System.out.println("Снял штаны Wrangler"); }
}
