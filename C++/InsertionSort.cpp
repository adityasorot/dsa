#include <bits/stdc++.h>
using namespace std;

void insertionSort(int arr[], int size)
{
    int key, j;
    for (int i = 1; i < size; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size - 1; i++)
    {
        cout << arr[i] << " ";
    }
    cout << arr[i];
}

int main()
{
    int size;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    insertionSort(arr, size);
    printArray(arr, size);
    return 0;
}