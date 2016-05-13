# basketcase

Fruit Basket - Scala 
---------------------

Built using the following:
- Scala 2.11.8
- JUnit 4

The 'BasketCase' dir contains the src and test files

I tried to do the honorable thing and 'package' this up,  So, in order for the tests to be run independently from the command line, I created a jar file.

So, save down *all* of the jar files and then run the following (filling in the appropriate paths on your system):

> $ java -cp path_to_jar_dir/scala-library.jar:path_to_jar_dir/junit.jar:/path_to_jar_dir/org.hamcrest.core_1.3.0.jar:path_to_jar_dir/basket-case.jar: org.junit.runner.JUnitCore scala.basketcase.CheckoutTest

I am on a Mac, using Java version 1.7.0_51

- CheckoutTest is the main test class
- ShoppingBasketTest contains additional unit tests to verify additional isolated functionality
