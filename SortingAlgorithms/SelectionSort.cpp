#include<bits/stdc++.h>
using namespace std;

void selectionSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx])
                minIdx = j;
        }
        swap(arr[i], arr[minIdx]);
    }
}

int main() {
    cout << "Enter the Size of the Array: ";
    int n;
    cin >> n;
    vector<int> arr(n);
    cout << endl << "Enter Array Elements: ";
    for (auto &i : arr) cin >> i;

    selectionSort(arr);
    cout << endl << "Array after Selection Sort: ";
    for (int num : arr)
        cout << num << " ";
    cout << endl;
}
