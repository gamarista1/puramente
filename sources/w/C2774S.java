package w;

import androidx.collection.B;
import androidx.collection.C;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.S  reason: case insensitive filesystem */
public final class C2774S implements C2759C {

    /* renamed from: a  reason: collision with root package name */
    private final b f27242a;

    /* renamed from: w.S$a */
    public static final class a extends C2773Q {

        /* renamed from: c  reason: collision with root package name */
        private int f27243c;

        public /* synthetic */ a(Object obj, C2760D d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, d10, i10);
        }

        public final int d() {
            return this.f27243c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!C6496s.c(aVar.b(), b()) || !C6496s.c(aVar.a(), a()) || !C2808t.c(aVar.f27243c, this.f27243c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            Object b10 = b();
            if (b10 != null) {
                i10 = b10.hashCode();
            } else {
                i10 = 0;
            }
            return (((i10 * 31) + C2808t.d(this.f27243c)) * 31) + a().hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, C2760D d10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? C2762F.e() : d10, (i11 & 4) != 0 ? C2808t.f27575a.a() : i10, (DefaultConstructorMarker) null);
        }

        private a(Object obj, C2760D d10, int i10) {
            super(obj, d10, (DefaultConstructorMarker) null);
            this.f27243c = i10;
        }
    }

    /* renamed from: w.S$b */
    public static final class b extends C2775T {
        public b() {
            super((DefaultConstructorMarker) null);
        }

        public a f(Object obj, int i10) {
            a aVar = new a(obj, (C2760D) null, 0, 6, (DefaultConstructorMarker) null);
            c().t(i10, aVar);
            return aVar;
        }
    }

    public C2774S(b bVar) {
        this.f27242a = bVar;
    }

    /* renamed from: f */
    public D0 a(r0 r0Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i10;
        B b10 = new B(this.f27242a.c().e() + 2);
        C c10 = new C(this.f27242a.c().e());
        C c11 = this.f27242a.c();
        int[] iArr3 = c11.f12189b;
        Object[] objArr = c11.f12190c;
        long[] jArr3 = c11.f12188a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            b10.h(i16);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            c10.t(i16, new C0((C2805q) r0Var.a().invoke(aVar.b()), aVar.a(), aVar.d(), (DefaultConstructorMarker) null));
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f27242a.c().a(0)) {
            b10.g(0, 0);
        }
        if (!this.f27242a.c().a(this.f27242a.b())) {
            b10.h(this.f27242a.b());
        }
        b10.n();
        return new D0(b10, c10, this.f27242a.b(), this.f27242a.a(), C2762F.e(), C2808t.f27575a.a(), (DefaultConstructorMarker) null);
    }
}
