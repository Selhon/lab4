//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public enum Category {
    FOOD("food"),
    PRINT("print"),
    DRESS("dress"),
    GENERAL("general");

    public String category;

    private Category() {
    }

    private Category(String category) {
        this.category = category;
    }

    public String print() {
        return this.category;
    }
}

