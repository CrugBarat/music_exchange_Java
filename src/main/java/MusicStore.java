import behaviours.ISell;
import java.util.HashMap;
import java.util.Map;

public class MusicStore {

    private String name;
    private HashMap<ISell, Integer> stock;

    public MusicStore(String name) {
        this.name = name;
        this.stock = new HashMap<ISell, Integer>();
    }

    public String getName() {
        return name;
    }

    public HashMap<ISell, Integer> getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockSize() {
       return this.stock.size();
    }

    public void addStockItem(ISell stockItem, int i) {
        this.stock.put(stockItem, i);
    }

    public void removeStockItem(ISell stockItem) {
        this.stock.remove(stockItem);
    }

    public int getStockAmount(ISell stockItem) {
        return this.stock.getOrDefault(stockItem, 0);
    }

    public void increaseStock(ISell stockItem) {
        if (!this.stock.containsKey(stockItem)) {
            addStockItem(stockItem, 1);
        } else {
            int value = getStockAmount(stockItem) + 1;
            this.stock.replace(stockItem, value);
        }
    }

    public void decreaseStock(ISell stockItem) {
        if (this.stock.containsKey(stockItem)) {
            if(getStockAmount(stockItem) > 0) {
                int value = getStockAmount(stockItem) - 1;
                this.stock.replace(stockItem, value);
            }
        }
    }

    public double calculatePotentialProfit() {
        double potentialProfit = 0.0;
        for (Map.Entry<ISell, Integer> entry : this.stock.entrySet()) {
            ISell key = entry.getKey();
            int value = entry.getValue();
            double potentialStockProfit = key.calculateMarkup() * value;
            potentialProfit += potentialStockProfit;
        }
        return potentialProfit;
    }
}
