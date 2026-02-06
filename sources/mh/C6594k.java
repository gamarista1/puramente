package mh;

import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6558k;

/* renamed from: mh.k  reason: case insensitive filesystem */
public abstract class C6594k {

    /* renamed from: a  reason: collision with root package name */
    private final C6558k f72213a = new C6558k();

    /* renamed from: b  reason: collision with root package name */
    private int f72214b;

    /* access modifiers changed from: protected */
    public final void a(char[] cArr) {
        C6496s.h(cArr, "array");
        synchronized (this) {
            try {
                if (this.f72214b + cArr.length < C6592i.f72211a) {
                    this.f72214b += cArr.length;
                    this.f72213a.addLast(cArr);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f72213a.H();
            if (cArr != null) {
                this.f72214b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i10];
        }
        return cArr;
    }
}
