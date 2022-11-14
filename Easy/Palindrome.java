
// Given an integer x, return true if x is a palindrome, and false otherwise.

import java.util.Scanner;

class Sol {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isPalindrome(n);
    }
    static boolean isPalindrome(int n) {
        int rem ,sum=0,temp=n;
        while(n>0){
            rem = n % 10;
            sum = (sum*10)+rem;
            n /=10;

        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }

}

