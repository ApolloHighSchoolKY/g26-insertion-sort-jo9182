
public class AInsertionSort
{

    public static void main(String[] args)
    {
        Integer myNumbers[] = {0, 15, 6, 8, 2, 37};


        for (int i = 1; i < myNumbers.length; i++) {
            int guide = myNumbers[i];

            // Wowza, didn't know you could do this. Very useful.
            int j;

            for (j = i - 1; j >= 0 && myNumbers[j] > guide; j--) {
                myNumbers[j + 1] = myNumbers[j];
            }

            //Because for some reason my code is allergic to i
            myNumbers[j + 1] = guide;
        }

        //Was there a different way to do this? 
        for(int num : myNumbers)
            System.out.println(num);
        }
    }
