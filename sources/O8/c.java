package o8;

import android.graphics.RectF;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f47406a;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f47407b;

    /* renamed from: c  reason: collision with root package name */
    private final int f47408c;

    public c(int i10, RectF rectF, int i11) {
        C6496s.h(rectF, "rectangle");
        this.f47406a = i10;
        this.f47407b = rectF;
        this.f47408c = i11;
    }

    public final int a() {
        return this.f47408c;
    }

    public final int b() {
        return this.f47406a;
    }

    public final RectF c() {
        return this.f47407b;
    }
}
