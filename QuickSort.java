public class QuickSort {
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int x=partition(arr, si, ei);
        quickSort(arr, si, x-1);
        quickSort(arr, x+1, ei);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
