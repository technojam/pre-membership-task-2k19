
import math
num=int(input("your Numerator :"))
den=int(input("your Denominator: "))
a=[]
while(num!=0):
    b=math.ceil(den/num)
    a.append(b)
    num=num*b-den
    den=b*den

for i in range(len(a)):
    print("1/{0} ".format(a[i]),end="")
    if(i==len(a)-1):
        pass
    else:
        print("+",end="")
    
