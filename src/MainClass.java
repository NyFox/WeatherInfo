import java.util.ArrayList;

/**
 * Created by Stas on 08.06.2016.
 */
public class MainClass {

    public ArrayList<Response> response;

    private Current_observation current_observation;

    public ArrayList<Response> getResponse ()
    {
        return response;
    }

    public void setResponse (ArrayList<Response> response)
    {
        this.response = response;
    }

    public Current_observation getCurrent_observation ()
    {
        return current_observation;
    }

    public void setCurrent_observation (Current_observation current_observation)
    {
        this.current_observation = current_observation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response = "+response+", current_observation = "+current_observation+"]";
    }

}
