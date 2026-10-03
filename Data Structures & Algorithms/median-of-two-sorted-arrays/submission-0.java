class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res[] = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;

        double ans = 0;

        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i];
                i++;
            }else{
                res[k++] = nums2[j];
                j++;
            }
        }

        while( i < n){
            res[k++] = nums1[i];
            i++;
        }
        while( j < m){
            res[k++] = nums2[j];
            j++;
        }

        int len = res.length;
        int mid = len/2;

        if(len % 2 == 0){
            double one = res[mid];
            double two = res[mid-1];
            System.out.println(two+ " --- ");
            ans = (one + two )/2;

        }else{
            ans = res[mid];
        }
        return ans;
    }
}
