package com.facebook.imagepipeline.producers;

import T5.n;
import W6.h;
import X6.C3078a;
import X6.C3091n;
import a7.f;
import a7.g;
import android.graphics.Bitmap;
import android.net.Uri;
import b6.C3156a;
import c7.C3184d;
import c7.C3185e;
import c7.C3186f;
import c7.C3189i;
import c7.m;
import i7.C3593b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k7.C3674a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m7.C3783c;

/* renamed from: com.facebook.imagepipeline.producers.p  reason: case insensitive filesystem */
public final class C3310p implements d0 {

    /* renamed from: m  reason: collision with root package name */
    public static final a f40023m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final W5.a f40024a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f40025b;

    /* renamed from: c  reason: collision with root package name */
    private final a7.c f40026c;

    /* renamed from: d  reason: collision with root package name */
    private final f f40027d;

    /* renamed from: e  reason: collision with root package name */
    private final C3091n f40028e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f40029f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f40030g;

    /* renamed from: h  reason: collision with root package name */
    private final d0 f40031h;

    /* renamed from: i  reason: collision with root package name */
    private final int f40032i;

    /* renamed from: j  reason: collision with root package name */
    private final C3078a f40033j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f40034k;

    /* renamed from: l  reason: collision with root package name */
    private final n f40035l;

    /* renamed from: com.facebook.imagepipeline.producers.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(C3189i iVar, W6.d dVar) {
            if (((long) iVar.e()) * ((long) iVar.d()) * ((long) C3783c.h(dVar.f34879h)) > 104857600) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$b */
    private final class b extends d {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C3310p f40036k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C3310p pVar, C3308n nVar, e0 e0Var, boolean z10, int i10) {
            super(pVar, nVar, e0Var, z10, i10);
            C6496s.h(nVar, "consumer");
            C6496s.h(e0Var, "producerContext");
            this.f40036k = pVar;
        }

