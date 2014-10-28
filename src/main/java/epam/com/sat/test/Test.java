package epam.com.sat.test;

import epam.com.sat.depo.DepoA;
import epam.com.sat.railway.Runner;

/**
 * Created by 1 on 28.10.2014.
 */
public class Test {
    public static void main(String[] args) {
        int c; int totalCargo;int totalPassenger;
        DepoA.Name depo = DepoA.Name.KARAGANDA;
        int totalVagons=15;


        c=Runner.createTrain(depo,totalVagons);
        for (int i = 0; i < totalVagons; i++) {
            ///fill vagons parametrs
        }

        totalCargo=Runner.calcTotalCargo();
        totalPassenger=Runner.calcTotalPassenger();


    }
}
