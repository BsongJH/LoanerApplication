import java.util.ArrayList;
import java.util.List;

public class Computers
{
    private String loanNum;
    private String model;
    private String type;  // True = Engineering, False == Standard
    private boolean availability;
    private List<String> thisObject;
    Computers(String newLoanNum, String newModel, String newType)
    {
        loanNum = newLoanNum;
        model = newModel;
        type = newType;
        availability = true;
    }
    // Getter methods
    // TODO make restrictions
    public List<String> inAList()
    {
        thisObject = new ArrayList<>();
        thisObject.add(boolToString(availability));
        thisObject.add(model);
        thisObject.add(loanNum);
        thisObject.add(type);
        return thisObject;
    }

    public String getAssetNum()
    {
        return loanNum;
    }
    public String getModel()
    {
        return model;
    }

    public String getLoanDate()
    {
        return type;
    }

    // Setter methods
    // TODO make restrictions
    public void setAssetNum(String assetNum)
    {
        this.loanNum = assetNum;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String boolToString(boolean availability)
    {
        if (availability) return "Available";
        else return "Not Available";
    }
}