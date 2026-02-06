package f1;

import java.util.Arrays;
import java.util.HashSet;

public class i implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    private static int f19653r = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19654a;

    /* renamed from: b  reason: collision with root package name */
    private String f19655b;

    /* renamed from: c  reason: collision with root package name */
    public int f19656c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f19657d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f19658e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f19659f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19660g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f19661h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f19662i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    a f19663j;

    /* renamed from: k  reason: collision with root package name */
    b[] f19664k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f19665l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f19666m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f19667n = false;

    /* renamed from: o  reason: collision with root package name */
    int f19668o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f19669p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    HashSet f19670q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f19663j = aVar;
    }

    static void c() {
        f19653r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f19665l;
            if (i10 >= i11) {
                b[] bVarArr = this.f19664k;
                if (i11 >= bVarArr.length) {
                    this.f19664k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f19664k;
                int i12 = this.f19665l;
                bVarArr2[i12] = bVar;
                this.f19665l = i12 + 1;
                return;
            } else if (this.f19664k[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f19656c - iVar.f19656c;
    }

    public final void e(b bVar) {
        int i10 = this.f19665l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f19664k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f19664k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f19665l--;
                return;
            }
            i11++;
        }
    }

    public void f() {
        this.f19655b = null;
        this.f19663j = a.UNKNOWN;
        this.f19658e = 0;
        this.f19656c = -1;
        this.f19657d = -1;
        this.f19659f = 0.0f;
        this.f19660g = false;
        this.f19667n = false;
        this.f19668o = -1;
        this.f19669p = 0.0f;
        int i10 = this.f19665l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19664k[i11] = null;
        }
        this.f19665l = 0;
        this.f19666m = 0;
        this.f19654a = false;
        Arrays.fill(this.f19662i, 0.0f);
    }

    public void i(d dVar, float f10) {
        this.f19659f = f10;
        this.f19660g = true;
        this.f19667n = false;
        this.f19668o = -1;
        this.f19669p = 0.0f;
        int i10 = this.f19665l;
        this.f19657d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19664k[i11].A(dVar, this, false);
        }
        this.f19665l = 0;
    }

    public void j(a aVar, String str) {
        this.f19663j = aVar;
    }

    public final void l(d dVar, b bVar) {
        int i10 = this.f19665l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19664k[i11].B(dVar, bVar, false);
        }
        this.f19665l = 0;
    }

    public String toString() {
        if (this.f19655b != null) {
            return "" + this.f19655b;
        }
        return "" + this.f19656c;
    }
}
