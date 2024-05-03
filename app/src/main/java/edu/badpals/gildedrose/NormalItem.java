package edu.badpals.gildedrose;

public class NormalItem {
    private Item item;

    public NormalItem(String name, int SellIn, int Quality){
        this.item = new Item(name, SellIn, Quality);
    }

    public String getName(){
        return this.item.name;
    }

    public int getSellIn(){
        return this.item.sellIn;
    }

    public int getQuality(){
        return this.item.quality;
    }

    public void setName(String newName){
        this.item.name = newName;
    }

    public void setSellIn(int newSellIn){
        this.item.sellIn = newSellIn;
    }

    public void setQuality(int newQuality){
        this.item.quality = newQuality;
    }

}
