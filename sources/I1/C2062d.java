package i1;

import com.revenuecat.purchases.common.Constants;
import f1.c;
import f1.i;
import j1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: i1.d  reason: case insensitive filesystem */
public class C2062d {

    /* renamed from: a  reason: collision with root package name */
    private HashSet f21844a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f21845b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21846c;

    /* renamed from: d  reason: collision with root package name */
    public final C2063e f21847d;

    /* renamed from: e  reason: collision with root package name */
    public final a f21848e;

    /* renamed from: f  reason: collision with root package name */
    public C2062d f21849f;

    /* renamed from: g  reason: collision with root package name */
    public int f21850g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f21851h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    i f21852i;

    /* renamed from: i1.d$a */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2062d(C2063e eVar, a aVar) {
        this.f21847d = eVar;
        this.f21848e = aVar;
    }

    public boolean a(C2062d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(C2062d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        } else if (!z10 && !p(dVar)) {
            return false;
        } else {
            this.f21849f = dVar;
            if (dVar.f21844a == null) {
                dVar.f21844a = new HashSet();
            }
            HashSet hashSet = this.f21849f.f21844a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f21850g = i10;
            this.f21851h = i11;
            return true;
        }
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f21844a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j1.i.a(((C2062d) it.next()).f21847d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f21844a;
    }

    public int e() {
        if (!this.f21846c) {
            return 0;
        }
        return this.f21845b;
    }

    public int f() {
        C2062d dVar;
        if (this.f21847d.X() == 8) {
            return 0;
        }
        if (this.f21851h == Integer.MIN_VALUE || (dVar = this.f21849f) == null || dVar.f21847d.X() != 8) {
            return this.f21850g;
        }
        return this.f21851h;
    }

    public final C2062d g() {
        switch (this.f21848e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f21847d.f21900S;
            case 2:
                return this.f21847d.f21902T;
            case 3:
                return this.f21847d.f21896Q;
            case 4:
                return this.f21847d.f21898R;
            default:
                throw new AssertionError(this.f21848e.name());
        }
    }

    public C2063e h() {
        return this.f21847d;
    }

    public i i() {
        return this.f21852i;
    }

    public C2062d j() {
        return this.f21849f;
    }

    public a k() {
        return this.f21848e;
    }

    public boolean l() {
        HashSet hashSet = this.f21844a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2062d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f21844a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f21846c;
    }

    public boolean o() {
        if (this.f21849f != null) {
            return true;
        }
        return false;
    }

    public boolean p(C2062d dVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (dVar == null) {
            return false;
        }
        a k10 = dVar.k();
        a aVar = this.f21848e;
        if (k10 != aVar) {
            switch (aVar.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (k10 == a.LEFT || k10 == a.RIGHT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!(dVar.h() instanceof C2066h)) {
                        return z10;
                    }
                    if (z10 || k10 == a.CENTER_X) {
                        z12 = true;
                    }
                    return z12;
                case 2:
                case 4:
                    if (k10 == a.TOP || k10 == a.BOTTOM) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!(dVar.h() instanceof C2066h)) {
                        return z11;
                    }
                    if (z11 || k10 == a.CENTER_Y) {
                        z12 = true;
                    }
                    return z12;
                case 5:
                    if (k10 == a.LEFT || k10 == a.RIGHT) {
                        return false;
                    }
                    return true;
                case 6:
                    if (k10 == a.BASELINE || k10 == a.CENTER_X || k10 == a.CENTER_Y) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f21848e.name());
            }
        } else if (aVar != a.BASELINE || (dVar.h().b0() && h().b0())) {
            return true;
        } else {
            return false;
        }
    }

    public void q() {
        HashSet hashSet;
        C2062d dVar = this.f21849f;
        if (!(dVar == null || (hashSet = dVar.f21844a) == null)) {
            hashSet.remove(this);
            if (this.f21849f.f21844a.size() == 0) {
                this.f21849f.f21844a = null;
            }
        }
        this.f21844a = null;
        this.f21849f = null;
        this.f21850g = 0;
        this.f21851h = Integer.MIN_VALUE;
        this.f21846c = false;
        this.f21845b = 0;
    }

    public void r() {
        this.f21846c = false;
        this.f21845b = 0;
    }

    public void s(c cVar) {
        i iVar = this.f21852i;
        if (iVar == null) {
            this.f21852i = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.f();
        }
    }

    public void t(int i10) {
        this.f21845b = i10;
        this.f21846c = true;
    }

    public String toString() {
        return this.f21847d.v() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f21848e.toString();
    }
}
