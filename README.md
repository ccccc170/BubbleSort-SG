# BubbleSort

## Project overview:

This project implements a bubblesort method to sort an
array of integers into ascending order. The bubblesort
methods scans arrays from left to right and swaps them
into the right order. It does this by comparing a 
value with the value next to it and then moving on to 
the next value and continuing the same process. It 
does this in a cycle until the elements of the array 
are in the desired order.

## The Sorting function:

The function that sorts the array is called sortArrAsc
and can be found in the BubbleSort class. The 
sortArrAsc method takes in an array of integers. 
Firstly, it creates a boolean value of false named 
isSorted. An outer for loop is the declared and ran, 
performing an amount of iterations equal to the amount
of number of elements present within the array. This 
outer loop ensures that the logic within the loop, 
which performs the sorting action, runs enough times 
to sort the entire array. Inside this loop, the 
isSorted vale is set to true. The inner loop is then
declared and ran which begins looping at the 2nd 
element of the array. The logic within the inner loop
uses an if statement which compares the current 
element's value with the one before it. If the current
element is a smaller value than the one before it, 
these values are switched by calling another method
called swap, which implements logic to switch the two
compared indexes. After swap has been run within the 
logic of the if statement, the isSorted value is set 
back to false.

After each iteration of the inner loop has ran for the
current index position, another if statement check the
value of os isSorted. If the value of insSorted is 
true during this check, the array is returned. This 
boolean value and if statement are used to make the 
function more efficient. If the first if statement 
within the inner for loop's condition is not met 
(that is any value from the array between the 2nd and
last value not being smaller than the value before it),
then this means that the array is sorted into 
ascending order and the swap function does not need to
be called and the isSorted value does not need to be 
set back to false before the check in the second if 
statement. This prevents the function from having to 
keep looping through the array and checking the order
if it is already sorted into ascending order.

If the sorted array has not been returned during the 
check in the second if statement, the next iteration 
of the outer loop begins and the process is ran again.
The function will either return via the check in the 
second if statement or after the outer loop has ran 
its full course and there return statement afterwards
has been reached.

## How to run the programme:

To run the programme, execute the main function 
within the main class. This function calls the start
function from the starter class. This start function 
initialises a hard-coded array, prints that array to 
the console, calls the sortArrAsc function from the 
BubbleSort class passing in the array, and finally 
prints the sorted version of that array to the 
console. If you wish to use the programme to sort a 
different array, you can change the code in the 
start function and pass in your desired array to the 
sortArrAsc function.