/**********************************************************************
    Readme Template
    Dynamic Programming
**********************************************************************/
    Names: Mohammad Khan, Asa Muhammad, Caroline Leung, Dylan Hu,
    Esteak Shapin, Han Zhang, Jishan Chowdhury
    Hours to complete assignment (optional): 1 hour



/**********************************************************************
    Explain what you did to find the alignment itself.
**********************************************************************/
    First we created a 3x(M+N) char array to store the alignment and
    the penalties because the worst case is that we do insertions at
    every position. Then starting from r=0,s=0,i=0 we compared against
    the cells of (r+1,s), (r,s+1), and (r+1,s+1). We found which one of
    those cells correctly led to the current cell and using the method
    given in the problem statement. We then stored the arrangement and
    penalties in char array at position i. We iterated i up one and
    moved the current cell to one of the three cells above. We continued
    this process until we reached the bottom right of the dp array,
    then we printed out our results.



/**********************************************************************
    Time Complexity Of Edit Distance
**********************************************************************/
    The estimated order of growth for the EditDistance.java program is
    O(N^2) because it has a double nested for loop with lengths N and
    M. This means the program runs in O(NM) which is generalized to
    O(N^2).



/**********************************************************************
    Space Complexity Of Edit Distance
**********************************************************************/
    The estimated space complexity for the EditDistance.java program is
    O(N^2) because the most significant space required is a 2d array
    with lengths of N and M. This means the program uses approximately
    O(NM) space which is generalized to O(N^2).



/**********************************************************************
    How much main memory does your computer have? Typical answers
    are 2GB and 4GB. If your machine has 512MB or less, use a lab
    machine for this question and the remainder of the readme questions.
**********************************************************************/
    16GB of main memory/RAM.



/**********************************************************************
    What additional test data did you create to test your program
    for special cases? (At least one set of test data required) And
    how did you test for correctness?
**********************************************************************/
    The test data given to us allowed us to properly test our algo for
    alignments that ended up with an end size of max(M,N). However,
    we were not sure if insertions at the end of string would work as
    this would cause the alignment to be larger than both initial
    strings, so we gave it cases such as ABCDEFG AGBCDEF which would cause
    this case to occur. The correctness of this case can easily be seen
    by hand so that was also useful. Once we made sure that our program
    could run under this case and similar cases, we were sure our program
    would be able to handle any string given to it.



/**********************************************************************
    List whatever help (if any) that you received
**********************************************************************/
    We did not receive any help while completing this assignment.



/**********************************************************************
    Describe any serious problems you encountered.
**********************************************************************/
    We did not encounter any serious problems while doing this
    assignment, we just followed instructions and it worked in the
    first couple of tries.



/**********************************************************************
    List any other comments here. Feel free to provide any feedback
    on how much you learned from doing the assignment, and whether
    you enjoyed doing it.
**********************************************************************/
    We already knew of the technique to find the edit distance between
    two strings but we did not know the technique to regain the best
    alignment of the two strings. We learned about this alignment
    technique during the assignment and that made it very fun.
