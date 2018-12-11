package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }


    /**
     *
     * @param number Number to check
     * @return Returns true if number is greater than 0 and is odd
     */
    private static boolean isOdd(int number)
    {
        return (number > 0 && number % 2 == 1);

    }

    /**
     * Receives range of numbers as parameters.
     * Prints -1 if end of range is equal or less than start of range,
     * or if end of range is less than 0.
     *
     * If range is ok, Iterates through it, calling function
     * isOdd to check if current number is odd.
     * If it is, adds it to a sum.
     *
     * @param start Start of range.
     * @param end End of range.
     * @return sum Sum of all odd numbers in the selected range.
     */
    private static int sumOdd(int start, int end)
    {
        int sum=0;

        if((end>=start) && (start>0) && (end>0))
        {
            for(int i = start;i<=end;i++)
            {
                if (isOdd(i))
                {
                    sum+=i;

                }
            }
            return sum;
        }
        else
        {
            return -1;
        }


    }



}
