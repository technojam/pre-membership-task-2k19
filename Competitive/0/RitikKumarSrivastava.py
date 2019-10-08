import math
from fractions import Fraction
np=int(input("Enter the Numerator of the: "))
dp=int(input("Enter the Denominator greater than numerator: "))
dn=0
dall=[]
print(str(np)+"/"+str(dp)+" =",end=" ")
if dp>np	:
	while np!=0	:
		dn=math.ceil(dp/np)
		dall.append(dn)
		np=(np*dn)-dp
		dp*=dn
for i in range(len(dall)): 
	if i != len(dall) - 1: 
		print("1/{0} +".format(dall[i]), end = " ") 
	else: 
		print("1/{0}" .format(dall[i]))
print("Number of elements in the egyptian fraction is: {0} ".format(str(len(dall))))