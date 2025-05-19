#include<bits/stdc++.h>

using namespace std;

struct TreeNode {

int val;

TreeNode* left;

TreeNode* right;

TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

};

void insert(TreeNode*& root, int val) {

if (!root) {

root = new TreeNode(val);

return;

}

if (val < root->val)

insert(root->left, val);

else

insert(root->right, val);

}

void inOrder(TreeNode* root, vector<int>& result) { if (!root) return;

inOrder(root->left, result);

result.push_back(root->val);

inOrder(root->right, result);

}

vector<int> bstSort(vector<int>& nums) {

TreeNode* root = nullptr;

for (int num : nums 
insert(root, num);

vector<int> sorted;

inOrder(root, sorted);

return sorted;

}



int main() {

cout<< "Enter the Size of the Array : ";

int n;

cin>>n;

vector<int> nums (n) ;

cout<<endl<< "Enter  Array Elements: ";

for(auto &i:nums)cin>>i;

nums = bstSort(nums);

cout<<endl<< "Array after BST sort : ";

for (int num : nums)

cout << num << " ";

cout << endl;

}
