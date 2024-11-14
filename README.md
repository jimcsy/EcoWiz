EcoWiz: Eco-friendly POS System
By Genesis Jim C. Cuasay

I.	Project overview 
This java-based console system was created to support the 12th Sustainable Development Goal – Responsible Consumption and Production. It involves a simulation of a point-of-sale (POS) transaction system that focuses on managing and promoting eco-friendly products, calculating environmental impact scores, and offering incentives for sustainable purchases.

II.	Object-oriented Principles
This project utilizes the four object-oriented principles: encapsulation, inheritance, polymorphism, and abstraction. Since there is sensitive data, such as customer details like usernames and passwords, encapsulation plays a crucial role in hiding and securing this information. Inheritance, on the other hand, was used to avoid code redundancy. For example, product information is accessed through a class, and this information needs to be distributed to other subclasses for functionality. Instead of repeatedly accessing this information, inheritance allows for code reusability. Abstraction and polymorphism were used in managing transactions. The system allows users to make regular purchases or discounted purchases using eco points. A single transaction class alone was too vague, so I used abstraction to simplify the process. Two subclasses were created to inherit the default methods from the abstract class, simulating either a regular purchase or a purchase with eco points. These default methods were overridden in the subclasses, as they each have different goals, which is where polymorphism was applied. As for the interface, another form of abstraction, it was also useful to have an interface class where I placed all the necessary steps, such as validating input and handling designs. These were used in several classes, which helped me avoid repeating the same tasks multiple times. Overall, this project contains elements that undermine the OOP principles.

III.	SDG Overview and Integration into the Project
Responsible Consumption and Production focuses on promoting sustainable consumption and production patterns, with the aim of reducing waste and conserving natural resources. The EcoWiz system can be a key instrument in achieving this objective. It encourages consumers to support eco-friendly products. The products stored in the system contain environmental impact scores; the higher the score, the safer the product is for the environment. Points earned from each purchase can be used as a discount on the next purchase. In this way, as consumers seek discounts, they are more likely to choose products with higher environmental scores, thus contributing to the achievement of the 12th Sustainable Development Goal.

IV.	Instructions for running the program
This project utilizes databases WIP>>>
