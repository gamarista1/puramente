package U8;

import Y.C1500m;
import Y.C1506p;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import r0.C2544x0;
import r0.C2550z0;
import s0.C2581c;
import yf.C6798l;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final long f34431a = C2550z0.e(0.0f, 0.0f, 0.0f, 0.3f, (C2581c) null, 16, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C6798l f34432b = a.f34433a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34433a = new a();

        a() {
            super(1);
        }

        public final long a(long j10) {
            return C2550z0.h(c.f34431a, j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2544x0.k(a(((C2544x0) obj).y()));
        }
    }

    private static final Window c(C1500m mVar, int i10) {
        j jVar;
        mVar.z(1009281237);
        if (C1506p.H()) {
            C1506p.Q(1009281237, i10, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:208)");
        }
        ViewParent parent = ((View) mVar.m(AndroidCompositionLocals_androidKt.k())).getParent();
        Window window = null;
        if (parent instanceof j) {
            jVar = (j) parent;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            window = jVar.a();
        }
        if (window == null) {
            Context context = ((View) mVar.m(AndroidCompositionLocals_androidKt.k())).getContext();
            C6496s.g(context, "getContext(...)");
            window = d(context);
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return window;
    }

    private static final Window d(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C6496s.g(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }

    public static final b e(Window window, C1500m mVar, int i10, int i11) {
        mVar.z(-715745933);
        if ((i11 & 1) != 0) {
            window = c(mVar, 0);
        }
        if (C1506p.H()) {
            C1506p.Q(-715745933, i10, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:201)");
        }
        View view = (View) mVar.m(AndroidCompositionLocals_androidKt.k());
        mVar.z(-1044852491);
        boolean S10 = mVar.S(view) | mVar.S(window);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new a(view, window);
            mVar.r(A10);
        }
        a aVar = (a) A10;
        mVar.R();
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return aVar;
    }
}
