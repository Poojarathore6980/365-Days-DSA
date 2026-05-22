
 static int c=0;
static int ans=0;
  static int kSmallest(Node root, int k) {
    c=0;
      solve(root,k);
      return ans;
  }
static void solve(Node root,int k){
    if(root==null){
        return ;
    }
    solve(root.left,k);
    c++;
    if(c==k){
        ans=root.data;
        return;
    }
    solve(root.right,k);
}