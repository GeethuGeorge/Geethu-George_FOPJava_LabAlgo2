package com.GL.Denominations.Lab2;

public class MergeSortImplementation {
	
//merge
public void merge(int ar[],int left,int mid,int right) {
	//size of two sub array
	int n1=mid-left+1;
	int n2=right-mid;
	
	// create 2 temp arrays
	 int leftAr[]=new int[n1];
	  int rightAr[]=new int[n2];
	
	  for(int i=0;i<n1;i++) {
			leftAr[i]=ar[left+i];
		}
	 for(int j=0;j<n2;j++) {
	 rightAr[j]=ar[mid+1+j];
		}
	 
	 int i=0;
		int j=0;
		int k=left;//first index of the merged array
		while(i<n1 && j<n2) {
			if(leftAr[i]>= rightAr[j]) {
				ar[k]=leftAr[i];
				i++;
			}else {
				ar[k]=rightAr[j];
				j++;
			}k++;
		}while(i<n1) {
			ar[k]=leftAr[i];
			i++;
			k++;
		}while(j<n2) {
			ar[k]=rightAr[j];
			j++;
			k++;
        }
}
		//sort the array from left to right
		public void sort(int notes[],int left,int right) {
			if(left<right) {
				int mid=(left+right)/2;
				sort(notes,left,mid);
				sort(notes,mid+1,right);
				merge(notes,left,mid,right);
			}
}
}
