package h4;

import Ef.m;
import X3.b;
import X3.g;
import a4.C3114g;
import a4.C3116i;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.api.a;
import e4.C3487a;
import e4.C3488b;
import h4.C3568c;
import j4.C3622i;
import j4.C3627n;
import j4.C3630q;
import j4.C3631r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.C3660b;
import k4.C3661c;
import k4.C3666h;
import k4.C3667i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m4.e;
import mf.O;
import o4.C3878a;
import o4.k;
import o4.l;
import o4.z;

/* renamed from: h4.d  reason: case insensitive filesystem */
public final class C3569d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43984c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final g f43985a;

    /* renamed from: b  reason: collision with root package name */
    private final C3630q f43986b;

    /* renamed from: h4.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3569d(g gVar, C3630q qVar, z zVar) {
        this.f43985a = gVar;
        this.f43986b = qVar;
    }

    private final String b(C3568c.C0675c cVar) {
        Object obj = cVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(C3568c.C0675c cVar) {
        Boolean bool;
        Object obj = cVar.b().get("coil#is_sampled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(C3622i iVar, C3568c.b bVar, C3568c.C0675c cVar, C3667i iVar2, C3666h hVar) {
        int i10;
        boolean d10 = d(cVar);
        if (!C3660b.b(iVar2)) {
            String str = (String) bVar.c().get("coil#transformation_size");
            if (str != null) {
                return C6496s.c(str, iVar2.toString());
            }
            int width = cVar.a().getWidth();
            int height = cVar.a().getHeight();
            C3661c d11 = iVar2.d();
            boolean z10 = d11 instanceof C3661c.a;
            int i11 = a.e.API_PRIORITY_OTHER;
            if (z10) {
                i10 = ((C3661c.a) d11).f45103a;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            C3661c c10 = iVar2.c();
            if (c10 instanceof C3661c.a) {
                i11 = ((C3661c.a) c10).f45103a;
            }
            double c11 = C3116i.c(width, height, i10, i11, hVar);
            boolean a10 = k.a(iVar);
            if (a10) {
                double f10 = m.f(c11, 1.0d);
                if (Math.abs(((double) i10) - (((double) width) * f10)) <= 1.0d || Math.abs(((double) i11) - (f10 * ((double) height))) <= 1.0d) {
                    return true;
                }
            } else if ((l.s(i10) || Math.abs(i10 - width) <= 1) && (l.s(i11) || Math.abs(i11 - height) <= 1)) {
                return true;
            }
            if (c11 != 1.0d && !a10) {
                return false;
            }
            if (c11 <= 1.0d || !d10) {
                return true;
            }
            return false;
        } else if (d10) {
            return false;
        } else {
            return true;
        }
    }

    public final C3568c.C0675c a(C3622i iVar, C3568c.b bVar, C3667i iVar2, C3666h hVar) {
        C3568c.C0675c cVar;
        if (!iVar.C().b()) {
            return null;
        }
        C3568c d10 = this.f43985a.d();
        if (d10 != null) {
            cVar = d10.b(bVar);
        } else {
            cVar = null;
        }
        if (cVar == null || !c(iVar, bVar, cVar, iVar2, hVar)) {
            return null;
        }
        return cVar;
    }

    public final boolean c(C3622i iVar, C3568c.b bVar, C3568c.C0675c cVar, C3667i iVar2, C3666h hVar) {
        if (!this.f43986b.c(iVar, C3878a.c(cVar.a()))) {
            return false;
        }
        return e(iVar, bVar, cVar, iVar2, hVar);
    }

    public final C3568c.b f(C3622i iVar, Object obj, C3627n nVar, b bVar) {
        C3568c.b B10 = iVar.B();
        if (B10 != null) {
            return B10;
        }
        bVar.l(iVar, obj);
        String f10 = this.f43985a.getComponents().f(obj, nVar);
        bVar.b(iVar, f10);
        if (f10 == null) {
            return null;
        }
        List O10 = iVar.O();
        Map b10 = iVar.E().b();
        if (O10.isEmpty() && b10.isEmpty()) {
            return new C3568c.b(f10, (Map) null, 2, (DefaultConstructorMarker) null);
        }
        Map B11 = O.B(b10);
        if (!O10.isEmpty()) {
            List O11 = iVar.O();
            int size = O11.size();
            for (int i10 = 0; i10 < size; i10++) {
                B11.put("coil#transformation_" + i10, ((e) O11.get(i10)).getCacheKey());
            }
            B11.put("coil#transformation_size", nVar.o().toString());
        }
        return new C3568c.b(f10, B11);
    }

    public final C3631r g(C3488b.a aVar, C3622i iVar, C3568c.b bVar, C3568c.C0675c cVar) {
        return new C3631r(new BitmapDrawable(iVar.l().getResources(), cVar.a()), iVar, C3114g.MEMORY_CACHE, bVar, b(cVar), d(cVar), l.t(aVar));
    }

    public final boolean h(C3568c.b bVar, C3622i iVar, C3487a.b bVar2) {
        C3568c d10;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (!(!iVar.C().c() || (d10 = this.f43985a.d()) == null || bVar == null)) {
            Drawable e10 = bVar2.e();
            if (e10 instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) e10;
            } else {
                bitmapDrawable = null;
            }
            if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.f()));
                String d11 = bVar2.d();
                if (d11 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d11);
                }
                d10.c(bVar, new C3568c.C0675c(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
