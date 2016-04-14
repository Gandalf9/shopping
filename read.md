The Challenge
=======
Using Java, write a simple program that calculates the price of a basket of shopping.

Items are presented one at a time, in a list, identified by name - for example "Apple" or "Banana".

Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a 

basket with two apples and one banana.

Given a list of shopping, calculate the total cost of those items.

How to use 
=======
Create an instance of `com.yatin.domain.Basket`. To add items to the basket call `addItem(buyable)`. 
Use `getTotalCost()` to get the total cost.

Have used Factory methods to create the objects, rather than a persistence layer for the sake of speed and complexity