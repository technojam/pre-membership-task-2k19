import math  
def egyptianFraction(num, dem): 
    print("The Egyptian Fraction Representation"+
          "of {0}/{1} is".
                  format(num,dem))  
    d = [] 
    while num != 0: 
        x = math.ceil(dem / num) 
        d.append(x) 
        num = x * num - dem 
        dem = dem * x 
    for i in range(len(d)): 
        if i != len(d) - 1: 
            print(" 1/{0} +". 
                    format(d[i]), end='') 
        else: 
            print(" 1/{0}".
                    format(d[i])) 
a=int(input("Enter numerator: "))
b=int(input("Enter denominator: "))
egyptianFraction(a, b)
