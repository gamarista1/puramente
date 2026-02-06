package ia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class H {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator f44395h = new F();

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator f44396i = new G();

    /* renamed from: a  reason: collision with root package name */
    private final int f44397a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f44398b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f44399c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f44400d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f44401e;

    /* renamed from: f  reason: collision with root package name */
    private int f44402f;

    /* renamed from: g  reason: collision with root package name */
    private int f44403g;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f44404a;

        /* renamed from: b  reason: collision with root package name */
        public int f44405b;

        /* renamed from: c  reason: collision with root package name */
        public float f44406c;

        private b() {
        }
    }

    public H(int i10) {
        this.f44397a = i10;
    }

    private void d() {
        if (this.f44400d != 1) {
            Collections.sort(this.f44398b, f44395h);
            this.f44400d = 1;
        }
    }

    private void e() {
        if (this.f44400d != 0) {
            Collections.sort(this.f44398b, f44396i);
            this.f44400d = 0;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f44404a - bVar2.f44404a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f44403g;
        if (i11 > 0) {
            b[] bVarArr = this.f44399c;
            int i12 = i11 - 1;
            this.f44403g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f44401e;
        this.f44401e = i13 + 1;
        bVar.f44404a = i13;
        bVar.f44405b = i10;
        bVar.f44406c = f10;
        this.f44398b.add(bVar);
        this.f44402f += i10;
        while (true) {
            int i14 = this.f44402f;
            int i15 = this.f44397a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = (b) this.f44398b.get(0);
                int i17 = bVar2.f44405b;
                if (i17 <= i16) {
                    this.f44402f -= i17;
                    this.f44398b.remove(0);
                    int i18 = this.f44403g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f44399c;
                        this.f44403g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f44405b = i17 - i16;
                    this.f44402f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f44402f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44398b.size(); i11++) {
            b bVar = (b) this.f44398b.get(i11);
            i10 += bVar.f44405b;
            if (((float) i10) >= f11) {
                return bVar.f44406c;
            }
        }
        if (this.f44398b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f44398b;
        return ((b) arrayList.get(arrayList.size() - 1)).f44406c;
    }

    public void i() {
        this.f44398b.clear();
        this.f44400d = -1;
        this.f44401e = 0;
        this.f44402f = 0;
    }
}
