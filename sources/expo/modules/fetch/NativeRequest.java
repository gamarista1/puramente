package expo.modules.fetch;

import Sd.l;
import ae.C4464a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.D;
import rh.n;
import rh.u;
import rh.y;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lae/a;", "appContext", "Lexpo/modules/fetch/NativeResponse;", "response", "<init>", "(Lae/a;Lexpo/modules/fetch/NativeResponse;)V", "Lrh/A;", "client", "Ljava/net/URL;", "url", "Lexpo/modules/fetch/NativeRequestInit;", "requestInit", "", "requestBody", "Llf/M;", "U", "(Lrh/A;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V", "Q", "()V", "c", "Lexpo/modules/fetch/NativeResponse;", "T", "()Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/fetch/c;", "d", "Lexpo/modules/fetch/c;", "requestHolder", "Lrh/e;", "e", "Lrh/e;", "task", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeRequest extends SharedObject {

    /* renamed from: c  reason: collision with root package name */
    private final NativeResponse f60395c;

    /* renamed from: d  reason: collision with root package name */
    private final c f60396d = new c((C) null);

    /* renamed from: e  reason: collision with root package name */
    private C6708e f60397e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeRequest(C4464a aVar, NativeResponse nativeResponse) {
        super(aVar);
        C6496s.h(aVar, "appContext");
        C6496s.h(nativeResponse, "response");
        this.f60395c = nativeResponse;
    }

    public final void Q() {
        C6708e eVar = this.f60397e;
        if (eVar != null) {
            eVar.cancel();
            this.f60395c.o0();
        }
    }

    public final NativeResponse T() {
        return this.f60395c;
    }

    public final void U(C6703A a10, URL url, NativeRequestInit nativeRequestInit, byte[] bArr) {
        y yVar;
        C6496s.h(a10, "client");
        C6496s.h(url, "url");
        C6496s.h(nativeRequestInit, "requestInit");
        if (nativeRequestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
            a10 = a10.B().h(n.f73444b).c();
        }
        u a11 = l.a(nativeRequestInit.getHeaders());
        String a12 = a11.a("Content-Type");
        D d10 = null;
        if (a12 != null) {
            yVar = y.f73499e.b(a12);
        } else {
            yVar = null;
        }
        C.a f10 = new C.a().f(a11);
        String method = nativeRequestInit.getMethod();
        if (bArr != null) {
            d10 = D.a.p(D.Companion, bArr, yVar, 0, 0, 6, (Object) null);
        }
        C b10 = f10.g(method, d10).m(b.f60413b.a(url)).b();
        this.f60396d.a(b10);
        C6708e a13 = a10.a(b10);
        this.f60397e = a13;
        if (a13 != null) {
            FirebasePerfOkHttpClient.enqueue(a13, this.f60395c);
        }
        this.f60395c.R0();
    }
}
