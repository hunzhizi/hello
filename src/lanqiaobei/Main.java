package lanqiaobei;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(13);
    }
}




//    int i = scanner.nextInt();
//        switch (i){
//                case 0:
//                System.out.print(1);
//                return;
//                case 1:
//                System.out.print(5);
//                return;
//                case 2:
//                System.out.print(10);
//                return;
//                case 3:
//                System.out.print(15);
//                return;
//                case 4:
//                System.out.print(20);
//                return;
//
//                }
////        1:1,2:2,3:6,4:24,5:120,6:720,7:5040,8:40320,9:362880,10:3628800,11:39916800,12:479001600,13:6227020800,14:87178291200,15:1307674368000,16:20922789888000,17:355687428096000,18:6402373705728000,19:121645100408832000,20:2432902008176640000,
//                int j = 19;
//                while(true){
//                BigInteger bigInteger = jieChent(j);
//                String s = bigInteger.toString();
//                String substring = s.substring(s.length() - i, s.length());
//                char[] chars = substring.toCharArray();
//                boolean flag = true;
//                for (char aChar : chars) {
//                if(aChar!='0'){
//                flag = false;
//                break;
//                }
//                }
//                if(flag){
//                System.out.print(j);
//                return;
//                }
//
//                j++;
//                }
//
//                }
//public static BigInteger jieChent(int i){
//        BigInteger bigInteger = new BigInteger("1");
//        for (int j = 1; j <= i; j++) {
//        bigInteger  = bigInteger.multiply(new BigInteger(String.valueOf(j)));
//
//        }
//        return bigInteger;

//D
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        int[] scores = new int[i];
//        for (int i1 = 0; i1 < scores.length; i1++) {
//            scores[i1] = scanner.nextInt();
//        }
//        int[] ints = Arrays.copyOf(scores, scores.length);
//        Arrays.sort(ints);
//        if(i%2==0){
//            int anInt = ints[(i) / 2];
//            for (int score : scores) {
//                if(score < anInt){
//                    System.out.print(anInt-score + " ");
//                }else{
//                    System.out.print(0+ " ");
//                }
//            }
//        }else{
//            int anInt = ints[i / 2];
//            for (int score : scores) {
//                if(score>=anInt){
//                    System.out.print(0+ " ");
//                }else{
//                    System.out.print(anInt + 1 - score + " ");
//                }
//            }
//        }
//    }



//    //        间 [2022, 2022222022]
//    int count = 0;
//        for (int i = 2022; i <= 2022222022; i++) {
//        if (isHuiWen(i)) {
//            count++;
//            System.out.println(i);
//        }
//    }
////        System.out.println(isHuiWen(123434321));
//        System.out.println(count);
//
//
//    public static boolean isHuiWen(int i) {
//        String s = Integer.toString(i);
//        char[] chars = s.toCharArray();
//        for (int i1 = 0; i1 < (chars.length + 1) / 2; i1++) {
//            if (!(chars[i1] == chars[chars.length - 1 - i1])) {
//                return false;
//            }
//            if (i1 != 0) {
//                if (chars[i1] < chars[i1 - 1]) {
//                    return false;
//                }
//
//            }
//
//        }
//        //is increase?
//
//        return true;
//    }
