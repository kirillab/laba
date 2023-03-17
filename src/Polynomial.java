import java.text.DecimalFormat;
public class Polynomial {
    static int index = 1;
    private int n;
    private int k;
    private int[] pow;
    private Fraction[] coefficients;

    Polynomial(int n, int k, int[] pow){
        this.n = n;
        this.k = k;
        this.pow = pow;

    }
    public void createCoefficients(int n){
        this.coefficients = Fraction.generate(n+1);
    }

    public static Polynomial[] generatePolinoms(int n, int[] pow){
        Polynomial[] polynomials = new Polynomial[n];
        for (int i = 0; i < polynomials.length; i++) {
            polynomials[i] = new Polynomial(n, pow[i], pow);
            polynomials[i].createCoefficients(pow[i]);
        }
        return polynomials;
    }

    public static String[] sumOfPolynomials(Polynomial[] polynomials){
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );

        int maxLength = 1;
        for (Polynomial item:polynomials) {
            if (item.coefficients.length > maxLength){maxLength = item.coefficients.length;}
        }
        double[] reversedArr = new double[maxLength];
        String[] arr = new String[maxLength];
        int itemLength = 0;
        int count = 0;

        for (int i = 0; i < polynomials.length; i++) {

            for (Fraction item:polynomials[i].coefficients) {
                itemLength++;
            }

            for (int j = itemLength - 1; j >= 0; j--) {
                reversedArr[count] += (polynomials[i].coefficients[j].getM()/polynomials[i].coefficients[j].getN());
                count++;
            }
            count = 0;
            itemLength = 0;
        }
        for (int i = reversedArr.length-1; i >= 0; i--) {
            String result = decimalFormat.format(reversedArr[i]);
            arr[count] = result;
            count++;
        }
    return arr;
    }
    private String getMessage() {
        String message = "";
        int k = coefficients.length-1;
        for (int i = 0; i < coefficients.length-1; i++) {

            if (coefficients[i].getM() == 0){
                message += "(" + 0 + ")" + " * " + "x^" + k + " + ";
                k--;
                continue;
            }

            if (i == n-1){message += "(" + coefficients[i].getM() + "/" + coefficients[i].getN() + ")" + " * " + "x^" + k + " + ";}
            else{message += "(" + coefficients[i].getM() + "/" + coefficients[i].getN() + ")" + " * " + "x^" + k + " + ";}
            k--;
            if(k==0){break;}
        }
        int temp = index;
        index++;
        return "Полином #" + temp + ": " + message + "(" + coefficients[coefficients.length-1].getM() + "/" +
                coefficients[coefficients.length-1].getN() + ")";
    }
    @Override
    public String toString(){
        return getMessage();
    }
}

