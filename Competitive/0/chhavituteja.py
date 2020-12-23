import math
def ef(n,d):
    lis=[]
    while(n!=0):
        x=math.ceil(d/n)
        lis.append(x)
        n=n*x-d
        d=d*x
    for i in range(len(lis)):
        if(i!=len(lis)-1):
            print("1/{} +".format(lis[i]), end="")
        else:
            print("1/{} ".format(lis[i]), end="")

