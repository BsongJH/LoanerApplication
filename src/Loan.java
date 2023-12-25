import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loan
{
    // TODO oan class will have the date and name attribute working similarly like the computer class
    protected LocalDate date;
    protected String firstName;
    protected String lastName;

    public Loan(String newFirstName, String newLastName)
    {
        date = LocalDate.now();
        firstName = newFirstName;
        lastName = newLastName;
    }

    public List<String> inAList()
    {
        List<String> newLine = new ArrayList<>();
        newLine.add(date.toString());
        newLine.add(firstName);
        newLine.add(lastName);
        return newLine;
    }

    // TODO make restriction when accessing information

    public String getLastName()
    {
        return lastName;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public String getFirstName()
    {
        return firstName;
    }
    // TODO make restrictions when accessing and changing

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}