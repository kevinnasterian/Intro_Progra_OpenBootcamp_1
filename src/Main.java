public class Main {

    public static void main(String[] args) {
        int param1 = 1;
        int param2 = 2;
        int param3 = 3;
        var valor = suma(param1, param2, param3);
        System.out.println(valor);

        coche micoche = new coche();
        micoche.AumentarPuertas();
        System.out.println(micoche.puertas);
    }

   public static int suma (int a, int b, int c){
        return a + b + c;
   }
}

class coche {
    public int puertas = 0;
    public void AumentarPuertas(){
        this.puertas++;
    }
}