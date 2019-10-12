#importing math for using the ceil function
import math

#taking the input of the present numerator
np=int(input("Enter the Numerator of the: "))
#taking the input of the present denominator
dp=int(input("Enter the Denominator greater than numerator: "))
dn=0
#declaring the list for storing the denominator of the egyptian fractions
dall=[]
print(str(np)+"/"+str(dp)+" =",end=" ")
#checking the conditon if the fraction is valid for having a egyptian fraction
if dp>np:
        #generating fractions till the numerator of the previous fraction is greater then 0
	while np>0:
                #getting the demoninator of the new fraction
		dn=math.ceil(dp/np)
		#storing the denominator of the new fraction in the list
		dall.append(dn)
		#calculating the numerator and denominator of the fraction left after reducing the new fraction from the previous fraction
		np=(np*dn)-dp
		dp*=dn
#displaying the egyptian fractions generated
for i in range(len(dall)):
	if i != len(dall) - 1: 
		print("1/{0} +".format(dall[i]), end = " ") 
	else: 
		print("1/{0}" .format(dall[i]))
#displaying the total number of elements in the egyptian fraction of the entered fraction
print("Number of elements in the egyptian fraction is: {0} ".format(str(len(dall))))
