package ch.hesge.algo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OTest {

    private O o;

    @Test
    public void shouldSumToTwo() {
        o = new O();
        Assertions.assertThat(o.sum()).isEqualTo(2.0);
    }
}