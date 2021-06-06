package br.com.giovanni.app.financeiro;

import br.com.giovanni.app.calculo.Calculadora;
import br.com.giovanni.app.calculo.interno.OperacoesAritimeticas;

public class Teste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2, 3, 4));

        OperacoesAritimeticas op = new OperacoesAritimeticas();
        System.out.println(op.soma(4, 5, 6));

//        System.out.println(calc.getLoggerClass());
    }
}
