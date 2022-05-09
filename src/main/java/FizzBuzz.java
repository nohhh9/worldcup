public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String out = ""; //접미사 자동완성 기능  "".var 하면 자동으로 완성됨
            if (i%3==0) { // i%3==0.if
                out += "Fizz";
            }
            if (i%5==0) {out += "Buzz";}
            if (i % 3 != 0 && i % 5 != 0) { // i%3==0.not
                out +=i;
            }
            System.out.println(out);// out.sout
        }
    }
}
