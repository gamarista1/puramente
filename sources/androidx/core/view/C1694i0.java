package androidx.core.view;

import Rg.h;
import Rg.j;
import android.view.View;
import android.view.ViewParent;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6494p;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import yf.p;

/* renamed from: androidx.core.view.i0  reason: case insensitive filesystem */
public abstract class C1694i0 {

    /* renamed from: androidx.core.view.i0$a */
    static final class a extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        int f16094b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f16095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f16096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, C6658d dVar) {
            super(2, dVar);
            this.f16096d = view;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f16096d, dVar);
            aVar.f16095c = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C6658d dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Rg.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r4.f16094b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r5)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                java.lang.Object r1 = r4.f16095c
                Rg.j r1 = (Rg.j) r1
                lf.w.b(r5)
                goto L_0x0037
            L_0x0022:
                lf.w.b(r5)
                java.lang.Object r5 = r4.f16095c
                r1 = r5
                Rg.j r1 = (Rg.j) r1
                android.view.View r5 = r4.f16096d
                r4.f16095c = r1
                r4.f16094b = r3
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L_0x0037
                return r0
            L_0x0037:
                android.view.View r5 = r4.f16096d
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x004f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                Rg.h r5 = androidx.core.view.C1692h0.b(r5)
                r3 = 0
                r4.f16095c = r3
                r4.f16094b = r2
                java.lang.Object r5 = r1.c(r5, r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                lf.M r5 = lf.C6514M.f71813a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1694i0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: androidx.core.view.i0$b */
    /* synthetic */ class b extends C6494p implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16097a = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* renamed from: i */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final h a(View view) {
        return Rg.k.b(new a(view, (C6658d) null));
    }

    public static final h b(View view) {
        return Rg.k.h(view.getParent(), b.f16097a);
    }
}
