package p6;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.C6496s;
import n6.c;

/* renamed from: p6.a  reason: case insensitive filesystem */
public final class C3934a extends c {

    /* renamed from: b  reason: collision with root package name */
    private final C3935b f47574b;

    /* renamed from: c  reason: collision with root package name */
    private long f47575c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f47576d = -1;

    public C3934a(C3935b bVar) {
        this.f47574b = bVar;
    }

    public void n(String str, Object obj, Animatable animatable) {
        C6496s.h(str, "id");
        long currentTimeMillis = System.currentTimeMillis();
        this.f47576d = currentTimeMillis;
        C3935b bVar = this.f47574b;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f47575c);
        }
    }

    public void r(String str, Object obj) {
        C6496s.h(str, "id");
        this.f47575c = System.currentTimeMillis();
    }
}
