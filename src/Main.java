public class Main {
    public static void main(String[] args) {
        Double result;
        Scan teclado = new Scan();

        System.out.println("\nConversor de Monedas en desarrollo!");

        while (teclado.getSalir() == 1) {
            System.out.println("""
                \nMonedas convertibles:
                ARS - Peso argentino
                BOB - Boliviano boliviano
                BRL - Real brasileño
                CLP - Peso chileno
                COP - Peso colombiano
                USD - Dólar estadounidense
                EUR - Euro
                GBP - Libra esterlina
                CAD - Dólar canadiense
                AUD - Dólar australiano
                CHF - Franco suizo
                RUB - Rublo ruso
                """);

            teclado.ingresaPorTeclado();

            ConsultaTipoDeCambio consultaTipoDeCambio = new ConsultaTipoDeCambio();
            TipoDeCambio tipo = consultaTipoDeCambio.consultaTipo(teclado.getBase_code(), teclado.getTarget_code());

            result = teclado.getAmount() / tipo.conversion_rate();

            System.out.println("******************************************");
            System.out.println(teclado.getAmount() + " " + teclado.getBase_code() + " equivalen a " + result + " " + teclado.getTarget_code());
            System.out.println("******************************************");

            teclado.sale();
        }
        System.out.println("\n** Gracias por usar nuestro conversor de monedas **");
        System.out.println("\nPROGRAMA FINALIZADO");
    }
}