package O6;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33372a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f33373b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f33374c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f33375d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f33376e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f33377f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f33378g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f33379h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f33380i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f33381j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f33382k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f33383l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f33384m = new c("DNG", "dng");

    /* renamed from: n  reason: collision with root package name */
    public static final List f33385n;

    static {
        c cVar = new c("JPEG", "jpeg");
        f33373b = cVar;
        c cVar2 = new c("PNG", "png");
        f33374c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f33375d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f33376e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f33377f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f33378g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f33379h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f33380i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f33381j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f33382k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f33383l = cVar11;
        f33385n = C6565s.q(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    private b() {
    }

    public static final boolean a(c cVar) {
        C6496s.h(cVar, "imageFormat");
        if (cVar == f33378g || cVar == f33379h || cVar == f33380i || cVar == f33381j) {
            return true;
        }
        return false;
    }

    public static final boolean b(c cVar) {
        C6496s.h(cVar, "imageFormat");
        if (a(cVar) || cVar == f33382k) {
            return true;
        }
        return false;
    }
}
