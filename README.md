# basketcase

Scala solution for adding particular fruits to a basket and ouputting the total cost.  Tests are written using JUnit

The 'BasketCase' dir contains the src and test files

I tried to do the honorable thing and 'package' this up so the tests can be run.  Easiest way I could think of to do this was to upload the classes and jars and give you the java command to execute.  

So, grab the classes and the jars and then cd into the 'classes' dir so your set up looks like so:

classes$ find .
.
./scala
./scala/basketcase
./scala/basketcase/Apple$.class
./scala/basketcase/Apple.class
./scala/basketcase/Banana$.class
./scala/basketcase/Banana.class
./scala/basketcase/Checkout$$anonfun$1.class
./scala/basketcase/Checkout$.class
./scala/basketcase/Checkout.class
./scala/basketcase/CheckoutTest.class
./scala/basketcase/Fruit.class
./scala/basketcase/Lemon$.class
./scala/basketcase/Lemon.class
./scala/basketcase/Orange$.class
./scala/basketcase/Orange.class
./scala/basketcase/Peach$.class
./scala/basketcase/Peach.class
./scala/basketcase/ShoppingBasket$.class
./scala/basketcase/ShoppingBasket.class
./scala/basketcase/ShoppingBasketTest.class

java -classpath <path_to_jar_dir>/scala-library.jar:<path_to_jar_dir>/junit.jar:/<path_to_jar_dir>/org.hamcrest.core_1.3.0.jar: org.junit.runner.JUnitCore scala.basketcase.CheckoutTest



I am on a Mac, using Java version 1.7.0_51
