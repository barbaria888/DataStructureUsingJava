import java.util.Arrays;

class anagram{
    //find if both string contain the same characters frequency or not
    public static boolean anagram(String str1,String str2)
    {

        if(str1.length()!=str2.length())return false;

        boolean flag=true;

        int [] freq1 =new int[123];
        int [] freq2 =new int[123];

        for(int i=0;i<str1.length();i++)
        {
            if((str1.charAt(i)<='A')&&(str1.charAt(i)>=122))return false;
            freq1[ str1.charAt(i) - 'A' ]++;
        }
        for(int i=0;i<str2.length();i++)
        {if((str2.charAt(i)<='A')&&(str2.charAt(i)>=122))return false;
            freq2[ str2.charAt(i) - 'A' ]++;
        }
        int j=0;
        while(freq1[j]==freq2[j]&&(j< freq1.length-1))
        {
            flag =true;
            j++;
        }
return flag;
    }
    public static boolean AtleastOnceAllCharacter(String str1,String str2)
    {
        boolean flag=true;
        if(str1.length()!=str2.length())return false;
        int [] freq1 =new int[57];
        for(int i=0;i<str1.length();i++)
        {
            if((str2.charAt(i)<='A')&&(str2.charAt(i)>=122))return false;
            freq1[ str1.charAt(i) - 'A' ]++;
        }
        int j=0;
        while(freq1[j]>=1)
        {
            flag =true;
            j++;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(anagram("rat","car"));


    }
}