package b2;

import Ff.d;
import Z1.a;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.C6496s;

/* renamed from: b2.g  reason: case insensitive filesystem */
public final class C1883g {

    /* renamed from: a  reason: collision with root package name */
    public static final C1883g f19165a = new C1883g();

    /* renamed from: b2.g$a */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19166a = new a();

        private a() {
        }
    }

    private C1883g() {
    }

    public final Z1.a a(e0 e0Var) {
        C6496s.h(e0Var, "owner");
        if (e0Var instanceof C1788k) {
            return ((C1788k) e0Var).getDefaultViewModelCreationExtras();
        }
        return a.C0192a.f10387b;
    }

    public final c0.c b(e0 e0Var) {
        C6496s.h(e0Var, "owner");
        if (e0Var instanceof C1788k) {
            return ((C1788k) e0Var).getDefaultViewModelProviderFactory();
        }
        return C1879c.f19159b;
    }

    public final String c(d dVar) {
        C6496s.h(dVar, "modelClass");
        String a10 = C1884h.a(dVar);
        if (a10 != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a10;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final a0 d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
