 module app.calculo {

    //utilizando o modo transitivo ele consegue pegar na classe do pai fazendo uma interação com logger mesmo nao importando a classe pois a classe calculo ja fez a chamada
    requires transitive app.logging;
    exports br.com.giovanni.app.calculo;

//    exports br.com.giovanni.app.calculo.interno
//            to app.financeiro;

    opens br.com.giovanni.app.calculo to app.financeiro;

    requires app.api.publica;
    provides br.com.giovanni.app.Calculadora
            with br.com.giovanni.app.calculo.CalculadoraImpl;
}