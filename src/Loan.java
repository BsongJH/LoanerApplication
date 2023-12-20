import java.time.LocalDate;

public class Loan
{
    // TODO oan class will have the date and name attribute working similarly like the computer class
    private LocalDate date;
    private String firstName;
    private String lastName;
    private Computers computer;

    public Loan(String newFirstName, String newLastName, Computers newComputer)
    {
        date = LocalDate.now();
        firstName = newFirstName;
        lastName = newLastName;
        computer = newComputer;
    }

    // TODO make restriction when accessing information
    public Computers getComputer()
    {
        return computer;
    }

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
    public void setComputer(Computers computer)
    {
        this.computer = computer;
    }

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
