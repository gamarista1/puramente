package Hc;

import Sg.C5541d;
import W8.c;
import W8.d;
import W8.i;
import android.util.Log;
import ic.C5027b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Hc.g  reason: case insensitive filesystem */
public final class C4304g implements C4305h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51016b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5027b f51017a;

    /* renamed from: Hc.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4304g(C5027b bVar) {
        C6496s.h(bVar, "transportFactoryProvider");
        this.f51017a = bVar;
    }

    /* access modifiers changed from: private */
    public final byte[] c(A a10) {
        String b10 = B.f50908a.c().b(a10);
        C6496s.g(b10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b10);
        byte[] bytes = b10.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public void a(A a10) {
        C6496s.h(a10, "sessionEvent");
        ((i) this.f51017a.get()).a("FIREBASE_APPQUALITY_SESSION", A.class, c.b("json"), new C4303f(this)).a(d.e(a10));
    }
}
