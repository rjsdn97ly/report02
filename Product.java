
public class Product implements Comparable<Product> {

   private String productName;
   private int productNum;       

   public Product(String productName, int productNum) {
      this.productName = productName;
      this.productNum = productNum;
   } 

   public String getProductName() {
      return productName;
   } 

   public int getProductNum() {
      return productNum;
   }       

   public int compareTo(Product compareProduct) { // override
      // ascending order
      return this.productNum - compareProduct.productNum;
      // descending order
      // return compareProduct.productNum - this.productNum;
      
//	   if (this.productNum < compareProduct.productNum) {
//			return -1;
//
//		} else if (this.productNum == compareProduct.productNum) {
//			return 0;
//
//		} else {
//			return 1;
//		}

   }       

   public String toString() {
      return "productName:" + productName + "  " + "productNum:" + productNum;
   }
}
