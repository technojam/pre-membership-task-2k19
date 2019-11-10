import math

thislist = []
n=int(input("Enter numerator :"))
d=int(input("Enter denominator :"))
print("Answer : ")
while(n!=1):
    x = math.ceil(d/n)
    nn = 1
    dd = x
    thislist.append(x)
    n = (n*dd)-(d*nn)
    d = d*dd
    if(d%n==0):
        d = int(d/n)
        n = int(n/n)
thislist.append(d)

for i in range(len(thislist)): 
        if i != len(thislist) - 1: 
            print("1/{0} +".format(thislist[i]), end = " ") 
        else: 
            print(" 1/{0}".format(thislist[i]), end = " ")
        


        
