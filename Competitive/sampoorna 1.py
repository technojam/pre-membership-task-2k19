matrix={}
def change(a):
    x,y=a
    if a not in matrix:
        matrix[a]=0
    if matrix[a]>=4:
        matrix[a]=1
        change((x+1,y))
        change((x-1,y))
        change((x,y+1))
        change((x,y-1))
    else:
        matrix[a]+=1
def add_input(x,y,n):
    matrix[(x,y)]=n
print("First add intial layout of matrix, you will be asked three values x and y cordinates and number of people in (x,y) cordinate n, which should not exceed 4")    
while True:
    c=input("Do you want to add input? [y]/n: ")
    if c=='y':
        x=int(input("enter value of x: "))
        y=int(input("enter value of y: "))
        print("enter number of guys in ({},{}): ".format(x,y))
        n=int(input())
        add_input(x,y,n)
        
    elif c=='n':
        break
    else:
        print("wrong input")
        continue
print("enter the x,y value in which you want to add 1 more person")
x=int(input("enter x "))
y=int(input("enter y "))
change((x,y))
print("answer")
print(matrix)
