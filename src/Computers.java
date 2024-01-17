import java.util.ArrayList;
import java.util.List;

public class Computers
{
    private String loanNum;
    private String model;
    private boolean type;  // True = Engineering, False == Standard
    private boolean availability;
    private List<String> thisComp;
    Computers(String newLoanNum, String newModel, boolean newType)
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
        thisComp = new ArrayList<>();
        thisComp.add(availableBoolToString(availability));
        thisComp.add(model);
        thisComp.add(loanNum);
        thisComp.add(" ");
        thisComp.add(" ");
        return thisComp;
    }

    public String getAssetNum()
    {
        return loanNum;
    }
    public String getModel()
    {
        return model;
    }

    public boolean getLoanDate()
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

    public void setType(boolean type)
    {
        this.type = type;
    }

    public String toString()
    {
        return loanNum + model + type;
    }

    public String availableBoolToString(boolean availability)
    {
        if (availability) return "Available";
        else return "Not Available";
    }
}