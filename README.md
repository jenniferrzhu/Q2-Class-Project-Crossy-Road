# :cherry_blossom: Crossy Japan :cherry_blossom:

A computer game that is inspired by Crossy Road. 

![/Q2 Project/src/imgs/gameGIF.gif](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/gameGIF.gif)

## :seedling: Game Description

In this game, the chicken tries to cross the road to return to its pagoda while avoiding cars. The user can moves forward and back using the arrow keys to weave between lanes if necessary to avoid collision, and the number of roads crossed is tracked with the score. Once the chicken collides with a car or the bottom of the frame, the chicken dies and the game restarts automatically.

## :seedling: Usage

* Arrow keys: moves chicken up and down
* Space: restarts the game after winning

## :seedling: Classes

### Chicken Class
![/Q2 Project/src/imgs/ChickenFinal.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/ChickenFinal.png)

This class is for the main character: the chicken. This was drawn in Pixil Art from a reference photo of the japanese chicken in the original Crossy Road game. Only one chicken object is created in frame.

### Pagoda Class
![/Q2 Project/src/imgs/PagodaFinal.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/PagodaFinal.png)

This class if for the pagoda that is seen throughout the game and when the player reaches the end. This was drawn in Pixil Art from a reference photo found on Google.

### Tree Class
![/Q2 Project/src/imgs/tree.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/tree.png)

This class is for the cherry blossom trees that are seen on grass roads. An array of tree objects was used to create the lushious forest that is behind the final pagoda. This was drawn in Pixil Art from a reference photo found on Google.

### Car Class
![/Q2 Project/src/imgs/carL.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/carL.png)
![/Q2 Project/src/imgs/carR.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/carR.png)

This class is for the cars that drive past on the dirt road. A loop was used to have a continuous flow of cars. The Car Class is for the cars going left on the road, and the Car2 class is for the cars going right on the road. These cars were drawn in Pixil Art from a reference photo found on Google.

### Background Class 

This class, including the Grass and Grass2 class, is for the dirt roads and grass paths. Objects were created and painted in Frame in a certain order to have a mixture of roads and grass. These background images were drawn in Pixil Art.

## :seedling: Methods

### Paint Method
![/Q2 Project/src/imgs/paint.PNG](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/paint.PNG)

The paint method paints all of the objects created in the Frame class to appear on the screen. This method also updates the x and y of the objects so that all objects are able to move.

### Reset Method
![/Q2 Project/src/imgs/reset.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/reset.png)

This method returns all of the objects to its original position, and it sets the score back to 0.

### Repeating Cars Method
![/Q2 Project/src/imgs/carRepeat.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/carRepeat.png)

Because there is no set pattern for the roads, the cars rely on the position of the road for its x and y. This method ensures that the cars loop back around to re-appear on screen after it passes a certain x-value, and when it returns, the x and y values update according to the road's x and y.

### Collide Method
![/Q2 Project/src/imgs/collide.png](https://github.com/jenniferrzhu/Q2-Class-Project-Crossy-Road/blob/main/Q2%20Project/src/imgs/collide.png)

This method is a major part of the game because it determines if the chicken was able to successfully pass all of the obstacles. This method checks for the collision of the chicken with the car using if statements. If the circumstances satisfy the condition, then the entire game resets.  

## :seedling: Help

If the game glitches, close the tab and run again. 

## :seedling: Future Updates

While there are no promises for future updates, we will consider impelementing a road randomizer to increase the longevity of the game, and they will consider adding to the mobility of the chicken so that it can turn left and right. We may also add a feature that places coins on the road that are collectable so that players could buy new characters. 

## :seedling: Contributions

We welcome any coding contributions that help meet the goals of our future updates. We are also open to suggestions that would help condense the current code.

## :seedling: Authors and Acknowledgement

### Graphic Creators
* Connie Zhu
* Jennifer Zhu

### Code Writers
* Connie Zhu
* Jennifer Zhu

### Mentor
* Mr. David

### Inspiration
* Crossy Road
