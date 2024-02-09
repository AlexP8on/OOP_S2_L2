package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OnlineOrderingSystem {
    public static void main(String[] args) {
 MenuItem[] menuItems = new MenuItem[]{
         new Burger("Chicken Royal", 8.99, "Chicken, Cheese, Tomato Lettuce, Saucy sauce"),
         new Pizza("The meat man ", 100.00, "Sour dough base, Tomato & Basil, Cheese, Grade A Wagyu steak"),
         new Salad("No Beef ", 2.00, "Lettuce, Tomato, Lettuce and More Lettuce"),
         new Dessert("Tmassoo ", 6.00, "Cream, Coffee, sponge")



 };

 for (MenuItem menuItem: menuItems){
     System.out.println("Name: "+menuItem.getName());
     System.out.println("Description: "+ menuItem.getDescription());
     System.out.println("Price:$ "+menuItem.getPrice() + "\n");
 }
 double totalcost = 0;
 for(MenuItem menuItem: menuItems) {
     totalcost += menuItem.getPrice();
 }
        System.out.println("Total cost: " + totalcost );
    }
}