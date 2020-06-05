#Fibonacci Series using Recursion 

def fib(n):  
    if (n <= 1): 
        return n; 
    return fib(n - 1) + fib(n - 2); 

n = int(input("Enter the nth number of fibonnacci series"))
print(fib(n))
