import java.util.*;
public class ForAllPatterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col=0;

        //F pattern...
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                if(row==0 || col==0 || row==n/2)
//                {
//                    System.out.print("*");
//                }
//            }
//        }

        //Square Pattern...
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                if(col==0 || col==n-1 || row==0 || row==n-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//        }

        //H Pattern
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                if(col==0 || col==n-1 || row==n/2)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//        }

        //I pattern...
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                if(col==n/2 || row==0 || row==n-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//        }

        //L Pattern
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                if(col==0 || row==n-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//        }

        //N pattern
//        for(row=0;row<n;row++,System.out.println())
//        {
//            for(col=0;col<n;col++)
//            {
//                //if (col == 0 || col == n - 1 || row+col ==n-1)  //Reverse N
//                if(col == 0 || row==col || col == n-1)            //Usual N
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//        }

        //P Pattern    incomplete
        for(row=0;row<n;row++,System.out.println())
        {
            for(col=0;col<n;col++)
            {
                if(row==0 || col==0 || row==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }
}
