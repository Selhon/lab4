public interface IItemCatalog {
    void addItem(GenericItem item);
    GenericItem findItemByID(int id);
    void deleteItem(int id);
    GenericItem findItemByName(Category category, String name);
}