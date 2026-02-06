package y8;

import com.facebook.soloader.E;

/* renamed from: y8.e  reason: case insensitive filesystem */
public class C4219e implements C4222h {

    /* renamed from: a  reason: collision with root package name */
    private final C4222h[] f49875a;

    /* renamed from: b  reason: collision with root package name */
    private int f49876b = 0;

    public C4219e(C4222h... hVarArr) {
        this.f49875a = hVarArr;
    }

    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        C4222h[] hVarArr;
        do {
            i10 = this.f49876b;
            hVarArr = this.f49875a;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f49876b = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
