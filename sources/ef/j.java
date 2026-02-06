package Ef;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.M;
import tf.C6729c;
import zf.C6828a;

public abstract class j implements Iterable, C6828a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62827d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f62828a;

    /* renamed from: b  reason: collision with root package name */
    private final long f62829b;

    /* renamed from: c  reason: collision with root package name */
    private final long f62830c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f62828a = j10;
            this.f62829b = C6729c.d(j10, j11, j12);
            this.f62830c = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long k() {
        return this.f62828a;
    }

    public final long n() {
        return this.f62829b;
    }

    /* renamed from: r */
    public M iterator() {
        return new k(this.f62828a, this.f62829b, this.f62830c);
    }
}