        /* access modifiers changed from: protected */
        public synchronized boolean J(C3189i iVar, int i10) {
            boolean z10;
            if (C3297c.f(i10)) {
                z10 = false;
            } else {
                z10 = super.J(iVar, i10);
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public int x(C3189i iVar) {
            C6496s.h(iVar, "encodedImage");
            return iVar.M();
        }

        /* access modifiers changed from: protected */
        public c7.n z() {
            c7.n d10 = m.d(0, false, false);
            C6496s.g(d10, "of(...)");
            return d10;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$c */
    private final class c extends d {

        /* renamed from: k  reason: collision with root package name */
        private final g f40037k;

        /* renamed from: l  reason: collision with root package name */
        private final f f40038l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C3310p f40039m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C3310p pVar, C3308n nVar, e0 e0Var, g gVar, f fVar, boolean z10, int i10) {
            super(pVar, nVar, e0Var, z10, i10);
            C6496s.h(nVar, "consumer");
            C6496s.h(e0Var, "producerContext");
            C6496s.h(gVar, "progressiveJpegParser");
            C6496s.h(fVar, "progressiveJpegConfig");
            this.f40039m = pVar;
            this.f40037k = gVar;
            this.f40038l = fVar;
            I(0);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
            return r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean J(c7.C3189i r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                r0 = 0
                if (r4 != 0) goto L_0x0006
                monitor-exit(r3)
                return r0
            L_0x0006:
                boolean r1 = super.J(r4, r5)     // Catch:{ all -> 0x0019 }
                boolean r2 = com.facebook.imagepipeline.producers.C3297c.f(r5)     // Catch:{ all -> 0x0019 }
                if (r2 != 0) goto L_0x001b
                r2 = 8
                boolean r2 = com.facebook.imagepipeline.producers.C3297c.n(r5, r2)     // Catch:{ all -> 0x0019 }
                if (r2 == 0) goto L_0x0061
                goto L_0x001b
            L_0x0019:
                r4 = move-exception
                goto L_0x0063
            L_0x001b:
                r2 = 4
                boolean r5 = com.facebook.imagepipeline.producers.C3297c.n(r5, r2)     // Catch:{ all -> 0x0019 }
                if (r5 != 0) goto L_0x0061
                boolean r5 = c7.C3189i.h0(r4)     // Catch:{ all -> 0x0019 }
                if (r5 == 0) goto L_0x0061
                O6.c r5 = r4.y()     // Catch:{ all -> 0x0019 }
                O6.c r2 = O6.b.f33373b     // Catch:{ all -> 0x0019 }
                if (r5 != r2) goto L_0x0061
                a7.g r5 = r3.f40037k     // Catch:{ all -> 0x0019 }
                boolean r4 = r5.g(r4)     // Catch:{ all -> 0x0019 }
                if (r4 != 0) goto L_0x003a
                monitor-exit(r3)
                return r0
            L_0x003a:
                a7.g r4 = r3.f40037k     // Catch:{ all -> 0x0019 }
                int r4 = r4.d()     // Catch:{ all -> 0x0019 }
                int r5 = r3.y()     // Catch:{ all -> 0x0019 }
                if (r4 > r5) goto L_0x0048
                monitor-exit(r3)
                return r0
            L_0x0048:
                a7.f r5 = r3.f40038l     // Catch:{ all -> 0x0019 }
                int r2 = r3.y()     // Catch:{ all -> 0x0019 }
                int r5 = r5.a(r2)     // Catch:{ all -> 0x0019 }
                if (r4 >= r5) goto L_0x005e
                a7.g r5 = r3.f40037k     // Catch:{ all -> 0x0019 }
                boolean r5 = r5.e()     // Catch:{ all -> 0x0019 }
                if (r5 != 0) goto L_0x005e
                monitor-exit(r3)
                return r0
            L_0x005e:
                r3.I(r4)     // Catch:{ all -> 0x0019 }
            L_0x0061:
                monitor-exit(r3)
                return r1
            L_0x0063:
                monitor-exit(r3)     // Catch:{ all -> 0x0019 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3310p.c.J(c7.i, int):boolean");
        }

        /* access modifiers changed from: protected */
        public int x(C3189i iVar) {
            C6496s.h(iVar, "encodedImage");
            return this.f40037k.c();
        }

        /* access modifiers changed from: protected */
        public c7.n z() {
            c7.n b10 = this.f40038l.b(this.f40037k.d());
            C6496s.g(b10, "getQualityInfo(...)");
            return b10;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$d */
    private abstract class d extends C3313t {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final e0 f40040c;

        /* renamed from: d  reason: collision with root package name */
        private final String f40041d = "ProgressiveDecoder";

        /* renamed from: e  reason: collision with root package name */
        private final g0 f40042e;

        /* renamed from: f  reason: collision with root package name */
        private final W6.d f40043f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f40044g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final G f40045h;

        /* renamed from: i  reason: collision with root package name */
        private int f40046i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C3310p f40047j;

        /* renamed from: com.facebook.imagepipeline.producers.p$d$a */
        public static final class a extends C3300f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f40048a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f40049b;

            a(d dVar, boolean z10) {
                this.f40048a = dVar;
                this.f40049b = z10;
            }

            public void a() {
                if (this.f40048a.f40040c.E()) {
                    this.f40048a.f40045h.h();
                }
            }

            public void b() {
                if (this.f40049b) {
                    this.f40048a.A();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C3310p pVar, C3308n nVar, e0 e0Var, boolean z10, int i10) {
            super(nVar);
            C6496s.h(nVar, "consumer");
            C6496s.h(e0Var, "producerContext");
            this.f40047j = pVar;
            this.f40040c = e0Var;
            this.f40042e = e0Var.y();
            W6.d h10 = e0Var.F().h();
            C6496s.g(h10, "getImageDecodeOptions(...)");
            this.f40043f = h10;
            this.f40045h = new G(pVar.f(), new C3311q(this, pVar, i10), h10.f34872a);
            e0Var.b(new a(this, z10));
        }

        /* access modifiers changed from: private */
        public final void A() {
            E(true);
            p().b();
        }

        private final void B(Throwable th2) {
            E(true);
            p().a(th2);
        }

        private final void C(C3185e eVar, int i10) {
            X5.a b10 = this.f40047j.c().b(eVar);
            try {
                E(C3297c.e(i10));
                p().c(b10, i10);
            } finally {
                X5.a.E(b10);
            }
        }

        private final C3185e D(C3189i iVar, int i10, c7.n nVar) {
            boolean z10;
            if (this.f40047j.h() == null || !((Boolean) this.f40047j.i().get()).booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                return this.f40047j.g().a(iVar, i10, nVar, this.f40043f);
            } catch (OutOfMemoryError e10) {
                if (z10) {
                    Runnable h10 = this.f40047j.h();
                    if (h10 != null) {
                        h10.run();
                    }
                    System.gc();
                    return this.f40047j.g().a(iVar, i10, nVar, this.f40043f);
                }
                throw e10;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void E(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 == 0) goto L_0x0020
                boolean r2 = r1.f40044g     // Catch:{ all -> 0x001d }
                if (r2 == 0) goto L_0x0008
                goto L_0x0020
            L_0x0008:
                com.facebook.imagepipeline.producers.n r2 = r1.p()     // Catch:{ all -> 0x001d }
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.d(r0)     // Catch:{ all -> 0x001d }
                r2 = 1
                r1.f40044g = r2     // Catch:{ all -> 0x001d }
                lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x001d }
                monitor-exit(r1)
                com.facebook.imagepipeline.producers.G r2 = r1.f40045h
                r2.c()
                return
            L_0x001d:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            L_0x0020:
                monitor-exit(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3310p.d.E(boolean):void");
        }

        private final void F(C3189i iVar) {
            if (iVar.y() == O6.b.f33373b) {
                iVar.R0(C3674a.c(iVar, C3783c.h(this.f40043f.f34879h), 104857600));
            }
        }

        private final void H(C3189i iVar, C3185e eVar, int i10) {
            this.f40040c.t("encoded_width", Integer.valueOf(iVar.e()));
            this.f40040c.t("encoded_height", Integer.valueOf(iVar.d()));
            this.f40040c.t("encoded_size", Integer.valueOf(iVar.M()));
            this.f40040c.t("image_color_space", iVar.t());
            if (eVar instanceof C3184d) {
                this.f40040c.t("bitmap_config", String.valueOf(((C3184d) eVar).h1().getConfig()));
            }
            if (eVar != null) {
                eVar.I(this.f40040c.getExtras());
            }
            this.f40040c.t("last_scan_num", Integer.valueOf(i10));
        }

        /* access modifiers changed from: private */
        public static final void r(d dVar, C3310p pVar, int i10, C3189i iVar, int i11) {
            String str;
            C6496s.h(dVar, "this$0");
            C6496s.h(pVar, "this$1");
            if (iVar != null) {
                C3593b F10 = dVar.f40040c.F();
                dVar.f40040c.t("image_format", iVar.y().a());
                Uri v10 = F10.v();
                if (v10 != null) {
                    str = v10.toString();
                } else {
                    str = null;
                }
                iVar.W0(str);
                C3091n g10 = F10.g();
                if (g10 == null) {
                    g10 = pVar.e();
                }
                boolean n10 = C3297c.n(i11, 16);
                if ((g10 == C3091n.ALWAYS || (g10 == C3091n.AUTO && !n10)) && (pVar.d() || !b6.f.n(F10.v()))) {
                    h t10 = F10.t();
                    C6496s.g(t10, "getRotationOptions(...)");
                    iVar.R0(C3674a.b(t10, F10.r(), iVar, i10));
                }
                if (dVar.f40040c.f().G().i()) {
                    dVar.F(iVar);
                }
                dVar.v(iVar, i11, dVar.f40046i);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x011c A[Catch:{ all -> 0x0113 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void v(c7.C3189i r18, int r19, int r20) {
            /*
                r17 = this;
                r11 = r17
                r12 = r18
                r0 = r19
                O6.c r1 = r18.y()
                O6.c r2 = O6.b.f33373b
                if (r1 == r2) goto L_0x0015
                boolean r1 = com.facebook.imagepipeline.producers.C3297c.f(r19)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r11.f40044g
                if (r1 != 0) goto L_0x01a0
                boolean r1 = c7.C3189i.h0(r18)
                if (r1 != 0) goto L_0x0021
                goto L_0x01a0
            L_0x0021:
                O6.c r1 = r18.y()
                O6.c r2 = O6.b.f33375d
                boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
                r2 = 0
                java.lang.String r13 = "DecodeProducer"
                if (r1 == 0) goto L_0x007c
                com.facebook.imagepipeline.producers.p$a r1 = com.facebook.imagepipeline.producers.C3310p.f40023m
                W6.d r3 = r11.f40043f
                boolean r1 = r1.b(r12, r3)
                if (r1 == 0) goto L_0x007c
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                int r1 = r18.e()
                int r3 = r18.d()
                W6.d r4 = r11.f40043f
                android.graphics.Bitmap$Config r4 = r4.f34879h
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Image is too big to attempt decoding: w = "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = ", h = "
                r5.append(r1)
                r5.append(r3)
                java.lang.String r1 = ", pixel config = "
                r5.append(r1)
                r5.append(r4)
                java.lang.String r1 = ", max bitmap size = 104857600"
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                r0.<init>(r1)
                com.facebook.imagepipeline.producers.g0 r1 = r11.f40042e
                com.facebook.imagepipeline.producers.e0 r3 = r11.f40040c
                r1.k(r3, r13, r0, r2)
                r11.B(r0)
                return
            L_0x007c:
                O6.c r1 = r18.y()
                java.lang.String r3 = "getImageFormat(...)"
                kotlin.jvm.internal.C6496s.g(r1, r3)
                java.lang.String r1 = r1.a()
                java.lang.String r3 = "unknown"
                if (r1 != 0) goto L_0x008f
                r7 = r3
                goto L_0x0090
            L_0x008f:
                r7 = r1
            L_0x0090:
                int r1 = r18.e()
                int r4 = r18.d()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                java.lang.String r1 = "x"
                r5.append(r1)
                r5.append(r4)
                java.lang.String r8 = r5.toString()
                int r4 = r18.I()
                java.lang.String r10 = java.lang.String.valueOf(r4)
                boolean r6 = com.facebook.imagepipeline.producers.C3297c.e(r19)
                r4 = 1
                if (r6 == 0) goto L_0x00c5
                r5 = 8
                boolean r5 = com.facebook.imagepipeline.producers.C3297c.n(r0, r5)
                if (r5 != 0) goto L_0x00c5
                r5 = r4
                goto L_0x00c6
            L_0x00c5:
                r5 = 0
            L_0x00c6:
                r9 = 4
                boolean r9 = com.facebook.imagepipeline.producers.C3297c.n(r0, r9)
                com.facebook.imagepipeline.producers.e0 r14 = r11.f40040c
                i7.b r14 = r14.F()
                W6.g r14 = r14.r()
                if (r14 == 0) goto L_0x00ef
                int r3 = r14.f34903a
                int r14 = r14.f34904b
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r3)
                r15.append(r1)
                r15.append(r14)
                java.lang.String r1 = r15.toString()
                r14 = r1
                goto L_0x00f0
            L_0x00ef:
                r14 = r3
            L_0x00f0:
                com.facebook.imagepipeline.producers.G r1 = r11.f40045h     // Catch:{ all -> 0x0113 }
                long r15 = r1.f()     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.e0 r1 = r11.f40040c     // Catch:{ all -> 0x0113 }
                i7.b r1 = r1.F()     // Catch:{ all -> 0x0113 }
                android.net.Uri r1 = r1.v()     // Catch:{ all -> 0x0113 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0113 }
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.C6496s.g(r1, r3)     // Catch:{ all -> 0x0113 }
                if (r5 != 0) goto L_0x0116
                if (r9 == 0) goto L_0x010e
                goto L_0x0116
            L_0x010e:
                int r3 = r17.x(r18)     // Catch:{ all -> 0x0113 }
                goto L_0x011a
            L_0x0113:
                r0 = move-exception
                goto L_0x019c
            L_0x0116:
                int r3 = r18.M()     // Catch:{ all -> 0x0113 }
            L_0x011a:
                if (r5 != 0) goto L_0x0124
                if (r9 == 0) goto L_0x011f
                goto L_0x0124
            L_0x011f:
                c7.n r5 = r17.z()     // Catch:{ all -> 0x0113 }
                goto L_0x0126
            L_0x0124:
                c7.n r5 = c7.m.f36558d     // Catch:{ all -> 0x0113 }
            L_0x0126:
                com.facebook.imagepipeline.producers.g0 r9 = r11.f40042e     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.e0 r2 = r11.f40040c     // Catch:{ all -> 0x0113 }
                r9.d(r2, r13)     // Catch:{ all -> 0x0113 }
                kotlin.jvm.internal.C6496s.e(r5)     // Catch:{ a -> 0x0160 }
                c7.e r9 = r11.D(r12, r3, r5)     // Catch:{ a -> 0x0160 }
                int r1 = r18.I()     // Catch:{ Exception -> 0x0159 }
                if (r1 == r4) goto L_0x013c
                r0 = r0 | 16
            L_0x013c:
                r1 = r17
                r2 = r9
                r3 = r15
                r15 = r9
                r9 = r14
                java.util.Map r1 = r1.w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.g0 r2 = r11.f40042e     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.e0 r3 = r11.f40040c     // Catch:{ all -> 0x0113 }
                r2.j(r3, r13, r1)     // Catch:{ all -> 0x0113 }
                r1 = r20
                r11.H(r12, r15, r1)     // Catch:{ all -> 0x0113 }
                r11.C(r15, r0)     // Catch:{ all -> 0x0113 }
                c7.C3189i.f(r18)
                return
            L_0x0159:
                r0 = move-exception
                r1 = r9
                r2 = r1
                goto L_0x0183
            L_0x015d:
                r0 = move-exception
                r2 = 0
                goto L_0x0183
            L_0x0160:
                r0 = move-exception
                c7.i r2 = r0.a()     // Catch:{ Exception -> 0x015d }
                java.lang.String r3 = r11.f40041d     // Catch:{ Exception -> 0x015d }
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                java.lang.String r9 = r0.getMessage()     // Catch:{ Exception -> 0x015d }
                r12 = 10
                java.lang.String r12 = r2.v(r12)     // Catch:{ Exception -> 0x015d }
                int r2 = r2.M()     // Catch:{ Exception -> 0x015d }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x015d }
                java.lang.Object[] r1 = new java.lang.Object[]{r9, r1, r12, r2}     // Catch:{ Exception -> 0x015d }
                U5.a.K(r3, r4, r1)     // Catch:{ Exception -> 0x015d }
                throw r0     // Catch:{ Exception -> 0x015d }
            L_0x0183:
                kotlin.jvm.internal.C6496s.e(r5)     // Catch:{ all -> 0x0113 }
                r1 = r17
                r3 = r15
                r9 = r14
                java.util.Map r1 = r1.w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.g0 r2 = r11.f40042e     // Catch:{ all -> 0x0113 }
                com.facebook.imagepipeline.producers.e0 r3 = r11.f40040c     // Catch:{ all -> 0x0113 }
                r2.k(r3, r13, r0, r1)     // Catch:{ all -> 0x0113 }
                r11.B(r0)     // Catch:{ all -> 0x0113 }
                c7.C3189i.f(r18)
                return
            L_0x019c:
                c7.C3189i.f(r18)
                throw r0
            L_0x01a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3310p.d.v(c7.i, int, int):void");
        }

        private final Map w(C3185e eVar, long j10, c7.n nVar, boolean z10, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            C3185e eVar2 = eVar;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            String str9 = null;
            if (!this.f40042e.f(this.f40040c, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j10);
            String valueOf2 = String.valueOf(nVar.b());
            String valueOf3 = String.valueOf(z10);
            if (!(eVar2 == null || (extras = eVar.getExtras()) == null || (obj = extras.get("non_fatal_decode_error")) == null)) {
                str9 = obj.toString();
            }
            Object obj2 = "non_fatal_decode_error";
            String str10 = str9;
            if (eVar2 instanceof C3186f) {
                Bitmap h12 = ((C3186f) eVar2).h1();
                C6496s.g(h12, "getUnderlyingBitmap(...)");
                Bitmap bitmap = h12;
                String str11 = h12.getWidth() + "x" + h12.getHeight();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", str11);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str6);
                hashMap.put("imageFormat", str5);
                hashMap.put("requestedImageSize", str7);
                hashMap.put("sampleSize", str4);
                int byteCount = bitmap.getByteCount();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(byteCount);
                hashMap.put("byteCount", sb2.toString());
                if (str10 != null) {
                    hashMap.put(obj2, str10);
                }
                return T5.g.a(hashMap);
            }
            String str12 = str8;
            String str13 = str10;
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str6);
            hashMap2.put("imageFormat", str5);
            hashMap2.put("requestedImageSize", str7);
            hashMap2.put("sampleSize", str12);
            if (str10 != null) {
                hashMap2.put(obj2, str10);
            }
            return T5.g.a(hashMap2);
        }

        /* renamed from: G */
        public void i(C3189i iVar, int i10) {
            if (!j7.b.d()) {
                boolean e10 = C3297c.e(i10);
                if (e10) {
                    if (iVar == null) {
                        boolean c10 = C6496s.c(this.f40040c.Q("cached_value_found"), Boolean.TRUE);
                        if (!this.f40040c.f().G().h() || this.f40040c.T() == C3593b.c.FULL_FETCH || c10) {
                            B(new C3156a("Encoded image is null."));
                            return;
                        }
                    } else if (!iVar.g0()) {
                        B(new C3156a("Encoded image is not valid."));
                        return;
                    }
                }
                if (J(iVar, i10)) {
                    boolean n10 = C3297c.n(i10, 4);
                    if (e10 || n10 || this.f40040c.E()) {
                        this.f40045h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            j7.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean e11 = C3297c.e(i10);
                if (e11) {
                    if (iVar == null) {
                        boolean c11 = C6496s.c(this.f40040c.Q("cached_value_found"), Boolean.TRUE);
                        if (this.f40040c.f().G().h() && this.f40040c.T() != C3593b.c.FULL_FETCH) {
                            if (c11) {
                            }
                        }
                        B(new C3156a("Encoded image is null."));
                        j7.b.b();
                        return;
                    } else if (!iVar.g0()) {
                        B(new C3156a("Encoded image is not valid."));
                        j7.b.b();
                        return;
                    }
                }
                if (!J(iVar, i10)) {
                    j7.b.b();
                    return;
                }
                boolean n11 = C3297c.n(i10, 4);
                if (e11 || n11 || this.f40040c.E()) {
                    this.f40045h.h();
                }
                C6514M m10 = C6514M.f71813a;
                j7.b.b();
            } catch (Throwable th2) {
                j7.b.b();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        public final void I(int i10) {
            this.f40046i = i10;
        }

        /* access modifiers changed from: protected */
        public boolean J(C3189i iVar, int i10) {
            return this.f40045h.k(iVar, i10);
        }

        public void g() {
            A();
        }

        public void h(Throwable th2) {
            C6496s.h(th2, "t");
            B(th2);
        }

        /* access modifiers changed from: protected */
        public void j(float f10) {
            super.j(f10 * 0.99f);
        }

        /* access modifiers changed from: protected */
        public abstract int x(C3189i iVar);

        /* access modifiers changed from: protected */
        public final int y() {
            return this.f40046i;
        }

        /* access modifiers changed from: protected */
        public abstract c7.n z();
    }

    public C3310p(W5.a aVar, Executor executor, a7.c cVar, f fVar, C3091n nVar, boolean z10, boolean z11, d0 d0Var, int i10, C3078a aVar2, Runnable runnable, n nVar2) {
        C6496s.h(aVar, "byteArrayPool");
        C6496s.h(executor, "executor");
        C6496s.h(cVar, "imageDecoder");
        C6496s.h(fVar, "progressiveJpegConfig");
        C6496s.h(nVar, "downsampleMode");
        C6496s.h(d0Var, "inputProducer");
        C6496s.h(aVar2, "closeableReferenceFactory");
        C6496s.h(nVar2, "recoverFromDecoderOOM");
        this.f40024a = aVar;
        this.f40025b = executor;
        this.f40026c = cVar;
        this.f40027d = fVar;
        this.f40028e = nVar;
        this.f40029f = z10;
        this.f40030g = z11;
        this.f40031h = d0Var;
        this.f40032i = i10;
        this.f40033j = aVar2;
        this.f40034k = runnable;
        this.f40035l = nVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.facebook.imagepipeline.producers.p$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.facebook.imagepipeline.producers.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.facebook.imagepipeline.producers.p$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.facebook.imagepipeline.producers.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.facebook.imagepipeline.producers.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.facebook.imagepipeline.producers.p$b} */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.imagepipeline.producers.n] */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.facebook.imagepipeline.producers.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.facebook.imagepipeline.producers.C3308n r11, com.facebook.imagepipeline.producers.e0 r12) {
        /*
            r10 = this;
            java.lang.String r1 = "consumer"
            kotlin.jvm.internal.C6496s.h(r11, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C6496s.h(r12, r1)
            boolean r1 = j7.b.d()
            if (r1 != 0) goto L_0x0053
            i7.b r1 = r12.F()
            android.net.Uri r2 = r1.v()
            boolean r2 = b6.f.n(r2)
            if (r2 != 0) goto L_0x0036
            android.net.Uri r1 = r1.v()
            boolean r1 = i7.C3594c.s(r1)
            if (r1 != 0) goto L_0x0036
            com.facebook.imagepipeline.producers.p$b r7 = new com.facebook.imagepipeline.producers.p$b
            boolean r5 = r10.f40030g
            int r6 = r10.f40032i
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x004d
        L_0x0036:
            a7.g r5 = new a7.g
            W5.a r1 = r10.f40024a
            r5.<init>(r1)
            com.facebook.imagepipeline.producers.p$c r9 = new com.facebook.imagepipeline.producers.p$c
            a7.f r6 = r10.f40027d
            boolean r7 = r10.f40030g
            int r8 = r10.f40032i
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r7 = r9
        L_0x004d:
            com.facebook.imagepipeline.producers.d0 r1 = r10.f40031h
            r1.b(r7, r12)
            goto L_0x00a1
        L_0x0053:
            java.lang.String r1 = "DecodeProducer#produceResults"
            j7.b.a(r1)
            i7.b r1 = r12.F()     // Catch:{ all -> 0x007e }
            android.net.Uri r2 = r1.v()     // Catch:{ all -> 0x007e }
            boolean r2 = b6.f.n(r2)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0080
            android.net.Uri r1 = r1.v()     // Catch:{ all -> 0x007e }
            boolean r1 = i7.C3594c.s(r1)     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0080
            com.facebook.imagepipeline.producers.p$b r7 = new com.facebook.imagepipeline.producers.p$b     // Catch:{ all -> 0x007e }
            boolean r5 = r10.f40030g     // Catch:{ all -> 0x007e }
            int r6 = r10.f40032i     // Catch:{ all -> 0x007e }
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0097
        L_0x007e:
            r0 = move-exception
            goto L_0x00a2
        L_0x0080:
            a7.g r5 = new a7.g     // Catch:{ all -> 0x007e }
            W5.a r1 = r10.f40024a     // Catch:{ all -> 0x007e }
            r5.<init>(r1)     // Catch:{ all -> 0x007e }
            com.facebook.imagepipeline.producers.p$c r9 = new com.facebook.imagepipeline.producers.p$c     // Catch:{ all -> 0x007e }
            a7.f r6 = r10.f40027d     // Catch:{ all -> 0x007e }
            boolean r7 = r10.f40030g     // Catch:{ all -> 0x007e }
            int r8 = r10.f40032i     // Catch:{ all -> 0x007e }
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007e }
            r7 = r9
        L_0x0097:
            com.facebook.imagepipeline.producers.d0 r1 = r10.f40031h     // Catch:{ all -> 0x007e }
            r1.b(r7, r12)     // Catch:{ all -> 0x007e }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x007e }
            j7.b.b()
        L_0x00a1:
            return
        L_0x00a2:
            j7.b.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3310p.b(com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.e0):void");
    }

    public final C3078a c() {
        return this.f40033j;
    }

    public final boolean d() {
        return this.f40029f;
    }

    public final C3091n e() {
        return this.f40028e;
    }

    public final Executor f() {
        return this.f40025b;
    }

    public final a7.c g() {
        return this.f40026c;
    }

    public final Runnable h() {
        return this.f40034k;
    }

    public final n i() {
        return this.f40035l;
    }
}
