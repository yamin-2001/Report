#include<bits/stdc++.h>
using namespace std;

void insertionSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

int main() {
    cout << "Enter the Size of the Array: ";
    int n;
    cin >> n;
    vector<int> arr(n);
    cout << endl << "Enter Array Elements: ";
    for (auto &i : arr) cin >> i;

    insertionSort(arr);
    cout << endl << "Array after Insertion Sort: ";
    for (int num : arr)
        cout << num << " ";
    cout << endl;
}
