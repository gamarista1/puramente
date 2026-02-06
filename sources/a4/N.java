package a4;

import Gh.C5406g;
import Gh.H;
import Gh.M;
import Ug.K;
import a4.C3117j;
import a4.S;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.PostProcessor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import d4.m;
import j4.C3620g;
import j4.C3627n;
import java.nio.ByteBuffer;
import k4.C3660b;
import k4.C3666h;
import k4.C3667i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import lf.C6514M;
import lf.w;
import m4.C3772a;
import o4.g;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;

public final class N implements C3117j {

    /* renamed from: a  reason: collision with root package name */
    private final S f35997a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C3627n f35998b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35999c;

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f36001a;

        /* renamed from: b  reason: collision with root package name */
        Object f36002b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f36004d;

        /* renamed from: e  reason: collision with root package name */
        int f36005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10, C6658d dVar) {
            super(dVar);
            this.f36004d = n10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36003c = obj;
            this.f36005e |= Integer.MIN_VALUE;
            return this.f36004d.decode(this);
        }
    }

    public static final class c implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f36006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f36007b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f36008c;

        public c(kotlin.jvm.internal.N n10, N n11, J j10) {
            this.f36006a = n10;
            this.f36007b = n11;
            this.f36008c = j10;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            int i10;
            int i11;
            boolean z10;
            this.f36006a.f71759a = imageDecoder;
            Size a10 = imageInfo.getSize();
            int width = a10.getWidth();
            int height = a10.getHeight();
            C3667i o10 = this.f36007b.f35998b.o();
            C3666h n10 = this.f36007b.f35998b.n();
            if (C3660b.b(o10)) {
                i10 = width;
            } else {
                i10 = g.h(o10.d(), n10);
            }
            C3667i o11 = this.f36007b.f35998b.o();
            C3666h n11 = this.f36007b.f35998b.n();
            if (C3660b.b(o11)) {
                i11 = height;
            } else {
                i11 = g.h(o11.c(), n11);
            }
            if (width > 0 && height > 0 && !(width == i10 && height == i11)) {
                double c10 = C3116i.c(width, height, i10, i11, this.f36007b.f35998b.n());
                J j10 = this.f36008c;
                if (c10 < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j10.f71755a = z10;
                if (z10 || !this.f36007b.f35998b.c()) {
                    imageDecoder.setTargetSize(Af.a.c(((double) width) * c10), Af.a.c(c10 * ((double) height)));
                }
            }
            this.f36007b.e(imageDecoder);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f36009a;

        /* renamed from: b  reason: collision with root package name */
        Object f36010b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f36012d;

        /* renamed from: e  reason: collision with root package name */
        int f36013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10, C6658d dVar) {
            super(dVar);
            this.f36012d = n10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36011c = obj;
            this.f36013e |= Integer.MIN_VALUE;
            return this.f36012d.h((Drawable) null, this);
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f36014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f36015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f36016c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f36017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Drawable drawable, C6787a aVar, C6787a aVar2, C6658d dVar) {
            super(2, dVar);
            this.f36015b = drawable;
            this.f36016c = aVar;
            this.f36017d = aVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new e(this.f36015b, this.f36016c, this.f36017d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f36014a == 0) {
                w.b(obj);
                C3106H.a(this.f36015b).registerAnimationCallback(g.b(this.f36016c, this.f36017d));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public N(S s10, C3627n nVar, boolean z10) {
        this.f35997a = s10;
        this.f35998b = nVar;
        this.f35999c = z10;
    }

    /* access modifiers changed from: private */
    public final void e(ImageDecoder imageDecoder) {
        int i10;
        PostProcessor postProcessor;
        if (g.g(this.f35998b.f())) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        imageDecoder.setAllocator(i10);
        imageDecoder.setMemorySizePolicy(this.f35998b.d() ^ true ? 1 : 0);
        if (this.f35998b.e() != null) {
            imageDecoder.setTargetColorSpace(this.f35998b.e());
        }
        imageDecoder.setUnpremultipliedRequired(!this.f35998b.m());
        C3772a a10 = C3620g.a(this.f35998b.l());
        if (a10 != null) {
            postProcessor = g.d(a10);
        } else {
            postProcessor = null;
        }
        imageDecoder.setPostProcessor(postProcessor);
    }

    /* access modifiers changed from: private */
    public static final Drawable f(N n10, J j10) {
        kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
        S i10 = n10.i(n10.f35997a);
        try {
            return ImageDecoder.decodeDrawable(n10.g(i10), C3127u.a(new c(n11, n10, j10)));
        } finally {
            ImageDecoder a10 = C3103E.a(n11.f71759a);
            if (a10 != null) {
                a10.close();
            }
            i10.close();
        }
    }

    private final ImageDecoder.Source g(S s10) {
        M b10 = s10.b();
        if (b10 != null) {
            return ImageDecoder.createSource(b10.s());
        }
        S.a f10 = s10.f();
        if (f10 instanceof C3108a) {
            return ImageDecoder.createSource(this.f35998b.g().getAssets(), ((C3108a) f10).a());
        }
        if (f10 instanceof C3113f) {
            return ImageDecoder.createSource(this.f35998b.g().getContentResolver(), ((C3113f) f10).a());
        }
        if (f10 instanceof W) {
            W w10 = (W) f10;
            if (C6496s.c(w10.b(), this.f35998b.g().getPackageName())) {
                return ImageDecoder.createSource(this.f35998b.g().getResources(), w10.c());
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return ImageDecoder.createSource(s10.n().H0());
        }
        if (i10 == 30) {
            return ImageDecoder.createSource(ByteBuffer.wrap(s10.n().H0()));
        }
        return ImageDecoder.createSource(s10.a().s());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(android.graphics.drawable.Drawable r8, qf.C6658d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a4.N.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            a4.N$d r0 = (a4.N.d) r0
            int r1 = r0.f36013e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36013e = r1
            goto L_0x0018
        L_0x0013:
            a4.N$d r0 = new a4.N$d
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f36011c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f36013e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f36010b
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            java.lang.Object r0 = r0.f36009a
            a4.N r0 = (a4.N) r0
            lf.w.b(r9)
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            lf.w.b(r9)
            boolean r9 = a4.C3105G.a(r8)
            if (r9 != 0) goto L_0x0043
            return r8
        L_0x0043:
            android.graphics.drawable.AnimatedImageDrawable r9 = a4.C3106H.a(r8)
            j4.n r2 = r7.f35998b
            j4.o r2 = r2.l()
            java.lang.Integer r2 = j4.C3620g.d(r2)
            if (r2 == 0) goto L_0x0058
            int r2 = r2.intValue()
            goto L_0x0059
        L_0x0058:
            r2 = -1
        L_0x0059:
            r9.setRepeatCount(r2)
            j4.n r9 = r7.f35998b
            j4.o r9 = r9.l()
            yf.a r9 = j4.C3620g.c(r9)
            j4.n r2 = r7.f35998b
            j4.o r2 = r2.l()
            yf.a r2 = j4.C3620g.b(r2)
            if (r9 != 0) goto L_0x0077
            if (r2 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r0 = r7
            goto L_0x0092
        L_0x0077:
            Ug.I0 r4 = Ug.Z.c()
            Ug.I0 r4 = r4.D1()
            a4.N$e r5 = new a4.N$e
            r6 = 0
            r5.<init>(r8, r9, r2, r6)
            r0.f36009a = r7
            r0.f36010b = r8
            r0.f36013e = r3
            java.lang.Object r9 = Ug.C5572i.g(r4, r5, r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0092:
            c4.d r9 = new c4.d
            j4.n r0 = r0.f35998b
            k4.h r0 = r0.n()
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.N.h(android.graphics.drawable.Drawable, qf.d):java.lang.Object");
    }

    private final S i(S s10) {
        if (!this.f35999c || !r.c(C3116i.f36055a, s10.n())) {
            return s10;
        }
        return V.e(H.d(new C3124q(s10.n())), this.f35998b.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object decode(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a4.N.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a4.N$b r0 = (a4.N.b) r0
            int r1 = r0.f36005e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36005e = r1
            goto L_0x0018
        L_0x0013:
            a4.N$b r0 = new a4.N$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f36003c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f36005e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f36001a
            kotlin.jvm.internal.J r0 = (kotlin.jvm.internal.J) r0
            lf.w.b(r8)
            goto L_0x0073
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f36002b
            kotlin.jvm.internal.J r2 = (kotlin.jvm.internal.J) r2
            java.lang.Object r5 = r0.f36001a
            a4.N r5 = (a4.N) r5
            lf.w.b(r8)
            goto L_0x0063
        L_0x0045:
            lf.w.b(r8)
            kotlin.jvm.internal.J r8 = new kotlin.jvm.internal.J
            r8.<init>()
            a4.M r2 = new a4.M
            r2.<init>(r7, r8)
            r0.f36001a = r7
            r0.f36002b = r8
            r0.f36005e = r5
            java.lang.Object r2 = Ug.C5594t0.c(r4, r2, r0, r5, r4)
            if (r2 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r5 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0063:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r0.f36001a = r2
            r0.f36002b = r4
            r0.f36005e = r3
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r0 = r2
        L_0x0073:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            boolean r0 = r0.f71755a
            a4.h r1 = new a4.h
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.N.decode(qf.d):java.lang.Object");
    }

    public static final class a implements C3117j.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f36000a;

        public a(boolean z10) {
            this.f36000a = z10;
        }

        private final boolean a(C5406g gVar) {
            C3116i iVar = C3116i.f36055a;
            if (r.c(iVar, gVar) || r.b(iVar, gVar) || (Build.VERSION.SDK_INT >= 30 && r.a(iVar, gVar))) {
                return true;
            }
            return false;
        }

        public C3117j create(m mVar, C3627n nVar, X3.g gVar) {
            if (!a(mVar.c().n())) {
                return null;
            }
            return new N(mVar.c(), nVar, this.f36000a);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
