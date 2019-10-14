import math as mt
nmr=int(input("enter the numerator: "))
dmr=int(input("enter the denominator: "))

print("now your fraction is:{0}/{1}".format(nmr,dmr))

lst=[]


while(nmr!=0):
    func=mt.ceil(dmr/nmr)
    lst.append(func)
    nmr=nmr*func-dmr
    dmr=func*dmr

for i in range(len(lst)):
    if(i<len(lst)-1):
        print("1/{0} +".format(lst[i]),end="")
    else:
        print("1/{0} ".format(lst[i]))

    
