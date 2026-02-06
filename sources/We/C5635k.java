package We;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p003if.h;

/* renamed from: We.k  reason: case insensitive filesystem */
public final class C5635k {

    /* renamed from: a  reason: collision with root package name */
    private final Map f65907a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final M0 f65908b;

    public C5635k(M0 m02) {
        this.f65908b = (M0) h.c(m02, "options are required");
    }
}
