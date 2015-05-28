Lab Searching Writeup
Allen Cao

1. Linear Searching
value is 199046 at index 0
value is 607456 at index 999
value is 736556 at index 499

2. Binary Searching
Searching for index 0, value 865978, found at index 0
Searching for index 999, value 467389, found at index 999
Searching for index 499, value 85433, found at index 499
Searching for index ??, value 1000001, found at index -1

3. Comparable is used because the binary search uses the compareTo method so a Comparable object is needed.
Binary Searching
Searching for index 0, value 398882, found at index -1
Searching for index 999, value 854051, found at index 999
Searching for index 499, value 675792, found at index 499
Searching for index ??, value 1000001, found at index -1
It doesn't work because the list is not ordered, either ascending or descending.

4. Binary Searching
Searching for index 0, value 1, found at index 0
Searching for index 999, value 1000, found at index 999
Searching for index 499, value 500, found at index 499
Searching for index ??, value 1000001, found at index -1
Binary search works now because the array is ascending and ordered.

5. Linear-searching for 100001, found at -1
Time elapsed was 1449974 nanoseconds
Binary-searching for 100001, found at -1
Time elapsed was 100021 nanoseconds
The binary-serach algorithm is obviously faster by a large margin.

6. For a linear-search, the index values 0-999 are checked one by one until the value is found or the index reaches 1000. Because the value 487 is at index value 486, the array will use 487 probes until it finds the correct value.
The binary-search would first find the midpoint of 0 and 999 which is 499, and its value 500 is greater than 487. The left bound would stay at 0 because the value is less then the midpoint, and the right 