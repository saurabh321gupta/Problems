import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static int[] solution(int[][] m) {
        m = new int[][]{{0, 1, 0, 0, 0, 1}, {4, 0, 0, 3, 2, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        int numberOfTerminals = 0;
        int n = m[0].length;
        int stateMapping[] = new int[n];
        int pos = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        mainLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                if (m[i][j] != 0) {
                    continue mainLoop;
                }
            }
            map.put(i, true);
            numberOfTerminals++;
            stateMapping[pos++] = i;
        }
        for (int i = 0; i < n; i++) {
            if (map.get(i) == null) {
                stateMapping[pos++] = i;
            }
        }

        Fraction[][] arr = new Fraction[n][n];
        mainLoop:
        for (int i = 0; i < numberOfTerminals; i++) {
            for (int j = 0; j < n; j++) {
                Fraction obj;
                if (i == j) {
                    obj = new Fraction(1, 1);
                } else {
                    obj = new Fraction(0, 1);
                }
                arr[i][j] = obj;
            }
        }

        for (int i = numberOfTerminals; i < n; i++) {
            int x [] = m[stateMapping[i]];
            int denr = getSum(x);
            for (int j = 0; j < n; j++) {
                Fraction obj = new Fraction(x[stateMapping[j]], denr);
                arr[i][j] = obj;
            }
        }

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j].toString() + "      ");
            }
            System.out.println();
        }

        Fraction[][] iMinusQ = getIMinusQ(arr, numberOfTerminals, n);

        return null;
    }

    private static Fraction[][] getIMinusQ(Fraction[][] arr, int numberOfTerminals, int n) {
        int size = n - numberOfTerminals;
        Fraction result[][] = new Fraction[size][size];
        for (int i = 0; i<size;i++){
            for(int j=0;j<size;j++){
                Fraction element = arr[i+numberOfTerminals][j+numberOfTerminals];
                if(i==j){
                   result[i][j]  = new Fraction(1,1).subtract(element);
                }else{
                    result[i][j]  = new Fraction(0,1).subtract(element);
                }
            }
        }
            return result;
    }

    public static double[][] invert(double a[][])
    {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i)
            b[i][i] = 1;

        // Transform the matrix into an upper triangle
        gaussian(a, index);

        // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k]
                            -= a[index[j]][i]*b[index[i]][k];

        // Perform backward substitutions
        for (int i=0; i<n; ++i)
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j)
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k)
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.

    public static void gaussian(double a[][], int index[])
    {
        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i=0; i<n; ++i)
            index[i] = i;

        // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i)
        {
            double c1 = 0;
            for (int j=0; j<n; ++j)
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }

        // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j)
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i)
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1)
                {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i)
            {
                double pj = a[index[i]][j]/a[index[j]][j];

                // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

                // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }


    public static int getSum(int[] x){
        int count=0;
        for(int y : x){
            count+=y;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution2.solution(new int[2][2]);
    }
}

class Fraction {

    int numerator;
    int denominator;

    /**
     * Constructor
     *
     * @param numr
     * @param denr
     */
    public Fraction(int numr, int denr) {
        numerator = numr;
        denominator = denr;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Calculates gcd of two numbers
     *
     * @param numerator
     * @param denominator
     * @return
     */
    public int calculateGCD(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return denominator;
        }
        return calculateGCD(denominator, numerator % denominator);
    }

    /**
     * Reduce the fraction to lowest form
     */
    void reduce() {
        int gcd = calculateGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if(denominator<0 && numerator>0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    /**
     * Adds two fractions
     *
     * @param fractionTwo
     * @return
     */
    public Fraction add(Fraction fractionTwo) {
        int numer = (numerator * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * denominator);
        int denr = denominator * fractionTwo.getDenominator();
        return new Fraction(numer, denr);
    }

    /**
     * Subtracts two fractions
     *
     * @param fractionTwo
     * @return
     */
    public Fraction subtract(Fraction fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) -
                (fractionTwo.numerator * denominator);
        int newDenominator = denominator * fractionTwo.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    /**
     * Multiples two functions
     *
     * @param fractionTwo
     * @return
     */
    public Fraction multiply(Fraction fractionTwo) {
        int newNumerator = numerator * fractionTwo.numerator;
        int newDenominator = denominator * fractionTwo.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    /**
     * Divides two fractions
     *
     * @param fractionTwo
     * @return
     */
    public Fraction divide(Fraction fractionTwo) {
        int newNumerator = numerator * fractionTwo.getDenominator();
        int newDenominator = denominator * fractionTwo.numerator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    /**
     * Returns string representation of the fraction
     */
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}