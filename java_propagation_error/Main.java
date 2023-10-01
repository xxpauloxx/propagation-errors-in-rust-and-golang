public class Main {
    // Método que realiza uma operação de divisão e lança uma exceção em caso de erro.
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Chamada do método divide com tratamento de exceção.
            double resultado = divide(10.0, 0.0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Chamada bem-sucedida.
            double resultado = divide(10.0, 2.0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
