
public class GenericItem implements Cloneable {
    private static int currentID;
    private GenericItem analog;
    private int ID;
    private String name;
    private float price;
    private Category category;

    GenericItem() {
        this.category = Category.GENERAL;
        this.ID = currentID++;
    }

    GenericItem(int id, String n, float p, Category c) {
        this.category = Category.GENERAL;
        this.ID = id;
        this.name = n;
        this.price = p;
        this.category = c;
    }

    public GenericItem(String name, float price, Category category) {
        this.category = Category.GENERAL;
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.category = Category.GENERAL;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = currentID++;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public GenericItem getAnalog() {
        return this.analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void printAll() {
        System.out.printf("ID: %d , Name: %-20s , Price: %5.2f , Category:%s \n", this.ID, this.name, this.price, this.category);
    }

    public boolean equals(Object o) {
        if (o instanceof GenericItem) {
            GenericItem curr = (GenericItem)o;
            if (curr.ID == this.ID && curr.name == this.name && curr.price == this.price && curr.category == this.category) {
                return true;
            }
        }

        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object DeepClone() throws CloneNotSupportedException {
        new GenericItem();
        GenericItem newObj = (GenericItem)super.clone();
        newObj.analog = (GenericItem)this.analog.clone();
        newObj.analog.analog = newObj;
        return newObj;
    }

    public String toString() {
        return "ID=" + this.ID + ", name=" + this.name + ", price=" + this.price + ", category=" + this.category;
    }
}
