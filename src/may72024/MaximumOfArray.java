package may72024;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{50,55,30,40,65,80,60,70};

        int max = Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max)
                max = num;
        }

        System.out.println("Maximum:"+max);
    }
}
