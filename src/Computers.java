public class Computers
{
    private int assetNum;
    private String model;
    private boolean type;  // True = Engineering, False == Standard
    private boolean availability;
    Computers(int newAssetNum, String newModel, boolean newType)
    {
        assetNum = newAssetNum;
        model = newModel;
        type = newType;
        availability = true;
    }
    // Getter methods
    // TODO make restrictions

    public int getAssetNum()
    {
        return assetNum;
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
    public void setAssetNum(int assetNum)
    {
        this.assetNum = assetNum;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setType(boolean type)
    {
        this.type = type;
    }
}
