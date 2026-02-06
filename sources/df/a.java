package Df;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C6496s;

public final class a extends Cf.a {
    public int f(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public long h(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    public Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C6496s.g(current, "current(...)");
        return current;
    }
}
