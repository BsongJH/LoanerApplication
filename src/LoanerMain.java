import java.util.Scanner;

public class LoanerMain
{
    public static LoanerMain panelInstance;
    private Tracker tracker;
    private Loan loan;
    private Search search;

    // Creating single panel instance
    public static LoanerMain getPanelInstance()
    {
        if (panelInstance == null)
        {
            synchronized (LoanerMain.class)
            {
                if (panelInstance == null)
                {
                    panelInstance = new LoanerMain();
                }
            }
        }
    }
    public LoanerMain()
    {
        System.out.println("choose an operation you want to perform");
        System.out.println("Track, loan, search");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // TODO change this part into a button
        if (input == "track")
        {
            tracker = new Tracker();
        } else if (input == "loan")
        {
            loan = new Loan();
        } else if (input == "search")
        {
            search = new Search();
        }
    }
}
