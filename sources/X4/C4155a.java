package x4;

import I4.a;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import u4.C4065e;

/* renamed from: x4.a  reason: case insensitive filesystem */
public abstract class C4155a {

    /* renamed from: a  reason: collision with root package name */
    final List f49357a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f49358b = false;

    /* renamed from: c  reason: collision with root package name */
    private final d f49359c;

    /* renamed from: d  reason: collision with root package name */
    protected float f49360d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    protected I4.c f49361e;

    /* renamed from: f  reason: collision with root package name */
    private Object f49362f = null;

    /* renamed from: g  reason: collision with root package name */
    private float f49363g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f49364h = -1.0f;

    /* renamed from: x4.a$b */
    public interface b {
        void b();
    }

    /* renamed from: x4.a$c */
    private static final class c implements d {
        private c() {
        }

        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public a b() {
            throw new IllegalStateException("not implemented");
        }

        public boolean c(float f10) {
            return false;
        }

        public float d() {
            return 0.0f;
        }

        public float e() {
            return 1.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: x4.a$d */
    private interface d {
        boolean a(float f10);

        a b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: x4.a$e */
    private static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List f49365a;

        /* renamed from: b  reason: collision with root package name */
        private a f49366b;

        /* renamed from: c  reason: collision with root package name */
        private a f49367c = null;

        /* renamed from: d  reason: collision with root package name */
        private float f49368d = -1.0f;

        e(List list) {
            this.f49365a = list;
            this.f49366b = f(0.0f);
        }

        private a f(float f10) {
            List list = this.f49365a;
            a aVar = (a) list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f49365a.size() - 2; size >= 1; size--) {
                a aVar2 = (a) this.f49365a.get(size);
                if (this.f49366b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (a) this.f49365a.get(0);
        }

        public boolean a(float f10) {
            a aVar = this.f49367c;
            a aVar2 = this.f49366b;
            if (aVar == aVar2 && this.f49368d == f10) {
                return true;
            }
            this.f49367c = aVar2;
            this.f49368d = f10;
            return false;
        }

        public a b() {
            return this.f49366b;
        }

        public boolean c(float f10) {
            if (this.f49366b.a(f10)) {
                return !this.f49366b.i();
            }
            this.f49366b = f(f10);
            return true;
        }

        public float d() {
            return ((a) this.f49365a.get(0)).f();
        }

        public float e() {
            List list = this.f49365a;
            return ((a) list.get(list.size() - 1)).c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: x4.a$f */
    private static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final a f49369a;

        /* renamed from: b  reason: collision with root package name */
        private float f49370b = -1.0f;

        f(List list) {
            this.f49369a = (a) list.get(0);
        }

        public boolean a(float f10) {
            if (this.f49370b == f10) {
                return true;
            }
            this.f49370b = f10;
            return false;
        }

        public a b() {
            return this.f49369a;
        }

        public boolean c(float f10) {
            return !this.f49369a.i();
        }

        public float d() {
            return this.f49369a.f();
        }

        public float e() {
            return this.f49369a.c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C4155a(List list) {
        this.f49359c = p(list);
    }

    private float g() {
        if (this.f49363g == -1.0f) {
            this.f49363g = this.f49359c.d();
        }
        return this.f49363g;
    }

    private static d p(List list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f49357a.add(bVar);
    }

    /* access modifiers changed from: protected */
    public a b() {
        if (C4065e.h()) {
            C4065e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        a b10 = this.f49359c.b();
        if (C4065e.h()) {
            C4065e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        if (this.f49364h == -1.0f) {
            this.f49364h = this.f49359c.e();
        }
        return this.f49364h;
    }

    /* access modifiers changed from: protected */
    public float d() {
        Interpolator interpolator;
        a b10 = b();
        if (b10 == null || b10.i() || (interpolator = b10.f31741d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    /* access modifiers changed from: package-private */
    public float e() {
        if (this.f49358b) {
            return 0.0f;
        }
        a b10 = b();
        if (b10.i()) {
            return 0.0f;
        }
        return (this.f49360d - b10.f()) / (b10.c() - b10.f());
    }

    public float f() {
        return this.f49360d;
    }

    public Object h() {
        Object obj;
        float e10 = e();
        if (this.f49361e == null && this.f49359c.a(e10)) {
            return this.f49362f;
        }
        a b10 = b();
        Interpolator interpolator = b10.f31742e;
        if (interpolator == null || b10.f31743f == null) {
            obj = i(b10, d());
        } else {
            obj = j(b10, e10, interpolator.getInterpolation(e10), b10.f31743f.getInterpolation(e10));
        }
        this.f49362f = obj;
        return obj;
    }

    /* access modifiers changed from: package-private */
    public abstract Object i(a aVar, float f10);

    /* access modifiers changed from: protected */
    public Object j(a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        if (this.f49361e != null) {
            return true;
        }
        return false;
    }

    public void l() {
        if (C4065e.h()) {
            C4065e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f49357a.size(); i10++) {
            ((b) this.f49357a.get(i10)).b();
        }
        if (C4065e.h()) {
            C4065e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f49358b = true;
    }

    public void n(float f10) {
        if (C4065e.h()) {
            C4065e.b("BaseKeyframeAnimation#setProgress");
        }
        if (!this.f49359c.isEmpty()) {
            if (f10 < g()) {
                f10 = g();
            } else if (f10 > c()) {
                f10 = c();
            }
            if (f10 != this.f49360d) {
                this.f49360d = f10;
                if (this.f49359c.c(f10)) {
                    l();
                }
                if (C4065e.h()) {
                    C4065e.c("BaseKeyframeAnimation#setProgress");
                }
            } else if (C4065e.h()) {
                C4065e.c("BaseKeyframeAnimation#setProgress");
            }
        } else if (C4065e.h()) {
            C4065e.c("BaseKeyframeAnimation#setProgress");
        }
    }

    public void o(I4.c cVar) {
        I4.c cVar2 = this.f49361e;
        if (cVar2 != null) {
            cVar2.c((C4155a) null);
        }
        this.f49361e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
