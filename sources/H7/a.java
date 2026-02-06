package H7;

import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import rh.u;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static C6703A f31712a;

    /* renamed from: H7.a$a  reason: collision with other inner class name */
    class C0519a implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InspectorNetworkRequestListener f31713a;

        C0519a(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            this.f31713a = inspectorNetworkRequestListener;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            if (!eVar.isCanceled()) {
                this.f31713a.onError(iOException.getMessage());
            }
        }

        public void onResponse(C6708e eVar, E e10) {
            InputStream a10;
            u F10 = e10.F();
            HashMap hashMap = new HashMap();
            for (String str : F10.k()) {
                hashMap.put(str, F10.a(str));
            }
            this.f31713a.onHeaders(e10.o(), hashMap);
            try {
                F a11 = e10.a();
                if (a11 != null) {
                    try {
                        a10 = a11.a();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = a10.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            this.f31713a.onData(new String(bArr, 0, read));
                        }
                        a10.close();
                    } catch (Throwable th2) {
                        if (a11 != null) {
                            a11.close();
                        }
                        throw th2;
                    }
                }
                this.f31713a.onCompletion();
                if (a11 != null) {
                    a11.close();
                }
            } catch (IOException e11) {
                this.f31713a.onError(e11.getMessage());
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
    }

    public static void a(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        if (f31712a == null) {
            C6703A.a aVar = new C6703A.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f31712a = aVar.f(10, timeUnit).W(10, timeUnit).S(0, TimeUnit.MINUTES).c();
        }
        try {
            FirebasePerfOkHttpClient.enqueue(f31712a.a(new C.a().l(str).b()), new C0519a(inspectorNetworkRequestListener));
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener.onError("Not a valid URL: " + str);
        }
    }
}
