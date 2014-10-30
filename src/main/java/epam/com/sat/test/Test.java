package epam.com.sat.test;

import epam.com.sat.depo.Depo;
//import epam.com.sat.depo.DepoA;
import epam.com.sat.depo.Dispatcher;
import epam.com.sat.depo.Train;
import epam.com.sat.railway.Builder;

import java.util.List;

/**
 * Created by 1 on 28.10.2014.
 */
public class Test {

    public static void main(String[] args) {

        int totalPassengerCargo;int totalPassenger;
        Dispatcher Dispatcher1 = new Dispatcher();
        Dispatcher1.setName("Sat");
        Train Train1= Dispatcher1.launchTrain("KARAGANDA","015-Astana",21,2);
        System.out.println(Train1.toString());
        if ((Train1 != null)) {
            totalPassengerCargo=Dispatcher1.calcTotalPassengerCargo(Train1);
            totalPassenger=Dispatcher1.calcTotalPassenger(Train1);
            Dispatcher1.sortByComfortLevel(Train1);
            List<Integer> arrFindVagons;
            arrFindVagons=Dispatcher1.searchVagons(2,8,Train1);
            System.out.println("Find vagons in range between 2 and 8:");
            for (Integer Id : arrFindVagons) {
                System.out.println("Vagon id=" + Id);
                }

            }

        System.gc();

        }



    }

