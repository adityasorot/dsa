arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
size1 = len(arr1)
size2 = len(arr2)
carry = 0
ans = [0] * (size1+1)
for i in range(size1):
    temp = carry + arr1[i] + arr2[i]
    ans[i] = temp % 2
    if temp >= 2:
        carry = 1
    else:
        carry = 0
ans[-1] = carry
print(*ans[::-1])
