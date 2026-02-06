package z4;

import A4.c;
import A4.i;
import H4.f;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import u4.C4062b;

/* renamed from: z4.a  reason: case insensitive filesystem */
public class C4230a {

    /* renamed from: a  reason: collision with root package name */
    private final i f50066a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final Map f50067b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f50068c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f50069d;

    /* renamed from: e  reason: collision with root package name */
    private C4062b f50070e;

    /* renamed from: f  reason: collision with root package name */
    private String f50071f = ".ttf";

    public C4230a(Drawable.Callback callback, C4062b bVar) {
        this.f50070e = bVar;
        if (!(callback instanceof View)) {
            f.c("LottieDrawable must be inside of a view for images to work.");
            this.f50069d = null;
            return;
        }
        this.f50069d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(c cVar) {
        Typeface typeface;
        String a10 = cVar.a();
        Typeface typeface2 = (Typeface) this.f50068c.get(a10);
        if (typeface2 != null) {
            return typeface2;
        }
        String c10 = cVar.c();
        String b10 = cVar.b();
        C4062b bVar = this.f50070e;
        if (bVar != null) {
            typeface = bVar.b(a10, c10, b10);
            if (typeface == null) {
                typeface = this.f50070e.a(a10);
            }
        } else {
            typeface = null;
        }
        C4062b bVar2 = this.f50070e;
        if (bVar2 != null && typeface == null) {
            String d10 = bVar2.d(a10, c10, b10);
            if (d10 == null) {
                d10 = this.f50070e.c(a10);
            }
            if (d10 != null) {
                typeface = Typeface.createFromAsset(this.f50069d, d10);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f50069d, "fonts/" + a10 + this.f50071f);
        }
        this.f50068c.put(a10, typeface);
        return typeface;
    }

    private Typeface e(Typeface typeface, String str) {
        int i10;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i10 = 3;
        } else if (contains) {
            i10 = 2;
        } else if (contains2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (typeface.getStyle() == i10) {
            return typeface;
        }
        return Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f50066a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f50067b.get(this.f50066a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e10 = e(a(cVar), cVar.c());
        this.f50067b.put(this.f50066a, e10);
        return e10;
    }

    public void c(String str) {
        this.f50071f = str;
    }

    public void d(C4062b bVar) {
        this.f50070e = bVar;
    }
}
