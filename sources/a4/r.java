package a4;

import Gh.C5406g;
import Gh.C5407h;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final C5407h f36082a;

    /* renamed from: b  reason: collision with root package name */
    private static final C5407h f36083b;

    /* renamed from: c  reason: collision with root package name */
    private static final C5407h f36084c;

    /* renamed from: d  reason: collision with root package name */
    private static final C5407h f36085d;

    /* renamed from: e  reason: collision with root package name */
    private static final C5407h f36086e;

    /* renamed from: f  reason: collision with root package name */
    private static final C5407h f36087f;

    /* renamed from: g  reason: collision with root package name */
    private static final C5407h f36088g;

    /* renamed from: h  reason: collision with root package name */
    private static final C5407h f36089h;

    /* renamed from: i  reason: collision with root package name */
    private static final C5407h f36090i;

    static {
        C5407h.a aVar = C5407h.f63295d;
        f36082a = aVar.d("GIF87a");
        f36083b = aVar.d("GIF89a");
        f36084c = aVar.d("RIFF");
        f36085d = aVar.d("WEBP");
        f36086e = aVar.d("VP8X");
        f36087f = aVar.d("ftyp");
        f36088g = aVar.d("msf1");
        f36089h = aVar.d("hevc");
        f36090i = aVar.d("hevx");
    }

    public static final boolean a(C3116i iVar, C5406g gVar) {
        if (!d(iVar, gVar) || (!gVar.F0(8, f36088g) && !gVar.F0(8, f36089h) && !gVar.F0(8, f36090i))) {
            return false;
        }
        return true;
    }

    public static final boolean b(C3116i iVar, C5406g gVar) {
        if (!e(iVar, gVar) || !gVar.F0(12, f36086e) || !gVar.e0(17) || ((byte) (gVar.i().I(16) & 2)) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean c(C3116i iVar, C5406g gVar) {
        if (gVar.F0(0, f36083b) || gVar.F0(0, f36082a)) {
            return true;
        }
        return false;
    }

    public static final boolean d(C3116i iVar, C5406g gVar) {
        return gVar.F0(4, f36087f);
    }

    public static final boolean e(C3116i iVar, C5406g gVar) {
        if (!gVar.F0(0, f36084c) || !gVar.F0(8, f36085d)) {
            return false;
        }
        return true;
    }
}
