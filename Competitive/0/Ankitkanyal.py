#python code for egyption fractions
import math
print("Enter the Fraction in the form of nr/dr")
print("Enter the value of nr")
nr=int(input())
print("Enter the value of dr")
dr=int(input())
print("The entered fraction is:{0}/{1}".format(nr,dr))
print("The Egyption Frcation representation of {0}/{1} is:".format(nr,dr))
li=[]
while(nr!=0):
    fr=math.ceil(dr/nr)
    li.append(fr)
    nr=nr*fr-dr
    dr=fr*dr

for i in range(len(li)):
    if(i<len(li)-1):
        print("1/{0} +".format(li[i]),end="")
    else:
        print("1/{0} ".format(li[i]))

    
