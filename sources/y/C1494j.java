package Y;

/* renamed from: Y.j  reason: case insensitive filesystem */
public abstract class C1494j {
    public static final int a(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int O10 = mVar.O();
        if (C1506p.H()) {
            C1506p.P();
        }
        return O10;
    }

    public static final K0 b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        K0 x10 = mVar.x();
        if (x10 != null) {
            mVar.s(x10);
            if (C1506p.H()) {
                C1506p.P();
            }
            return x10;
        }
        throw new IllegalStateException("no recompose scope found");
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final r d(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        r P10 = mVar.P();
        if (C1506p.H()) {
            C1506p.P();
        }
        return P10;
    }
}
