import math
arr = list(map(int, input().split()))
# arr = [8, 9, 5, 6, 7]
size = len(arr)


def merge(arr, p, q, r):
    L = arr[p:q+1]
    R = arr[q + 1:r + 1]
    L.append(float('inf'))
    R.append(float('inf'))
    i = j = 0
    for k in range(p, r + 1):
        if L[i] < R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1


def mergesort(arr, p, r):
    if p < r:
        q = math.floor((p + r) / 2)
        mergesort(arr, p, q)
        mergesort(arr, q + 1, r)
        merge(arr, p, q, r)


mergesort(arr, 0, size-1)
print(*arr)
