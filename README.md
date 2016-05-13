# basketcase

Fruit Basket - Scala 
---------------------

Built using the following:
- Scala 2.11.8
- JUnit 4

The 'BasketCase' dir contains the src and test files

I tried to do the honorable thing and 'package' this up so the tests can be run.  Easiest way I could think of to do this was to upload the classes and jars and supply the command to execute.  

So, save down the 'classes' and 'jars' directories and do the following:

> $ cd classes

Verify the folder structure under classes is retained:

> $ find .
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

From the 'classes' dir, run the following command (filling in the appropriate paths on your system):

> $ java -cp <path_to_jar_dir>/scala-library.jar:<path_to_jar_dir>/junit.jar:/<path_to_jar_dir>/org.hamcrest.core_1.3.0.jar: org.junit.runner.JUnitCore scala.basketcase.CheckoutTest

I am on a Mac, using Java version 1.7.0_51

- CheckoutTest is the main test class
- ShoppingBasketTest contains additional unit tests to verify additional isolated functionality
