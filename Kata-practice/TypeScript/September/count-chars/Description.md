### Learning TypeScript. Advanced Types. Intersection Types

[Link](https://www.codewars.com/kata/5916c87540ef95d8e1000007/train/typescript)

#### 22 Dec 2024

An intersection type combines multiple types into one. This allows you to add together existing types to get a single type that has all the features you need. For example, Person & Serializable & Loggable is a Person and Serializable and Loggable. That means an object of this type will have all members of all three types.

You will mostly see intersection types used for mixins and other concepts that don’t fit in the classic object-oriented mold. (There are a lot of these in JavaScript!) Here’s a simple example that shows how to create a mixin:

## Task

In the example above you can see that extends function returns T & U which should correspond to intersection of types T and U. But in fact it returns object containing all properties from T mixed with additional properties from U.

Your task is to create function intersect which returns object with properties that are present simultaneously in T and U.