package scala.basketcase

import scala.BigDecimal
import scala.collection.mutable.ArrayBuffer

case class ShoppingBasket(fruits: ArrayBuffer[Fruit])
{
    def empty() { this.fruits.clear() }   
    def remove(fruit:Fruit) { fruits -= fruit }
}

// use a sealed trait - the subtypes are finite in the given exercise
sealed trait Fruit {
  val price: BigDecimal
}

// Dealing with money, albeit in small amounts, so use BigDecimal to be safe
final object Banana extends Fruit {
  val price = BigDecimal(0.30)
}

final object Orange extends Fruit {
  val price = BigDecimal(0.50)
}

final object Apple extends Fruit {
  val price = BigDecimal(0.20)
}

final object Lemon extends Fruit {
  val price = BigDecimal(0.15)
}

final object Peach extends Fruit {
  val price = BigDecimal(0.75)
}



