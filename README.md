# E-Commerce-Console-Application #
**Object Oriented Programming project in java**


This console application is a simple E-Commerce system implemented in Java. 
It allows both administrators and customers to interact with the inventory, 
manage shopping carts, and perform transactions.

           *Features*

      --For Administrators--

-Product Management:

Create new products (both electronic and clothing).
Modify existing product details such as price and quantity.
Delete products from the inventory.
View all products in the inventory.

-Search and Display:

Search for products by name.
Display detailed information about products, including reviews and ratings.

-Promotion Code Management:(Optional Feature)

Add promotion codes to provide discounts.

     --For Customers--

-Product Interaction:

Search for products by name.
View all products in the inventory.

-Shopping Cart:

Add products to the shopping cart.
Remove products from the shopping cart.
Modify the quantity of products in the shopping cart.
View the contents of the shopping cart.

-Product Reviews:(Optional Feature)

Add reviews and ratings for products.

-Payment Processing:

Perform transactions using a credit card.
Apply promotion codes for discounts.


       **Project Structure**

-Inventory Class:

Manages the inventory of both clothing and electronic products.
Provides functionality to add, modify, delete, search, and display products.

-ShoppingCart Class:

Manages the customer's shopping cart.
Allows adding, removing, and modifying items in the cart.
Displays the contents of the cart and calculates the total price.

-CreditCard Class:

Represents a customer's credit card with a balance and a code.
Performs payment processing and verifies the credit card code.

-PromotionCode Class:

Manages promotion codes.
Allows adding codes and verifying them for discounts.

-Product Class (Abstract):

Represents a generic product with common attributes like name, price, id, quantity.
Subclasses include ClothingProduct and ElectronicProduct.

-ClothingProduct and ElectronicProduct Classes:

Subclasses of the Product class with specific attributes for clothing and electronic products.
Implement the adminDisplay and customerDisplay methods for displaying product details.

-Test Class:

Contains the main method to run the console application.
Provides a user interface for both administrators and customers.
             
                     **How to Run**

Compile and run the Test class.
Follow the on-screen prompts to interact with the E-Commerce system.
 !!--> This project is designed with on-screen instructions guiding the user through the process of adding products or users. 
    Simply follow the prompts on the screen to interact with the application and customize it by adding your desired products or users.
 		
		      **REMARKS**
I didn't create a separate class for users (admin/customer) initially, as I believed that collecting email and password input 
in the Test class would be sufficient. However, during the implementation, I ended up incorporating the entire functionality 
of a User class within the Test class(using typeofowner).







