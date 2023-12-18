import java.time.LocalDate;

public class Loan
{
    // TODO oan class will have the date and name attribute working similarly like the computer class
    private LocalDate date;
    private String firstName;
    private String lastName;

    public Loan(String newFirstName, String newLastName)
    {
        date = LocalDate.now();
        firstName = newFirstName;
        lastName = newLastName;
    }
}
