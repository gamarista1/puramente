package m0;

import J0.G;
import J0.m0;
import O0.i;
import O0.j;
import O0.k;
import O0.n;
import O0.q;
import O0.u;
import Q0.C1321d;
import Q0.K;
import Q0.L;
import Wg.g;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.C;
import androidx.collection.C1588b;
import androidx.collection.C1601o;
import androidx.collection.C1602p;
import androidx.collection.D;
import androidx.compose.ui.platform.C1639i1;
import androidx.compose.ui.platform.C1642j1;
import androidx.compose.ui.platform.C1645k1;
import androidx.compose.ui.platform.coreshims.d;
import androidx.compose.ui.platform.coreshims.e;
import androidx.compose.ui.platform.coreshims.f;
import androidx.compose.ui.platform.r;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import c1.v;
import e1.C1942a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6527k;
import mf.C6565s;
import mf.M;
import q0.C2423i;
import qf.C6658d;
import x1.b;
import yf.C6787a;
import yf.C6798l;

/* renamed from: m0.b  reason: case insensitive filesystem */
public final class C2176b implements m, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final r f23563a;

    /* renamed from: b  reason: collision with root package name */
    private C6787a f23564b;

    /* renamed from: c  reason: collision with root package name */
    private d f23565c;

    /* renamed from: d  reason: collision with root package name */
    private final C f23566d = new C(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final D f23567e = new D(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private long f23568f = 100;

    /* renamed from: g  reason: collision with root package name */
    private a f23569g = a.SHOW_ORIGINAL;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23570h = true;

    /* renamed from: i  reason: collision with root package name */
    private final C1588b f23571i = new C1588b(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private final Wg.d f23572j = g.b(1, (Wg.a) null, (C6798l) null, 6, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final Handler f23573k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    private C1601o f23574l = C1602p.a();

    /* renamed from: m  reason: collision with root package name */
    private long f23575m;

    /* renamed from: n  reason: collision with root package name */
    private C f23576n = C1602p.b();

    /* renamed from: o  reason: collision with root package name */
    private C1639i1 f23577o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f23578p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f23579q;

    /* renamed from: m0.b$a */
    private enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* renamed from: m0.b$b  reason: collision with other inner class name */
    private static final class C0379b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0379b f23583a = new C0379b();

        private C0379b() {
        }

        private final void b(C2176b bVar, LongSparseArray longSparseArray) {
            TranslationResponseValue a10;
            CharSequence a11;
            C1642j1 j1Var;
            n b10;
            O0.a aVar;
            C6798l lVar;
            M a12 = b.a(longSparseArray);
            while (a12.hasNext()) {
                long a13 = a12.a();
                ViewTranslationResponse a14 = C2183i.a(longSparseArray.get(a13));
                if (!(a14 == null || (a10 = a14.getValue("android:text")) == null || (a11 = a10.getText()) == null || (j1Var = (C1642j1) bVar.i().c((int) a13)) == null || (b10 = j1Var.b()) == null || (aVar = (O0.a) k.a(b10.w(), i.f4556a.z())) == null || (lVar = (C6798l) aVar.a()) == null)) {
                    Boolean bool = (Boolean) lVar.invoke(new C1321d(a11.toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                }
            }
        }

        /* access modifiers changed from: private */
        public static final void e(C2176b bVar, LongSparseArray longSparseArray) {
            f23583a.b(bVar, longSparseArray);
        }

        public final void c(C2176b bVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            n b10;
            String e10;
            for (long j10 : jArr) {
                C1642j1 j1Var = (C1642j1) bVar.i().c((int) j10);
                if (!(j1Var == null || (b10 = j1Var.b()) == null)) {
                    C2178d.a();
                    ViewTranslationRequest.Builder a10 = C2177c.a(bVar.j().getAutofillId(), (long) b10.o());
                    List list = (List) k.a(b10.w(), q.f4613a.D());
                    if (!(list == null || (e10 = C1942a.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null)) == null)) {
                        ViewTranslationRequest.Builder unused = a10.setValue("android:text", TranslationRequestValue.forText(new C1321d(e10, (List) null, (List) null, 6, (DefaultConstructorMarker) null)));
                        consumer.accept(a10.build());
                    }
                }
                Consumer<ViewTranslationRequest> consumer2 = consumer;
            }
        }

        public final void d(C2176b bVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (C6496s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    b(bVar, longSparseArray);
                } else {
                    bVar.j().post(new l(bVar, longSparseArray));
                }
            }
        }
    }

    /* renamed from: m0.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f23584a;

        /* renamed from: b  reason: collision with root package name */
        Object f23585b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f23586c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2176b f23587d;

        /* renamed from: e  reason: collision with root package name */
        int f23588e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2176b bVar, C6658d dVar) {
            super(dVar);
            this.f23587d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23586c = obj;
            this.f23588e |= Integer.MIN_VALUE;
            return this.f23587d.b(this);
        }
    }

    public C2176b(r rVar, C6787a aVar) {
        this.f23563a = rVar;
        this.f23564b = aVar;
        this.f23577o = new C1639i1(rVar.getSemanticsOwner().a(), C1602p.a());
        this.f23579q = new C2175a(this);
    }

    private final void A() {
        O0.a aVar;
        C6798l lVar;
        C1601o i10 = i();
        Object[] objArr = i10.f12190c;
        long[] jArr = i10.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            j w10 = ((C1642j1) objArr[(i11 << 3) + i13]).b().w();
                            if (!(!C6496s.c(k.a(w10, q.f4613a.r()), Boolean.FALSE) || (aVar = (O0.a) k.a(w10, i.f4556a.A())) == null || (lVar = (C6798l) aVar.a()) == null)) {
                                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private final f B(n nVar) {
        androidx.compose.ui.platform.coreshims.b a10;
        AutofillId autofillId;
        String i10;
        d dVar = this.f23565c;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || (a10 = e.a(this.f23563a)) == null) {
            return null;
        }
        n r10 = nVar.r();
        if (r10 != null) {
            autofillId = dVar.a((long) r10.o());
            if (autofillId == null) {
                return null;
            }
        } else {
            autofillId = a10.a();
        }
        f b10 = dVar.b(autofillId, (long) nVar.o());
        if (b10 == null) {
            return null;
        }
        j w10 = nVar.w();
        q qVar = q.f4613a;
        if (w10.g(qVar.w())) {
            return null;
        }
        Bundle a11 = b10.a();
        if (a11 != null) {
            a11.putLong("android.view.contentcapture.EventTimestamp", this.f23575m);
        }
        String str = (String) k.a(w10, qVar.C());
        if (str != null) {
            b10.e(nVar.o(), (String) null, (String) null, str);
        }
        List list = (List) k.a(w10, qVar.D());
        if (list != null) {
            b10.b("android.widget.TextView");
            b10.f(C1942a.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null));
        }
        C1321d dVar2 = (C1321d) k.a(w10, qVar.g());
        if (dVar2 != null) {
            b10.b("android.widget.EditText");
            b10.f(dVar2);
        }
        List list2 = (List) k.a(w10, qVar.d());
        if (list2 != null) {
            b10.c(C1942a.e(list2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null));
        }
        O0.g gVar = (O0.g) k.a(w10, qVar.y());
        if (!(gVar == null || (i10 = C1645k1.i(gVar.n())) == null)) {
            b10.b(i10);
        }
        L e10 = C1645k1.e(w10);
        if (e10 != null) {
            K l10 = e10.l();
            b10.g(v.h(l10.i().l()) * l10.b().getDensity() * l10.b().r1(), 0, 0, 0);
        }
        C2423i h10 = nVar.h();
        b10.d((int) h10.i(), (int) h10.l(), 0, 0, (int) h10.n(), (int) h10.h());
        return b10;
    }

    private final void C(n nVar) {
        if (l()) {
            F(nVar);
            c(nVar.o(), B(nVar));
            List t10 = nVar.t();
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C((n) t10.get(i10));
            }
        }
    }

    private final void D(n nVar) {
        if (l()) {
            d(nVar.o());
            List t10 = nVar.t();
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                D((n) t10.get(i10));
            }
        }
    }

    private final void E() {
        this.f23576n.i();
        C1601o i10 = i();
        int[] iArr = i10.f12189b;
        Object[] objArr = i10.f12190c;
        long[] jArr = i10.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            this.f23576n.t(iArr[i14], new C1639i1(((C1642j1) objArr[i14]).b(), i()));
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        this.f23577o = new C1639i1(this.f23563a.getSemanticsOwner().a(), i());
    }

    private final void F(n nVar) {
        O0.a aVar;
        C6798l lVar;
        C6798l lVar2;
        j w10 = nVar.w();
        Boolean bool = (Boolean) k.a(w10, q.f4613a.r());
        if (this.f23569g == a.SHOW_ORIGINAL && C6496s.c(bool, Boolean.TRUE)) {
            O0.a aVar2 = (O0.a) k.a(w10, i.f4556a.A());
            if (aVar2 != null && (lVar2 = (C6798l) aVar2.a()) != null) {
                Boolean bool2 = (Boolean) lVar2.invoke(Boolean.FALSE);
            }
        } else if (this.f23569g == a.SHOW_TRANSLATED && C6496s.c(bool, Boolean.FALSE) && (aVar = (O0.a) k.a(w10, i.f4556a.A())) != null && (lVar = (C6798l) aVar.a()) != null) {
            Boolean bool3 = (Boolean) lVar.invoke(Boolean.TRUE);
        }
    }

    private final void c(int i10, f fVar) {
        if (fVar != null) {
            if (this.f23567e.a(i10)) {
                this.f23567e.q(i10);
            } else {
                this.f23566d.t(i10, fVar);
            }
        }
    }

    private final void d(int i10) {
        if (this.f23566d.b(i10)) {
            this.f23566d.q(i10);
        } else {
            this.f23567e.f(i10);
        }
    }

    private final void e(C1601o oVar) {
        int i10;
        n nVar;
        C1321d dVar;
        C1321d dVar2;
        C1321d dVar3;
        C1601o oVar2 = oVar;
        int[] iArr = oVar2.f12189b;
        long[] jArr = oVar2.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = iArr[(i11 << 3) + i14];
                            C1639i1 i1Var = (C1639i1) this.f23576n.c(i15);
                            C1642j1 j1Var = (C1642j1) oVar2.c(i15);
                            if (j1Var != null) {
                                nVar = j1Var.b();
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                if (i1Var == null) {
                                    Iterator it = nVar.w().iterator();
                                    while (it.hasNext()) {
                                        Object key = ((Map.Entry) it.next()).getKey();
                                        q qVar = q.f4613a;
                                        if (C6496s.c(key, qVar.D())) {
                                            List list = (List) k.a(nVar.w(), qVar.D());
                                            if (list != null) {
                                                dVar3 = (C1321d) C6565s.q0(list);
                                            } else {
                                                dVar3 = null;
                                            }
                                            x(nVar.o(), String.valueOf(dVar3));
                                        }
                                    }
                                } else {
                                    Iterator it2 = nVar.w().iterator();
                                    while (it2.hasNext()) {
                                        q qVar2 = q.f4613a;
                                        if (C6496s.c((u) ((Map.Entry) it2.next()).getKey(), qVar2.D())) {
                                            List list2 = (List) k.a(i1Var.b(), qVar2.D());
                                            if (list2 != null) {
                                                dVar = (C1321d) C6565s.q0(list2);
                                            } else {
                                                dVar = null;
                                            }
                                            List list3 = (List) k.a(nVar.w(), qVar2.D());
                                            if (list3 != null) {
                                                dVar2 = (C1321d) C6565s.q0(list3);
                                            } else {
                                                dVar2 = null;
                                            }
                                            if (!C6496s.c(dVar, dVar2)) {
                                                x(nVar.o(), String.valueOf(dVar2));
                                            }
                                        }
                                    }
                                }
                                i10 = 8;
                            } else {
                                G0.a.c("no value for specified key");
                                throw new C6527k();
                            }
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private final void g() {
        O0.a aVar;
        C6787a aVar2;
        C1601o i10 = i();
        Object[] objArr = i10.f12190c;
        long[] jArr = i10.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            j w10 = ((C1642j1) objArr[(i11 << 3) + i13]).b().w();
                            if (!(k.a(w10, q.f4613a.r()) == null || (aVar = (O0.a) k.a(w10, i.f4556a.a())) == null || (aVar2 = (C6787a) aVar.a()) == null)) {
                                Boolean bool = (Boolean) aVar2.invoke();
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(C2176b bVar) {
        if (bVar.l()) {
            m0.j(bVar.f23563a, false, 1, (Object) null);
            bVar.z(bVar.f23563a.getSemanticsOwner().a(), bVar.f23577o);
            bVar.w(bVar.f23563a.getSemanticsOwner().a(), bVar.f23577o);
            bVar.e(bVar.i());
            bVar.E();
            bVar.f23578p = false;
        }
    }

    private final void k() {
        O0.a aVar;
        C6798l lVar;
        C1601o i10 = i();
        Object[] objArr = i10.f12190c;
        long[] jArr = i10.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            j w10 = ((C1642j1) objArr[(i11 << 3) + i13]).b().w();
                            if (!(!C6496s.c(k.a(w10, q.f4613a.r()), Boolean.TRUE) || (aVar = (O0.a) k.a(w10, i.f4556a.A())) == null || (lVar = (C6798l) aVar.a()) == null)) {
                                Boolean bool = (Boolean) lVar.invoke(Boolean.FALSE);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private final void m() {
        d dVar = this.f23565c;
        if (dVar != null && Build.VERSION.SDK_INT >= 29) {
            long j10 = 255;
            char c10 = 7;
            if (this.f23566d.g()) {
                ArrayList arrayList = new ArrayList();
                C c11 = this.f23566d;
                Object[] objArr = c11.f12190c;
                long[] jArr = c11.f12188a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j11 = jArr[i10];
                        long[] jArr2 = jArr;
                        if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j11 & j10) < 128) {
                                    arrayList.add((f) objArr[(i10 << 3) + i12]);
                                }
                                j11 >>= 8;
                                i12++;
                                j10 = 255;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        jArr = jArr2;
                        j10 = 255;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add(((f) arrayList.get(i13)).h());
                }
                dVar.d(arrayList2);
                this.f23566d.i();
            }
            if (this.f23567e.c()) {
                ArrayList arrayList3 = new ArrayList();
                D d10 = this.f23567e;
                int[] iArr = d10.f12195b;
                long[] jArr3 = d10.f12194a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr3[i14];
                        if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i14 << 3) + i16]));
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        }
                        i14++;
                        c10 = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    arrayList4.add(Long.valueOf((long) ((Number) arrayList3.get(i17)).intValue()));
                }
                dVar.e(C6565s.f1(arrayList4));
                this.f23567e.h();
            }
        }
    }

    private final void o(G g10) {
        if (this.f23571i.add(g10)) {
            this.f23572j.c(C6514M.f71813a);
        }
    }

    private final void w(n nVar, C1639i1 i1Var) {
        List t10 = nVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar2 = (n) t10.get(i10);
            if (i().a(nVar2.o()) && !i1Var.a().a(nVar2.o())) {
                C(nVar2);
            }
        }
        C c10 = this.f23576n;
        int[] iArr = c10.f12189b;
        long[] jArr = c10.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            if (!i().a(i14)) {
                                d(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List t11 = nVar.t();
        int size2 = t11.size();
        for (int i15 = 0; i15 < size2; i15++) {
            n nVar3 = (n) t11.get(i15);
            if (i().a(nVar3.o()) && this.f23576n.a(nVar3.o())) {
                Object c11 = this.f23576n.c(nVar3.o());
                if (c11 != null) {
                    w(nVar3, (C1639i1) c11);
                } else {
                    G0.a.c("node not present in pruned tree before this change");
                    throw new C6527k();
                }
            }
        }
    }

    private final void x(int i10, String str) {
        d dVar;
        if (Build.VERSION.SDK_INT >= 29 && (dVar = this.f23565c) != null) {
            AutofillId a10 = dVar.a((long) i10);
            if (a10 != null) {
                dVar.c(a10, str);
            } else {
                G0.a.c("Invalid content capture ID");
                throw new C6527k();
            }
        }
    }

    private final void z(n nVar, C1639i1 i1Var) {
        D d10 = new D(0, 1, (DefaultConstructorMarker) null);
        List t10 = nVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar2 = (n) t10.get(i10);
            if (i().a(nVar2.o())) {
                if (!i1Var.a().a(nVar2.o())) {
                    o(nVar.q());
                    return;
                }
                d10.f(nVar2.o());
            }
        }
        D a10 = i1Var.a();
        int[] iArr = a10.f12195b;
        long[] jArr = a10.f12194a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) >= 128 || d10.a(iArr[(i11 << 3) + i13])) {
                            j10 >>= 8;
                            i13++;
                        } else {
                            o(nVar.q());
                            return;
                        }
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List t11 = nVar.t();
        int size2 = t11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            n nVar3 = (n) t11.get(i14);
            if (i().a(nVar3.o())) {
                Object c10 = this.f23576n.c(nVar3.o());
                if (c10 != null) {
                    z(nVar3, (C1639i1) c10);
                } else {
                    G0.a.c("node not present in pruned tree before this change");
                    throw new C6527k();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(qf.C6658d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof m0.C2176b.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            m0.b$c r0 = (m0.C2176b.c) r0
            int r1 = r0.f23588e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23588e = r1
            goto L_0x0018
        L_0x0013:
            m0.b$c r0 = new m0.b$c
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f23586c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f23588e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r2 = r0.f23585b
            Wg.f r2 = (Wg.f) r2
            java.lang.Object r5 = r0.f23584a
            m0.b r5 = (m0.C2176b) r5
            lf.w.b(r10)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            r10 = r2
            goto L_0x0056
        L_0x0035:
            r10 = move-exception
            goto L_0x00a5
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0040:
            java.lang.Object r2 = r0.f23585b
            Wg.f r2 = (Wg.f) r2
            java.lang.Object r5 = r0.f23584a
            m0.b r5 = (m0.C2176b) r5
            lf.w.b(r10)     // Catch:{ all -> 0x0035 }
            goto L_0x0066
        L_0x004c:
            lf.w.b(r10)
            Wg.d r10 = r9.f23572j     // Catch:{ all -> 0x00a3 }
            Wg.f r10 = r10.iterator()     // Catch:{ all -> 0x00a3 }
            r5 = r9
        L_0x0056:
            r0.f23584a = r5     // Catch:{ all -> 0x0035 }
            r0.f23585b = r10     // Catch:{ all -> 0x0035 }
            r0.f23588e = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r10.a(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x0066:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0035 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x009b
            r2.next()     // Catch:{ all -> 0x0035 }
            boolean r10 = r5.l()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x007a
            r5.m()     // Catch:{ all -> 0x0035 }
        L_0x007a:
            boolean r10 = r5.f23578p     // Catch:{ all -> 0x0035 }
            if (r10 != 0) goto L_0x0087
            r5.f23578p = r4     // Catch:{ all -> 0x0035 }
            android.os.Handler r10 = r5.f23573k     // Catch:{ all -> 0x0035 }
            java.lang.Runnable r6 = r5.f23579q     // Catch:{ all -> 0x0035 }
            r10.post(r6)     // Catch:{ all -> 0x0035 }
        L_0x0087:
            androidx.collection.b r10 = r5.f23571i     // Catch:{ all -> 0x0035 }
            r10.clear()     // Catch:{ all -> 0x0035 }
            long r6 = r5.f23568f     // Catch:{ all -> 0x0035 }
            r0.f23584a = r5     // Catch:{ all -> 0x0035 }
            r0.f23585b = r2     // Catch:{ all -> 0x0035 }
            r0.f23588e = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r10 = Ug.V.a(r6, r0)     // Catch:{ all -> 0x0035 }
            if (r10 != r1) goto L_0x0033
            return r1
        L_0x009b:
            androidx.collection.b r10 = r5.f23571i
            r10.clear()
            lf.M r10 = lf.C6514M.f71813a
            return r10
        L_0x00a3:
            r10 = move-exception
            r5 = r9
        L_0x00a5:
            androidx.collection.b r0 = r5.f23571i
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2176b.b(qf.d):java.lang.Object");
    }

    public final C1601o i() {
        if (this.f23570h) {
            this.f23570h = false;
            this.f23574l = C1645k1.b(this.f23563a.getSemanticsOwner());
            this.f23575m = System.currentTimeMillis();
        }
        return this.f23574l;
    }

    public final r j() {
        return this.f23563a;
    }

    public final boolean l() {
        if (!m.f23591a0.a() || this.f23565c == null) {
            return false;
        }
        return true;
    }

    public void onStart(C1798v vVar) {
        this.f23565c = (d) this.f23564b.invoke();
        C(this.f23563a.getSemanticsOwner().a());
        m();
    }

    public void onStop(C1798v vVar) {
        D(this.f23563a.getSemanticsOwner().a());
        m();
        this.f23565c = null;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f23573k.removeCallbacks(this.f23579q);
        this.f23565c = null;
    }

    public final void p() {
        this.f23569g = a.SHOW_ORIGINAL;
        g();
    }

    public final void q(long[] jArr, int[] iArr, Consumer consumer) {
        C0379b.f23583a.c(this, jArr, iArr, consumer);
    }

    public final void r() {
        this.f23569g = a.SHOW_ORIGINAL;
        k();
    }

    public final void s(G g10) {
        this.f23570h = true;
        if (l()) {
            o(g10);
        }
    }

    public final void t() {
        this.f23570h = true;
        if (l() && !this.f23578p) {
            this.f23578p = true;
            this.f23573k.post(this.f23579q);
        }
    }

    public final void u() {
        this.f23569g = a.SHOW_TRANSLATED;
        A();
    }

    public final void v(C2176b bVar, LongSparseArray longSparseArray) {
        C0379b.f23583a.d(bVar, longSparseArray);
    }

    public void onViewAttachedToWindow(View view) {
    }
}
