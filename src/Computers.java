public class Computers
{
    private int assetNum;
    private String userName;
    private int loanDate;
    Computers(int newAssetNum, String newUserName, int newLoanDate)
    {
        assetNum = newAssetNum;
        userName = newUserName;
        loanDate = newLoanDate;
    }
    // Getter methods
    // TODO make restrictions

    public int getAssetNum()
    {
        return assetNum;
    }
    public String getUserName()
    {
        return userName;
    }

    public int getLoanDate()
    {
        return loanDate;
    }
}
