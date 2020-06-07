import accessories.Case;
import behaviours.ISell;
import enums.Category;
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
        stockItem = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, Category.GUITAR, "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        stockItem2 = new Case("BAM", "8004XL", 500.0, 567.93, Category.ACCESSORY, (Instrument) stockItem);
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

    @Test
    public void canSellItem() {
        musicStore.increaseStock(stockItem);
        musicStore.sellItem(stockItem);
        assertEquals(549.0, musicStore.getSales(), 0.01);
        assertEquals(0, musicStore.getStockAmount(stockItem));
        assertEquals(1, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void canSellMultipleItems() {
        musicStore.increaseStock(stockItem);
        musicStore.increaseStock(stockItem2);
        musicStore.sellItem(stockItem);
        musicStore.sellItem(stockItem2);
        assertEquals(1116.93, musicStore.getSales(), 0.01);
        assertEquals(0, musicStore.getStockAmount(stockItem));
        assertEquals(0, musicStore.getStockAmount(stockItem2));
        assertEquals(1, musicStore.getSaleItemAmount(stockItem));
        assertEquals(1, musicStore.getSaleItemAmount(stockItem2));
    }

    @Test
    public void canReturnItem() {
        musicStore.sellItem(stockItem);
        musicStore.returnItem(stockItem);
        assertEquals(-549.0, musicStore.getSales(), 0.01);
        assertEquals(1, musicStore.getStockAmount(stockItem));
        assertEquals(0, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void cannotReturnItemIfNotBeenSold() {
        musicStore.returnItem(stockItem);
        assertEquals(0, musicStore.getSales(), 0.01);
        assertEquals(0, musicStore.getStockAmount(stockItem));
        assertEquals(0, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void canAddItemToTrackSales() {
        musicStore.addSaleItem(stockItem, 1);
        assertEquals(1, musicStore.getTrackSaleSize());
    }

    @Test
    public void canRemoveItemFromTrackSales() {
        musicStore.addSaleItem(stockItem, 1);
        musicStore.removeSaleItem(stockItem);
        assertEquals(0, musicStore.getTrackSaleSize());
    }

    @Test
    public void canGetSaleAmount() {
        musicStore.addSaleItem(stockItem, 1);
        assertEquals(1, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void canIncreaseSaleAmount() {
        musicStore.increaseSaleItemAmount(stockItem);
        musicStore.increaseSaleItemAmount(stockItem);
        assertEquals(2, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void canDecreaseSaleItem() {
        musicStore.increaseSaleItemAmount(stockItem);
        musicStore.increaseSaleItemAmount(stockItem);
        musicStore.increaseSaleItemAmount(stockItem);
        musicStore.decreaseSaleItemAmount(stockItem);
        assertEquals(2, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void saleItemAmountIsZeroIfNoStock() {
        assertEquals(0, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void cannotDecreaseSaleAmountIfNoPreviousSale() {
        musicStore.decreaseSaleItemAmount(stockItem);
        assertEquals(0, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void saleAmountCannotBeNegative() {
        musicStore.increaseSaleItemAmount(stockItem);
        musicStore.decreaseSaleItemAmount(stockItem);
        musicStore.decreaseSaleItemAmount(stockItem);
        assertEquals(0, musicStore.getSaleItemAmount(stockItem));
    }

    @Test
    public void canIncreaseSaleAmountIfInitiallyNoSales() {
        musicStore.increaseSaleItemAmount(stockItem);
        assertEquals(1, musicStore.getSaleItemAmount(stockItem));
    }

}
