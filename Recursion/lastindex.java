public class lastindex {
    public static int LastIndex(int arr[], int si , int data){
        if(si == arr.length){
            return -1;
        }
        int index = LastIndex(arr, si+1, data);
        if(index == -1 ){
            if(arr[si] == data){
                return si;
            }else{
                return -1;
            }

        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 5;
        System.out.println(LastIndex(arr, 0, x));
    }
}
