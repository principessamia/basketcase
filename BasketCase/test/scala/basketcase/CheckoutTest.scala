package scala.basketcase

import scala.BigDecimal
import scala.collection.mutable.ArrayBuffer

import org.junit.Assert._
import org.junit.Test

class CheckoutTest {
  
  @Test
  def totalCostOfEmptyBasket() {
    val basket = ShoppingBasket(ArrayBuffer())
    assertEquals(BigDecimal(0.0), Checkout.totalCost(basket))
  }
  
  @Test
  def totalCostOfSingleFruit() {
    val basket = ShoppingBasket(ArrayBuffer(Banana))
    assertEquals(BigDecimal(0.30), Checkout.totalCost(basket))
  }
  
  @Test
  def totalCostOfMultipleFruitsOfSameType() {
    val basket = ShoppingBasket(ArrayBuffer(Orange, Orange, Orange))
    assertEquals(BigDecimal(1.50), Checkout.totalCost(basket))
  }
  
  @Test
  def totalCostOfMultipleFruitsOfDifferentTypes() {
    val basket = ShoppingBasket(ArrayBuffer(Banana, Banana, Orange, Apple, Apple, Lemon, Peach))
    assertEquals(BigDecimal(2.40), Checkout.totalCost(basket))
  } 
}