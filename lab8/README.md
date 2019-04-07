# Input Mask

## Decorator Pattern

I have utilized Decorator Design Pattern to solve this problem. The reason behind it is that at run time we have to add additional responsibility to the object (additional responsibility - it is nothing but addition of ####Spaces#### and Slash with Card Number and Card Expiry Date). The decorator pattern is most suitable design pattern for implementation of such requirement.

 

### Design -

I have introduced one interface which has one method to handle spaces in addSpace class and slash in addSlash class. These classes have implementation for addition of spaces and slash after specific count of card number. Also, at the start it self i have handled working of removing last character from the input. It will reduce the count and removeLastCharacter method gets invoked accordingly.

Also, in case, in future the requirement came like, we have to add spaces after 6 digit then we just need to another responsibility to the object and call this class via newly created interface.
