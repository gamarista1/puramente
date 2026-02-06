package I4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import u4.C4071k;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final C4071k f31738a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f31739b;

    /* renamed from: c  reason: collision with root package name */
    public Object f31740c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f31741d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f31742e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f31743f;

    /* renamed from: g  reason: collision with root package name */
    public final float f31744g;

    /* renamed from: h  reason: collision with root package name */
    public Float f31745h;

    /* renamed from: i  reason: collision with root package name */
    private float f31746i;

    /* renamed from: j  reason: collision with root package name */
    private float f31747j;

    /* renamed from: k  reason: collision with root package name */
    private int f31748k;

    /* renamed from: l  reason: collision with root package name */
    private int f31749l;

    /* renamed from: m  reason: collision with root package name */
    private float f31750m;

    /* renamed from: n  reason: collision with root package name */
    private float f31751n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f31752o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f31753p;

    public a(C4071k kVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f31746i = -3987645.8f;
        this.f31747j = -3987645.8f;
        this.f31748k = 784923401;
        this.f31749l = 784923401;
        this.f31750m = Float.MIN_VALUE;
        this.f31751n = Float.MIN_VALUE;
        this.f31752o = null;
        this.f31753p = null;
        this.f31738a = kVar;
        this.f31739b = obj;
        this.f31740c = obj2;
        this.f31741d = interpolator;
        this.f31742e = null;
        this.f31743f = null;
        this.f31744g = f10;
        this.f31745h = f11;
    }

    public boolean a(float f10) {
        if (f10 < f() || f10 >= c()) {
            return false;
        }
        return true;
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f31738a == null) {
            return 1.0f;
        }
        if (this.f31751n == Float.MIN_VALUE) {
            if (this.f31745h == null) {
                this.f31751n = 1.0f;
            } else {
                this.f31751n = f() + ((this.f31745h.floatValue() - this.f31744g) / this.f31738a.e());
            }
        }
        return this.f31751n;
    }

    public float d() {
        if (this.f31747j == -3987645.8f) {
            this.f31747j = ((Float) this.f31740c).floatValue();
        }
        return this.f31747j;
    }

    public int e() {
        if (this.f31749l == 784923401) {
            this.f31749l = ((Integer) this.f31740c).intValue();
        }
        return this.f31749l;
    }

    public float f() {
        C4071k kVar = this.f31738a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f31750m == Float.MIN_VALUE) {
            this.f31750m = (this.f31744g - kVar.p()) / this.f31738a.e();
        }
        return this.f31750m;
    }

    public float g() {
        if (this.f31746i == -3987645.8f) {
            this.f31746i = ((Float) this.f31739b).floatValue();
        }
        return this.f31746i;
    }

    public int h() {
        if (this.f31748k == 784923401) {
            this.f31748k = ((Integer) this.f31739b).intValue();
        }
        return this.f31748k;
    }

    public boolean i() {
        if (this.f31741d == null && this.f31742e == null && this.f31743f == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f31739b + ", endValue=" + this.f31740c + ", startFrame=" + this.f31744g + ", endFrame=" + this.f31745h + ", interpolator=" + this.f31741d + '}';
    }

    public a(C4071k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f31746i = -3987645.8f;
        this.f31747j = -3987645.8f;
        this.f31748k = 784923401;
        this.f31749l = 784923401;
        this.f31750m = Float.MIN_VALUE;
        this.f31751n = Float.MIN_VALUE;
        this.f31752o = null;
        this.f31753p = null;
        this.f31738a = kVar;
        this.f31739b = obj;
        this.f31740c = obj2;
        this.f31741d = null;
        this.f31742e = interpolator;
        this.f31743f = interpolator2;
        this.f31744g = f10;
        this.f31745h = f11;
    }

    protected a(C4071k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f31746i = -3987645.8f;
        this.f31747j = -3987645.8f;
        this.f31748k = 784923401;
        this.f31749l = 784923401;
        this.f31750m = Float.MIN_VALUE;
        this.f31751n = Float.MIN_VALUE;
        this.f31752o = null;
        this.f31753p = null;
        this.f31738a = kVar;
        this.f31739b = obj;
        this.f31740c = obj2;
        this.f31741d = interpolator;
        this.f31742e = interpolator2;
        this.f31743f = interpolator3;
        this.f31744g = f10;
        this.f31745h = f11;
    }

    public a(Object obj) {
        this.f31746i = -3987645.8f;
        this.f31747j = -3987645.8f;
        this.f31748k = 784923401;
        this.f31749l = 784923401;
        this.f31750m = Float.MIN_VALUE;
        this.f31751n = Float.MIN_VALUE;
        this.f31752o = null;
        this.f31753p = null;
        this.f31738a = null;
        this.f31739b = obj;
        this.f31740c = obj;
        this.f31741d = null;
        this.f31742e = null;
        this.f31743f = null;
        this.f31744g = Float.MIN_VALUE;
        this.f31745h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(Object obj, Object obj2) {
        this.f31746i = -3987645.8f;
        this.f31747j = -3987645.8f;
        this.f31748k = 784923401;
        this.f31749l = 784923401;
        this.f31750m = Float.MIN_VALUE;
        this.f31751n = Float.MIN_VALUE;
        this.f31752o = null;
        this.f31753p = null;
        this.f31738a = null;
        this.f31739b = obj;
        this.f31740c = obj2;
        this.f31741d = null;
        this.f31742e = null;
        this.f31743f = null;
        this.f31744g = Float.MIN_VALUE;
        this.f31745h = Float.valueOf(Float.MAX_VALUE);
    }
}
