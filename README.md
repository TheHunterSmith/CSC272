# CSC272

Hello class,

For the first discussion post we will be looking at the differences between what a class is and what an object is.

First, in our book a class is described as, "a set of objects with the same behavior... each class defines a specific set of methods that you can use with its objects." So a class can be described as a data type to create an object. An object would be something you create using whatever specific class you created. The book uses the example of "PrintStream" as a class, and the object "System.out" This would look like: System.out.println ("Hello World!");

 Another example of this would be using the class "car", you can type:

Car honda = newCar();

"Car" being the class, "honda" being the object within the class.

Within the class multiple objects can be made. Within the program multiple classes can be made. To go off our car class we can add more. 

Car honda = newCar();
Car mazda = newCar();
Car ford = newCar();
Car toyota = newCar();

From looking at this we can see the class is still "Car" and the objects that were created are "honda", "mazda", "ford", and "toyota". After creating the objects within the class, we can modify what we want to do with the objects. 

The difference between a public class and a private class is, the public class would be something we can see after running the program. Then in turn, a private class would be something we can't see after running the program. Looking at what we have already created, you could make an object in the private class that you don't want people to see while it is running, and then call back to what has been made in the private class to run it in the public class.
