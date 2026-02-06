package W0;

/* renamed from: W0.j  reason: case insensitive filesystem */
public abstract class C1442j {
    /* access modifiers changed from: private */
    public static final boolean b(char c10, char c11) {
        if (!Character.isHighSurrogate(c10) || !Character.isLowSurrogate(c11)) {
            return false;
        }
        return true;
    }
}
