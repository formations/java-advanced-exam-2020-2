package ch.hesge.algo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class LTest {

    private L l;

    @Test
    public void shouldJoinStrings() {
        l = new L();
        String result = l.merge(Arrays.asList("Foo", "Bar", "Baz"));
        Assertions.assertThat(result)
                .isEqualTo("Foo & Bar & Baz");
    }

    @Test
    public void shouldReturnSingleStringIfThereIsOnlyOne() {
        l = new L();
        String result = l.merge(Collections.singletonList("Foo"));
        Assertions.assertThat(result)
                .isEqualTo("Foo");
    }
}