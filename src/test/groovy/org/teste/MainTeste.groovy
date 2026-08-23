package org.teste

import spock.lang.Specification

class MainTeste extends Specification{

    def "metodo teste retorna 1"() {
        given:
            def a = new Main()
        expect:
            a.teste() == 1
    }


}
