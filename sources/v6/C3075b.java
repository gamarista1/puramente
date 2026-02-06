package V6;

import M5.d;
import Sg.p;
import W6.g;
import W6.h;
import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.C6496s;

/* renamed from: V6.b  reason: case insensitive filesystem */
public final class C3075b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f34676a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34677b;

    /* renamed from: c  reason: collision with root package name */
    private final h f34678c;

    /* renamed from: d  reason: collision with root package name */
    private final W6.d f34679d;

    /* renamed from: e  reason: collision with root package name */
    private final d f34680e;

    /* renamed from: f  reason: collision with root package name */
    private final String f34681f;

    /* renamed from: g  reason: collision with root package name */
    private Object f34682g;

    /* renamed from: h  reason: collision with root package name */
    private final int f34683h;

    /* renamed from: i  reason: collision with root package name */
    private final long f34684i;

    public C3075b(String str, g gVar, h hVar, W6.d dVar, d dVar2, String str2) {
        int i10;
        int i11;
        C6496s.h(str, "sourceString");
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(dVar, "imageDecodeOptions");
        this.f34676a = str;
        this.f34677b = gVar;
        this.f34678c = hVar;
        this.f34679d = dVar;
        this.f34680e = dVar2;
        this.f34681f = str2;
        int hashCode = str.hashCode() * 31;
        int i12 = 0;
        if (gVar != null) {
            i10 = gVar.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + hVar.hashCode()) * 31) + dVar.hashCode()) * 31;
        if (dVar2 != null) {
            i11 = dVar2.hashCode();
        } else {
            i11 = 0;
        }
        this.f34683h = ((hashCode2 + i11) * 31) + (str2 != null ? str2.hashCode() : i12);
        this.f34684i = RealtimeSinceBootClock.get().now();
    }

    public String a() {
        return this.f34676a;
    }

    public boolean b(Uri uri) {
        C6496s.h(uri, "uri");
        String a10 = a();
        String uri2 = uri.toString();
        C6496s.g(uri2, "toString(...)");
        return p.O(a10, uri2, false, 2, (Object) null);
    }

    public boolean c() {
        return false;
    }

    public final void d(Object obj) {
        this.f34682g = obj;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(C3075b.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C3075b bVar = (C3075b) obj;
        if (!C6496s.c(this.f34676a, bVar.f34676a) || !C6496s.c(this.f34677b, bVar.f34677b) || !C6496s.c(this.f34678c, bVar.f34678c) || !C6496s.c(this.f34679d, bVar.f34679d) || !C6496s.c(this.f34680e, bVar.f34680e) || !C6496s.c(this.f34681f, bVar.f34681f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f34683h;
    }

    public String toString() {
        String str = this.f34676a;
        g gVar = this.f34677b;
        h hVar = this.f34678c;
        W6.d dVar = this.f34679d;
        d dVar2 = this.f34680e;
        String str2 = this.f34681f;
        return "BitmapMemoryCacheKey(sourceString=" + str + ", resizeOptions=" + gVar + ", rotationOptions=" + hVar + ", imageDecodeOptions=" + dVar + ", postprocessorCacheKey=" + dVar2 + ", postprocessorName=" + str2 + ")";
    }
}
