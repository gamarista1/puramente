package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.J;
import androidx.fragment.app.T;
import androidx.lifecycle.C1790m;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
final class C1753a extends T implements J.m {

    /* renamed from: t  reason: collision with root package name */
    final J f16876t;

    /* renamed from: u  reason: collision with root package name */
    boolean f16877u;

    /* renamed from: v  reason: collision with root package name */
    int f16878v;

    /* renamed from: w  reason: collision with root package name */
    boolean f16879w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1753a(androidx.fragment.app.J r3) {
        /*
            r2 = this;
            androidx.fragment.app.z r0 = r3.w0()
            androidx.fragment.app.A r1 = r3.y0()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.A r1 = r3.y0()
            android.content.Context r1 = r1.f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f16878v = r0
            r0 = 0
            r2.f16879w = r0
            r2.f16876t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1753a.<init>(androidx.fragment.app.J):void");
    }

    public void A(String str, PrintWriter printWriter) {
        B(str, printWriter, true);
    }

    public void B(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16823k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16878v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16877u);
            if (this.f16820h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f16820h));
            }
            if (!(this.f16816d == 0 && this.f16817e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16816d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16817e));
            }
            if (!(this.f16818f == 0 && this.f16819g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16818f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16819g));
            }
            if (!(this.f16824l == 0 && this.f16825m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16824l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f16825m);
            }
            if (!(this.f16826n == 0 && this.f16827o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16826n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16827o);
            }
        }
        if (!this.f16815c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f16815c.size();
            for (int i10 = 0; i10 < size; i10++) {
                T.a aVar = (T.a) this.f16815c.get(i10);
                switch (aVar.f16832a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f16832a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                printWriter.println(aVar.f16833b);
                if (z10) {
                    if (!(aVar.f16835d == 0 && aVar.f16836e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f16835d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f16836e));
                    }
                    if (aVar.f16837f != 0 || aVar.f16838g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f16837f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f16838g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        int size = this.f16815c.size();
        for (int i10 = 0; i10 < size; i10++) {
            T.a aVar = (T.a) this.f16815c.get(i10);
            C1769q qVar = aVar.f16833b;
            if (qVar != null) {
                qVar.mBeingSaved = this.f16879w;
                qVar.setPopDirection(false);
                qVar.setNextTransition(this.f16820h);
                qVar.setSharedElementNames(this.f16828p, this.f16829q);
            }
            switch (aVar.f16832a) {
                case 1:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, false);
                    this.f16876t.j(qVar);
                    break;
                case 3:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.o1(qVar);
                    break;
                case 4:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.I0(qVar);
                    break;
                case 5:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, false);
                    this.f16876t.A1(qVar);
                    break;
                case 6:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.y(qVar);
                    break;
                case 7:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, false);
                    this.f16876t.o(qVar);
                    break;
                case 8:
                    this.f16876t.y1(qVar);
                    break;
                case 9:
                    this.f16876t.y1((C1769q) null);
                    break;
                case 10:
                    this.f16876t.x1(qVar, aVar.f16840i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f16832a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        for (int size = this.f16815c.size() - 1; size >= 0; size--) {
            T.a aVar = (T.a) this.f16815c.get(size);
            C1769q qVar = aVar.f16833b;
            if (qVar != null) {
                qVar.mBeingSaved = this.f16879w;
                qVar.setPopDirection(true);
                qVar.setNextTransition(J.t1(this.f16820h));
                qVar.setSharedElementNames(this.f16829q, this.f16828p);
            }
            switch (aVar.f16832a) {
                case 1:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, true);
                    this.f16876t.o1(qVar);
                    break;
                case 3:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.j(qVar);
                    break;
                case 4:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.A1(qVar);
                    break;
                case 5:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, true);
                    this.f16876t.I0(qVar);
                    break;
                case 6:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.o(qVar);
                    break;
                case 7:
                    qVar.setAnimations(aVar.f16835d, aVar.f16836e, aVar.f16837f, aVar.f16838g);
                    this.f16876t.w1(qVar, true);
                    this.f16876t.y(qVar);
                    break;
                case 8:
                    this.f16876t.y1((C1769q) null);
                    break;
                case 9:
                    this.f16876t.y1(qVar);
                    break;
                case 10:
                    this.f16876t.x1(qVar, aVar.f16839h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f16832a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1769q E(ArrayList arrayList, C1769q qVar) {
        ArrayList arrayList2 = arrayList;
        C1769q qVar2 = qVar;
        int i10 = 0;
        while (i10 < this.f16815c.size()) {
            T.a aVar = (T.a) this.f16815c.get(i10);
            int i11 = aVar.f16832a;
            if (i11 != 1) {
                if (i11 == 2) {
                    C1769q qVar3 = aVar.f16833b;
                    int i12 = qVar3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1769q qVar4 = (C1769q) arrayList2.get(size);
                        if (qVar4.mContainerId == i12) {
                            if (qVar4 == qVar3) {
                                z10 = true;
                            } else {
                                if (qVar4 == qVar2) {
                                    this.f16815c.add(i10, new T.a(9, qVar4, true));
                                    i10++;
                                    qVar2 = null;
                                }
                                T.a aVar2 = new T.a(3, qVar4, true);
                                aVar2.f16835d = aVar.f16835d;
                                aVar2.f16837f = aVar.f16837f;
                                aVar2.f16836e = aVar.f16836e;
                                aVar2.f16838g = aVar.f16838g;
                                this.f16815c.add(i10, aVar2);
                                arrayList2.remove(qVar4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f16815c.remove(i10);
                        i10--;
                    } else {
                        aVar.f16832a = 1;
                        aVar.f16834c = true;
                        arrayList2.add(qVar3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f16833b);
                    C1769q qVar5 = aVar.f16833b;
                    if (qVar5 == qVar2) {
                        this.f16815c.add(i10, new T.a(9, qVar5));
                        i10++;
                        qVar2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f16815c.add(i10, new T.a(9, qVar2, true));
                        aVar.f16834c = true;
                        i10++;
                        qVar2 = aVar.f16833b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f16833b);
            i10++;
        }
        return qVar2;
    }

    public String F() {
        return this.f16823k;
    }

    public void G() {
        if (this.f16831s != null) {
            for (int i10 = 0; i10 < this.f16831s.size(); i10++) {
                ((Runnable) this.f16831s.get(i10)).run();
            }
            this.f16831s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public C1769q H(ArrayList arrayList, C1769q qVar) {
        for (int size = this.f16815c.size() - 1; size >= 0; size--) {
            T.a aVar = (T.a) this.f16815c.get(size);
            int i10 = aVar.f16832a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            qVar = null;
                            break;
                        case 9:
                            qVar = aVar.f16833b;
                            break;
                        case 10:
                            aVar.f16840i = aVar.f16839h;
                            break;
                    }
                }
                arrayList.add(aVar.f16833b);
            }
            arrayList.remove(aVar.f16833b);
        }
        return qVar;
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f16821i) {
            return true;
        }
        this.f16876t.i(this);
        return true;
    }

    public int h() {
        return z(false, true);
    }

    public int i() {
        return z(true, true);
    }

    public void j() {
        m();
        this.f16876t.d0(this, false);
    }

    public void k() {
        m();
        this.f16876t.d0(this, true);
    }

    public T l(C1769q qVar) {
        J j10 = qVar.mFragmentManager;
        if (j10 == null || j10 == this.f16876t) {
            return super.l(qVar);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + qVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, C1769q qVar, String str, int i11) {
        super.n(i10, qVar, str, i11);
        qVar.mFragmentManager = this.f16876t;
    }

    public T o(C1769q qVar) {
        J j10 = qVar.mFragmentManager;
        if (j10 == null || j10 == this.f16876t) {
            return super.o(qVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + qVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16878v >= 0) {
            sb2.append(" #");
            sb2.append(this.f16878v);
        }
        if (this.f16823k != null) {
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb2.append(this.f16823k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public T v(C1769q qVar, C1790m.b bVar) {
        if (qVar.mFragmentManager != this.f16876t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f16876t);
        } else if (bVar == C1790m.b.INITIALIZED && qVar.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != C1790m.b.DESTROYED) {
            return super.v(qVar, bVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i10) {
        if (this.f16821i) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f16815c.size();
            for (int i11 = 0; i11 < size; i11++) {
                T.a aVar = (T.a) this.f16815c.get(i11);
                C1769q qVar = aVar.f16833b;
                if (qVar != null) {
                    qVar.mBackStackNesting += i10;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f16833b + " to " + aVar.f16833b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        int size = this.f16815c.size() - 1;
        while (size >= 0) {
            T.a aVar = (T.a) this.f16815c.get(size);
            if (aVar.f16834c) {
                if (aVar.f16832a == 8) {
                    aVar.f16834c = false;
                    this.f16815c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f16833b.mContainerId;
                    aVar.f16832a = 2;
                    aVar.f16834c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        T.a aVar2 = (T.a) this.f16815c.get(i11);
                        if (aVar2.f16834c && aVar2.f16833b.mContainerId == i10) {
                            this.f16815c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    public int z(boolean z10, boolean z11) {
        if (!this.f16877u) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
                A("  ", printWriter);
                printWriter.close();
            }
            this.f16877u = true;
            if (this.f16821i) {
                this.f16878v = this.f16876t.m();
            } else {
                this.f16878v = -1;
            }
            if (z11) {
                this.f16876t.a0(this, z10);
            }
            return this.f16878v;
        }
        throw new IllegalStateException("commit already called");
    }
}
