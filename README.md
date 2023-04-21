# Paper-Rock-Scissors

Build a game in which two players compete in a game of Paper-Rock-Scissors with different strategies. 
Who will win more rounds? 

## Rules
The rules:
- Paper beats Rock
- Rock beats Scissors
- Scissors beats Paper
- If both players choose the same, the round is counted as a tie

Implement two players:
- Player A always chooses Paper
- Player B chooses randomly

The game consists of 100 rounds of the above two players competing. 

The output of the program should be like the following:

"Player A wins 31 of 100 games"

"Player B wins 37 of 100 games"

"Tie: 32 of 100 games"

## Documentation

The game is implemented following the **Strategy**, **AbstractFactory** and **Singleton** design patterns principles.

There are two main interfaces, **GameStrategy** and **Move** interfaces.

**GameStrategy** interface defines a single method _play_ which will take a **Move** as a parameter and return the Result. 

**Result** is an enumeration with values (**WIN**,**DRAW**,**LOSE**)

**Move** interface defines a _setter_ method to allow implementer classes to set up its convenient Strategy and a _getter_ method for the appropriate Strategy, also there is a method _playAgainst_ that takes Move as a parameter. 

**AbstractMove** class implements most of the **Move** interface, invokes the **GameStrategy** _play_ method, and in the end, enables easy implementation of the concrete moves(**PaperMove**, **RockMove**, **ScissorsMove**) through the inheritance concept.

**PaperGameStrategy**, **RockGameStrategy**, and **ScissorsGameStrategy** are concrete strategies implementing the rules of the game which are supplied during the creation of each concrete move.

**MoveGameStrategyFactory** interface defines methods for the creation of concrete strategies.

**GameStrategyFactory** is an AbstractFactory class that implements MoveGameStrategyFactory and it is responsible for the creation of concrete strategies.

**MoveFactory** uses **MoveGameStrategyFactory** and builds concrete moves providing the appropriate concrete strategies for each of them.

**GameController** is responsible for the creation of players, rounds iterations, and adding moves for every particular round, the final result is a **Game** object which consists of **Player** objects, and the **GameResult** object which are representing the actual final result.

### Pros
- Possible to extend without changing the existing solution
- Possible to take advantage of our superclass's logic when extending 
- Clear responsibility between strategies
- Solve the problem

### Cons
- Adding a new move will result in adding a lot of new classes
- Constantly adding new moves will make a game robust


### Conclusion
On the one hand, by using the Strategy pattern in combination with the AbstractFactory pattern, we can keep our components enough decoupled and we have a clear responsibility, so we are able to extend classes using the advantage of the predecessor's logic instead of modifying of the existing source code in case we want to add a new move into our game. But on the other hand, it is not enough flexible approach, because even for one new move we should add a lot of classes, also if we should constantly add new moves then our application will get robust over time, so in that case, should think about some other design approach. 

Generally, a game of this type is quite rounded in the context of moves, so solving this particular problem using this approach is okay.





