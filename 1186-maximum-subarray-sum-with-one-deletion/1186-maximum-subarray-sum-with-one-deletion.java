class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];

        for(int i=1; i<arr.length; i++){
            int previous_nodelete = nodelete;
            int previous_onedelete = onedelete;

            nodelete = Math.max(nodelete+arr[i], arr[i]);
            
            int v2;
            if(previous_onedelete == Integer.MIN_VALUE){
                v2 = arr[i];
            }else{
                v2 = previous_onedelete + arr[i];
            }
            onedelete = Math.max(v2, previous_nodelete);

            res = Math.max(res, Math.max(onedelete, nodelete)); 
        }
        return res;
    }
}