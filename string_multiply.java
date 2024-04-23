class sdf{
public static String multiply(String num1, String num2) {
    int n1=0, n2=0;
    int k = 1;
    for (int i = num1.length()-1; i >= 0; i--)
    {if(num1.charAt(0)=='-'){i++;n1=-n1;}
        if(i==0){
            n1 = (num1.charAt(0) - '0') * (10);break;}
        //
        n1 += (num1.charAt(i) - '0') * (10 * k);
        k++;
    }
    int t=0;
    for (int i = num2.length()-1; i >= 0; i--)

    {
        if(i==0)
        {
            n2 = (num2.charAt(0) - '0') ;
            System.out.println(num2.charAt(0));
            break;
        }
        if(num2.charAt(0)=='-')
        {
            i++;n2=-n2;
        }
        System.out.println((num2.charAt(i) - '0'));
        n2 += (num2.charAt(i) - '0') * (10 * t);
        t++;
    }
    Integer ans = n1 * n2;
    return ans.toString();
}

    public static void main(String[] args) {
        System.out.println(   multiply("12","3"));
    }

}