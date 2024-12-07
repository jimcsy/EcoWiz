<h1 align ="center">
  <br>
  <img src="images/logo.png" alt="icon" height="120" /img> 
  <br>
  <strong>
  🛒 ECO-FRIENDLY POS SYSTEM
  </strong>
  <br>
</h1>

<p align="center">
  <strong>
  Table of Contents
  </strong>
  <br>
  <a href="#i-project-overview">
    <img src="images/overview.png" alt="icon" height="30" >
  </a>
  <a href="#ii-object-oriented-programming-principles">
    <img src="images/principles.png" alt="icon" height="30" >
  </a>
  <a href="#iii-sdg-integration">
    <img src="images/integration.png" alt="icon" height="30" >
  </a>
  <a href="#iv-how-to-run-the-program">
    <img src="images/execution.png" alt="icon" height="30" >
  </a>
</p>

<h2 align = "center">
        <a href = "https://drive.google.com/drive/u/3/folders/1MlFnAPzaqlr_FCRhPzARKhxZGPCtOl6U">
        <img src = https://github.com/jimcsy/EcoWiz/blob/main/images/loop.gif>
        </a>
</h2>

> **Note:**
> Please click this <a href="https://drive.google.com/drive/u/3/folders/1MlFnAPzaqlr_FCRhPzARKhxZGPCtOl6U"><strong>link</strong></a> to watch the demonstration video.
___
## I. PROJECT OVERVIEW&nbsp;🔍
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This Java-based console system was designed to support the United Nations' 12th Sustainable Development Goal (SDG) – Responsible Consumption and Production. The system simulates a point-of-sale (POS) transaction platform focused on promoting eco-friendly products. It calculates environmental impact scores and offers incentives for sustainable purchases. Developed using Java and backed by MySQL for database management, the system ensures efficient storage and retrieval of product data, transaction details, and user information.

