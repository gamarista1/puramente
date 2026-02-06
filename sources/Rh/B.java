package rh;

import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum B {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f73125b = null;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f73133a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B a(String str) {
            C6496s.h(str, "protocol");
            B b10 = B.HTTP_1_0;
            if (!C6496s.c(str, b10.f73133a)) {
                b10 = B.HTTP_1_1;
                if (!C6496s.c(str, b10.f73133a)) {
                    b10 = B.H2_PRIOR_KNOWLEDGE;
                    if (!C6496s.c(str, b10.f73133a)) {
                        b10 = B.HTTP_2;
                        if (!C6496s.c(str, b10.f73133a)) {
                            b10 = B.SPDY_3;
                            if (!C6496s.c(str, b10.f73133a)) {
                                b10 = B.QUIC;
                                if (!C6496s.c(str, b10.f73133a)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return b10;
        }

        private a() {
        }
    }

    static {
        f73125b = new a((DefaultConstructorMarker) null);
    }

    private B(String str) {
        this.f73133a = str;
    }

    public String toString() {
        return this.f73133a;
    }
}
