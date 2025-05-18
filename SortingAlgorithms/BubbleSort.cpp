#include<bits/stdc++.h>
using namespace std;

void bubbleSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }
}

int main() {
    cout << "Enter the Size of the Array: ";
    int n;
    cin >> n;
    vector<int> arr(n);
    cout << endl << "Enter Array Elements: ";
    for (auto &i : arr) cin >> i;

    bubbleSort(arr);
    cout << endl << "Array after Bubble Sort: ";
    for (int num : arr)
        cout << num << " ";
    cout << endl;
}
