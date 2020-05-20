
import javax.xml.catalog.CatalogResolver;
import java.util.ArrayList;
import java.util.HashMap;

public class IC implements IItemCatalog {

    private class NameAndCategory {
        String name;
        Category category;

        NameAndCategory(String name, Category category) {
            this.name = name;
            this.category = category;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + name.length();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            NameAndCategory item = (NameAndCategory) obj;
            if (this.name.equals(item.name) && this.category == item.category)
                return true;
            return false;

        }
    }
    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private HashMap<NameAndCategory, GenericItem> namedCatalog = new HashMap<>();

    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item);
        namedCatalog.put(new NameAndCategory(item.getName(), item.getCategory()), item);
    }

    public GenericItem findItemByID(int id){
        return catalog.getOrDefault(id, null);
    }

    public void deleteItem(int id) {
        GenericItem deletedItem = catalog.remove(id);
        namedCatalog.remove(new NameAndCategory(deletedItem.getName(), deletedItem.getCategory()));
    }

    public GenericItem findItemByName(Category category, String name) {
        System.out.print("3");
        return namedCatalog.getOrDefault(new NameAndCategory(name, category), null);
    }

}
