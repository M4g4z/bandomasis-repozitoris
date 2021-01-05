import java.util.Arrays;

public class Uzduotis {
    public static void main(String[] args) {
    
        System.out.println(plotoSkaiciavimas(15, 18));
        System.out.println("^Plotas, mylios v");
        System.out.println(kmIMylias(8.05));
        System.out.println();
        sukeisti(4, 7);
        System.out.print("Sukeitimas per masyvus: ");
        sukeitimas(4, 7);
        System.out.println();
        int[] skMas = {-1337, 0, 1337, 2674, 4011};
        System.out.println();
        System.out.println("Vidurkis: " + vidurkis(skMas));
    }

    public static double plotoSkaiciavimas(double ilgis, double plotis) {
        double plotas;
        plotas = ilgis * plotis;

        return plotas;
    }

    public static double kmIMylias(double km) {
        double mylios;
        mylios = km * 0.621371192;

        return mylios;
    }

    public static void sukeisti(int x, int y) {
        int z = x;
        x = y;
        y = z;

        System.out.println("x = " + x + "  y = " + y);
    }

    public static int[] sukeitimas(int sk1, int sk2) {
        int[] sukeistieji = new int[2];
        sukeistieji[0] = sk2;
        sukeistieji[1] = sk1;
        System.out.println(Arrays.toString(sukeistieji));
        return sukeistieji;
    }

    public static double vidurkis(int[] skMas) {
        double avg = 0;
        int suma = 0;

        for (int i = 0; i < skMas.length; i++) {
            suma += skMas[i];
            avg = suma / skMas.length;
        }
        
        return avg;
    }
}
