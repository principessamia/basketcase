package scala.basketcase

import java.text.NumberFormat

object Checkout {
  
    def totalCost(shoppingBasket: ShoppingBasket): BigDecimal = {
      // Collect prices for all fruits in the basket
      val prices = shoppingBasket.fruits.map(x => x.price);      
      val total = prices.sum;
      
      // Here, when we output to local currency, we will lose the precision 
      // Could always write a custom formatter in the future  
      println("Total cost of the fruit basket is " + NumberFormat.getCurrencyInstance.format(total));
      return total;
  }
}