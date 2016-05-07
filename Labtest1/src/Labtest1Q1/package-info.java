/**
 * 
 */
/**
 * @author rahul
 *
 */
package Labtest1Q1;

/*

Lab Test 1
Duration- 2 hours (10 to 12 ) 					Max. Marks – 20 
Answer all possible questions. Implement following situations using one or more design patterns. 
You may implement them separately or in combined manner wherever possible.
1. A vehicle can be in various states- Idle or moving. It responds to operations such as applyBrake() 
differently in each of this state. Ex. When it is in moving state applyBrake() will result in vehicle 
coming to idle state. When it is in idle state, applyBrake() will have no effect.  (additionally you can 
refine the moving state by adding separate state for each of the gear shift with rules to move sequentially 
from lower to top gear and back).
(state design patten states idel , moving)

2. The above vehicle can be provided either a Petrol or Diesel fuel tank and engine. The getFuel() operation 
should providing of Petrol or Diesel based on the type of the engine fitted.
(statergy class petrol ,diesel)

3. If this vehicle is now modified by providing LPG Gas cylinder as the new option for fuel. 
The operation to access the LPG fuel form this device is getLPG(). Ensure that the earlier operation getFuel() 
is able to get fuel from LPG cylinder.
(adapter)

4. Consider a graphical drawing editor which provides basic shapes such as circle, triangle 
and square as elements for drawing. The editor allows you to embed these elements within one another 
to any depth. Ex. You can create a ring of concentric circles or squares or triangles as well as have a 
circle within a triangle within a square. Possibilities are unlimited.
(composit)

5. You have an online banking account for your actual bank account. Basic transactions such as 
getBalance(), withdraw( int amount), deposit(int amount) etc can be performed through both these options.
 In addition the online account must have a secure login procedure and each of the basic transactions could be
  perfomed through online account only if you have logged in successfully. 
  

*/