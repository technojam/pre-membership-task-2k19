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
