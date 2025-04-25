# Here is the background information on your task


The Walmart pet department has decided to combine its numerous databases into a single source of truth. The centralized database will save much time and effort when it comes to querying the data and collecting metrics. They just got approval to begin the project, so now it’s up to your team to begin putting the database together. The first step is to figure out the database schema. You have been selected to design the database, and are expected to have the first draft of an ERD completed shortly. The pet department has sent over a list of requirements the design must satisfy and are eager to get started. Good luck!
## Task ER Diagram
Your task is to draft an ERD for an appropriately normalized relational database that satisfies these requirements:

The database should store information related to the following products.
Pet food, which has a name, manufacturer, weight, flavor, and target health condition.
Pet toys, which have an associated material, name, manufacturer, and durability.
Pet apparel, which has a color, manufacturer, size, name, and specific care instructions.
 
Each product should be associated with one or more animals.
 
Each product should be associated with a manufacturer.
 
The database should track customers and their transactions.
It should store customer names and email addresses.
Customers can make transactions to purchase one or more products.
Each transaction should store the date and the products involved.
 
The database should track shipments to various Walmart locations.
Each location should be represented by a name and a zip code.
A shipment is recorded as an origin, a destination, and a collection of products, each with an associated quantity.