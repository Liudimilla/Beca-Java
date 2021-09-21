public class Teste {

    public static void main(String[] args) {
        System.out.println("Teste One"); //criar um ponto de parada (Breakpoint)
        metodo1();
        System.out.println("Teste TWO");
    }

    private static void metodo1() {
        System.out.println("Teste Three");
        metodo2();
        System.out.println("Teste Four");
    }

    private static void metodo2() {
        System.out.println("Teste Five");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int a = i / 0;
                
//  precisamos avisar para a máquina virtual qual exceção pode acontecer. Para isso,
//  utilizaremos um novo bloco de código, por meio de catch, sinalizando que queremos
//  capturar um problema. No caso, ArithmeticException.
            
            } catch (ArithmeticException ex) {

            }    
    }
}