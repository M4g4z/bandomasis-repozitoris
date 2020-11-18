public class PTT {
    public static void main(String[] args) {
        System.out.println("Pagrindinė");
        System.out.println("Trigonometrinė");
        System.out.println("Tapatybė");
        System.out.println();

        double laipsniai = 0.0;

        while (laipsniai < 90.1) {

            double radianai = Math.toRadians(laipsniai);
            double sinusas = Math.sin(radianai);
            double kosinusas = Math.cos(radianai);
            double vienetas = Math.pow(sinusas, 2.0) + Math.pow(kosinusas, 2.0);
            System.out.println(laipsniai + " kampo sin^2 + cos^2 =  " + vienetas);
            laipsniai = laipsniai + 1.0;
        }
    }
}