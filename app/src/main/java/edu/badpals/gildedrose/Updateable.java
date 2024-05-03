package edu.badpals.gildedrose;

public interface Updateable {
    public int getSellIn();
    public void setSellIn(int newSellIn);

    public default void updateSellIn(){
        setSellIn(getSellIn() - 1);
    }

    public void updateQuality();
    
    public default void updateItem(){
        updateSellIn();
        updateQuality();
    }

}
