import math 
def EFraction(num, den):
	print("the egyptian fraction version of ",num,"/",den,"is: ") 
	egfr = []
	while num != 0: 
		x = math.ceil(den/num)
		egfr.append(x)
		num = x * num - den 
		den = den * x
	for i in range(len(egfr)): 
		if i != len(egfr) - 1: 
			print(" 1 /",egfr[i],"+") 
		else:  
			print(" 1 / ",egfr[i]) 

x=int(input("enter numerator"))
y=int(input("enter denomerator"))
EFraction(x,y)

