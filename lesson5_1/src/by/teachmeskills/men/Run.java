package by.teachmeskills.men;

import by.teachmeskills.men.jacket.MaStrumJacket;
import by.teachmeskills.men.jacket.StoneIslandJacket;
import by.teachmeskills.men.jacket.TommyHilfigerJacket;
import by.teachmeskills.men.pants.CheapMondayPants;
import by.teachmeskills.men.pants.LevisPants;
import by.teachmeskills.men.pants.WranglerPants;
import by.teachmeskills.men.shoes.ClarksShoes;
import by.teachmeskills.men.shoes.DrMartensShoes;
import by.teachmeskills.men.shoes.GrensonShoes;

public class Run {
    public static void main(String[] args) {
        Men firstMen = new Men("Владислав",new StoneIslandJacket(),new LevisPants(),new DrMartensShoes());
        Men secondMen = new Men("Егор",new TommyHilfigerJacket(),new CheapMondayPants(),new GrensonShoes());
        Men thirdMen = new Men("Владимир", new MaStrumJacket(),new WranglerPants(),new ClarksShoes());

        firstMen.putOnAll();
        firstMen.takeOffAll();

        secondMen.putOnAll();
        secondMen.takeOffAll();

        thirdMen.putOnAll();
        thirdMen.takeOffAll();

    }
}
