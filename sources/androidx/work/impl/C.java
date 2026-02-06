package androidx.work.impl;

import Q3.C1343c;
import android.text.TextUtils;
import androidx.work.F;
import androidx.work.i;
import androidx.work.s;
import androidx.work.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C extends androidx.work.C {

    /* renamed from: j  reason: collision with root package name */
    private static final String f18750j = s.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final P f18751a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18752b;

    /* renamed from: c  reason: collision with root package name */
    private final i f18753c;

    /* renamed from: d  reason: collision with root package name */
    private final List f18754d;

    /* renamed from: e  reason: collision with root package name */
    private final List f18755e;

    /* renamed from: f  reason: collision with root package name */
    private final List f18756f;

    /* renamed from: g  reason: collision with root package name */
    private final List f18757g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18758h;

    /* renamed from: i  reason: collision with root package name */
    private w f18759i;

    public C(P p10, List list) {
        this(p10, (String) null, i.KEEP, list, (List) null);
    }

    private static boolean i(C c10, Set set) {
        set.addAll(c10.c());
        Set l10 = l(c10);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l10.contains((String) it.next())) {
                return true;
            }
        }
        List<C> e10 = c10.e();
        if (e10 != null && !e10.isEmpty()) {
            for (C i10 : e10) {
                if (i(i10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(c10.c());
        return false;
    }

    public static Set l(C c10) {
        HashSet hashSet = new HashSet();
        List<C> e10 = c10.e();
        if (e10 != null && !e10.isEmpty()) {
            for (C c11 : e10) {
                hashSet.addAll(c11.c());
            }
        }
        return hashSet;
    }

    public w a() {
        if (!this.f18758h) {
            C1343c cVar = new C1343c(this);
            this.f18751a.o().d(cVar);
            this.f18759i = cVar.d();
        } else {
            s e10 = s.e();
            String str = f18750j;
            e10.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f18755e) + ")");
        }
        return this.f18759i;
    }

    public i b() {
        return this.f18753c;
    }

    public List c() {
        return this.f18755e;
    }

    public String d() {
        return this.f18752b;
    }

    public List e() {
        return this.f18757g;
    }

    public List f() {
        return this.f18754d;
    }

    public P g() {
        return this.f18751a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f18758h;
    }

    public void k() {
        this.f18758h = true;
    }

    public C(P p10, String str, i iVar, List list, List list2) {
        this.f18751a = p10;
        this.f18752b = str;
        this.f18753c = iVar;
        this.f18754d = list;
        this.f18757g = list2;
        this.f18755e = new ArrayList(list.size());
        this.f18756f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f18756f.addAll(((C) it.next()).f18756f);
            }
        }
        int i10 = 0;
        while (i10 < list.size()) {
            if (iVar != i.REPLACE || ((F) list.get(i10)).d().g() == Long.MAX_VALUE) {
                String b10 = ((F) list.get(i10)).b();
                this.f18755e.add(b10);
                this.f18756f.add(b10);
                i10++;
            } else {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
        }
    }
}
