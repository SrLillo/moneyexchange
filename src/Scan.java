import java.util.Scanner;

public class Scan {
    private String base_code;
    private String target_code;
    private Double amount;
    private int salir = 1;
    Scanner teclado = new Scanner(System.in);

    public void ingresaPorTeclado() {
        System.out.println("Indica la moneda a ser convertida - moneda de origen");
        base_code = teclado.next();

        System.out.println("Indica la moneda a la cual deseas hacer la conversión - moneda de destino");
        target_code = teclado.next();

        System.out.println("Indica el importe a cambiar");
        amount = teclado.nextDouble();
    }

    public void sale() {
        System.out.println("Si deseas realizar una nueva conversión, ingresa 1, si deseas salir, ingresa 0");
        salir = teclado.nextInt();
    }

    public String getBase_code() {
        return this.base_code;
    }

    public String getTarget_code() {
        return this.target_code;
    }

    public Double getAmount() {
        return this.amount;
    }

    public int getSalir() {
        return salir;
    }
}

