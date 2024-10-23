package String;

public class PercentageCalculation {
    public static void main(String[] args) {
        String s="Hello World! 1234 @Java#2024";
        int upper=0;
        int lower=0;
        int space=0;
        int digit=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                upper++;
            }
            else if(c>='a'&&c<='z'){
                lower++;
            }
            else if(Character.isDigit(c)){
                digit++;
            }
            else if(c==' '){
                space++;
            }
        }
        int total=lower+upper+digit+space;
        double upperPercentage = (double) upper / total * 100;
        double lowerPercentage = (double) lower / total * 100;
        double digitPercentage = (double) digit / total * 100;
        // Print results with formatting
        System.out.printf("Uppercase Percentage: %.2f%%\n", upperPercentage);
        System.out.printf("Lowercase Percentage: %.2f%%\n", lowerPercentage);
        System.out.printf("Digit Percentage: %.2f%%\n", digitPercentage);

    }
}
