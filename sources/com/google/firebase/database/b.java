package com.google.firebase.database;

import Lb.C4368b;
import Lb.D;
import Lb.l;
import Ob.g;
import Ob.m;
import Tb.n;
import Tb.o;
import Tb.r;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class b extends h {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f57120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f57121b;

        a(n nVar, g gVar) {
            this.f57120a = nVar;
            this.f57121b = gVar;
        }

        public void run() {
            b bVar = b.this;
            bVar.f57160a.k0(bVar.m(), this.f57120a, (e) this.f57121b.b());
        }
    }

    /* renamed from: com.google.firebase.database.b$b  reason: collision with other inner class name */
    class C0854b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f57123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f57124b;

        C0854b(n nVar, g gVar) {
            this.f57123a = nVar;
            this.f57124b = gVar;
        }

        public void run() {
            b bVar = b.this;
            bVar.f57160a.k0(bVar.m().x(Tb.b.l()), this.f57123a, (e) this.f57124b.b());
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4368b f57126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f57127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f57128c;

        c(C4368b bVar, g gVar, Map map) {
            this.f57126a = bVar;
            this.f57127b = gVar;
            this.f57128c = map;
        }

        public void run() {
            b bVar = b.this;
            bVar.f57160a.m0(bVar.m(), this.f57126a, (e) this.f57127b.b(), this.f57128c);
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f57130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f57131b;

        d(i.b bVar, boolean z10) {
            this.f57130a = bVar;
            this.f57131b = z10;
        }

        public void run() {
            b bVar = b.this;
            bVar.f57160a.l0(bVar.m(), this.f57130a, this.f57131b);
        }
    }

    public interface e {
        void a(Gb.b bVar, b bVar2);
    }

    b(Lb.n nVar, l lVar) {
        super(nVar, lVar);
    }

    private Task Q(n nVar, e eVar) {
        m.l(m());
        g l10 = Ob.l.l(eVar);
        this.f57160a.g0(new C0854b(nVar, l10));
        return (Task) l10.a();
    }

    private Task T(Object obj, n nVar, e eVar) {
        m.l(m());
        D.g(m(), obj);
        Object b10 = Pb.a.b(obj);
        m.k(b10);
        n b11 = o.b(b10, nVar);
        g l10 = Ob.l.l(eVar);
        this.f57160a.g0(new a(b11, l10));
        return (Task) l10.a();
    }

    private Task V(Map map, e eVar) {
        if (map != null) {
            Map c10 = Pb.a.c(map);
            C4368b r10 = C4368b.r(m.e(m(), c10));
            g l10 = Ob.l.l(eVar);
            this.f57160a.g0(new c(r10, l10, c10));
            return (Task) l10.a();
        }
        throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
    }

    public b J(String str) {
        if (str != null) {
            if (m().isEmpty()) {
                m.i(str);
            } else {
                m.h(str);
            }
            return new b(this.f57160a, m().t(new l(str)));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }

    public String K() {
        if (m().isEmpty()) {
            return null;
        }
        return m().C().b();
    }

    public b L() {
        l H10 = m().H();
        if (H10 != null) {
            return new b(this.f57160a, H10);
        }
        return null;
    }

    public g M() {
        m.l(m());
        return new g(this.f57160a, m());
    }

    public void N(e eVar) {
        R((Object) null, eVar);
    }

    public void O(i.b bVar, boolean z10) {
        if (bVar != null) {
            m.l(m());
            this.f57160a.g0(new d(bVar, z10));
            return;
        }
        throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
    }

    public void P(Object obj, e eVar) {
        Q(r.c(this.f57161b, obj), eVar);
    }

    public void R(Object obj, e eVar) {
        T(obj, r.c(this.f57161b, (Object) null), eVar);
    }

    public void S(Object obj, Object obj2, e eVar) {
        T(obj, r.c(this.f57161b, obj2), eVar);
    }

    public void U(Map map, e eVar) {
        V(map, eVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        b L10 = L();
        if (L10 == null) {
            return this.f57160a.toString();
        }
        try {
            return L10.toString() + "/" + URLEncoder.encode(K(), Constants.ENCODING).replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            throw new Gb.c("Failed to URLEncode key: " + K(), e10);
        }
    }
}
