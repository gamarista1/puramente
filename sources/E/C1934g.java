package e;

import Y.C1500m;
import Y.C1521x;
import Y.I0;
import Y.o1;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.K;
import androidx.activity.O;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

/* renamed from: e.g  reason: case insensitive filesystem */
public final class C1934g {

    /* renamed from: a  reason: collision with root package name */
    public static final C1934g f19493a = new C1934g();

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f19494b = C1521x.d((o1) null, a.f19495a, 1, (Object) null);

    /* renamed from: e.g$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19495a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final K invoke() {
            return null;
        }
    }

    private C1934g() {
    }

    public final K a(C1500m mVar, int i10) {
        mVar.z(-2068013981);
        K k10 = (K) mVar.m(f19494b);
        mVar.z(1680121597);
        if (k10 == null) {
            k10 = O.a((View) mVar.m(AndroidCompositionLocals_androidKt.k()));
        }
        mVar.R();
        if (k10 == null) {
            Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof K) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            k10 = (K) context;
        }
        mVar.R();
        return k10;
    }
}