Discover more: [Features](#features) • [Goal](#goal) • [Limitation](#limitation)

###  &nbsp;&nbsp;🔑&nbsp;&nbsp;**FEATURES**
- **Eco-Friendly Product Focus**: The system promotes sustainable products, contributing to responsible consumption and production.
- **Incentive and Reward System**: Users earn points for purchasing eco-friendly products, which can be redeemed for discounts, encouraging further sustainable purchasing behavio
- **Database Integration**: MySQL is used to store product details, user profiles, transaction history, and user activity.
- **User Interface**: The console-based interface allows users to browse products, make purchases, check environmental impact scores, and track reward points.

###   &nbsp;&nbsp;🥅&nbsp;&nbsp;**GOAL**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This project aims to promote eco-friendly products in our supermarket by assigning eco points (1-10) based on environmental impact scores. It offers consumers discounts based on the eco points they have earned. The core focus is on incentivizing sustainable consumer behavior and responsible consumption within the retail environment.

###   &nbsp;&nbsp;🚧&nbsp;&nbsp;**LIMITATION**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This project does not cover administrative features such as checking product availability, updating product prices, or managing product quantities. Although these features would add value to the system, they were excluded due to time constraints and the creators' involvement in other ongoing projects. Despite these exclusions, the project successfully meets the rubric requirements and adheres to Object-Oriented Programming (OOP) principles.
___
## II. OBJECT-ORIENTED PROGRAMMING PRINCIPLES&nbsp;📋
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This project utilizes the four object-oriented principles: encapsulation, inheritance, polymorphism, and abstraction. These principles were instrumental in enhancing the modularity and readability of the code.
| **Principle**    | **Application**  |
|:--------------------------------:|-----------|
| **`Encapsulation`**       | Given the presence of sensitive data, such as customer details including usernames and passwords, encapsulation is essential for safeguarding this information by restricting access and ensuring security.
| **`Inheritance`**     | Inheritance was employed to minimize code redundancy. For instance, product information is accessed through a class, and this data needs to be shared to various subclasses for functionality. Rather than repeatedly accessing this information, inheritance facilitates code reuse.   |  |
| **`Abstraction`**          | The system enables users to make regular or discounted purchases using eco points. A single transaction class was too general to adequately represent these different scenarios, so abstraction was utilized to streamline the process. Two subclasses were created to inherit default methods from the abstract class, simulating either a regular purchase or a purchase using eco points.    |
| **`Polymorphism`**      | Utilized in conjunction with abstraction. The default methods in the parent class (transaction) were overridden in the subclasses (buy and redeem), as each subclass exhibits distinct behavior. Polymorphism enabled the methods to function differently based on the specific subclass, facilitating varied actions for each type of transaction.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To gain a deeper understanding, it is recommended to watch the video demonstration, where the topics are discussed in greater detail, with visual aids provided to ensure full comprehension. Please refer to the link above.
___
## III. SDG INTEGRATION&nbsp;🎯
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**The Responsible Consumption and Production (SDG 12)** is one of the 17 Sustainable Development Goals (SDGs) established by the United Nations in 2015. It focuses on ensuring that human consumption and production patterns are sustainable, reduce environmental harm, and support the efficient use of resources.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The **EcoWiz: Eco-friendly POS System** can play a pivotal role in achieving this objective by encouraging consumers to support eco-friendly products. The products within the system are assigned eco scores (ranging from 1 to 10) based on their environmental impact, with higher scores indicating a safer product for the environment. Points earned from each purchase can be redeemed as discounts on future purchases. This incentive structure encourages consumers to select products with higher environmental scores in order to obtain discounts, thereby contributing to the realization of the 12th Sustainable Development Goal. In line with this, the system aims to support the following **key targets**:

> + **Sustainable Practices in Business**
>    + Encourage consumers to choose products that are both essential to their needs and beneficial to the environment.
>    + Promote transparency within supply chains and urge companies to adopt responsible sourcing and effective environmental management practices.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;By aligning consumer behavior with sustainability goals, this project fosters a more responsible and eco-conscious approach to both production and consumption, ultimately contributing to a sustainable future.


## IV. HOW TO RUN THE PROGRAM❓

### 1. **Prerequisite**&nbsp;🧩
  + Java Development Kit
  + Database Management System – `MySql`
  + Java Database Connectivity (JDBC) driver
  + IDE - `Visual Studio Code (VsCode)`


### 2. **Run the Program**&nbsp;▶️ 
- **Download** and **extract** the folder from this repository, `ecowiz.zip`.
- **Open** the extracted folder in a **new window** within `VSCode`.
- **Check the File Structure**
  ```bash
  lib/
  ├── mysql-connector-j-9.1.0.jar
  src/
  ├── commerce/
  │   ├── Customer.java
  │   ├── CustomerCredentials.java
  │   ├── CustomerHomePage.java
  │   ├── Guest.java
  │   └── Products.java
  ├── core/
  │   ├── DatabaseConnection.java
  │   └── General.java
  ├── main/
  │   └── Ecowiz.java
  ├── transaction/
  │   ├── Buy.java
  │   ├── Redeem.java
  │   └── Transaction.java
  ecowizDatabase.sql
  README.md
  ```

- **Change Credentials** <br>
Locate the `DatabaseConnection.java` file in your `VsCode` and update the values with your *`MySql credentials`*.

  ```java
  // Class file name: DBConnection.java
  private static String dbUrl = "jdbc:mysql://localhost:3306/";
  private static String dbUser = "root";
  private static String dbPassword = "genesis";  
  private static String sqlFilePath = "C:\\Users\\Genesis Jim\\Desktop\\OOP_Finals - Copy (2)\\ecowizDatabase.sql"; 
  ```
#### 2.1 **Using Visual Studio Code (VSCode):**
  - After changing the credential values, locate the `Java Projects` in the Explorer tab and add the `mysql-connector-java.jar` file under the `Referenced Libraries `section.
  - **Run** the `Ecowiz.java` file.
  - If errors occur, please verify the file structure and ensure that your credentials are correctly entered.

#### 2.2 Using Command Prompt (CMD):
- **Navigate** to the project directory by running the following command:
  - ```bash
    cd "path\to\your\project\src"
    #cd "C:\Users\Genesis Jim\Desktop\Finals\EcoWiz\src"
    ```
- **Compile** the program using the following command:
  - ```bash
    javac -d out -cp ".;path\to\your\mysql-connector-java.jar" main\*.java transaction\*.java commerce\*.java core\*.java

    ```
  - This step will generate a folder named `out` within your src directory. Inside the `out` folder, you will find *four subfolders*, each named after the corresponding package (`main`, `transaction`, `commerce`, `core`). These subfolders will contain the compiled `.class files`, which are the converted versions of your `.java files`.
-  **Run** the compiled program using the following command:
    - ```bash
      java -cp "out; path\to\your\mysql-connector-java.jar" main.Ecowiz
      ```




