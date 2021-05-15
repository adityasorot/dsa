#include <bits/stdc++.h>
using namespace std;
void binarySum(int arr1[], int arr2[], int size)
{
    int ans[size + 1], temp, carry = 0;
    for (int i = 0; i < size; i++)
    {
        temp = carry + arr1[i] + arr2[i];
        ans[i] = temp % 2;
        if (temp >= 2)
            carry = 1;
        else
            carry = 0;
    }
    ans[size] = carry;
    for (int i = size; i >= 0; i--)
    {
        cout << ans[i] << ' ';
    }
}
int main()
{
    int size, i, *p;
    cin >> size;
    int arr1[size], arr2[size];
    for (i = 0; i < size; i++)
    {
        cin >> arr1[i];
    }
    for (i = 0; i < size; i++)
    {
        cin >> arr2[i];
    }
    binarySum(arr1, arr2, size);
    return 0;
}