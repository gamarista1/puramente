package Sh;

import Ph.c;

abstract class a extends d implements c {

    /* renamed from: k  reason: collision with root package name */
    Class[] f65102k;

    /* renamed from: l  reason: collision with root package name */
    String[] f65103l;

    /* renamed from: m  reason: collision with root package name */
    Class[] f65104m;

    a(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, str, cls);
        this.f65102k = clsArr;
        this.f65103l = strArr;
        this.f65104m = clsArr2;
    }

    public Class[] l() {
        if (this.f65104m == null) {
            this.f65104m = e(5);
        }
        return this.f65104m;
    }

    public Class[] m() {
        if (this.f65102k == null) {
            this.f65102k = e(3);
        }
        return this.f65102k;
    }
}
