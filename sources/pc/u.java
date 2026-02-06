package Pc;

import Oc.d;
import Sc.c;
import com.google.gson.e;
import com.google.gson.t;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class u implements com.google.gson.u, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final u f52215g = new u();

    /* renamed from: a  reason: collision with root package name */
    private double f52216a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private int f52217b = 136;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52218c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52219d;

    /* renamed from: e  reason: collision with root package name */
    private List f52220e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List f52221f = Collections.emptyList();

    class a extends t {

        /* renamed from: a  reason: collision with root package name */
        private volatile t f52222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f52224c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f52225d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f52226e;

        a(boolean z10, boolean z11, e eVar, com.google.gson.reflect.a aVar) {
            this.f52223b = z10;
            this.f52224c = z11;
            this.f52225d = eVar;
            this.f52226e = aVar;
        }

        private t a() {
            t tVar = this.f52222a;
            if (tVar != null) {
                return tVar;
            }
            t q10 = this.f52225d.q(u.this, this.f52226e);
            this.f52222a = q10;
            return q10;
        }

        public Object read(Sc.a aVar) {
            if (!this.f52223b) {
                return a().read(aVar);
            }
            aVar.D1();
            return null;
        }

        public void write(c cVar, Object obj) {
            if (this.f52224c) {
                cVar.T();
            } else {
                a().write(cVar, obj);
            }
        }
    }

    private static boolean e(Class cls) {
        if (!cls.isMemberClass() || Rc.a.n(cls)) {
            return false;
        }
        return true;
    }

    private boolean g(d dVar) {
        if (dVar == null) {
            return true;
        }
        if (this.f52216a >= dVar.value()) {
            return true;
        }
        return false;
    }

    private boolean h(Oc.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (this.f52216a < eVar.value()) {
            return true;
        }
        return false;
    }

    private boolean i(d dVar, Oc.e eVar) {
        if (!g(dVar) || !h(eVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public u clone() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean c(Class cls, boolean z10) {
        List list;
        if (this.f52216a != -1.0d && !i((d) cls.getAnnotation(d.class), (Oc.e) cls.getAnnotation(Oc.e.class))) {
            return true;
        }
        if (!this.f52218c && e(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && Rc.a.l(cls)) {
            return true;
        }
        if (z10) {
            list = this.f52220e;
        } else {
            list = this.f52221f;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }

    public t create(e eVar, com.google.gson.reflect.a aVar) {
        Class rawType = aVar.getRawType();
        boolean c10 = c(rawType, true);
        boolean c11 = c(rawType, false);
        if (c10 || c11) {
            return new a(c11, c10, eVar, aVar);
        }
        return null;
    }

    public boolean d(Field field, boolean z10) {
        List list;
        Oc.a aVar;
        if ((this.f52217b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f52216a != -1.0d && !i((d) field.getAnnotation(d.class), (Oc.e) field.getAnnotation(Oc.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f52219d && ((aVar = (Oc.a) field.getAnnotation(Oc.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) || c(field.getType(), z10)) {
            return true;
        }
        if (z10) {
            list = this.f52220e;
        } else {
            list = this.f52221f;
        }
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }
}
