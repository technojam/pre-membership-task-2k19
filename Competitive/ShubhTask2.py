def fib(n):
    
    fibs = [0, 1]
    for i in range(2, n+1):
        fibs.append(fibs[-1] + fibs[-2])
    return fibs

print(fib(100))
print("100th element of fibonacci series is ",fib(100)[100])
