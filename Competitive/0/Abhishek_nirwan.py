#this program contain only one function i.e get_egyptian_fraction
import math
def get_egyptian_fraction(num, dem ):# start of function

    print("You select this fraction {}/{} ".format(num,dem))
    d = []
    while num != 0:
        #Below Four line contain method as formula to find denominator of fraction of num 1
        x = math.ceil(dem / num) # give the smaller int value which greater than dem/num
        d.append(x)              #add required  x or denominator of required fraction
        num = x * num - dem      #give required numenator for ceil to get x in d array
        dem = dem * x            #give required denomenator for ceil to get x in d array

    for i in range(len(d)):#loop to print result in series

            print(" 1/{} ".format(d[i]),end = " ")
            if i == (len(d)-1):       #false when i = last element of array d to break loop
                 break
            print("+",end = " ")      # end of function get_egyptian_fraction(num, dem )
        
        
#further two line consist taking of input and and calling of function ......
numerator=int(input("Enter numerator: "))
denomenator=int(input("Enter denominator: "))
get_egyptian_fraction(numerator, denomenator)
#end
