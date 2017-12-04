import java.util.ArrayList;
import java.util.List;

public class Humans {

    String name;
    ArrayList<Money> allMoney = new ArrayList<>();

    public Humans(String name) {
        this.name = name;
        allMoney.add(new Hrivna(4));
        allMoney.add(new USD(1));

    }
    public List <Money> getList(){
        return allMoney;
    }

}
