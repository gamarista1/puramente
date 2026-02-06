package j3;

import Xg.C5696h;
import Xg.L;
import Xg.N;
import Xg.x;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import mf.Y;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f22775a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    private final x f22776b;

    /* renamed from: c  reason: collision with root package name */
    private final x f22777c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22778d;

    /* renamed from: e  reason: collision with root package name */
    private final L f22779e;

    /* renamed from: f  reason: collision with root package name */
    private final L f22780f;

    public G() {
        x a10 = N.a(C6565s.n());
        this.f22776b = a10;
        x a11 = N.a(Y.e());
        this.f22777c = a11;
        this.f22779e = C5696h.b(a10);
        this.f22780f = C5696h.b(a11);
    }

    public abstract k a(s sVar, Bundle bundle);

    public final L b() {
        return this.f22779e;
    }

    public final L c() {
        return this.f22780f;
    }

    public final boolean d() {
        return this.f22778d;
    }

    public void e(k kVar) {
        C6496s.h(kVar, "entry");
        x xVar = this.f22777c;
        xVar.setValue(Y.m((Set) xVar.getValue(), kVar));
    }

    public void f(k kVar) {
        int i10;
        C6496s.h(kVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f22775a;
        reentrantLock.lock();
        try {
            List h12 = C6565s.h1((Collection) this.f22779e.getValue());
            ListIterator listIterator = h12.listIterator(h12.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C6496s.c(((k) listIterator.previous()).f(), kVar.f())) {
                        i10 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            h12.set(i10, kVar);
            this.f22776b.setValue(h12);
            C6514M m10 = C6514M.f71813a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void g(k kVar, boolean z10) {
        C6496s.h(kVar, "popUpTo");
        ReentrantLock reentrantLock = this.f22775a;
        reentrantLock.lock();
        try {
            x xVar = this.f22776b;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) xVar.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C6496s.c((k) next, kVar)) {
                    break;
                }
                arrayList.add(next);
            }
            xVar.setValue(arrayList);
            C6514M m10 = C6514M.f71813a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void h(k kVar, boolean z10) {
        Object obj;
        C6496s.h(kVar, "popUpTo");
        Iterable iterable = (Iterable) this.f22777c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k) it.next()) == kVar) {
                    Iterable<k> iterable2 = (Iterable) this.f22779e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (k kVar2 : iterable2) {
                            if (kVar2 == kVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        x xVar = this.f22777c;
        xVar.setValue(Y.o((Set) xVar.getValue(), kVar));
        List list = (List) this.f22779e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            k kVar3 = (k) obj;
            if (!C6496s.c(kVar3, kVar) && ((List) this.f22779e.getValue()).lastIndexOf(kVar3) < ((List) this.f22779e.getValue()).lastIndexOf(kVar)) {
                break;
            }
        }
        k kVar4 = (k) obj;
        if (kVar4 != null) {
            x xVar2 = this.f22777c;
            xVar2.setValue(Y.o((Set) xVar2.getValue(), kVar4));
        }
        g(kVar, z10);
    }

    public void i(k kVar) {
        C6496s.h(kVar, "entry");
        x xVar = this.f22777c;
        xVar.setValue(Y.o((Set) xVar.getValue(), kVar));
    }

    public void j(k kVar) {
        C6496s.h(kVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f22775a;
        reentrantLock.lock();
        try {
            x xVar = this.f22776b;
            xVar.setValue(C6565s.L0((Collection) xVar.getValue(), kVar));
            C6514M m10 = C6514M.f71813a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k(k kVar) {
        C6496s.h(kVar, "backStackEntry");
        Iterable iterable = (Iterable) this.f22777c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k) it.next()) == kVar) {
                    Iterable<k> iterable2 = (Iterable) this.f22779e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (k kVar2 : iterable2) {
                            if (kVar2 == kVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        k kVar3 = (k) C6565s.B0((List) this.f22779e.getValue());
        if (kVar3 != null) {
            x xVar = this.f22777c;
            xVar.setValue(Y.o((Set) xVar.getValue(), kVar3));
        }
        x xVar2 = this.f22777c;
        xVar2.setValue(Y.o((Set) xVar2.getValue(), kVar));
        j(kVar);
    }

    public final void l(boolean z10) {
        this.f22778d = z10;
    }
}
