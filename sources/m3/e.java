package M3;

import M3.b;
import N3.c;
import N3.d;
import N3.f;
import N3.g;
import N3.h;
import O3.n;
import P3.u;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import androidx.work.s;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.q;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final List f4319a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4320a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(c cVar) {
            C6496s.h(cVar, "it");
            String simpleName = cVar.getClass().getSimpleName();
            C6496s.g(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    public static final class b implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f[] f4321a;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5694f[] f4322a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C5694f[] fVarArr) {
                super(0);
                this.f4322a = fVarArr;
            }

            /* renamed from: a */
            public final Object[] invoke() {
                return new b[this.f4322a.length];
            }
        }

        /* renamed from: M3.e$b$b  reason: collision with other inner class name */
        public static final class C0107b extends l implements q {

            /* renamed from: a  reason: collision with root package name */
            int f4323a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f4324b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f4325c;

            public C0107b(C6658d dVar) {
                super(3, dVar);
            }

            /* renamed from: i */
            public final Object invoke(C5695g gVar, Object[] objArr, C6658d dVar) {
                C0107b bVar = new C0107b(dVar);
                bVar.f4324b = gVar;
                bVar.f4325c = objArr;
                return bVar.invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object f10 = C6680b.f();
                int i10 = this.f4323a;
                if (i10 == 0) {
                    w.b(obj);
                    C5695g gVar = (C5695g) this.f4324b;
                    b[] bVarArr = (b[]) ((Object[]) this.f4325c);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!C6496s.c(bVar, b.a.f4313a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f4313a;
                    }
                    this.f4323a = 1;
                    if (gVar.emit(bVar, this) == f10) {
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

        public b(C5694f[] fVarArr) {
            this.f4321a = fVarArr;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            C5694f[] fVarArr = this.f4321a;
            Object a10 = Yg.l.a(gVar, fVarArr, new a(fVarArr), new C0107b((C6658d) null), dVar);
            if (a10 == C6680b.f()) {
                return a10;
            }
            return C6514M.f71813a;
        }
    }

    public e(List list) {
        C6496s.h(list, "controllers");
        this.f4319a = list;
    }

    public final boolean a(u uVar) {
        C6496s.h(uVar, "workSpec");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f4319a) {
            if (((c) next).d(uVar)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            s e10 = s.e();
            String a10 = f.f4326a;
            e10.a(a10, "Work " + uVar.f5091a + " constrained by " + C6565s.x0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f4320a, 31, (Object) null));
        }
        return arrayList.isEmpty();
    }

    public final C5694f b(u uVar) {
        C6496s.h(uVar, "spec");
        ArrayList<c> arrayList = new ArrayList<>();
        for (Object next : this.f4319a) {
            if (((c) next).c(uVar)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (c f10 : arrayList) {
            arrayList2.add(f10.f());
        }
        return C5696h.n(new b((C5694f[]) C6565s.e1(arrayList2).toArray(new C5694f[0])));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(n nVar) {
        this(C6565s.q(new N3.a(nVar.a()), new N3.b(nVar.b()), new h(nVar.d()), new d(nVar.c()), new g(nVar.c()), new f(nVar.c()), new N3.e(nVar.c())));
        C6496s.h(nVar, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH);
    }
}
