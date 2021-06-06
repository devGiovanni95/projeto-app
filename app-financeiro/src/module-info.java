module app.financeiro {

    requires java.base;//por padrao
//    requires app.calculo;
    requires app.api.publica;
    uses br.com.giovanni.app.Calculadora;
}
