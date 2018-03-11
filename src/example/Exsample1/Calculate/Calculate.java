package example.Exsample1.Calculate;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate");
        String[] arg = {"1", "2"};
//
        int x = 3, y = 3;
        x = x++ + ++x; //8
        System.out.println(x);
        y = --y - y--; // 0
        System.out.println(y);
//
        int i = 1;
        i = i++ + ((i > 2) ? i++ : (i++ * i++)) + i++; // 1+(2*3)+4=11
        System.out.println(i);
        i = 2;
        i = i++ + ((i > 2) ? i++ : (i++ * i++)) + i++;//2+3+4=9
        System.out.println(i);
//
        System.out.println("Sum:" + sum(arg));
    }

    private static Integer sum(String[] arg) {
        return Integer.parseInt(arg[0])+ Integer.parseInt(arg[1]);
    }

    private static Integer subtr(String[] arg){
        return Integer.parseInt(arg[0]) - Integer.parseInt(arg[1]);
    }

    private static Integer mult(String[] arg){
        return Integer.parseInt(arg[0]) * Integer.parseInt(arg[1]);
    }
    private static double div(String[] arg){
        return Integer.parseInt(arg[0]) / Integer.parseInt(arg[1]);
    }
    private static Double pow(String[] arg){
        return Math.pow(Double.parseDouble(arg[0]) , Double.parseDouble(arg[1]));
    }

}
