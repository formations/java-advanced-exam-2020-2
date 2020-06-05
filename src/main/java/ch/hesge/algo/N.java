package ch.hesge.algo;

import ch.hesge.algo.model.Coin;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class N {

    /**
     * Retourner un Stream infini dont chaque terme est un nombre aléatoire soit 0, soit 1.
     * <p>
     * Utiliser la classe Coin et la méthode flip() fournies
     *
     * @return Stream infini de 0 et de 1
     */
    public IntStream randomStream() {
        Coin coin = new Coin();
        return Stream.generate(coin::flip)
                .mapToInt(flip -> {
                    if (flip == Coin.Flip.HEAD) return 0;
                    return 1;
                });
    }
}
