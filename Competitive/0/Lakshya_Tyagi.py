Question 0: Understand the pattern and write the code accordingly.

import math

x=2
add=0

a = int(input("Enter Numerator: "))
b = int(input("Enter Denomenator: "))

c = a/b
temp=c

print(c)

print("Output: 0")

while(add!=c):
    if((1/x)<=temp):
        add=add+(1/x)
        temp=c-add
        print("+1/", x)
    x=x+1


print(add)



Question 1: Understand the pattern and write the code accordingly.
    
c=0
t=0
d=""
n=int(input("Enter Size: "))
res=(n*n)+1
for i in range(1, n+1):
    t=res
    print(d, end="")
    for j in range(1, n-(i-1)+1):
        c=c+1
        print(c*10, end="")
    for k in range(1, n-(i-1)+1):
        if(k==n-(i-1)):
            print(t, end="")
            t=t+1
        else:
            print(t*10, end="")
            t=t+1
    d=d+"**"

    res=res-(i+1)
    print()

    
  Question 2: Write a function which takes n as input and returns the corresponding nth fibonacci number.
    
  n=int(input("Enter number: "))
def memo(f):
    a = {}
    def need(x):
        if x not in a:            
            a[x] = f(x)
        return a[x]
    return need
    

def Fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)

Fibonacci = memo(Fibonacci)

print(Fibonacci(n))
