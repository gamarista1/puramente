package wh;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import rh.l;

/* renamed from: wh.b  reason: case insensitive filesystem */
public final class C6772b {

    /* renamed from: a  reason: collision with root package name */
    private final List f73773a;

    /* renamed from: b  reason: collision with root package name */
    private int f73774b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73775c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f73776d;

    public C6772b(List list) {
        C6496s.h(list, "connectionSpecs");
        this.f73773a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f73773a.size();
        for (int i10 = this.f73774b; i10 < size; i10++) {
            if (((l) this.f73773a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        C6496s.h(sSLSocket, "sslSocket");
        int i10 = this.f73774b;
        int size = this.f73773a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f73773a.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f73774b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f73775c = c(sSLSocket);
            lVar.c(sSLSocket, this.f73776d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f73776d);
        sb2.append(", modes=");
        sb2.append(this.f73773a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C6496s.e(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C6496s.g(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        C6496s.h(iOException, "e");
        this.f73776d = true;
        if (this.f73775c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
