### Code:
~~~
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int number) {

        int temp=number;
        int rem,sum=0;
        while (temp>0)
        {
            rem=temp%10;
            temp=temp/10;
            sum=sum+rem;
            
        }
        if (number%sum==0){
            return sum;
        }
        else {
            return -1;
        }
    }
}
~~~
