package r6;

import T5.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.List;
import q6.q;

/* renamed from: r6.b  reason: case insensitive filesystem */
public class C3977b {

    /* renamed from: t  reason: collision with root package name */
    public static final q f47948t = q.f47740h;

    /* renamed from: u  reason: collision with root package name */
    public static final q f47949u = q.f47741i;

    /* renamed from: a  reason: collision with root package name */
    private Resources f47950a;

    /* renamed from: b  reason: collision with root package name */
    private int f47951b;

    /* renamed from: c  reason: collision with root package name */
    private float f47952c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f47953d;

    /* renamed from: e  reason: collision with root package name */
    private q f47954e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f47955f;

    /* renamed from: g  reason: collision with root package name */
    private q f47956g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f47957h;

    /* renamed from: i  reason: collision with root package name */
    private q f47958i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f47959j;

    /* renamed from: k  reason: collision with root package name */
    private q f47960k;

    /* renamed from: l  reason: collision with root package name */
    private q f47961l;

    /* renamed from: m  reason: collision with root package name */
    private Matrix f47962m;

    /* renamed from: n  reason: collision with root package name */
    private PointF f47963n;

    /* renamed from: o  reason: collision with root package name */
    private ColorFilter f47964o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f47965p;

    /* renamed from: q  reason: collision with root package name */
    private List f47966q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f47967r;

    /* renamed from: s  reason: collision with root package name */
    private C3979d f47968s;

    public C3977b(Resources resources) {
        this.f47950a = resources;
        s();
    }

    private void s() {
        this.f47951b = 300;
        this.f47952c = 0.0f;
        this.f47953d = null;
        q qVar = f47948t;
        this.f47954e = qVar;
        this.f47955f = null;
        this.f47956g = qVar;
        this.f47957h = null;
        this.f47958i = qVar;
        this.f47959j = null;
        this.f47960k = qVar;
        this.f47961l = f47949u;
        this.f47962m = null;
        this.f47963n = null;
        this.f47964o = null;
        this.f47965p = null;
        this.f47966q = null;
        this.f47967r = null;
        this.f47968s = null;
    }

    public static C3977b t(Resources resources) {
        return new C3977b(resources);
    }

    private void v() {
        List<Drawable> list = this.f47966q;
        if (list != null) {
            for (Drawable g10 : list) {
                k.g(g10);
            }
        }
    }

    public C3976a a() {
        v();
        return new C3976a(this);
    }

    public ColorFilter b() {
        return this.f47964o;
    }

    public PointF c() {
        return this.f47963n;
    }

    public q d() {
        return this.f47961l;
    }

    public Drawable e() {
        return this.f47965p;
    }

    public int f() {
        return this.f47951b;
    }

    public Drawable g() {
        return this.f47957h;
    }

    public q h() {
        return this.f47958i;
    }

    public List i() {
        return this.f47966q;
    }

    public Drawable j() {
        return this.f47953d;
    }

    public q k() {
        return this.f47954e;
    }

    public Drawable l() {
        return this.f47967r;
    }

    public Drawable m() {
        return this.f47959j;
    }

    public q n() {
        return this.f47960k;
    }

    public Resources o() {
        return this.f47950a;
    }

    public Drawable p() {
        return this.f47955f;
    }

    public q q() {
        return this.f47956g;
    }

    public C3979d r() {
        return this.f47968s;
    }

    public C3977b u(C3979d dVar) {
        this.f47968s = dVar;
        return this;
    }
}
