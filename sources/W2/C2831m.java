package w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: w2.m  reason: case insensitive filesystem */
public class C2831m {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator f27777h = new C2829k();

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator f27778i = new C2830l();

    /* renamed from: a  reason: collision with root package name */
    private final int f27779a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f27780b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f27781c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f27782d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f27783e;

    /* renamed from: f  reason: collision with root package name */
    private int f27784f;

    /* renamed from: g  reason: collision with root package name */
    private int f27785g;

    /* renamed from: w2.m$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f27786a;

        /* renamed from: b  reason: collision with root package name */
        public int f27787b;

        /* renamed from: c  reason: collision with root package name */
        public float f27788c;

        private b() {
        }
    }

    public C2831m(int i10) {
        this.f27779a = i10;
    }

    private void d() {
        if (this.f27782d != 1) {
            Collections.sort(this.f27780b, f27777h);
            this.f27782d = 1;
        }
    }

    private void e() {
        if (this.f27782d != 0) {
            Collections.sort(this.f27780b, f27778i);
            this.f27782d = 0;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f27786a - bVar2.f27786a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f27785g;
        if (i11 > 0) {
            b[] bVarArr = this.f27781c;
            int i12 = i11 - 1;
            this.f27785g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f27783e;
        this.f27783e = i13 + 1;
        bVar.f27786a = i13;
        bVar.f27787b = i10;
        bVar.f27788c = f10;
        this.f27780b.add(bVar);
        this.f27784f += i10;
        while (true) {
            int i14 = this.f27784f;
            int i15 = this.f27779a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = (b) this.f27780b.get(0);
                int i17 = bVar2.f27787b;
                if (i17 <= i16) {
                    this.f27784f -= i17;
                    this.f27780b.remove(0);
                    int i18 = this.f27785g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f27781c;
                        this.f27785g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f27787b = i17 - i16;
                    this.f27784f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f27784f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27780b.size(); i11++) {
            b bVar = (b) this.f27780b.get(i11);
            i10 += bVar.f27787b;
            if (((float) i10) >= f11) {
                return bVar.f27788c;
            }
        }
        if (this.f27780b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f27780b;
        return ((b) arrayList.get(arrayList.size() - 1)).f27788c;
    }

    public void i() {
        this.f27780b.clear();
        this.f27782d = -1;
        this.f27783e = 0;
        this.f27784f = 0;
    }
}
