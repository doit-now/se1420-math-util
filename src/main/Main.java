/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fu.util.MathUtility;
//câu lệnh từ JDK 8 (5), khai báo sẵn hàm static,
//ở dưới gọi hàm static ko cần chấm, y chang C, chỉ áp dụng cho static
/**
 *
 * @author giao-lang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120; //tớ hy vọng thấy 120 nếu tớ gọi 5!
        long actual = MathUtility.getFactorial(5);
        //in ra kiểm tra sự khớp nhau giữa cái ta muốn và cái ta làm
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);

        //tiếp tục cho các tình huống 6! 7!, 21! -5! 0!....
        //             các tình huống cần phải test ta gọi là test cases
        //về lí thuyết ta phải test hết các tình huống...
        //về thực hành: kì 5 sẽ rõ SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //tao kì vọng mày ném về ngoại lệ, phải là ngoại lệ
        //IllegalArgumentException nếu tao cố tình, người xài hàm
        //này của tao đưa tham số âm, tham số > 20
        System.out.println("expected: IllegalArgumentException: " + MathUtility.getFactorial(-5));
       
        System.out.println("Chúc cuối tuần thứ 9 vui vẻ");
    }

}
