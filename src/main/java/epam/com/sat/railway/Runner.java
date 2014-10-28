package epam.com.sat.railway;

import java.util.Date;

/**
 * Created by 1 on 28.10.2014.
 */
public class Runner {

    Date sysDate = new Date();
    String sysDTString = sysDate.toString();

    static public int createTrain(){

       if ()
        {System.out.println("Train create on="+sysDTString);}
        return 1;
       else
        {System.out.println("Train don't create on "+sysDTString);}
        return 0;
    }

    static public int calcTotalPassenger(){
        int TotalPassenger=0;

        {System.out.println("TotalPassenger on="+sysDTString+" = "+TotalPassenger);}
        return TotalPassenger;
    }

    static public int calcTotalCargo(){
        int TotalCargo=0;

        {System.out.println("TotalCargo on="+sysDTString+" = "+TotalCargo);}
        return TotalCargo;
    }



}
