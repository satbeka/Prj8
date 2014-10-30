package epam.com.sat.test;

import epam.com.sat.depo.DepoA;
import epam.com.sat.depo.Train;
import epam.com.sat.railway.Runner;

/**
 * Created by 1 on 28.10.2014.
 */
public class Test {
    public static void main(String[] args) {


         int totalPassengerCargo;int totalPassenger;
        DepoA.Name depo = DepoA.Name.KARAGANDA;
        //int totalVagons=15;


        Train Train1=Runner.launchTrain(depo);
        System.out.println(Train1.toString());
        if ((Train1 != null)) {
            totalPassengerCargo=Train1.calcTotalPassengerCargo();
            totalPassenger=Train1.calcTotalPassenger();
            Train1.sortByComfortLevel();


            

        }



        System.gc();

    }
}
