package edu.badpals.gildedrose;

public class App {
    public static void main(String[] args) {
    GildedRose shop = new GildedRose();


        shop.addItem(new NormalItem("+5 Dexterity Vest", 10, 20));
        shop.addItem(new AgedBrie("Aged Brie", 2, 0));
        shop.addItem(new NormalItem("Elixir of the Mongoose", 5, 7));
        shop.addItem(new Sulfuras("Sulfuras, Hand of Ragnaros", 0));
        shop.addItem(new Sulfuras("Sulfuras, Hand of Ragnaros", -1));
        shop.addItem(new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        shop.addItem(new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        shop.addItem(new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        shop.addItem(new Conjured("Conjured Mana Cake", 3, 6));

        System.out.println("-------- day 0 --------\n");
        System.out.println(shop);

        for(int i = 1;i < 30; i++ ){
            shop.updateItems();
            System.out.println(String.format("-------- day %d --------%n", i));
            System.out.println(shop);
        }
    }
}
