public class Main {
    public static void main(String[] args){
        ItemCatalog a= new ItemCatalog();
        GenericItem f1 = new GenericItem("f1", 6F, Category.GENERAL);
        GenericItem f2 = new GenericItem("f2", 3.43F, Category.GENERAL);
        GenericItem f3 = new GenericItem("ff", 0F, Category.GENERAL);
        a.add(f1);
        a.add(f2);
        a.add(f3);

        if(null==a.findByPriceAndCategory(Category.GENERAL,3.43F)){
            System.out.print("BAD ");
        }
        else{
            System.out.print("GOOD ");
        }
    }
}
