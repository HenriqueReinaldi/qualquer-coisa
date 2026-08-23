package org.teste

import spock.lang.Shared
import spock.lang.Specification

class SortTeste extends Specification {

    @Shared
    def sorter = new Sorter()


    def "bubble sort ordena conjunto nao nulo corretamente"() {
        when:
            sorter.bbs(entrada)

        then:
            entrada = saida

        where:
            entrada | saida
            [0]     | [0]

            [1,2]   | [1,2]
            [2,1]   | [1,2]

            [1,2,3] | [1,2,3]
            [3,2,1] | [1,2,3]
            [2,3,1] | [1,2,3]

            [5,234,51,31,3,5,1,23,5,6,123] | [1, 3, 5, 5, 5, 6, 23, 31, 51, 123, 234]

            [1,1,1,1,1,1] | [1,1,1,1,1,1]
    }

}
