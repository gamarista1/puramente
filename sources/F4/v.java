package F4;

import B4.b;
import B4.j;
import B4.k;
import B4.n;
import C4.h;
import D4.e;
import G4.c;
import H4.l;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u4.C4071k;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30733a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30734b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30735c = c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30736a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                D4.e$b[] r0 = D4.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30736a = r0
                D4.e$b r1 = D4.e.b.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30736a     // Catch:{ NoSuchFieldError -> 0x001d }
                D4.e$b r1 = D4.e.b.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: F4.v.a.<clinit>():void");
        }
    }

    public static e a(c cVar, C4071k kVar) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        c cVar2 = cVar;
        C4071k kVar2 = kVar;
        e.b bVar = e.b.NONE;
        h hVar = h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.f();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar2 = bVar;
        h hVar2 = hVar;
        e.a aVar = null;
        String str = null;
        j jVar = null;
        k kVar3 = null;
        b bVar3 = null;
        C4.a aVar2 = null;
        C3007j jVar2 = null;
        long j10 = 0;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        long j11 = -1;
        float f16 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        n nVar = null;
        while (cVar.q()) {
            switch (cVar2.T(f30733a)) {
                case 0:
                    str2 = cVar.F();
                    break;
                case 1:
                    j10 = (long) cVar.y();
                    break;
                case 2:
                    str = cVar.F();
                    break;
                case 3:
                    int y10 = cVar.y();
                    aVar = e.a.UNKNOWN;
                    if (y10 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[y10];
                        break;
                    }
                case 4:
                    j11 = (long) cVar.y();
                    break;
                case 5:
                    i10 = (int) (((float) cVar.y()) * l.e());
                    break;
                case 6:
                    i11 = (int) (((float) cVar.y()) * l.e());
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.F());
                    break;
                case 8:
                    nVar = C3000c.g(cVar, kVar);
                    break;
                case 9:
                    int y11 = cVar.y();
                    if (y11 < e.b.values().length) {
                        bVar2 = e.b.values()[y11];
                        int i13 = a.f30736a[bVar2.ordinal()];
                        if (i13 == 1) {
                            kVar2.a("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            kVar2.a("Unsupported matte type: Luma Inverted");
                        }
                        kVar2.r(1);
                        break;
                    } else {
                        kVar2.a("Unsupported matte type: " + y11);
                        break;
                    }
                case 10:
                    cVar.b();
                    while (cVar.q()) {
                        arrayList2.add(x.a(cVar, kVar));
                    }
                    kVar2.r(arrayList2.size());
                    cVar.n();
                    break;
                case 11:
                    cVar.b();
                    while (cVar.q()) {
                        C4.c a10 = C3005h.a(cVar, kVar);
                        if (a10 != null) {
                            arrayList3.add(a10);
                        }
                    }
                    cVar.n();
                    break;
                case 12:
                    cVar.f();
                    while (cVar.q()) {
                        int T10 = cVar2.T(f30734b);
                        if (T10 == 0) {
                            jVar = C3001d.d(cVar, kVar);
                        } else if (T10 != 1) {
                            cVar.U();
                            cVar.V();
                        } else {
                            cVar.b();
                            if (cVar.q()) {
                                kVar3 = C2999b.a(cVar, kVar);
                            }
                            while (cVar.q()) {
                                cVar.V();
                            }
                            cVar.n();
                        }
                    }
                    cVar.o();
                    break;
                case 13:
                    cVar.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.q()) {
                        cVar.f();
                        while (cVar.q()) {
                            int T11 = cVar2.T(f30735c);
                            if (T11 == 0) {
                                int y12 = cVar.y();
                                if (y12 == 29) {
                                    aVar2 = C3002e.b(cVar, kVar);
                                } else if (y12 == 25) {
                                    jVar2 = new C3008k().b(cVar2, kVar2);
                                }
                            } else if (T11 != 1) {
                                cVar.U();
                                cVar.V();
                            } else {
                                arrayList4.add(cVar.F());
                            }
                        }
                        cVar.o();
                    }
                    cVar.n();
                    kVar2.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    f16 = (float) cVar.v();
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    f12 = (float) cVar.v();
                    break;
                case 16:
                    f13 = (float) (cVar.v() * ((double) l.e()));
                    break;
                case 17:
                    f14 = (float) (cVar.v() * ((double) l.e()));
                    break;
                case 18:
                    f11 = (float) cVar.v();
                    break;
                case 19:
                    f15 = (float) cVar.v();
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    bVar3 = C3001d.f(cVar2, kVar2, false);
                    break;
                case 21:
                    str3 = cVar.F();
                    break;
                case 22:
                    z12 = cVar.t();
                    break;
                case 23:
                    if (cVar.y() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 24:
                    int y13 = cVar.y();
                    if (y13 < h.values().length) {
                        hVar2 = h.values()[y13];
                        break;
                    } else {
                        kVar2.a("Unsupported Blend Mode: " + y13);
                        hVar2 = h.NORMAL;
                        break;
                    }
                default:
                    cVar.U();
                    cVar.V();
                    break;
            }
        }
        cVar.o();
        ArrayList arrayList5 = new ArrayList();
        if (f11 > 0.0f) {
            I4.a aVar3 = r0;
            arrayList = arrayList2;
            z10 = z11;
            I4.a aVar4 = new I4.a(kVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f11));
            arrayList5.add(aVar3);
            f10 = 0.0f;
        } else {
            arrayList = arrayList2;
            z10 = z11;
            f10 = 0.0f;
        }
        if (f15 <= f10) {
            f15 = kVar.f();
        }
        C4071k kVar4 = kVar;
        arrayList5.add(new I4.a(kVar4, valueOf2, valueOf2, (Interpolator) null, f11, Float.valueOf(f15)));
        arrayList5.add(new I4.a(kVar4, valueOf, valueOf, (Interpolator) null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            kVar2.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new n();
            }
            nVar.m(z10);
        }
        return new e(arrayList3, kVar, str2, j10, aVar, j11, str, arrayList, nVar, i10, i11, i12, f16, f12, f13, f14, jVar, kVar3, arrayList5, bVar2, bVar3, z12, aVar2, jVar2, hVar2);
    }

    public static e b(C4071k kVar) {
        Rect b10 = kVar.b();
        List emptyList = Collections.emptyList();
        e.a aVar = e.a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        n nVar = r4;
        n nVar2 = new n();
        return new e(emptyList, kVar, "__container", -1, aVar, -1, (String) null, emptyList2, nVar, 0, 0, 0, 0.0f, 0.0f, (float) b10.width(), (float) b10.height(), (j) null, (k) null, Collections.emptyList(), e.b.NONE, (b) null, false, (C4.a) null, (C3007j) null, h.NORMAL);
    }
}
