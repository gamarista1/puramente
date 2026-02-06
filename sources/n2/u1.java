package n2;

import android.media.metrics.LogSessionId;
import i2.C2076a;
import i2.L;
import java.util.Objects;

public final class u1 {

    /* renamed from: d  reason: collision with root package name */
    public static final u1 f24653d;

    /* renamed from: a  reason: collision with root package name */
    public final String f24654a;

    /* renamed from: b  reason: collision with root package name */
    private final a f24655b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f24656c;

    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f24657b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f24658a;

        public a(LogSessionId logSessionId) {
            this.f24658a = logSessionId;
        }
    }

    static {
        u1 u1Var;
        if (L.f22072a < 31) {
            u1Var = new u1("");
        } else {
            u1Var = new u1(a.f24657b, "");
        }
        f24653d = u1Var;
    }

    public u1(String str) {
        C2076a.g(L.f22072a < 31);
        this.f24654a = str;
        this.f24655b = null;
        this.f24656c = new Object();
    }

    public LogSessionId a() {
        return ((a) C2076a.e(this.f24655b)).f24658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (!Objects.equals(this.f24654a, u1Var.f24654a) || !Objects.equals(this.f24655b, u1Var.f24655b) || !Objects.equals(this.f24656c, u1Var.f24656c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f24654a, this.f24655b, this.f24656c});
    }

    public u1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private u1(a aVar, String str) {
        this.f24655b = aVar;
        this.f24654a = str;
        this.f24656c = new Object();
    }
}
