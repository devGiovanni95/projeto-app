package br.com.giovanni.app.financeiro;
import br.com.giovanni.app.Calculadora;
import java.util.ServiceLoader;
import java.lang.reflect.Field;


//import br.com.giovanni.app.calculo.CalculadoraImpl;
//import br.com.giovanni.app.calculo.interno.OperacoesAritimeticas;

public class Teste {

    public static void main(String[] args) {
        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println(calc.soma(2, 3, 4));

//        OperacoesAritimeticas op = new OperacoesAritimeticas();
//        System.out.println(op.soma(4, 5, 6));

//        Calculadora.class.getDeclaredFields()[].getName;
//        System.out.println(Calculadora.class.getName());

//        try {
//            Field fieldId = Calculadora.class.getDeclaredFields()[0];
//            fieldId.setAccessible(true);
//            fieldId.set(calc, "def");
//            System.out.println(fieldId.get(calc));
//            fieldId.setAccessible(false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            Field fieldId = calc.getClass().getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);

            System.out.println(calc.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
