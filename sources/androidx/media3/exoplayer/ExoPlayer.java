package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.C1807e;
import androidx.media3.exoplayer.image.ImageOutput;
import f2.C1964E;
import f2.C1968c;
import i2.C2076a;
import i2.C2078c;
import i2.L;
import m2.C2189A;
import m2.C2190B;
import m2.m;
import m2.n;
import m2.o;
import m2.p;
import m2.q;
import m2.r;
import m2.s;
import m2.x;
import nb.C5112g;
import nb.u;
import t2.C2615C;
import t2.C2651q;
import v2.C;
import z2.C2968l;

public interface ExoPlayer extends C1964E {

    public interface a {
        void B(boolean z10);

        void z(boolean z10) {
        }
    }

    public static final class b {

        /* renamed from: A  reason: collision with root package name */
        long f17327A;

        /* renamed from: B  reason: collision with root package name */
        boolean f17328B;

        /* renamed from: C  reason: collision with root package name */
        boolean f17329C;

        /* renamed from: D  reason: collision with root package name */
        Looper f17330D;

        /* renamed from: E  reason: collision with root package name */
        boolean f17331E;

        /* renamed from: F  reason: collision with root package name */
        boolean f17332F;

        /* renamed from: G  reason: collision with root package name */
        String f17333G;

        /* renamed from: H  reason: collision with root package name */
        boolean f17334H;

        /* renamed from: a  reason: collision with root package name */
        final Context f17335a;

        /* renamed from: b  reason: collision with root package name */
        C2078c f17336b;

        /* renamed from: c  reason: collision with root package name */
        long f17337c;

        /* renamed from: d  reason: collision with root package name */
        u f17338d;

        /* renamed from: e  reason: collision with root package name */
        u f17339e;

        /* renamed from: f  reason: collision with root package name */
        u f17340f;

        /* renamed from: g  reason: collision with root package name */
        u f17341g;

        /* renamed from: h  reason: collision with root package name */
        u f17342h;

        /* renamed from: i  reason: collision with root package name */
        C5112g f17343i;

        /* renamed from: j  reason: collision with root package name */
        Looper f17344j;

        /* renamed from: k  reason: collision with root package name */
        int f17345k;

        /* renamed from: l  reason: collision with root package name */
        C1968c f17346l;

        /* renamed from: m  reason: collision with root package name */
        boolean f17347m;

        /* renamed from: n  reason: collision with root package name */
        int f17348n;

        /* renamed from: o  reason: collision with root package name */
        boolean f17349o;

        /* renamed from: p  reason: collision with root package name */
        boolean f17350p;

        /* renamed from: q  reason: collision with root package name */
        boolean f17351q;

        /* renamed from: r  reason: collision with root package name */
        int f17352r;

        /* renamed from: s  reason: collision with root package name */
        int f17353s;

        /* renamed from: t  reason: collision with root package name */
        boolean f17354t;

        /* renamed from: u  reason: collision with root package name */
        C2190B f17355u;

        /* renamed from: v  reason: collision with root package name */
        long f17356v;

        /* renamed from: w  reason: collision with root package name */
        long f17357w;

        /* renamed from: x  reason: collision with root package name */
        long f17358x;

        /* renamed from: y  reason: collision with root package name */
        x f17359y;

        /* renamed from: z  reason: collision with root package name */
        long f17360z;

        public b(Context context) {
            this(context, new n(context), new o(context));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C2189A f(Context context) {
            return new m(context);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C2615C.a g(Context context) {
            return new C2651q(context, (z2.u) new C2968l());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C h(Context context) {
            return new v2.n(context);
        }

        public ExoPlayer e() {
            C2076a.g(!this.f17331E);
            this.f17331E = true;
            return new F(this, (C1964E) null);
        }

        private b(Context context, u uVar, u uVar2) {
            this(context, uVar, uVar2, new p(context), new q(), new r(context), new s());
        }

        private b(Context context, u uVar, u uVar2, u uVar3, u uVar4, u uVar5, C5112g gVar) {
            this.f17335a = (Context) C2076a.e(context);
            this.f17338d = uVar;
            this.f17339e = uVar2;
            this.f17340f = uVar3;
            this.f17341g = uVar4;
            this.f17342h = uVar5;
            this.f17343i = gVar;
            this.f17344j = L.R();
            this.f17346l = C1968c.f19951g;
            this.f17348n = 0;
            this.f17352r = 1;
            this.f17353s = 0;
            this.f17354t = true;
            this.f17355u = C2190B.f23692g;
            this.f17356v = 5000;
            this.f17357w = 15000;
            this.f17358x = 3000;
            this.f17359y = new C1807e.b().a();
            this.f17336b = C2078c.f22089a;
            this.f17360z = 500;
            this.f17327A = 2000;
            this.f17329C = true;
            this.f17333G = "";
            this.f17345k = -1000;
        }
    }

    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f17361b = new c(-9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f17362a;

        public c(long j10) {
            this.f17362a = j10;
        }
    }

    void release();

    void setImageOutput(ImageOutput imageOutput);
}
