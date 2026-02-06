package Cf;

import java.util.Random;

public abstract class a extends c {
    public int b(int i10) {
        return d.g(i().nextInt(), i10);
    }

    public double c() {
        return i().nextDouble();
    }

    public int d() {
        return i().nextInt();
    }

    public int e(int i10) {
        return i().nextInt(i10);
    }

    public long g() {
        return i().nextLong();
    }

    public abstract Random i();
}
