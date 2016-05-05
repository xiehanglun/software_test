package andycpp;

public class Triangle {
    //private static string result; // 静态变量，用于存储运行结果
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