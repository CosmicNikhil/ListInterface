package may72024;

public class SumOfArray
{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int sum = 0;
        for(int num:arr)
        {
            sum += num;
        }

        System.out.println("Sum:"+sum);
    }
}
