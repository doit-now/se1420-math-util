/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author giao-lang
 */
public class MathUtility {
    //ta sẽ làm class MathUtility giống y chang thiết kế của class Math
    //Math là class tiện ích 
    public static final double PI = 3.1415;
    
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        if (n == 0 || n == 1)
//            return 1; //đặc biệt, return luôn
//        
//        //đứa nào viết else ở đây, trừ điểm
//        //mặc nhiên CPU đến đc đây là hiểu rằng n = 2..20
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //viết hàm đệ quy cho pro
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        if (n == 0 || n == 1)
            return 1; //đk dừng
        
        return n * getFactorial(n - 1); //đệ quy đó em
        //gọi lại chính hàm của mình với quy mô khác, n - 1
        //đi mãi sẽ về 1
        
    }
    //5! = 5 * 4!;  4! = 4 * 3!; 3! = 3 * 2!, 2! = 2 * 1!
    //1! = 1, đệ quy là gọi lại mình với quy mô nhỏ hơn
    //kết luận: n! = n * (n - 1)!
    //phải có dừng, ko thì lặp vô tận
    
    
}
