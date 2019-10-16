fib1=1
fib2=1
print("Enter the number of fibbo term you wanna print")
n=int(input())
def fibb(fib1,fib2,n):
    if(n>2):
        temp=fib2
        fib2=fib1+fib2
        fib1=temp
        n=n-1
        fibb(fib1,fib2,n)
    elif(n==1):
        print(fib1)
    elif(n==2):
        print(fib2)
    else:
        print("The nth element is :",fib2)
fibb(fib1,fib2,n)    
