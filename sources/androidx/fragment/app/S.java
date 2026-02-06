package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class S {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f16809a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f16810b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f16811c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private M f16812d;

    S() {
    }

    /* access modifiers changed from: package-private */
    public void A(M m10) {
        this.f16812d = m10;
    }

    /* access modifiers changed from: package-private */
    public Bundle B(String str, Bundle bundle) {
        if (bundle != null) {
            return (Bundle) this.f16811c.put(str, bundle);
        }
        return (Bundle) this.f16811c.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void a(C1769q qVar) {
        if (!this.f16809a.contains(qVar)) {
            synchronized (this.f16809a) {
                this.f16809a.add(qVar);
            }
            qVar.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + qVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f16810b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        if (this.f16810b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                q10.s(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f16810b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Q q10 : this.f16810b.values()) {
                printWriter.print(str);
                if (q10 != null) {
                    C1769q k10 = q10.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f16809a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((C1769q) this.f16809a.get(i10)).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1769q f(String str) {
        Q q10 = (Q) this.f16810b.get(str);
        if (q10 != null) {
            return q10.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C1769q g(int i10) {
        for (int size = this.f16809a.size() - 1; size >= 0; size--) {
            C1769q qVar = (C1769q) this.f16809a.get(size);
            if (qVar != null && qVar.mFragmentId == i10) {
                return qVar;
            }
        }
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                C1769q k10 = q10.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C1769q h(String str) {
        if (str != null) {
            for (int size = this.f16809a.size() - 1; size >= 0; size--) {
                C1769q qVar = (C1769q) this.f16809a.get(size);
                if (qVar != null && str.equals(qVar.mTag)) {
                    return qVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                C1769q k10 = q10.k();
                if (str.equals(k10.mTag)) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C1769q i(String str) {
        C1769q findFragmentByWho;
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null && (findFragmentByWho = q10.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(C1769q qVar) {
        View view;
        View view2;
        ViewGroup viewGroup = qVar.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f16809a.indexOf(qVar);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            C1769q qVar2 = (C1769q) this.f16809a.get(i10);
            if (qVar2.mContainer == viewGroup && (view2 = qVar2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f16809a.size()) {
                return -1;
            }
            C1769q qVar3 = (C1769q) this.f16809a.get(indexOf);
            if (qVar3.mContainer == viewGroup && (view = qVar3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List k() {
        ArrayList arrayList = new ArrayList();
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                arrayList.add(q10);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List l() {
        ArrayList arrayList = new ArrayList();
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                arrayList.add(q10.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public HashMap m() {
        return this.f16811c;
    }

    /* access modifiers changed from: package-private */
    public Q n(String str) {
        return (Q) this.f16810b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List o() {
        ArrayList arrayList;
        if (this.f16809a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f16809a) {
            arrayList = new ArrayList(this.f16809a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public M p() {
        return this.f16812d;
    }

    /* access modifiers changed from: package-private */
    public Bundle q(String str) {
        return (Bundle) this.f16811c.get(str);
    }

    /* access modifiers changed from: package-private */
    public void r(Q q10) {
        C1769q k10 = q10.k();
        if (!c(k10.mWho)) {
            this.f16810b.put(k10.mWho, q10);
            if (k10.mRetainInstanceChangedWhileDetached) {
                if (k10.mRetainInstance) {
                    this.f16812d.b(k10);
                } else {
                    this.f16812d.l(k10);
                }
                k10.mRetainInstanceChangedWhileDetached = false;
            }
            if (J.L0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Q q10) {
        C1769q k10 = q10.k();
        if (k10.mRetainInstance) {
            this.f16812d.l(k10);
        }
        if (this.f16810b.get(k10.mWho) == q10 && ((Q) this.f16810b.put(k10.mWho, (Object) null)) != null && J.L0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        Iterator it = this.f16809a.iterator();
        while (it.hasNext()) {
            Q q10 = (Q) this.f16810b.get(((C1769q) it.next()).mWho);
            if (q10 != null) {
                q10.m();
            }
        }
        for (Q q11 : this.f16810b.values()) {
            if (q11 != null) {
                q11.m();
                C1769q k10 = q11.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    if (k10.mBeingSaved && !this.f16811c.containsKey(k10.mWho)) {
                        B(k10.mWho, q11.q());
                    }
                    s(q11);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(C1769q qVar) {
        synchronized (this.f16809a) {
            this.f16809a.remove(qVar);
        }
        qVar.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f16810b.clear();
    }

    /* access modifiers changed from: package-private */
    public void w(List list) {
        this.f16809a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C1769q f10 = f(str);
                if (f10 != null) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(HashMap hashMap) {
        this.f16811c.clear();
        this.f16811c.putAll(hashMap);
    }

    /* access modifiers changed from: package-private */
    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f16810b.size());
        for (Q q10 : this.f16810b.values()) {
            if (q10 != null) {
                C1769q k10 = q10.k();
                B(k10.mWho, q10.q());
                arrayList.add(k10.mWho);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList z() {
        synchronized (this.f16809a) {
            try {
                if (this.f16809a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f16809a.size());
                Iterator it = this.f16809a.iterator();
                while (it.hasNext()) {
                    C1769q qVar = (C1769q) it.next();
                    arrayList.add(qVar.mWho);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + qVar.mWho + "): " + qVar);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
