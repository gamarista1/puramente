package Hc;

import bc.C4473f;

/* renamed from: Hc.d  reason: case insensitive filesystem */
public enum C4301d implements C4473f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f51011a;

    private C4301d(int i10) {
        this.f51011a = i10;
    }

    public int d() {
        return this.f51011a;
    }
}
