package c5;

import T4.c;
import T4.i;
import T4.l;
import V4.v;
import W4.d;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: c5.b  reason: case insensitive filesystem */
public class C3171b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final d f36453a;

    /* renamed from: b  reason: collision with root package name */
    private final l f36454b;

    public C3171b(d dVar, l lVar) {
        this.f36453a = dVar;
        this.f36454b = lVar;
    }

    public c b(i iVar) {
        return this.f36454b.b(iVar);
    }

    /* renamed from: c */
    public boolean a(v vVar, File file, i iVar) {
        return this.f36454b.a(new C3176g(((BitmapDrawable) vVar.get()).getBitmap(), this.f36453a), file, iVar);
    }
}
