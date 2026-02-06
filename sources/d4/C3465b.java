package d4;

import X3.g;
import a4.C3114g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d4.C3472i;
import j4.C3627n;
import qf.C6658d;

/* renamed from: d4.b  reason: case insensitive filesystem */
public final class C3465b implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f43098a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43099b;

    /* renamed from: d4.b$a */
    public static final class a implements C3472i.a {
        /* renamed from: b */
        public C3472i a(Bitmap bitmap, C3627n nVar, g gVar) {
            return new C3465b(bitmap, nVar);
        }
    }

    public C3465b(Bitmap bitmap, C3627n nVar) {
        this.f43098a = bitmap;
        this.f43099b = nVar;
    }

    public Object a(C6658d dVar) {
        return new C3470g(new BitmapDrawable(this.f43099b.g().getResources(), this.f43098a), false, C3114g.MEMORY);
    }
}
