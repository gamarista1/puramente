package K1;

import androidx.datastore.preferences.protobuf.C1728a;
import androidx.datastore.preferences.protobuf.C1749w;
import androidx.datastore.preferences.protobuf.C1751y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import java.util.List;

public final class g extends C1749w implements P {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C1751y.b strings_ = C1749w.s();

    public static final class a extends C1749w.a implements P {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a w(Iterable iterable) {
            q();
            ((g) this.f16561b).J(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        C1749w.F(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void J(Iterable iterable) {
        K();
        C1728a.b(iterable, this.strings_);
    }

    private void K() {
        if (!this.strings_.o()) {
            this.strings_ = C1749w.A(this.strings_);
        }
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public List M() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    public final Object r(C1749w.d dVar, Object obj, Object obj2) {
        switch (e.f3992a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((e) null);
            case 3:
                return C1749w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x10 = PARSER;
                if (x10 == null) {
                    synchronized (g.class) {
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
