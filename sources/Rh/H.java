package rh;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum H {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f73192b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f73199a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H a(String str) {
            C6496s.h(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return H.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return H.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return H.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return H.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return H.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        private a() {
        }
    }

    static {
        f73192b = new a((DefaultConstructorMarker) null);
    }

    private H(String str) {
        this.f73199a = str;
    }

    public final String b() {
        return this.f73199a;
    }
}
