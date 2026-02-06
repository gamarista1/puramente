package w;

import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.b  reason: case insensitive filesystem */
public abstract class C2784b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C2801m f27296a = C2806r.a(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C2802n f27297b = C2806r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C2803o f27298c = C2806r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C2804p f27299d = C2806r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C2801m f27300e = C2806r.a(Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C2802n f27301f = C2806r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C2803o f27302g = C2806r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C2804p f27303h = C2806r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C2782a a(float f10, float f11) {
        return new C2782a(Float.valueOf(f10), t0.f(C6490l.f71789a), Float.valueOf(f11), (String) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C2782a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
