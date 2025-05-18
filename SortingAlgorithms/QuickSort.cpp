#include<bits/stdc++.h>
using namespace std;

int partition(vector<int>& arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot)
            swap(arr[++i], arr[j]);
    }
    swap(arr[i + 1], arr[high]);
    return i + 1;
}

void quickSort(vector<int>& arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    cout << "Enter the Size of the Array: ";
    int n;
    cin >> n;
    vector<int> arr(n);
    cout << endl << "Enter Array Elements: ";
    for (auto &i : arr) cin >> i;

    quickSort(arr, 0, n - 1);
    cout << endl << "Array after Quick Sort: ";
    for (int num : arr)
        cout << num << " ";
    cout << endl;
}
