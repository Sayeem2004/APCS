Programming Assignment: Traveling Salesperson Problem
Names: Mohammad Khan, Esteak Shapin, Dylan Hu, Han Zhang, Jishan Chowdhury,
Sydney Moy, Caroline Leung



/**********************************************************************
 * Approximate number of hours to complete this assignment            *
 **********************************************************************/
Number of hours: 1 hour



/**********************************************************************
 *  Explain how you implemented the nearest insertion heuristic.      *
 **********************************************************************/
First we created a function insertAtPosition(Point p, int i) that inserted
a node after position i of the linked list and updated length and size
accordingly. Then in the actual function itself, we first checked the
base case of the tour being empty. In this case we would insert the point
at position 0. If the tour was not empty, we traversed through the entire
linked list and kept track of the node that was closest to the point that
was going to be inserted. After looping through the linked list, we inserted
the point after the node that was closest using insertAtPosition.



/**********************************************************************
 *  Explain how you implemented the smallest insertion heuristic.     *
 *  It's sufficient to list only the differences between this         *
 *  heuristic and the nearest insertion heuristic.                    *
 **********************************************************************/
Just like in nearest insertion heuristic we used insertAtPosition and also
checked the same base case. We also looped through the list, but this time
instead of checking for the nearest node we checked for the node were inserting
the point after that node would cause the smallest increase in path length.
After looping through the linked list, we inserted the point after the
node that was closest using insertAtPosition.



/**********************************************************************
 *  First, explain why it is better to use a linked list instead of   *
 *  an array. Second, explain what is the advantage of using a        *
 *  *circularly* linked list instead of a normal linked list.         *
 **********************************************************************/
1. One advantage of using a linked list instead of an array is that a linked
list can work with an arbitrary number of nodes. An array can only contain a
limited number of nodes, and if that number is passed we would have to create
a new array, which is inefficient. Meanwhile, a linked list can be arbitrarily
long and we wouldn't have to reinstantiate it ever. Also inserting into a linked
list is faster than in an array because in an array in order to insert a point,
all the values after that point would have to be shifted back one, and this is
inefficient. Meanwhile in order to insert into a linked list, only 1 reference
has to be changed. Overall, linked lists are just more efficient for this problem.

2. A circularly linked list is better than a normal linked list in this
problem because this problem includes a path between the last node and
first node. A normal linked list can represent this path, but then there
would be a duplicate node in the normal linked list, and this would mess up
the insertion of new nodes using the heuristics. Also if a new endpoint was
given to the normal linked list, we would have to erase the front node and
the end node and replace them, which would be inefficient, but in a circularly
linked list we would only have to erase the front node. Overall, circularly
linked lists are easier to work with and slightly more efficient. 



/**********************************************************************
 *  In the table below, fill in the lengths that are computed by the  *
 *  two heuristics (nearest neighbor and smallest increase) that we   *
 *  ask you to implement.                                             *
 **********************************************************************/
data file      nearest neighbor     smallest increase
-----------------------------------------------------
tsp10.txt         1566.1363             1655.7462
tsp100.txt        7389.9297             4887.2190
tsp1000.txt      27868.7106            17265.6282
usa13509.txt     77449.9794            45074.7769



/**********************************************************************
 *  Do two timing analyses. Estimate the running time (in seconds)    *
 *  of each heuristic as a function of n, using expressions of the    *
 *  form: a * n^b, where b is an integer.                             *
 *                                                                    *
 *  Explain how you determined each of your answers.                  *
 *                                                                    *
 *  To get your data points, run the two heuristics for n = 1,000,    *
 *  and repeatedly double n until the execution time exceeds 60       *
 *  seconds.                                                          *
 *                                                                    *
 *  You may use TSPTimer to help do this, as per the checklist.       *
 *  If you do so, execute it with the -Xint option. This turns off    *
 *  various compiler optimizations, which helps normalize and         *
 *  stabilize the timing data that you collect.                       *
 *                                                                    *
 *  (If n = 1,000 takes over 60 seconds, your code is too slow.       *
 *  See the checklist for a suggestion on how to fix it.)             *
 **********************************************************************/
n               nearest time           smallest time
------------------------------------------------------------
  1000            0.011                   0.008
  2000            0.023                   0.023
  4000            0.073                   0.071
  8000            0.276                   0.289
 16000            1.272                   1.327
 32000            5.753                   5.899
 64000           25.035                  26.145
128000          121.217                 136.765

The runtime of the nearest neighbor heuristic is O(N^2). We determined this
theoretically because for every size test case we are adding N points to
the tour, and adding each point takes O(N) time because we have to loop
through the entire tour to find the optimal point of insertion. So that
would give a total time complexity of O(N^2). This is also shown by the
data above as the doubling factor for nearest time is approximately 4.

The runtime of the smallest insertion heuristic is also O(N^2). This is
because, just like in nearest neighbor, we are adding N point, and each
insertion takes O(N) time as we have to go through the entire tour. This
conclusion is also supported by the data above as the doubling factor for
smallest time is approximately 4.



/**********************************************************************
 *  If you implemented your own heuristic, please describe here how   *
 *  it differs from the assignments' heuristics, and why you think it *
 *  will perform better.                                              *
 **********************************************************************/
We did not implement our own heuristic.



/**********************************************************************
 *  If you implemented your own heuristic, please provide the lengths *
 *  of these heuristics for the following two input files.            *
 **********************************************************************/
We did not implement our own heuristic.



/**********************************************************************
 *  Did you receive help from classmates, past COS 126 students, or
 *  anyone else? If so, please list their names.  ("A Sunday lab TA"
 *  or "Office hours on Thursday" is ok if you don't know their name.)
 **********************************************************************/
We did not receive any outside help.



/**********************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 **********************************************************************/
We did not encounter any serious problems.



/**********************************************************************
 *  List any other comments here.
 **********************************************************************/
No other comments.
