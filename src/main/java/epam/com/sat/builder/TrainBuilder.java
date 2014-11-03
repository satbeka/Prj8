package epam.com.sat.builder;

//import epam.com.sat.depo.Train;

import java.util.Random;

/**
 * Created by 1 on 28.10.2014.
 */
public class TrainBuilder {


    //int cargo,int idVagon,int countPassenger,int levelComfort
    public int randomCargo(){
        Random r= new Random();
        return r.nextInt(50);
    };
    public int randomCountPassenger(){
        Random r= new Random();
        return r.nextInt(30);
    };
    public String randomLevelComfort(int idVagon){
        if (idVagon%2==0){return "COMMON_PLACE";};
        if (idVagon%3==0){return "PLATSKARD";};
        if (idVagon%5==0){return "COMPARTMENT";};

        return "COMMON_PLACE";
    };


    /*
    {
    Date sysDate = new Date();
    String sysDTString = sysDate.toString();}
    */






}
