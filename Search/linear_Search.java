/**

Linear search is also called as sequential search algorithm. 
It is the simplest searching algorithm. In Linear search, 
we simply traverse the list completely and match each element of the list with the item whose location is to be found. 
If the match is found, then the location of the item is returned; otherwise, the algorithm returns NULL. 

Wikipedia: https://en.wikipedia.org/wiki/Linear_search
*/
class LinearSearch {  
static int linearSearch(int a[], int n, int val) {  
  // Going through array sequencially  
  for (int i = 0; i < n; i++)  
    {  
        if (a[i] == val)  
        return i+1;  
    }  
  return -1;  
}  
public static void main(String args[]) {  
  int a[] = {5, -5, 3, 40, 9}; // given array  
  int val = 3; // value to be searched  
  int n = a.length; // size of array  
  int res = linearSearch(a, n, val); // Store result  
  System.out.println();  
  System.out.print("The elements of the array are - ");  
  for (int i = 0; i < n; i++)  
  System.out.print(" " + a[i]);  
  System.out.println();  
  System.out.println("Element to be searched is - " + val);  
  if (res == -1)  
  System.out.println("Element is not present in the array");  
  else  
  System.out.println("Element is present at " + res +" position of array");  
}  
}  
