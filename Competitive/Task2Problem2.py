n=int(input("Enter number: "))
def fs(f):
    a = {}
    def z(x):
        if x not in a:            
            a[x] = f(x)
        return a[x]
    return z
def Fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)

Fibonacci = fs(Fibonacci)

print(Fibonacci(n))
