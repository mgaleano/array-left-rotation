# Coding Problem: Array Left Rotation
---

A left rotation operation on an array of size **n** shifts each of the array's elements **1** unit to the left. For example, if **2** left rotations are performed on array **[1, 2, 3, 4, 5]**, then the array would become
**[3, 4, 5, 1, 2]**.
Given an array of integers and a number, **d**, perform left rotations on the array. Then print the updated array as a single line of space-separated integers.

### Input Format

The first argument contains an integer denoting the value of **d** (the number of left rotations you must perform).
The second argument contains space-separated integers describing the respective elements of the array's initial state.

### Constraints

* 1 ≤ n ≤ 10
* 1 ≤ d ≤ n

### Output Format
Print a single line of **n** space-separated integers denoting the final state of the array after performing **d** left rotations.

### Sample Input
```
4
1 2 3 4 5
```

### Sample Output
```
5 1 2 3 4
```

### Explanation
When we perform **d = 4** left rotations, the array undergoes the following sequence of changes:

[1, 2, 3, 4, 5] --> [2, 3, 4, 5, 1] --> [3, 4, 5, 1, 2] --> [4, 5, 1, 2, 3] --> [5, 1, 2, 3, 4]

Thus, we print the array's final state as a single line of space-separated values, which is `5 1 2 3 4`.