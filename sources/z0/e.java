package Z0;

import Q0.V;
import Q0.X;
import android.text.style.TtsSpan;
import lf.C6535s;

public abstract class e {
    public static final TtsSpan a(V v10) {
        if (v10 instanceof X) {
            return b((X) v10);
        }
        throw new C6535s();
    }

    public static final TtsSpan b(X x10) {
        return new TtsSpan.VerbatimBuilder(x10.a()).build();
    }
}
