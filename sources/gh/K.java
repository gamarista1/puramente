package Gh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6550c;
import mf.C6559l;
import mf.C6565s;

public final class K extends C6550c implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final a f63218d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C5407h[] f63219b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f63220c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C5404e eVar, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            C5404e eVar2;
            C5404e eVar3 = eVar;
            int i17 = i10;
            List list3 = list;
            int i18 = i11;
            int i19 = i12;
            List list4 = list2;
            if (i18 < i19) {
                int i20 = i18;
                while (i20 < i19) {
                    if (((C5407h) list3.get(i20)).O() >= i17) {
                        i20++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                C5407h hVar = (C5407h) list.get(i11);
                C5407h hVar2 = (C5407h) list3.get(i19 - 1);
                int i21 = -1;
                if (i17 == hVar.O()) {
                    int intValue = ((Number) list4.get(i18)).intValue();
                    int i22 = i18 + 1;
                    i13 = i22;
                    i14 = intValue;
                    hVar = (C5407h) list3.get(i22);
                } else {
                    i13 = i18;
                    i14 = -1;
                }
                if (hVar.j(i17) != hVar2.j(i17)) {
                    int i23 = 1;
                    for (int i24 = i13 + 1; i24 < i19; i24++) {
                        if (((C5407h) list3.get(i24 - 1)).j(i17) != ((C5407h) list3.get(i24)).j(i17)) {
                            i23++;
                        }
                    }
                    long c10 = j10 + c(eVar3) + ((long) 2) + ((long) (i23 * 2));
                    eVar3.D(i23);
                    eVar3.D(i14);
                    for (int i25 = i13; i25 < i19; i25++) {
                        byte j11 = ((C5407h) list3.get(i25)).j(i17);
                        if (i25 == i13 || j11 != ((C5407h) list3.get(i25 - 1)).j(i17)) {
                            eVar3.D(j11 & 255);
                        }
                    }
                    C5404e eVar4 = new C5404e();
                    while (i13 < i19) {
                        byte j12 = ((C5407h) list3.get(i13)).j(i17);
                        int i26 = i13 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i19) {
                                i15 = i19;
                                break;
                            } else if (j12 != ((C5407h) list3.get(i27)).j(i17)) {
                                i15 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i15 && i17 + 1 == ((C5407h) list3.get(i13)).O()) {
                            eVar3.D(((Number) list4.get(i13)).intValue());
                            i16 = i15;
                            eVar2 = eVar4;
                        } else {
                            eVar3.D(((int) (c10 + c(eVar4))) * i21);
                            i16 = i15;
                            eVar2 = eVar4;
                            a(c10, eVar4, i17 + 1, list, i13, i15, list2);
                        }
                        eVar4 = eVar2;
                        i13 = i16;
                        i21 = -1;
                    }
                    eVar3.K(eVar4);
                    return;
                }
                int min = Math.min(hVar.O(), hVar2.O());
                int i28 = 0;
                int i29 = i17;
                while (i29 < min && hVar.j(i29) == hVar2.j(i29)) {
                    i28++;
                    i29++;
                }
                long c11 = j10 + c(eVar3) + ((long) 2) + ((long) i28) + 1;
                eVar3.D(-i28);
                eVar3.D(i14);
                int i30 = i28 + i17;
                while (i17 < i30) {
                    eVar3.D(hVar.j(i17) & 255);
                    i17++;
                }
                if (i13 + 1 != i19) {
                    C5404e eVar5 = new C5404e();
                    eVar3.D(((int) (c(eVar5) + c11)) * -1);
                    a(c11, eVar5, i30, list, i13, i12, list2);
                    eVar3.K(eVar5);
                } else if (i30 == ((C5407h) list3.get(i13)).O()) {
                    eVar3.D(((Number) list4.get(i13)).intValue());
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        static /* synthetic */ void b(a aVar, long j10, C5404e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            long j11;
            int i14;
            int i15;
            int i16;
            if ((i13 & 1) != 0) {
                j11 = 0;
            } else {
                j11 = j10;
            }
            if ((i13 & 4) != 0) {
                i14 = 0;
            } else {
                i14 = i10;
            }
            if ((i13 & 16) != 0) {
                i15 = 0;
            } else {
                i15 = i11;
            }
            if ((i13 & 32) != 0) {
                i16 = list.size();
            } else {
                i16 = i12;
            }
            aVar.a(j11, eVar, i14, list, i15, i16, list2);
        }

        private final long c(C5404e eVar) {
            return eVar.B0() / ((long) 4);
        }

        public final K d(C5407h... hVarArr) {
            C5407h[] hVarArr2 = hVarArr;
            C6496s.h(hVarArr2, "byteStrings");
            if (hVarArr2.length == 0) {
                return new K(new C5407h[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List w12 = C6559l.w1(hVarArr);
            C6565s.B(w12);
            int size = w12.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = hVarArr2.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(C6565s.m(w12, hVarArr2[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C5407h) w12.get(0)).O() > 0) {
                int i13 = 0;
                while (i13 < w12.size()) {
                    C5407h hVar = (C5407h) w12.get(i13);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (i15 < w12.size()) {
                        C5407h hVar2 = (C5407h) w12.get(i15);
                        if (!hVar2.P(hVar)) {
                            continue;
                            break;
                        } else if (hVar2.O() == hVar.O()) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                        } else if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                            w12.remove(i15);
                            arrayList.remove(i15);
                        } else {
                            i15++;
                        }
                    }
                    i13 = i14;
                }
                C5404e eVar = new C5404e();
                b(this, 0, eVar, 0, w12, 0, 0, arrayList, 53, (Object) null);
                int c10 = (int) c(eVar);
                int[] iArr = new int[c10];
                for (int i16 = 0; i16 < c10; i16++) {
                    iArr[i16] = eVar.readInt();
                }
                Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                C6496s.g(copyOf, "copyOf(...)");
                return new K((C5407h[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }

        private a() {
        }
    }

    public /* synthetic */ K(C5407h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public static final K v(C5407h... hVarArr) {
        return f63218d.d(hVarArr);
    }

    public int a() {
        return this.f63219b.length;
    }

    public /* bridge */ boolean b(C5407h hVar) {
        return super.contains(hVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C5407h)) {
            return false;
        }
        return b((C5407h) obj);
    }

    /* renamed from: g */
    public C5407h get(int i10) {
        return this.f63219b[i10];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C5407h)) {
            return -1;
        }
        return r((C5407h) obj);
    }

    public final C5407h[] k() {
        return this.f63219b;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C5407h)) {
            return -1;
        }
        return t((C5407h) obj);
    }

    public final int[] n() {
        return this.f63220c;
    }

    public /* bridge */ int r(C5407h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int t(C5407h hVar) {
        return super.lastIndexOf(hVar);
    }

    private K(C5407h[] hVarArr, int[] iArr) {
        this.f63219b = hVarArr;
        this.f63220c = iArr;
    }
}
