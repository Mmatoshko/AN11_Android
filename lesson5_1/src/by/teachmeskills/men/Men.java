package by.teachmeskills.men;

import by.teachmeskills.men.jacket.IJacket;
import by.teachmeskills.men.pants.IPants;
import by.teachmeskills.men.shoes.IShoes;

public class Men implements IMen {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Men(String name, IJacket jacket, IPants pants, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Men() { }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public IJacket getJacket() { return jacket; }

    public void setJacket(IJacket jacket) { this.jacket = jacket; }

    public IPants getPants() { return pants; }

    public void setPants(IPants pants) { this.pants = pants; }

    public IShoes getShoes() { return shoes; }

    public void setShoes(IShoes shoes) { this.shoes = shoes; }


    @Override
    public void putOnAll() {
        System.out.println("\n" + this.name + " одевается.");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOffAll() {
        System.out.println("\n" + this.name + " раздевается.");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
