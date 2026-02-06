package androidx.lifecycle;

import Ug.K;
import Wg.r;
import Wg.u;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import androidx.lifecycle.C1790m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

/* renamed from: androidx.lifecycle.i  reason: case insensitive filesystem */
public abstract class C1786i {

    /* renamed from: androidx.lifecycle.i$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f17226a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f17227b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1790m f17228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1790m.b f17229d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5694f f17230e;

        /* renamed from: androidx.lifecycle.i$a$a  reason: collision with other inner class name */
        static final class C0303a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f17231a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5694f f17232b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r f17233c;

            /* renamed from: androidx.lifecycle.i$a$a$a  reason: collision with other inner class name */
            static final class C0304a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f17234a;

                C0304a(r rVar) {
                    this.f17234a = rVar;
                }

                public final Object emit(Object obj, C6658d dVar) {
                    Object k10 = this.f17234a.k(obj, dVar);
                    if (k10 == C6680b.f()) {
                        return k10;
                    }
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0303a(C5694f fVar, r rVar, C6658d dVar) {
                super(2, dVar);
                this.f17232b = fVar;
                this.f17233c = rVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0303a(this.f17232b, this.f17233c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0303a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f17231a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f fVar = this.f17232b;
                    C0304a aVar = new C0304a(this.f17233c);
                    this.f17231a = 1;
                    if (fVar.collect(aVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1790m mVar, C1790m.b bVar, C5694f fVar, C6658d dVar) {
            super(2, dVar);
            this.f17228c = mVar;
            this.f17229d = bVar;
            this.f17230e = fVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f17228c, this.f17229d, this.f17230e, dVar);
            aVar.f17227b = obj;
            return aVar;
        }

        public final Object invoke(r rVar, C6658d dVar) {
            return ((a) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object f10 = C6680b.f();
            int i10 = this.f17226a;
            if (i10 == 0) {
                w.b(obj);
                r rVar2 = (r) this.f17227b;
                C1790m mVar = this.f17228c;
                C1790m.b bVar = this.f17229d;
                C0303a aVar = new C0303a(this.f17230e, rVar2, (C6658d) null);
                this.f17227b = rVar2;
                this.f17226a = 1;
                if (L.a(mVar, bVar, aVar, this) == f10) {
                    return f10;
                }
                rVar = rVar2;
            } else if (i10 == 1) {
                rVar = (r) this.f17227b;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.a.a(rVar, (Throwable) null, 1, (Object) null);
            return C6514M.f71813a;
        }
    }

    public static final C5694f a(C5694f fVar, C1790m mVar, C1790m.b bVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(mVar, "lifecycle");
        C6496s.h(bVar, "minActiveState");
        return C5696h.e(new a(mVar, bVar, fVar, (C6658d) null));
    }
}
