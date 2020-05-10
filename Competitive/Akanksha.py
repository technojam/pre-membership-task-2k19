matrix={}
def member(a):
    x,y=a
    if a not in matrix:
        matrix[a]=0
    if matrix[a]>=4:
        matrix[a]=1
        member((x+1,y))
        member((x-1,y))
        member((x,y+1))
        member((x,y-1))
    else:
        matrix[a]+=1
def add_input(x,y,n):
    matrix[(x,y)]=n
print("Enter x ,y and number of persons:")    
while True:
    c=input("Add input? [y]/n: ")
    if c=='y':
        x=int(input("enter x: "))
        y=int(input("enter y: "))
        print("enter number of persons in ({},{}): ".format(x,y))
        n=int(input())
        add_input(x,y,n)

    elif c=='n':
        break
    else:
        print("wrong input")
        continue
print("enter the x,y to add 1 more person")
x=int(input("enter x "))
y=int(input("enter y "))
member((x,y))
print("answer")
print(matrix)
