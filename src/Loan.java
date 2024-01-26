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
        date = LocalDate.now();
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

}