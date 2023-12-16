public class Computers
{
    private int assetNum;
    private String model;
    private boolean type;
    Computers(int newAssetNum, String newModel, boolean newType)
    {
        assetNum = newAssetNum;
        model = newModel;
        type = newType;
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
}
