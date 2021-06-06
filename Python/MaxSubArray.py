import math

arr = list(map(int, input().split()))
size = len(arr)


def maxCrossingSubarray(arr, low, mid, high):
    leftSum = float('-inf')
    sum = 0
    for i in range(mid, low - 1, -1):
        sum += arr[i]
        if sum > leftSum:
            leftSum = sum
            maxLeft = i
    rightSum = float('-inf')
    sum = 0
    for i in range(mid + 1, high + 1):
        sum += arr[i]
        if sum > rightSum:
            rightSum = sum
            maxRight = i
    return (maxLeft, maxRight, leftSum + rightSum)


def maxSubArray(arr, low, high):
    if low == high:
        return (low, high, arr[low])
    else:
        mid = math.floor((low + high) / 2)
        (leftLow, leftHigh, leftSum) = maxSubArray(arr, low, mid)
        (rightLow, rightHigh, rightSum) = maxSubArray(arr, mid + 1, high)
        (crossLow, crossHigh,
         crossSum) = maxCrossingSubarray(arr, low, mid, high)
        if (leftSum >= rightSum) and (leftSum >= crossSum):
            return (leftLow, leftHigh, leftSum)
        elif (rightSum >= crossSum) and (rightSum >= leftSum):
            return (rightLow, rightHigh, rightSum)
        else:
            return (crossLow, crossHigh, crossSum)


newArr = []
for i in range(size - 1):
    newArr.append(arr[i + 1] - arr[i])
print(newArr)

dayBuy, daySell, amt = maxSubArray(newArr, 0, size - 2)
print({dayBuy + 1})
print({daySell + 1})
print({amt})
# 13 -3 -25 20 -3 -16 -23 18 20 -7 12 -5 -22 15 -4 7
