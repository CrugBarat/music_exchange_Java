# Music Exchange

This exercise was tasked to me by CodeClan, Glasgow where I studied towards a PDA Level 8 in Professional Software Development. The exercise brief can be found below.

## Brief

You are being asked to model a music shop. This shop will contain items which can be sold. These items might be instruments, which someone may play or they might be other items, e.g. guitar strings, drum sticks, sheet music. Each item that can be sold will have both a price at which the shop bought the item, and a price at which the item will be sold.

You will need to:

- Create a IPlay interface that could be applied to instruments. This should have a play method that returns the sound of the instrument being played as a String
- Create classes for different types of instruments
- Each class will have its own instance variables for attributes particular to that instrument
- Create an Instrument superclass which contains attributes you see as being common to all instruments  
- Create a ISell interface which has a calculateMarkup method, which returns an int/double, based on the buying price and the selling price
- Create a Shop class, which has a collection of ISell items, called stock

In your shop you should be able to:
- add items to stock
- remove items from stock

**Possible Extensions**

- Using the calculateMarkup method for each item in stock, create a method which gives the total potential profit for the shop
- Create and use an enum for instrument types
- Any other extensions you may wish to add
