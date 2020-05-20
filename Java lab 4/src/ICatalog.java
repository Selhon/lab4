public interface ICatalog {
    void add(GenericItem item);
    GenericItem findByID(int id);
    void removeItem(int id);
    GenericItem findByPriceAndCategory(Category category, Float price);
}