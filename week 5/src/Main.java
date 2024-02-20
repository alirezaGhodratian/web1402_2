import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       //tamrin_1();
       //tamrin_2();
       // tamrin_3();
        //tamrin_4();
        //tamrin_5();

    }
    public static void tamrin_1 ()
    {
        int [] nums =new int[100];
        Scanner S = new Scanner(System.in);
        int c_zoj=0;
        int c_manfi=0;
        int c_def=0;

        for (int i = 0; i <nums.length ; i++)
        {
            System.out.println("pleas add num " +(i+1));
          nums[i]=Integer.valueOf(S.nextLine());


           if(nums[i]<0)
              c_manfi++;
           else if(nums[i]%2==0)
                c_zoj++;
          else
              c_def++;

        }
        int [] zoj=new int[c_zoj];
        int [] manfi=new int[c_manfi];
        int [] defult =new int[c_def];

        int count1=0;
        int count2=0;
        int count3=0;

        for (int i = 0; i < nums.length; i++)
        {


             if(nums[i]<0)
            {
                manfi[count2]=nums[i];
                count2++;
            }
            else if(nums[i]%2==0)
            {
                zoj[count1]=nums[i];
                count1++;
            }
            else
            {
                defult[count3]= nums[i];
                count3++;
            }

        }
        int counter=0;
        for (int i = 0; i <zoj.length ; i++)
        {
            nums[counter++]=zoj[i];
        }
        for (int i = 0; i <defult.length ; i++)
        {
            nums[counter++]=defult[i];
        }
        for (int i = 0; i <manfi.length ; i++)
        {
            nums[counter++]=manfi[i];
        }

        System.out.println(Arrays.toString(nums));





    }

    public static void tamrin_2 ()
    {
        int sum=0;
      int nums []=new int[100];
      Scanner S =new Scanner(System.in);
        for (int i = 0; i <nums.length ; i++)
        {
            System.out.println("pleas add num " + (i + 1));
            nums[i] = Integer.valueOf(S.nextLine());


        }
        System.out.println("pleas add  a num for compare in sum");
        int finall =Integer.valueOf(S.nextLine());

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                if (j==i)
                    continue;
                for (int k = j; k < nums.length; k++)
                {
                    if (k==i || k==j)
                        continue;
                    for (int l = k; l < nums.length; l++)
                    {
                        if(l==i || l==j || l==k)
                            continue;
                       if( nums[i]+nums[j]+nums[k]+nums[l]==finall)
                           System.out.println( nums[i]+"+"+nums[j]+"+"+nums[k]+"+"+nums[l]+"=="+finall);

                    }

                }

            }
        }

       // اگر حالت های بیشتری بخواهیم که در آن با تغییر جایگاه هر یک از چهار عدد حالت جدیدی ایجاد
       //شود کافی است تمام حلقه ها از صفر شروع شوند اما در این حالت فقط چهار خانه جواب را نشان
       //                                     میدهد نه حالت های چینش مختلف همان چهار عدد تکراری را

    }

    public static void tamrin_3 ()
    {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        int nums []=new int[100];
        Scanner S =new Scanner(System.in);
        for (int i = 0; i <nums.length ; i++)
        {
            System.out.println("pleas add num " + (i + 1));
            nums[i] = Integer.valueOf(S.nextLine());


        }

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]<min1)
            {
                min2=min1;
                 min1=nums[i];
            }
            if(min1<nums[i] && min2>nums[i])
            {
                min2=nums[i];

            }
        }
        System.out.println("firs min is : "+min1+" and second min is : "+min2);


    }

    public static void tamrin_4 ()
    {
        Scanner S =new Scanner(System.in);
        System.out.println("pleas add number of numbers");
        int numArray= Integer.valueOf(S.nextLine());

        int nums []=new int[numArray];

        for (int i = 0; i <nums.length ; i++)
        {
            System.out.println("pleas add num " + (i + 1));
            nums[i] = Integer.valueOf(S.nextLine());

        }

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));



    }

    public static void tamrin_5 ()
    {

        Scanner S = new Scanner(System.in);
        System.out.println("pleas add number of numbers");
        int n = Integer.valueOf(S.nextLine());

        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("pleas add num " + (i + 1));
            nums[i] = Integer.valueOf(S.nextLine());

        }

        Arrays.sort(nums);

        System.out.println("pleas add a number for search");
        int search = Integer.valueOf(S.nextLine());

        int index = n / 2;

        if (search == nums[index])
        {
            System.out.println("we found your num in index : " + index);
        }
        else if (search > nums[index])
        {
            for (int i = index; i < nums.length; i++) {
                if (nums[i] == search) {
                    System.out.println("we found your num in index : " + i);
                }

            }

        }
        else if (search < nums[index])
        {

            for (int i = 0; i < index; i++)
            {
                if (nums[i] == search)
                {
                    System.out.println("we found your num in index : " + i);
                }

            }


        }
        else
        {
            System.out.println("we cant find your number");
        }


        System.out.println(Arrays.toString(nums));

    }

}