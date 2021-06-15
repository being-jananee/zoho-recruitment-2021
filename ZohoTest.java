import java.util.Scanner;

public class ZohoTest {
    public static void main(String[] args) {
                String input =new Scanner(System.in).nextLine();
                String output="";
                int inputLength =input.length(), outputLength = output.length(),middle = inputLength/2;
                while(inputLength>outputLength){
                    output += input.charAt(middle++);
                    outputLength ++;
                    for(int i=0;i<inputLength-outputLength;i++)
                        System.out.print(" ");
                    System.out.println(output);
                    middle %= inputLength;
                }
    }
}
