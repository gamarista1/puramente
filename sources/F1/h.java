package f1;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f1.b;
import java.util.Arrays;
import java.util.Comparator;

public class h extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f19643g = 128;

    /* renamed from: h  reason: collision with root package name */
    private i[] f19644h = new i[128];

    /* renamed from: i  reason: collision with root package name */
    private i[] f19645i = new i[128];

    /* renamed from: j  reason: collision with root package name */
    private int f19646j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f19647k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    c f19648l;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f19656c - iVar2.f19656c;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        i f19650a;

        /* renamed from: b  reason: collision with root package name */
        h f19651b;

        b(h hVar) {
            this.f19651b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (this.f19650a.f19654a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.f19650a.f19662i;
                    float f11 = fArr[i10] + (iVar.f19662i[i10] * f10);
                    fArr[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        this.f19650a.f19662i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    h.this.G(this.f19650a);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f12 = iVar.f19662i[i11];
                if (f12 != 0.0f) {
                    float f13 = f12 * f10;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.f19650a.f19662i[i11] = f13;
                } else {
                    this.f19650a.f19662i[i11] = 0.0f;
                }
            }
            return true;
        }

        public void b(i iVar) {
            this.f19650a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f19650a.f19662i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (i10 >= 0) {
                float f10 = iVar.f19662i[i10];
                float f11 = this.f19650a.f19662i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f19650a.f19662i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f19650a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f19650a.f19662i[i10] + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                }
            }
            return str + "] " + this.f19650a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f19648l = cVar;
    }

    private void F(i iVar) {
        int i10;
        int i11 = this.f19646j + 1;
        i[] iVarArr = this.f19644h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f19644h = iVarArr2;
            this.f19645i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f19644h;
        int i12 = this.f19646j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f19646j = i13;
        if (i13 > 1 && iVarArr3[i12].f19656c > iVar.f19656c) {
            int i14 = 0;
            while (true) {
                i10 = this.f19646j;
                if (i14 >= i10) {
                    break;
                }
                this.f19645i[i14] = this.f19644h[i14];
                i14++;
            }
            Arrays.sort(this.f19645i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f19646j; i15++) {
                this.f19644h[i15] = this.f19645i[i15];
            }
        }
        iVar.f19654a = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    public void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f19646j) {
            if (this.f19644h[i10] == iVar) {
                while (true) {
                    int i11 = this.f19646j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f19644h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f19646j = i11 - 1;
                        iVar.f19654a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        i iVar = bVar.f19606a;
        if (iVar != null) {
            b.a aVar = bVar.f19610e;
            int f10 = aVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                i a10 = aVar.a(i10);
                float g10 = aVar.g(i10);
                this.f19647k.b(a10);
                if (this.f19647k.a(iVar, g10)) {
                    F(a10);
                }
                this.f19607b += bVar.f19607b * g10;
            }
            G(iVar);
        }
    }

    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f19646j; i11++) {
            i iVar = this.f19644h[i11];
            if (!zArr[iVar.f19656c]) {
                this.f19647k.b(iVar);
                if (i10 == -1) {
                    if (!this.f19647k.c()) {
                    }
                } else if (!this.f19647k.d(this.f19644h[i10])) {
                }
                i10 = i11;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f19644h[i10];
    }

    public void c(i iVar) {
        this.f19647k.b(iVar);
        this.f19647k.e();
        iVar.f19662i[iVar.f19658e] = 1.0f;
        F(iVar);
    }

    public void clear() {
        this.f19646j = 0;
        this.f19607b = 0.0f;
    }

    public boolean isEmpty() {
        if (this.f19646j == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f19607b + ") : ";
        for (int i10 = 0; i10 < this.f19646j; i10++) {
            this.f19647k.b(this.f19644h[i10]);
            str = str + this.f19647k + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        return str;
    }
}
