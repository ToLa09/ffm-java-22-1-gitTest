import java.util.ArrayList;
import java.util.List;

public class Shop {

    private int clientCapacity;
    private String name;

    public Shop(int clientCapacity, String name) {
        this.clientCapacity = clientCapacity;
        this.name = name;
    }
    //Waren verkaufen
    public void sellGoods() {
        List<Buyable> buyableGoods = new ArrayList<>(List.of(
        ));
        return;
    }
}
