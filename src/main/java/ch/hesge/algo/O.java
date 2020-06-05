package ch.hesge.algo;

import java.util.stream.DoubleStream;

public class O {

    /**
     * La série de terme général (1/2)n est convergente
     * et sa somme vaut : 1 + 1/2 + 1/4 + 1/8 + 1/16 + ⋯ = 2.
     *
     * A l'aide de la méthode Stream.iterate(), montrer que pour n = 90,
     * le résultat est proche de 2.
     *
     * @return Valeur approchée de 2
     */
    public double sum() {
        return DoubleStream.iterate(1.0, i -> i * 2)
                .map(i -> 1 / i)
                .limit(100)
                .sum();
    }
}
