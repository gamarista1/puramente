package l9;

import android.media.metrics.LogSessionId;
import ja.C3645a;
import ja.M;

public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f46344b;

    /* renamed from: a  reason: collision with root package name */
    private final a f46345a;

    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f46346b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f46347a;

        public a(LogSessionId logSessionId) {
            this.f46347a = logSessionId;
        }
    }

    static {
        s0 s0Var;
        if (M.f44981a < 31) {
            s0Var = new s0();
        } else {
            s0Var = new s0(a.f46346b);
        }
        f46344b = s0Var;
    }

    public s0() {
        this((a) null);
        C3645a.f(M.f44981a < 31);
    }

    public LogSessionId a() {
        return ((a) C3645a.e(this.f46345a)).f46347a;
    }

    public s0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private s0(a aVar) {
        this.f46345a = aVar;
    }
}
