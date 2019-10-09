# Question 0: Understand the pattern
# and write the code accordingly.

# Answer 0: Rangoli Pattern Problem

import string
akhil = string.ascii_lowercase

n = int(input())
L = []
for i in range(n):
    s = "-".join(akhil[i:n])
    L.append((s[::-1]+s[1:]).center(4*n-3, "-"))
print('\n'.join(L[:0:-1]+L))


# Question 1: Understand the pattern 
# and write the code accordingly.

# Answer 1: Pattern Printing Problem

n=int(input())
count1=1
count2=1
value=[]
value1=[]
p=1
outer=n
while(outer>0):
	value1=[]
	value=[]
	q=((outer*outer)+p)
	if(n-outer>0):
		a=2*(n-outer)
		for i in range(a):
			value.append('*')
	while(count1<outer+1):
		value1.append(p)
		p+=1
		count1+=1
 
	while(count2<outer+1):
		value1.append(q)
		q+=1
		count2+=1
 
	print(*value, sep='',end='')	
	print(*value1, sep='0',end='\n')	
	outer-=1
	count1=1
	count2=1

# Question 2: Write a function which takes n
# as input and returns the
# corresponding nth fibonacci number.

# Answer 2: 

def memoize(func):
    memo = dict()
    def decorated(n):
        if n not in memo:
            memo[n] = func(n)
        return memo[n]

    return decorated

@memoize
def fib(n):
    global call_count
    call_count = call_count + 1
    if n<=1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

call_count = 0
for i in range(1000):
    print(fib(i))
print(call_count)
