package Ef;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.r;
import tf.C6729c;
import zf.C6828a;

public abstract class a implements Iterable, C6828a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0929a f62805d = new C0929a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final char f62806a;

    /* renamed from: b  reason: collision with root package name */
    private final char f62807b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62808c;

    /* renamed from: Ef.a$a  reason: collision with other inner class name */
    public static final class C0929a {
        public /* synthetic */ C0929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0929a() {
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i10 != Integer.MIN_VALUE) {
            this.f62806a = c10;
            this.f62807b = (char) C6729c.c(c10, c11, i10);
            this.f62808c = i10;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final char k() {
        return this.f62806a;
    }

    public final char n() {
        return this.f62807b;
    }

    /* renamed from: r */
    public r iterator() {
        return new b(this.f62806a, this.f62807b, this.f62808c);
    }
}
