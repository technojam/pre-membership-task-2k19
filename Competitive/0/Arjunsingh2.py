
import math as m
n=int(input("Enter Numerator :"))
d=int(input("Enter Denominator: "))
l=[]
while(n!=0):
    a=m.ceil(d/n)
    l.append(a)
    n=n*a-d
    d=a*d

for i in range(len(l)):
    print("1/{0} ".format(l[i]),end="")
    if(i==len(l)-1):
        pass
    else:
        print("+",end="")
    
