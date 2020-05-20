import javax.xml.catalog.CatalogResolver;
import java.util.ArrayList;
import java.util.HashMap;
public class ItemCatalog implements ICatalog {
    private class PriceAndCategory {
        Float price;
        Category category;
        PriceAndCategory(Float price, Category category) {
            this.price = price;
            this.category = category;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Float.toString(price).length();
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            ItemCatalog.PriceAndCategory item = (ItemCatalog.PriceAndCategory) obj;
            if (this.price.equals(item.price) && this.category == item.category)
                return true;
            return false;
        }
    }
    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private HashMap<PriceAndCategory , GenericItem> PriceAndCategoryCatalog = new HashMap<>();

    public GenericItem findByPriceAndCategory(Category category, Float price) {
        return PriceAndCategoryCatalog.getOrDefault(new PriceAndCategory(price,category), null);
    }
    public void add(GenericItem item) {
        catalog.put(item.getID(), item);
        PriceAndCategoryCatalog.put(new PriceAndCategory(item.getPrice(),item.getCategory()), item);
    }
    public GenericItem findByID(int id){
        return catalog.getOrDefault(id, null);
    }
    public void removeItem(int id) {
        GenericItem deletedItem = catalog.remove(id);
        PriceAndCategoryCatalog.remove(deletedItem.getPrice(),deletedItem.getCategory());
    }



}