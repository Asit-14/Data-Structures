public class firstindex {

    public static  int firstIndex(int[]arr, int si , int data){
        if(si == arr.length){
            return-1;
        }
        if(arr[si]== data){
            return si;
        }
        return firstIndex(arr, si+1, data);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 5;
        System.out.println(firstIndex(arr, 0, x));
    }
}