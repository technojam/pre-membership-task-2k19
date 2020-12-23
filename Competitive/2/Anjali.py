### Question 0: Understand the pattern and write the code accordingly.
    
    #size 3

    ----c----
    --c-b-c--
    c-b-a-b-c
    --c-b-c--
    ----c----

    #size 5

    --------e--------
    ------e-d-e------
    ----e-d-c-d-e----
    --e-d-c-b-c-d-e--
    e-d-c-b-a-b-c-d-e
    --e-d-c-b-c-d-e--
    ----e-d-c-d-e----
    ------e-d-e------
    --------e--------
SOLUTION:
import string
def pattern(n):
    alpha = string.ascii_lowercase
    l=[]
    for i in range(n):
        s = '-'.join(alpha[i:n])
        l.append((s[::-1]+s[1:]).center(4*n-3,'-'))
    b=reversed(l[1:])
    print("\n".join(b), "\n".join(l), sep = "\n")
t=int(input("Enter the size: "))
pattern(t)

    


### Question 1: Understand the pattern and write the code accordingly.

    n = 4

        1020304017018019020
        **50607014015016
        ****809012013
        ******10011
    
    n = 5

        102030405026027028029030
        **6070809022023024025
        ****10011012019020021
        ******13014017018
        ********15016


### Question 2: Write a function which takes n as input and returns the corresponding nth fibonacci number.

    NOTE: You have to use recursion.
          You have to make sure program works even for 100th fibonacci number.

SOLUTION:
def fib(n):
    if(n<0):
        print("Invalid Input")
    elif(n==1):
        return 0
    elif(n==2):
        return 1
    else:
        return fib(n-1)+fib(n-2)
t=int(input("Enter the number: "))
print(fib(i))


