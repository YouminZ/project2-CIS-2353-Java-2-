import java.util.Scanner;

/**
 * Main Demo to check if line is proper or not this program also
 * matches the correct parenthesis, brackets, and curly brackets
 * ex. [] {} () is proper
 * ex. [] {} (] is not proper
 *
 *
 * Created by Youmin Zheng on 11/2/2016.
 * CIS 2353
 * Fall 2016
 * Prof. John P. Baugh
 */

public class Main {

    private static LLInterfaceAdapter<Integer> BracketStack;
    private static LLInterfaceAdapter<Integer> ParenStack;
    private static LLInterfaceAdapter<Integer> CurlyStack;

    public static void main(String[] args) {

        BracketStack = new LLInterfaceAdapter<Integer>();
        ParenStack = new LLInterfaceAdapter<Integer>();
        CurlyStack = new LLInterfaceAdapter<Integer>();


        Scanner keyboard = new Scanner(System.in);      //scanner object to record input

        System.out.println("Please input a set of parentheses");
        String line = keyboard.nextLine();

        //String line = "()(())(()) [][[]][[]] {}{{}}{{}}";

        for(int i = 0; i <= line.length()-1; i++){

            char proper = line.charAt(i);               //holds the character at index i

            //if right bracket, curly, or parentheses is encountered and their associated list is empty
            if( (proper == ']' && BracketStack.isEmpty()) || (proper == '}' && CurlyStack.isEmpty()) || (proper == ')' && ParenStack.isEmpty()) ){
                switchPop(proper);
                break;
            }
            //if its last character in the string and a open bracket, curly, or parentheses is encountered
            else if(i == line.length()-1 && (proper == '[' || proper == '{' || proper == '(')){
                switchPush(proper);
                printResult();
            }
            //if its last character in the string and a close bracket, curly, or parentheses is encountered
            else if(i == line.length()-1 && (proper == ']' || proper == '}' || proper == ')')) {
                switchPop(proper);
                printResult();
            }
            else if(proper == '[' || proper == '{' || proper == '('){
                switchPush(proper);
            }
            else if(proper == ']' || proper == '}' || proper == ')'){
                switchPop(proper);
            }
            else if(i == line.length()-1){
                printResult();
            }
            else{
                continue;
            }
        }//end for loop
    }//end main

    private static void switchPop(char proper){
        switch (proper){
            case ']': BracketStack.pop(); break;
            case '}': CurlyStack.pop(); break;
            case ')': ParenStack.pop(); break;
            default: break;
        }
    }//end switchPop Utility

    private static void switchPush(char proper){
        switch (proper){
            case '[': BracketStack.push(1); break;
            case '{': CurlyStack.push(1); break;
            case '(': ParenStack.push(1); break;
            default: break;
        }
    }//end switchPush Utility

    private static void printResult(){
        if(BracketStack.isEmpty() && CurlyStack.isEmpty() && ParenStack.isEmpty()){
            System.out.println("Input is well-formed");
        }
        else{
            System.out.println("Sorry, input is NOT well-formed");
        }
    }//end printResult Utility

}
