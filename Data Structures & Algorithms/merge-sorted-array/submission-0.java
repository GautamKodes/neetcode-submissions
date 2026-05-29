class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length-1;
        int len2 = nums2.length-1;
        int main = len1 - len2;
        int maincount = 0;
        if (len2<0){
        } else if (len2>=0){
            int j =0;
            for (int i = 0; i<=len1; i++){
                if (j>len2){
                    break;
                }
                else if (nums2[j] <= nums1[i] && maincount <= main){
                    for (int k = len1; k>i; k--){
                        nums1[k] = nums1[k-1];
                    }
                    nums1[i] = nums2[j];
                    j = j +1;
                    maincount = maincount -1;
                } else if(maincount >= main){
                    nums1[i] = nums2[j];
                    j = j+1;
                }
                maincount = maincount +1;
            }
        }
    }
}