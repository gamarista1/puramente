package Bh;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class h extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62621d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f62622e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f62622e;
        }

        private a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.intValue() >= 9) goto L_0x0022;
     */
    static {
        /*
            Bh.h$a r0 = new Bh.h$a
            r1 = 0
            r0.<init>(r1)
            f62621d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r0 = Sg.p.m(r0)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L_0x002c
        L_0x0022:
            r2 = r3
            goto L_0x002c
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x002c }
            goto L_0x0022
        L_0x002c:
            f62622e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.h.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) j.f62626a.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String h(SSLSocket sSLSocket) {
        boolean z10;
        C6496s.h(sSLSocket, "sslSocket");
        try {
            String a10 = sSLSocket.getApplicationProtocol();
            if (a10 == null) {
                z10 = true;
            } else {
                z10 = C6496s.c(a10, "");
            }
            if (z10) {
                return null;
            }
            return a10;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
