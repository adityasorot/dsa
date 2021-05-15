#include <bits/stdc++.h>
using namespace std;

void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << ' ';
    cout << '\n';
}

void merge(int arr[], int p, int q, int r)
{
    int n1 = q - p + 1;
    int n2 = r - q;
    int L[n1 + 1], R[n2 + 1];
    for (int i = 0; i < n1; i++)
    {
        L[i] = arr[p + i];
    }
    for (int i = 0; i < n2; i++)
    {
        R[i] = arr[q + 1 + i];
    }
    L[n1] = INT_MAX;
    R[n2] = INT_MAX;
    int i = 0;
    int j = 0;
    for (int k = p; k < r + 1; k++)
    {
        if (L[i] < R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
    }
}

void mergeSort(int arr[], int p, int r)
{
    if (p < r)
    {
        int q = floor((p + r) / 2);
        mergeSort(arr, p, q);
        mergeSort(arr, q + 1, r);
        merge(arr, p, q, r);
    }
}

int main()
{
    int size = 5;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
        cin >> arr[i];
    mergeSort(arr, 0, size - 1);
    printArray(arr, size);
    return 0;
}