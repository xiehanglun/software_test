package andycpp;

public class Triangle {
    //private static string result; // ��̬���������ڴ洢���н��
    public String triangle(int a,int b, int c) {
       if(a == b && b == c)
       {
    	   return "equilateral";
       }
       else if(a==b || b==c || a==c)
       {
    	   return "isosceles";
       }
       else 
       {
    	   return "scalene";
       }
    }
    
}