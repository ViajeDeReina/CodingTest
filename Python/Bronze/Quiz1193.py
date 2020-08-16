n = 0
i, j = 1, 1
sum = 0
x = int(input())

while sum < x:
    n +=1
    sum += n

if n%2 == 0:
    j = sum - x+1
    i = n+1-j
else:
    i = sum-x+1
    j = n+1-i

print(str(i)+"/"+str(j))