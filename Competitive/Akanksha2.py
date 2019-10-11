Ques 0:
import string
a = string.ascii_lowercase

n = int(input("Enter the value of n "))
L = []
for i in range(n):
    s = "-".join(a[i:n])
    L.append((s[::-1]+s[1:]).center(4*n-3, "-"))
print('\n'.join(L[:0:-1]+L))
 
 
 Ques 2:
 def Fibo(n): 
    if n<0: 
        print("Invalid") 
    elif n==1: 
        return 0
    elif n==2: 
        return 1
    else: 
        return Fibo(n-1)+Fibo(n-2) 
  
a=int(input("Enter the term: ")) 
print(Fibo(a)) 
