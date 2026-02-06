package Fh;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.u;
import sh.C6726e;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f63136g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f63137a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f63138b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f63139c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f63140d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f63141e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f63142f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(u uVar) {
            String str;
            u uVar2 = uVar;
            C6496s.h(uVar2, "responseHeaders");
            int size = uVar.size();
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (p.v(uVar2.g(i10), "Sec-WebSocket-Extensions", true)) {
                    String x10 = uVar2.x(i10);
                    int i11 = 0;
                    while (i11 < x10.length()) {
                        int r10 = C6726e.r(x10, ',', i11, 0, 4, (Object) null);
                        int p10 = C6726e.p(x10, ';', i11, r10);
                        String Z10 = C6726e.Z(x10, i11, p10);
                        int i12 = p10 + 1;
                        if (p.v(Z10, "permessage-deflate", true)) {
                            if (z10) {
                                z13 = true;
                            }
                            i11 = i12;
                            while (i11 < r10) {
                                int p11 = C6726e.p(x10, ';', i11, r10);
                                int p12 = C6726e.p(x10, '=', i11, p11);
                                String Z11 = C6726e.Z(x10, i11, p12);
                                if (p12 < p11) {
                                    str = p.x0(C6726e.Z(x10, p12 + 1, p11), "\"");
                                } else {
                                    str = null;
                                }
                                i11 = p11 + 1;
                                if (p.v(Z11, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    if (str != null) {
                                        num = p.m(str);
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                    }
                                } else if (p.v(Z11, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (str != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (p.v(Z11, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z13 = true;
                                    }
                                    if (str != null) {
                                        num2 = p.m(str);
                                    } else {
                                        num2 = null;
                                    }
                                    if (num2 != null) {
                                    }
                                } else if (p.v(Z11, "server_no_context_takeover", true)) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (str != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                }
                                z13 = true;
                            }
                            z10 = true;
                        } else {
                            i11 = i12;
                            z13 = true;
                        }
                    }
                }
            }
            return new e(z10, num, z11, num2, z12, z13);
        }

        private a() {
        }
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f63137a = z10;
        this.f63138b = num;
        this.f63139c = z11;
        this.f63140d = num2;
        this.f63141e = z12;
        this.f63142f = z13;
    }

    public final boolean a(boolean z10) {
        if (z10) {
            return this.f63139c;
        }
        return this.f63141e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f63137a == eVar.f63137a && C6496s.c(this.f63138b, eVar.f63138b) && this.f63139c == eVar.f63139c && C6496s.c(this.f63140d, eVar.f63140d) && this.f63141e == eVar.f63141e && this.f63142f == eVar.f63142f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        boolean z10 = this.f63137a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i11 = (z10 ? 1 : 0) * true;
        Integer num = this.f63138b;
        int i12 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i13 = (i11 + i10) * 31;
        boolean z12 = this.f63139c;
        if (z12) {
            z12 = true;
        }
        int i14 = (i13 + (z12 ? 1 : 0)) * 31;
        Integer num2 = this.f63140d;
        if (num2 != null) {
            i12 = num2.hashCode();
        }
        int i15 = (i14 + i12) * 31;
        boolean z13 = this.f63141e;
        if (z13) {
            z13 = true;
        }
        int i16 = (i15 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f63142f;
        if (!z14) {
            z11 = z14;
        }
        return i16 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f63137a + ", clientMaxWindowBits=" + this.f63138b + ", clientNoContextTakeover=" + this.f63139c + ", serverMaxWindowBits=" + this.f63140d + ", serverNoContextTakeover=" + this.f63141e + ", unknownValues=" + this.f63142f + ')';
    }
}
