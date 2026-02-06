package com.facebook.fresco.animation.factory;

import P6.e;
import R5.g;
import R5.i;
import T5.d;
import T5.o;
import V6.n;
import X6.C3093p;
import android.content.Context;
import android.graphics.Rect;
import b7.C3158a;
import c7.C3185e;
import c7.C3189i;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;

@d
public class AnimatedFactoryV2Impl implements Q6.a {

    /* renamed from: a  reason: collision with root package name */
    private final U6.d f39474a;

    /* renamed from: b  reason: collision with root package name */
    private final C3093p f39475b;

    /* renamed from: c  reason: collision with root package name */
    private final n f39476c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39477d;

    /* renamed from: e  reason: collision with root package name */
    private Q6.d f39478e;

    /* renamed from: f  reason: collision with root package name */
    private R6.b f39479f;

    /* renamed from: g  reason: collision with root package name */
    private S6.a f39480g;

    /* renamed from: h  reason: collision with root package name */
    private C3158a f39481h;

    /* renamed from: i  reason: collision with root package name */
    private g f39482i;

    /* renamed from: j  reason: collision with root package name */
    private int f39483j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f39484k;

    /* renamed from: l  reason: collision with root package name */
    private int f39485l;

    class a implements a7.c {
        a() {
        }

        public C3185e a(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
            return AnimatedFactoryV2Impl.this.n().b(iVar, dVar, dVar.f34880i);
        }
    }

    class b implements R6.b {
        b() {
        }

        public P6.a a(e eVar, Rect rect) {
            return new R6.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f39477d);
        }
    }

    class c implements R6.b {
        c() {
        }

        public P6.a a(e eVar, Rect rect) {
            return new R6.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f39477d);
        }
    }

    @d
    public AnimatedFactoryV2Impl(U6.d dVar, C3093p pVar, n nVar, boolean z10, boolean z11, int i10, int i11, g gVar) {
        this.f39474a = dVar;
        this.f39475b = pVar;
        this.f39476c = nVar;
        this.f39483j = i10;
        this.f39484k = z11;
        this.f39477d = z10;
        this.f39482i = gVar;
        this.f39485l = i11;
    }

    private Q6.d j() {
        return new Q6.e(new c(), this.f39474a, this.f39484k);
    }

    private D6.d k() {
        D6.b bVar = new D6.b();
        ExecutorService executorService = this.f39482i;
        if (executorService == null) {
            executorService = new R5.d(this.f39475b.d());
        }
        D6.c cVar = new D6.c();
        T5.n nVar = o.f34179b;
        return new D6.d(l(), i.g(), executorService, RealtimeSinceBootClock.get(), this.f39474a, this.f39476c, bVar, cVar, nVar, o.a(Boolean.valueOf(this.f39484k)), o.a(Boolean.valueOf(this.f39477d)), o.a(Integer.valueOf(this.f39483j)), o.a(Integer.valueOf(this.f39485l)));
    }

    private R6.b l() {
        if (this.f39479f == null) {
            this.f39479f = new b();
        }
        return this.f39479f;
    }

    /* access modifiers changed from: private */
    public S6.a m() {
        if (this.f39480g == null) {
            this.f39480g = new S6.a();
        }
        return this.f39480g;
    }

    /* access modifiers changed from: private */
    public Q6.d n() {
        if (this.f39478e == null) {
            this.f39478e = j();
        }
        return this.f39478e;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer o() {
        return 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer p() {
        return 3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C3185e q(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
        return n().a(iVar, dVar, dVar.f34880i);
    }

    public C3158a a(Context context) {
        if (this.f39481h == null) {
            this.f39481h = k();
        }
        return this.f39481h;
    }

    public a7.c b() {
        return new D6.a(this);
    }

    public a7.c c() {
        return new a();
    }
}
