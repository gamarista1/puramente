package S8;

import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.P;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1790m;
import e.C1930c;
import e.C1935h;
import g.C2000c;
import h.C2014c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public abstract class b {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33940a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C6514M.f71813a;
        }

        public final void invoke(boolean z10) {
        }
    }

    /* renamed from: S8.b$b  reason: collision with other inner class name */
    static final class C0552b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1935h f33942b;

        /* renamed from: S8.b$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f33943a;

            public a(a aVar) {
                this.f33943a = aVar;
            }

            public void dispose() {
                this.f33943a.d((C2000c) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0552b(a aVar, C1935h hVar) {
            super(1);
            this.f33941a = aVar;
            this.f33942b = hVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C6496s.h(m10, "$this$DisposableEffect");
            this.f33941a.d(this.f33942b);
            return new a(this.f33941a);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f33945b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C6798l lVar) {
            super(1);
            this.f33944a = aVar;
            this.f33945b = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C6514M.f71813a;
        }

        public final void invoke(boolean z10) {
            this.f33944a.c();
            this.f33945b.invoke(Boolean.valueOf(z10));
        }
    }

    public static final a a(String str, C6798l lVar, C1500m mVar, int i10, int i11) {
        boolean z10;
        C6496s.h(str, "permission");
        mVar.z(1424240517);
        if ((i11 & 2) != 0) {
            lVar = a.f33940a;
        }
        if (C1506p.H()) {
            C1506p.Q(1424240517, i10, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:47)");
        }
        Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
        mVar.z(-1903070007);
        boolean z11 = true;
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(str)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object A10 = mVar.A();
        if (z10 || A10 == C1500m.f10026a.a()) {
            A10 = new a(str, context, g.e(context));
            mVar.r(A10);
        }
        a aVar = (a) A10;
        mVar.R();
        g.b(aVar, (C1790m.a) null, mVar, 0, 2);
        C2014c cVar = new C2014c();
        mVar.z(-1903069605);
        boolean S10 = mVar.S(aVar);
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.C(lVar)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z12 = S10 | z11;
        Object A11 = mVar.A();
        if (z12 || A11 == C1500m.f10026a.a()) {
            A11 = new c(aVar, lVar);
            mVar.r(A11);
        }
        mVar.R();
        C1935h a10 = C1930c.a(cVar, (C6798l) A11, mVar, 8);
        P.b(aVar, a10, new C0552b(aVar, a10), mVar, C1935h.f19496c << 3);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return aVar;
    }
}
