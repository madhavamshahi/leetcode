
/*
Question 


Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n))

*/



class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        
        vector<int> combined(nums1.size()+nums2.size());
        
        int j=0;
        
        for(int i=0;i<nums1.size()+nums2.size(); i++){
            
            
            if(i<nums1.size()){
                
                combined[i]=nums1[i];
            }else{
        combined[i]=nums2[j++];

                
            }
            
        }
        
        
        
        
        sort(combined.begin(), combined.end());
        
        
        int n=nums1.size()+nums2.size();
        
        int a;
        int b;
        if(n%2==0){
            
            
            a=(n/2);//2
            
             b=a;
            
            int v1=combined[a-1];
                        int v2=combined[b];

            for(int i=0;i<n;i++){
                
                
                cout<<combined[i]<<endl;
            }
            

            return (v1+v2)/(double)2;
                
            
            
        }else{
            
            
             a=((n+1)/2);
            
        
            
            int v=combined[a-1];
            return v;
            
            
        }
        
        
        
        
        
        
        
        
        
    }
};