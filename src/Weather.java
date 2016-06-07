import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Stas on 07.06.2016.
 */
public class Weather {

    public static Gson jsonData = new GsonBuilder().create();

    public static void ImplementationMainClass(){

        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new URL("" +
                    "http://api.wunderground.com/api/5871d00365a72dde/conditions/q/Russia/Ekaterinburg.json").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        MainClass responseWeather = jsonData.fromJson(reader, MainClass.class);


        for (Response search : responseWeather.response){

            System.out.println("Version: " + search.getVersion());

        }

    }

    public static void main(String args[]){

        ExpTryCatch();

    }


    public static void ExpTryCatch(){
        try{
            ImplementationMainClass();
        }catch (Exception error){
            System.out.println("Error = > : " + error.getMessage());
        }
    }

}
