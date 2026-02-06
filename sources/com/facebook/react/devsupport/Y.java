package com.facebook.react.devsupport;

import I7.g;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Locale;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;

public class Y {

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f40755a;

    class a implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f40756a;

        a(g gVar) {
            this.f40756a = gVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            U5.a.I("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
            this.f40756a.a(false);
        }

        public void onResponse(C6708e eVar, E e10) {
            if (!e10.m0()) {
                U5.a.m("ReactNative", "Got non-success http code from packager when requesting status: " + e10.o());
                this.f40756a.a(false);
                return;
            }
            F a10 = e10.a();
            if (a10 == null) {
                U5.a.m("ReactNative", "Got null body response from packager when requesting status");
                this.f40756a.a(false);
                return;
            }
            String E10 = a10.E();
            if (!"packager-status:running".equals(E10)) {
                U5.a.m("ReactNative", "Got unexpected response from packager when requesting status: " + E10);
                this.f40756a.a(false);
                return;
            }
            this.f40756a.a(true);
        }
    }

    public Y(C6703A a10) {
        this.f40755a = a10;
    }

    private static String a(String str) {
        return String.format(Locale.US, "http://%s/status", new Object[]{str});
    }

    public void b(String str, g gVar) {
        FirebasePerfOkHttpClient.enqueue(this.f40755a.a(new C.a().l(a(str)).b()), new a(gVar));
    }
}
