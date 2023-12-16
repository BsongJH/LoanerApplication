import java.util.Scanner;

public class LoanerMain
{
    /* TODO Main 화면은 버튼 세개 (Track, Loan, Search)가 있고
        버튼을
     */
    public static LoanerMain panelInstance;
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
        return panelInstance;
    }
    /*
        원하는 방법 (하나씩 구현해보자.
        스크롤 패널에 컴퓨터 리스트를 보여준다. 컴퓨터 리스트에 론 가능 불가능 이 보여진다
        유저는 가능/불가능한 컴퓨터를 클릭한다/하이라이트 한다. 론 버튼을 누른다. 작은 창이 뜨는데 거기에 이름과 날짜를 기입하고 확인을 누른다.
        기입된 정보는 스프레드 시트에 저장된다 --> 컴퓨터 목록은 이미 저장된 상태이기 때문에 옆에 다른칸에 새롭게 기입된다.
     */
    public LoanerMain()
    {
        System.out.println("choose an operation you want to perform");
        System.out.println("Track, loan, search");

        // Testing
        int asset = 1;
        String model = "7440";
        // type true = engineering, false = standard
        boolean type = true;

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input == "add")
        {
            // Creates computer and add to spread sheet
            Computers newComp = new Computers(asset,model,type);
            // TODO spread sheet method or class here. Possibly a function

        }
        else if (input == "loan")
        {

        }

    }
}
