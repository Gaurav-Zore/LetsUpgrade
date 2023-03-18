public class Palindrome {

    public static void main(String[] args) {
        
        int rev = 0, num = 12321;
        int temp = num;


        while(temp>0)
        {
            rev = rev*10 + temp % 10;
            temp/=10;
        }
        System.out.println(rev);
        if(num==rev)
    {
        System.out.println(num+" "+"Number is Palindrome.");
    }
    else{
        System.out.println(num+" "+"Number is not Palindrome.");
    }
    }  
}
