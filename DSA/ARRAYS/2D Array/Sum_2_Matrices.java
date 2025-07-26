package Two_D_Arrays;

public class Sum_2_Matrices
{

    public static void main(String[] args) 
    {

        int[][] a = {
        					{1, 2, 3, 4},
        					{5, 6, 7, 8},
        					{9, 10, 11, 12},
        					{13, 14, 15, 16}
        				};	

        int[][] b = {
        					{1, 2, 3, 4},
        					{5, 6, 7, 8},
        					{9, 10, 11, 12},
        					{13, 14, 15, 16}
        				};

        if (a.length == b.length)
        {
            int i;
            for (i = 0; i < a.length; i++) 
            {
                if (a[i].length != b[i].length)
                {
                    break;
                }
            }

            if (i == a.length) 
            {
                int[][] c = new int[a.length][a[0].length];

                for (int l = 0; l < a.length; l++) 
                {
                    for (int j = 0; j < a[l].length; j++) 
                    {
                        c[l][j] = a[l][j] + b[l][j];
                    }
                    
                }

                System.out.println("The added new 2D array is:");
                for (int k = 0; k < c.length; k++) 
                {
                    for (int m = 0; m < c[k].length; m++) 
                    {
                        System.out.print(c[k][m] + " ");
                        
                    }
                    System.out.println(); 
                }
            } 
            else 
            {
                System.out.println("Matrix dimensions don't match.");
            }
        } 
        else 
        {
            System.out.println("Matrix row counts don't match.");
        }
    }
}
