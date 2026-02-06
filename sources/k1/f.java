package K1;

import androidx.datastore.preferences.protobuf.C1749w;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f extends C1749w implements P {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.g();

    public static final class a extends C1749w.a implements P {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a w(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            q();
            ((f) this.f16561b).J().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final H f3993a = H.d(r0.b.STRING, "", r0.b.MESSAGE, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        C1749w.F(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public Map J() {
        return L();
    }

    private I L() {
        if (!this.preferences_.l()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private I M() {
        return this.preferences_;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static f O(InputStream inputStream) {
        return (f) C1749w.D(DEFAULT_INSTANCE, inputStream);
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    /* access modifiers changed from: protected */
    public final Object r(C1749w.d dVar, Object obj, Object obj2) {
        switch (e.f3992a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a((e) null);
            case 3:
                return C1749w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f3993a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x10 = PARSER;
                if (x10 == null) {
                    synchronized (f.class) {
                        try {
                            x10 = PARSER;
                            if (x10 == null) {
                                x10 = new C1749w.b(DEFAULT_INSTANCE);
                                PARSER = x10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return x10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
