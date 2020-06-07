import accessories.Case;
import behaviours.ISell;
import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MusicStoreTest {

    MusicStore musicStore;
    ISell stockItem, stockItem2;

    @Before
    public void before() {
        musicStore =new MusicStore("HMV");
        stockItem = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        stockItem2 = new Case("BAM", "8004XL", 500.0, 567.93, (Instrument) stockItem);
    }

    @Test
    public void stockStartsAtZero() {
        assertEquals(0, musicStore.getStockSize());
    }

    @Test
    public void canAddItemToStock() {
        musicStore.addStockItem(stockItem, 1);
        assertEquals(1, musicStore.getStockSize());
    }

    @Test
    public void canRemoveItemFromStock() {
        musicStore.addStockItem(stockItem, 1);
        musicStore.removeStockItem(stockItem);
        assertEquals(0, musicStore.getStockSize());
    }

    @Test
    public void canGetStockAmount() {
        musicStore.addStockItem(stockItem, 1);
        assertEquals(1, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void canIncreaseStockAmount() {
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem);
        assertEquals(2, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void canDecreaseStockAmount() {
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem);
        musicStore.decreaseStock(stockItem);
        assertEquals(2, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void stockAmountIsZeroIfNoStock() {
        assertEquals(0, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void cannotDecreaseStockIfNoStock() {
        musicStore.decreaseStock(stockItem);
        assertEquals(0, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void stockAmountCannotBeNegative() {
        musicStore.increaseStock(stockItem);
        musicStore.decreaseStock(stockItem);
        musicStore.decreaseStock(stockItem);
        assertEquals(0, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void canIncreaseStockAmountIfInitiallyNoStock() {
        musicStore.increaseStock(stockItem);
        assertEquals(1, musicStore.getStockAmount(stockItem));
    }

    @Test
    public void canCalculatePotentialProfit() {
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem2);
        musicStore.increaseStock(stockItem2);
        assertEquals(657.86, musicStore.calculatePotentialProfit(), 0.01);
    }
}
