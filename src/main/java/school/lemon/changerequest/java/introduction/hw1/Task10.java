package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        int i;
        {
            do {

                i = n % 10;
                if (i==2)  return true;
                n=n/10;

            }
            while (n < 1);


        }

       return false;
    }
}
