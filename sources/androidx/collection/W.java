package androidx.collection;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.C2664a;
import yf.C6798l;
import zf.C6828a;

public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12130a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12131b;

    /* renamed from: c  reason: collision with root package name */
    public int f12132c;

    /* renamed from: d  reason: collision with root package name */
    public int f12133d;

    public class a implements Set, C6828a {
        public a() {
        }

        public int a() {
            return W.this.f12133d;
        }

        public boolean contains(Object obj) {
            return W.this.a(obj);
        }

        public boolean containsAll(Collection collection) {
            C6496s.h(collection, "elements");
            W w10 = W.this;
            for (Object a10 : collection) {
                if (!w10.a(a10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return W.this.d();
        }

        public final /* bridge */ int size() {
            return a();
        }

        public Object[] toArray() {
            return C6488j.a(this);
        }

        public Object[] toArray(Object[] objArr) {
            C6496s.h(objArr, "array");
            return C6488j.b(this, objArr);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ W f12135a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(W w10) {
            super(1);
            this.f12135a = w10;
        }

        /* renamed from: a */
        public final CharSequence invoke(Object obj) {
            if (obj == this.f12135a) {
                return "(this)";
            }
            return String.valueOf(obj);
        }
    }

    public /* synthetic */ W(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String g(W w10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if (obj == null) {
            if ((i11 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i11 & 2) != 0) {
                charSequence5 = charSequence6;
            } else {
                charSequence5 = charSequence2;
            }
            if ((i11 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence7 = charSequence4;
            if ((i11 & 32) != 0) {
                lVar = null;
            }
            return w10.f(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12132c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f12130a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12131b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C6496s.c(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0075
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            return r2
        L_0x0075:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.W.a(java.lang.Object):boolean");
    }

    public final int b() {
        return this.f12132c;
    }

    public final int c() {
        return this.f12133d;
    }

    public final boolean d() {
        if (this.f12133d == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f12133d != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.W
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.W r1 = (androidx.collection.W) r1
            int r3 = r1.c()
            int r5 = r17.c()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f12131b
            long[] r5 = r0.f12130a
            int r6 = r5.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0061
            r7 = r4
        L_0x0025:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x005c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003f:
            if (r12 >= r10) goto L_0x005a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0056
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L_0x0056
            return r4
        L_0x0056:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003f
        L_0x005a:
            if (r10 != r11) goto L_0x0061
        L_0x005c:
            if (r7 == r6) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.W.equals(java.lang.Object):boolean");
    }

    public final String f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = charSequence2;
        CharSequence charSequence7 = charSequence3;
        CharSequence charSequence8 = charSequence4;
        C6798l lVar2 = lVar;
        C6496s.h(charSequence5, "separator");
        C6496s.h(charSequence6, "prefix");
        C6496s.h(charSequence7, "postfix");
        C6496s.h(charSequence8, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence6);
        Object[] objArr = this.f12131b;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0:
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i15];
                            if (i12 == i10) {
                                sb2.append(charSequence8);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(charSequence5);
                            }
                            if (lVar2 == null) {
                                sb2.append(obj);
                            } else {
                                sb2.append((CharSequence) lVar2.invoke(obj));
                            }
                            i12++;
                            i13 = 8;
                        } else {
                            int i16 = i10;
                        }
                        j10 >>= i13;
                        i15++;
                    }
                    int i17 = i10;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    int i18 = i10;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence7);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int i10;
        Object[] objArr = this.f12131b;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        int i11 = 0;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i12 << 3) + i15];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += i10;
                        }
                        j10 >>= 8;
                    }
                    if (i14 != 8) {
                        return i13;
                    }
                }
                if (i12 == length) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    public String toString() {
        return g(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new b(this), 25, (Object) null);
    }

    private W() {
        this.f12130a = V.f12128a;
        this.f12131b = C2664a.f26375c;
    }
}
