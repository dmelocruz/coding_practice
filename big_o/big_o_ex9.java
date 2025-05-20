int sum(Node node){
    if(node == null){
        return 0;
    }
    return node.value + sum(node.left) + sum(node.right);
}

// Time complexity: O(n), where n is the number of nodes in the tree
// 2 branches at each call: 2^depth
// depth ~ log(n)
// therefore, O(n) = O(2^log(n)) = O(n)