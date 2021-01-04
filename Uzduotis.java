public class Uzduotis {
    public static void main(String[] args) {
    
        System.out.println(plotoSkaiciavimas(15, 18));
        System.out.println("^Plotas, mylios v");
        System.out.println(kmIMylias(8.05));

        sukeisti(4, 7);

        int[] skMas = {-1337, 0, 1337, 2674, 4011};
        System.out.println("vidurkis: " + vidurkis(skMas));
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

    public static double vidurkis(int[] skMas) {

        double avg = 0;
        int suma = 0;

        for (int i = 0; i < skMas.length; i++) {
            suma = suma + skMas[i];
            avg = suma / skMas.length;
        }
        
        return avg;
    }
}

