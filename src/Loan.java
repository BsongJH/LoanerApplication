import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loan
{
    // TODO oan class will have the date and name attribute working similarly like the computer class
    protected LocalDate date;
    protected String name;

    public Loan(String newName)
    {
        // This attributes will be send via compObj.getNum or something by clicking the desired computer
        date = LocalDate.now();
        name = newName;
    }

    public List<String> inAList()
    {
        List<String> newLine = new ArrayList<>();
        newLine.add(date.toString());
        newLine.add(name);
        return newLine;
    }

    // TODO make restriction when accessing information

    public String getName()
    {
        return name;
    }

    public LocalDate getDate()
    {
        return date;
    }
    // TODO make restrictions when accessing and changing

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

}