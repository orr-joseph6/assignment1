# assignment1

## Preface
We modified this assignment from the real assignment one from CS106A at Stanford. At Stanford,
Karel runs in Eclipse, but for this class we have written a simple script to run Karel programs
from the command line. It works like this:
```bash
$ ./run CollectNewspaperKarel.java
```

## Problem 1: CollectNewspaperKarel
Your first task is to solve a simple story-problem in Karel’s world. Suppose that Karel
has settled into its house, which is the square area in the center of the following diagram:

![Problem 1 Diagram](https://raw.githubusercontent.com/mahackers/assignment1/master/images/p1.png)

Karel starts off in the northwest corner of its house as shown in the diagram. The problem
is to program Karel to collect the newspaper—represented (as all objects in Karel’s world
are) by a beeper—from outside the doorway and then to return to its initial position.

This exercise is extremely simple and exists just to get you started. You can assume that
every part of the world looks just as it does in the diagram. The house is exactly this size,
the door is always in the position shown, and the beeper is just outside the door. Thus, all
you have to do is write the sequence of commands necessary to have Karel

1. Move to the newspaper.
2. Pick it up.
3. Return to its original starting point

Even though the program requires just a few lines, it is still worth getting at least a little
practice in decomposition. In your solution, include a private method for each of the
steps shown in the outline.

## Problem 2: StoneMasonKarel
Karel has been hired to repair the damage done to the Quad in the 1989 earthquake. In
particular, Karel is to repair a set of arches where some of the stones (represented by
beepers, of course) are missing from the columns supporting the arches, as follows:

![Problem 2 Diagram 1](https://raw.githubusercontent.com/mahackers/assignment1/master/images/p2-1.png)

Your program should work on the world shown above, but it should be general enough to
handle any world that meets certain basic conditions as outlined at the end of this
problem. There are several example worlds in the starter folder, and your program should
work correctly with all of them.

When Karel is done, the missing stones in the columns should be replaced by beepers, so
that the final picture resulting from the world shown above would look like this:

![Problem 2 Diagram 2](https://raw.githubusercontent.com/mahackers/assignment1/master/images/p2-2.png)

Karel may count on the following facts about the world:
- Karel starts at 1st Avenue and 1st Street, facing east, with an infinite number of
beepers.
- The columns are exactly four units apart, on 1st, 5th, 9th Avenue, and so forth.
- The end of the columns is marked by a wall immediately after the final column. This
wall section appears after 13th Avenue in the example, but your program should work
for any number of columns.
- The top of the column is marked by a wall, but Karel cannot assume that columns are
always five units high, or even that all columns are the same height.
- Some of the corners in the column may already contain beepers representing stones
that are still in place. Your program should not put a second beeper on these corners.

## Problem 3: MazeKarel
We will walk you through this if we get to it on day one.
