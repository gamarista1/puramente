package e;

import Y.C1500m;
import Y.C1521x;
import Y.I0;
import Y.o1;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g.C2003f;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

/* renamed from: e.f  reason: case insensitive filesystem */
public final class C1933f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1933f f19490a = new C1933f();

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f19491b = C1521x.d((o1) null, a.f19492a, 1, (Object) null);

    /* renamed from: e.f$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19492a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C2003f invoke() {
            return null;
        }
    }

    private C1933f() {
    }

    public final C2003f a(C1500m mVar, int i10) {
        mVar.z(1418020823);
        C2003f fVar = (C2003f) mVar.m(f19491b);
        if (fVar == null) {
            Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof C2003f) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            fVar = (C2003f) context;
        }
        mVar.R();
        return fVar;
    }
}
