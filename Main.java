import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "Gilbert Ndayishimiye","Deposing", "9788000","0.84"));
        accList.add(new Account(2, "Goldien Kanyandekwe","Credit", "98658000", "0.09"));
        accList.add(new Account(3, "Godefroid Bagirumunwa","Checking","84598000","0.87"));
        accList.add(new Account(4, "Vicent Manzi","Saving", "8459000", "0.69"));
        accList.add(new Account(5, "Gaudence Habineza","Checking", "5326500","0.32"));
        accList.add(new Account(6, "Beranard Bucumi","Deposit","26745500","0.23"));
        accList.add(new Account(7, "Cassien Mukamana","Credit", "9809000",  "0.34"));
        accList.add(new Account(8, "Vilginie Mukagatare ","Debit", "9870008",   "0.65"));
        accList.add(new Account(9, "Fride Gisubizo","Saving", "98765090", "0.49"));
        accList.add(new Account(10, "Ntamavyagiro Claver","Checking","9986989","0.20"));





        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}