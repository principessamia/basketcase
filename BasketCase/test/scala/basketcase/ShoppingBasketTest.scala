package scala.basketcase

import org.junit.Test
import org.junit.Assert._
import scala.collection.mutable.ArrayBuffer
import scala.basketcase.ShoppingBasket._

class ShoppingBasketTest {
  
  @Test
  def testBasketIsEmptyOnCreate() {
     val shopping = ShoppingBasket(ArrayBuffer());
     assertTrue(shopping.fruits.size == 0);
  }
  
  @Test
  def testBasketCanBeEmptied() {
     val shopping = ShoppingBasket(ArrayBuffer(Banana));
     assertTrue(shopping.fruits.size == 1);
     shopping.empty();
     assertTrue(shopping.fruits.size == 0);
  }
  
  @Test
  def testCanRemoveFruitFromBasket() {
     val shopping = ShoppingBasket(ArrayBuffer(Banana, Peach));
     shopping.remove(Banana);
     assertTrue(shopping.fruits.size == 1);
  }
  
  @Test
  def testAllFruitsHaveAValidPrice() {
    assertTrue(Banana.price > 0.0); 
    assertTrue(Peach.price > 0.0);
    assertTrue(Orange.price > 0.0);
    assertTrue(Apple.price > 0.0);
    assertTrue(Lemon.price > 0.0);   
  } 
  
  @Test
  def testBasketHasEnoughForOurFiveADay() {
      val basket = ShoppingBasket(ArrayBuffer(Banana, Orange, Apple, Lemon, Peach))
      assertTrue(basket.fruits.size >= 5)
  }  
}

