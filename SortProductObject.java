import java.util.Arrays; 

public class SortProductObject { 

   public static void main(String[] args) {

       Product[] products = new Product[3];
       products[0] = new Product("A", 11);
       products[1] = new Product("Z", 13);
       products[2] = new Product("X", 10);

       System.out.println("[compareTo sort productNum]");
       Arrays.sort(products);  // compareTo() sort
       printProduct(products);

       System.out.println("[compare sort prouctName]");
       Arrays.sort(products, new ProductNameComparator());
       printProduct(products);
       }      

   public static void printProduct(Product[] product) {
       for(Product pro : product)
    	   System.out.println(pro); 
   }
}