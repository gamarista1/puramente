package z2;

import A2.b;
import E2.d;
import F2.c;
import R2.e;
import S2.f;
import T2.m;
import W2.h;
import W2.s;
import W2.t;
import android.net.Uri;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.collect.C4770v;
import f2.q;
import f3.C1984C;
import f3.C1986b;
import f3.C1989e;
import f3.C1992h;
import f3.C1994j;
import f3.J;
import g3.C2011b;
import h3.C2036a;
import i2.G;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: z2.l  reason: case insensitive filesystem */
public final class C2968l implements u {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f29234r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s  reason: collision with root package name */
    private static final a f29235s = new a(new C2966j());

    /* renamed from: t  reason: collision with root package name */
    private static final a f29236t = new a(new C2967k());

    /* renamed from: b  reason: collision with root package name */
    private boolean f29237b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29238c;

    /* renamed from: d  reason: collision with root package name */
    private int f29239d;

    /* renamed from: e  reason: collision with root package name */
    private int f29240e;

    /* renamed from: f  reason: collision with root package name */
    private int f29241f;

    /* renamed from: g  reason: collision with root package name */
    private int f29242g;

    /* renamed from: h  reason: collision with root package name */
    private int f29243h;

    /* renamed from: i  reason: collision with root package name */
    private int f29244i;

    /* renamed from: j  reason: collision with root package name */
    private int f29245j;

    /* renamed from: k  reason: collision with root package name */
    private int f29246k = 1;

    /* renamed from: l  reason: collision with root package name */
    private int f29247l;

    /* renamed from: m  reason: collision with root package name */
    private C4770v f29248m;

    /* renamed from: n  reason: collision with root package name */
    private int f29249n = 112800;

    /* renamed from: o  reason: collision with root package name */
    private boolean f29250o = true;

    /* renamed from: p  reason: collision with root package name */
    private s.a f29251p = new h();

    /* renamed from: q  reason: collision with root package name */
    private int f29252q;

    /* renamed from: z2.l$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0492a f29253a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f29254b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor f29255c;

        /* renamed from: z2.l$a$a  reason: collision with other inner class name */
        public interface C0492a {
            Constructor a();
        }

        public a(C0492a aVar) {
            this.f29253a = aVar;
        }

        private Constructor b() {
            synchronized (this.f29254b) {
                if (this.f29254b.get()) {
                    Constructor constructor = this.f29255c;
                    return constructor;
                }
                try {
                    Constructor a10 = this.f29253a.a();
                    return a10;
                } catch (ClassNotFoundException unused) {
                    this.f29254b.set(true);
                    return this.f29255c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public C2972p a(Object... objArr) {
            Constructor b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return (C2972p) b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List list) {
        int i11;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                list.add(new C1986b());
                return;
            case 1:
                list.add(new C1989e());
                return;
            case 2:
                boolean z10 = this.f29239d | this.f29237b;
                if (!this.f29238c) {
                    i12 = 0;
                }
                list.add(new C1992h(i12 | z10 ? 1 : 0));
                return;
            case 3:
                boolean z11 = this.f29240e | this.f29237b;
                if (!this.f29238c) {
                    i12 = 0;
                }
                list.add(new b(i12 | z11 ? 1 : 0));
                return;
            case 4:
                C2972p a10 = f29235s.a(Integer.valueOf(this.f29241f));
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new d(this.f29241f));
                    return;
                }
            case 5:
                list.add(new c());
                return;
            case 6:
                s.a aVar = this.f29251p;
                int i14 = this.f29242g;
                if (this.f29250o) {
                    i12 = 0;
                }
                list.add(new e(aVar, i12 | i14));
                return;
            case 7:
                boolean z12 = this.f29245j | this.f29237b;
                if (!this.f29238c) {
                    i12 = 0;
                }
                list.add(new f(i12 | z12 ? 1 : 0));
                return;
            case 8:
                s.a aVar2 = this.f29251p;
                int i15 = this.f29244i;
                if (this.f29250o) {
                    i11 = 0;
                } else {
                    i11 = 32;
                }
                list.add(new T2.h(aVar2, i15 | i11));
                s.a aVar3 = this.f29251p;
                int i16 = this.f29243h;
                if (!this.f29250o) {
                    i13 = 16;
                }
                list.add(new m(aVar3, i13 | i16));
                return;
            case 9:
                list.add(new U2.d());
                return;
            case 10:
                list.add(new C1984C());
                return;
            case 11:
                if (this.f29248m == null) {
                    this.f29248m = C4770v.E();
                }
                list.add(new J(this.f29246k, !this.f29250o ? 1 : 0, this.f29251p, new G(0), new C1994j(this.f29247l, this.f29248m), this.f29249n));
                return;
            case 12:
                list.add(new C2011b());
                return;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                list.add(new H2.a(this.f29252q));
                return;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                C2972p a11 = f29236t.a(new Object[0]);
                if (a11 != null) {
                    list.add(a11);
                    return;
                }
                return;
            case 16:
                list.add(new B2.b(this.f29250o ^ true ? 1 : 0, this.f29251p));
                return;
            case 17:
                list.add(new V2.a());
                return;
            case 18:
                list.add(new C2036a());
                return;
            case 19:
                list.add(new D2.a());
                return;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                int i17 = this.f29243h;
                if ((i17 & 2) == 0 && (i17 & 4) == 0) {
                    list.add(new G2.a());
                    return;
                }
                return;
            case 21:
                list.add(new C2.a());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public static Constructor k() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(C2972p.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Constructor l() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(C2972p.class).getConstructor((Class[]) null);
    }

    public synchronized C2972p[] b(Uri uri, Map map) {
        C2972p[] pVarArr;
        try {
            int[] iArr = f29234r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int b10 = q.b(map);
            if (b10 != -1) {
                i(b10, arrayList);
            }
            int c10 = q.c(uri);
            if (!(c10 == -1 || c10 == b10)) {
                i(c10, arrayList);
            }
            for (int i10 : iArr) {
                if (!(i10 == b10 || i10 == c10)) {
                    i(i10, arrayList);
                }
            }
            pVarArr = new C2972p[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                C2972p pVar = (C2972p) arrayList.get(i11);
                if (this.f29250o && !(pVar.h() instanceof T2.h) && !(pVar.h() instanceof m) && !(pVar.h() instanceof J) && !(pVar.h() instanceof B2.b) && !(pVar.h() instanceof e)) {
                    pVar = new t(pVar, this.f29251p);
                }
                pVarArr[i11] = pVar;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return pVarArr;
    }

    public synchronized C2972p[] d() {
        return b(Uri.EMPTY, new HashMap());
    }

    /* renamed from: j */
    public synchronized C2968l e(boolean z10) {
        this.f29250o = z10;
        return this;
    }

    public synchronized C2968l m(int i10) {
        this.f29252q = i10;
        return this;
    }

    /* renamed from: n */
    public synchronized C2968l c(s.a aVar) {
        this.f29251p = aVar;
        return this;
    }
}
