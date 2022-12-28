# list comprehensions
n=int(input())
m=int(input())
o=int(input())
kl=int(input())
arr=[]
for i in range(n+1):
    for j in range(m+1):
        for k in range(o+1):
            if((i+j+k)!=kl):
                arr.append([i,j,k])
print(arr)



