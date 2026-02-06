package androidx.lifecycle;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

/* renamed from: androidx.lifecycle.p  reason: case insensitive filesystem */
public abstract class C1793p implements K {

    /* renamed from: androidx.lifecycle.p$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f17253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1793p f17254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f17255c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1793p pVar, p pVar2, C6658d dVar) {
            super(2, dVar);
            this.f17254b = pVar;
            this.f17255c = pVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f17254b, this.f17255c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f17253a;
            if (i10 == 0) {
                w.b(obj);
                C1790m a10 = this.f17254b.a();
                p pVar = this.f17255c;
                this.f17253a = 1;
                if (H.a(a10, pVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public abstract C1790m a();

    public final C5600w0 b(p pVar) {
        C6496s.h(pVar, "block");
        return C5576k.d(this, (g) null, (M) null, new a(this, pVar, (C6658d) null), 3, (Object) null);
    }
}
