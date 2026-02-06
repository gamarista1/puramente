package androidx.fragment.app;

import T1.c;
import android.view.ViewGroup;
import androidx.lifecycle.C1790m;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    private final C1777z f16813a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f16814b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList f16815c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    int f16816d;

    /* renamed from: e  reason: collision with root package name */
    int f16817e;

    /* renamed from: f  reason: collision with root package name */
    int f16818f;

    /* renamed from: g  reason: collision with root package name */
    int f16819g;

    /* renamed from: h  reason: collision with root package name */
    int f16820h;

    /* renamed from: i  reason: collision with root package name */
    boolean f16821i;

    /* renamed from: j  reason: collision with root package name */
    boolean f16822j = true;

    /* renamed from: k  reason: collision with root package name */
    String f16823k;

    /* renamed from: l  reason: collision with root package name */
    int f16824l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f16825m;

    /* renamed from: n  reason: collision with root package name */
    int f16826n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f16827o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList f16828p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList f16829q;

    /* renamed from: r  reason: collision with root package name */
    boolean f16830r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList f16831s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f16832a;

        /* renamed from: b  reason: collision with root package name */
        C1769q f16833b;

        /* renamed from: c  reason: collision with root package name */
        boolean f16834c;

        /* renamed from: d  reason: collision with root package name */
        int f16835d;

        /* renamed from: e  reason: collision with root package name */
        int f16836e;

        /* renamed from: f  reason: collision with root package name */
        int f16837f;

        /* renamed from: g  reason: collision with root package name */
        int f16838g;

        /* renamed from: h  reason: collision with root package name */
        C1790m.b f16839h;

        /* renamed from: i  reason: collision with root package name */
        C1790m.b f16840i;

        a() {
        }

        a(int i10, C1769q qVar) {
            this.f16832a = i10;
            this.f16833b = qVar;
            this.f16834c = false;
            C1790m.b bVar = C1790m.b.RESUMED;
            this.f16839h = bVar;
            this.f16840i = bVar;
        }

        a(int i10, C1769q qVar, boolean z10) {
            this.f16832a = i10;
            this.f16833b = qVar;
            this.f16834c = z10;
            C1790m.b bVar = C1790m.b.RESUMED;
            this.f16839h = bVar;
            this.f16840i = bVar;
        }

        a(int i10, C1769q qVar, C1790m.b bVar) {
            this.f16832a = i10;
            this.f16833b = qVar;
            this.f16834c = false;
            this.f16839h = qVar.mMaxState;
            this.f16840i = bVar;
        }
    }

    T(C1777z zVar, ClassLoader classLoader) {
        this.f16813a = zVar;
        this.f16814b = classLoader;
    }

    public T b(int i10, C1769q qVar) {
        n(i10, qVar, (String) null, 1);
        return this;
    }

    public T c(int i10, C1769q qVar, String str) {
        n(i10, qVar, str, 1);
        return this;
    }

    public final T d(ViewGroup viewGroup, C1769q qVar, String str) {
        qVar.mContainer = viewGroup;
        qVar.mInDynamicContainer = true;
        return c(viewGroup.getId(), qVar, str);
    }

    public T e(C1769q qVar, String str) {
        n(0, qVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f16815c.add(aVar);
        aVar.f16835d = this.f16816d;
        aVar.f16836e = this.f16817e;
        aVar.f16837f = this.f16818f;
        aVar.f16838g = this.f16819g;
    }

    public T g(C1769q qVar) {
        f(new a(7, qVar));
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public T l(C1769q qVar) {
        f(new a(6, qVar));
        return this;
    }

    public T m() {
        if (!this.f16821i) {
            this.f16822j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, C1769q qVar, String str, int i11) {
        String str2 = qVar.mPreviousWho;
        if (str2 != null) {
            c.f(qVar, str2);
        }
        Class<?> cls = qVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = qVar.mTag;
            if (str3 == null || str.equals(str3)) {
                qVar.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + qVar + ": was " + qVar.mTag + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = qVar.mFragmentId;
                if (i12 == 0 || i12 == i10) {
                    qVar.mFragmentId = i10;
                    qVar.mContainerId = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + qVar + ": was " + qVar.mFragmentId + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + qVar + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i11, qVar));
    }

    public T o(C1769q qVar) {
        f(new a(3, qVar));
        return this;
    }

    public T p(int i10, C1769q qVar) {
        return q(i10, qVar, (String) null);
    }

    public T q(int i10, C1769q qVar, String str) {
        if (i10 != 0) {
            n(i10, qVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public T r(Runnable runnable) {
        return s(false, runnable);
    }

    /* access modifiers changed from: package-private */
    public T s(boolean z10, Runnable runnable) {
        if (!z10) {
            m();
        }
        if (this.f16831s == null) {
            this.f16831s = new ArrayList();
        }
        this.f16831s.add(runnable);
        return this;
    }

    public T t(int i10, int i11) {
        return u(i10, i11, 0, 0);
    }

    public T u(int i10, int i11, int i12, int i13) {
        this.f16816d = i10;
        this.f16817e = i11;
        this.f16818f = i12;
        this.f16819g = i13;
        return this;
    }

    public T v(C1769q qVar, C1790m.b bVar) {
        f(new a(10, qVar, bVar));
        return this;
    }

    public T w(boolean z10) {
        this.f16830r = z10;
        return this;
    }
}
