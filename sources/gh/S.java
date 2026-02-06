package Gh;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6496s;

public final class S {

    /* renamed from: a  reason: collision with root package name */
    public static final S f63248a = new S();

    /* renamed from: b  reason: collision with root package name */
    private static final int f63249b = 65536;

    /* renamed from: c  reason: collision with root package name */
    private static final Q f63250c = new Q(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    private static final int f63251d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference[] f63252e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f63251d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f63252e = atomicReferenceArr;
    }

    private S() {
    }

    private final AtomicReference a() {
        return f63252e[(int) (Thread.currentThread().getId() & (((long) f63251d) - 1))];
    }

    public static final void b(Q q10) {
        int i10;
        C6496s.h(q10, "segment");
        if (q10.f63246f != null || q10.f63247g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!q10.f63244d) {
            AtomicReference a10 = f63248a.a();
            Q q11 = f63250c;
            Q q12 = (Q) a10.getAndSet(q11);
            if (q12 != q11) {
                if (q12 != null) {
                    i10 = q12.f63243c;
                } else {
                    i10 = 0;
                }
                if (i10 >= f63249b) {
                    a10.set(q12);
                    return;
                }
                q10.f63246f = q12;
                q10.f63242b = 0;
                q10.f63243c = i10 + 8192;
                a10.set(q10);
            }
        }
    }

    public static final Q c() {
        AtomicReference a10 = f63248a.a();
        Q q10 = f63250c;
        Q q11 = (Q) a10.getAndSet(q10);
        if (q11 == q10) {
            return new Q();
        }
        if (q11 == null) {
            a10.set((Object) null);
            return new Q();
        }
        a10.set(q11.f63246f);
        q11.f63246f = null;
        q11.f63243c = 0;
        return q11;
    }
}
