package br.com.giovanni.app.calculo;

import br.com.giovanni.app.Calculadora;
import br.com.giovanni.app.calculo.interno.OperacoesAritimeticas;
import br.com.giovanni.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private String id ="ABC";

    private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

    public double soma(double... nums) {
        Logger.info("Somando....");
        return opAritimeticas.soma(nums);
    }

    public Class<Logger> getLoggerClass(){
        return Logger.class;
    }

    public String getId() {
        return id;
    }
}