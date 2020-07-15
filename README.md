# Good and Bad - By Aaron Allen & Lucious Morrison

## Objectives

To demonstrate your understanding of the following:

1. Objects and functions
2. Controlling execution
3. Access control
4. Reusing classes


## Overview

In a world filled with good and evil and everything in between, a rise of super people has occurred. With this, a need to register such beings as well as normal humans has become necessary.

## Unit test

UML is required
Unit test in place before proceeding with code
Make sure you test EVERY public method

## Part 1

In this project you will find a *Human* class to begin your program with. The requirements to complete the *Human* is as follows

**Fields**

Fields should be *private*, getters and setters should be created for setting and retrieving the field data

- id (int) : An ID number to associate with each *Human*
- name (String) : a *String* value for the *Human* name
- dob (LocalDate) : a *LocalDate* object that represents the date of birth
- gender (String) : a value for how the *Human* identifies
- occupation (String) : a job title for the *Human*

**Methods**

- As stated above, getters and setters should be available for all fields except the *id*. The *id* field should only have a get method and the values should be set upon instantiation (i.e. in the constructor)
- getAge() : this method should return an integer of the current age

## Part 2

In this section you will create a *SuperHuman* class that will subclass the *Human* and add the following:

**Fields**

- alias (String) : A *String* value of the super human's name (i.e. Superman, Batman)
- affiliation (enum) : A enum value that classifies the super human as either good, bad, or neutral
- ability (String) : A *String* value representing the super power

**Methods**

- catchPhrase() : Should return a string value that represents the catch phrase for the super human (i.e. To infinity and beyond)
- usePower() : Should return a string that combines the catch phrase with a sound effect of the power (i.e. Up up and away, swooosh)

## Part 3

1. Create a *main* method that instantiates a few *Human* and *SuperHuman* classes
2. Demonstrate calling methods from the *Human* instances
3. Demonstrate calling methods inherited from *Human* on your *SuperHuman* instances
