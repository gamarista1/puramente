package c5;

import T4.i;
import T4.k;
import V4.v;
import android.content.res.Resources;

/* renamed from: c5.a  reason: case insensitive filesystem */
public class C3170a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f36451a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f36452b;

    public C3170a(Resources resources, k kVar) {
        this.f36452b = (Resources) o5.k.d(resources);
        this.f36451a = (k) o5.k.d(kVar);
    }

    public boolean a(Object obj, i iVar) {
        return this.f36451a.a(obj, iVar);
    }

    public v b(Object obj, int i10, int i11, i iVar) {
        return C3169A.c(this.f36452b, this.f36451a.b(obj, i10, i11, iVar));
    }
}
