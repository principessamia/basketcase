package scala.basketcase

object Checkout {
  
  def totalCost(shoppingBasket: ShoppingBasket): BigDecimal = {
      // Collect prices for all fruits in the basket
      val prices = shoppingBasket.fruits.map(x => x.price);      
      return prices.sum;
  }
}