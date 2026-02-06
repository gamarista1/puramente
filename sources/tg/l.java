package tg;

import Hg.i;
import Hg.k;
import Of.H;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public abstract class l extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73561b = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            return new b(str);
        }

        private a() {
        }
    }

    public static final class b extends l {

        /* renamed from: c  reason: collision with root package name */
        private final String f73562c;

        public b(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.f73562c = str;
        }

        /* renamed from: d */
        public i a(H h10) {
            C6496s.h(h10, "module");
            return Hg.l.d(k.ERROR_CONSTANT_VALUE, this.f73562c);
        }

        public String toString() {
            return this.f73562c;
        }
    }

    public l() {
        super(C6514M.f71813a);
    }

    /* renamed from: c */
    public C6514M b() {
        throw new UnsupportedOperationException();
    }
}
