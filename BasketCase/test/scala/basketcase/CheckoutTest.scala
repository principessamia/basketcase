package scala.basketcase

import scala.collection.mutable.ArrayBuffer
import scala.basketcase.Checkout._
import org.junit.Test
import org.junit.Assert._

class CheckoutTest {
  
  @Test
  def testTotalCostOfEmptyBasket() {
    val basket = ShoppingBasket(ArrayBuffer())
    assertEquals(BigDecimal(0.0), Checkout.totalCost(basket))
  }
  
  @Test
  def testTotalCostOfSingleFruit() {
    val basket = ShoppingBasket(ArrayBuffer(Banana))
    assertEquals(BigDecimal(0.30), Checkout.totalCost(basket))
  }
  
  @Test
  def testTotalCostOfMultipleFruitsOfSameType() {
    val basket = ShoppingBasket(ArrayBuffer(Orange, Orange, Orange))
    assertEquals(BigDecimal(1.50), Checkout.totalCost(basket))
  }
  
  @Test
  def testTotalCostOfMultipleFruitsOfDifferentTypes() {
    val basket = ShoppingBasket(ArrayBuffer(Banana, Banana, Orange, Apple, Apple, Lemon, Peach))
    assertEquals(BigDecimal(2.40), Checkout.totalCost(basket))
  }
  
 
}