Pokemon Master
Easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has A Pokeball with her and there are B pokemon in front of Sara. Considering each pokemon takes one Pokeball, your task is to tell Sara if she can catch all the pokemon or not.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function PokemonMaster() that takes integers A and B as arguments.
Constraints:-
1 <= A, B <= 8
Output
Return 1 if Sara can catch all the pokemon else return 0.
Example
Sample Input:-
4 3
Sample Output:-
1
Sample Input:-
4 6
Sample Output:-
0*/

static int PokemonMaster(int A, int B){
    if(A>=B){
       return 1;
    }else {
        return 0;
    }

}
