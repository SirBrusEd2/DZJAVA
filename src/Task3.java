public class Task3 {
    public void hometask2(){
        double x, y, z, u, u1, u2;
        x = -4.5;
        y = 0.75e-4;
        z = 0.845e2;
        u = (Math.pow(8 + Math.pow(x-y,2) + 1,1/3.))/(Math.pow(x,2) + Math.pow(y,2) + 2);
        u1 = (Math.exp(Math.abs(x-y))*Math.pow((Math.pow(Math.tan(z), 2) + 1),x));
        u2 = u-u1;
        System.out.println(u2);
        System.out.printf("%3.4f", u2);
    }
}
