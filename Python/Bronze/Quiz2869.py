import sys

a,b,v = map(int, sys.stdin.readline().split())
day = 0
if (v-b)%(a-b) == 0:
    day = (v-b)//(a-b)
else:
    day = (v-b)//(a-b)+1
print(day)