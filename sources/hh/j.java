package Hh;

import Gh.C5406g;
import Gh.M;
import Sg.C5538a;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import pf.C6632a;
import yf.p;

public abstract class j {

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(((i) obj).b(), ((i) obj2).b());
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f63515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f63516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ M f63517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5406g f63518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f63519e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f63520f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N f63521g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ N f63522h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ N f63523i;

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f63524a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5406g f63525b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f63526c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f63527d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(N n10, C5406g gVar, N n11, N n12) {
                super(2);
                this.f63524a = n10;
                this.f63525b = gVar;
                this.f63526c = n11;
                this.f63527d = n12;
            }

            public final void a(int i10, long j10) {
                if (i10 == 1) {
                    N n10 = this.f63524a;
                    if (n10.f71759a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (j10 == 24) {
                        n10.f71759a = Long.valueOf(this.f63525b.r0());
                        this.f63526c.f71759a = Long.valueOf(this.f63525b.r0());
                        this.f63527d.f71759a = Long.valueOf(this.f63525b.r0());
                    } else {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(J j10, long j11, M m10, C5406g gVar, M m11, M m12, N n10, N n11, N n12) {
            super(2);
            this.f63515a = j10;
            this.f63516b = j11;
            this.f63517c = m10;
            this.f63518d = gVar;
            this.f63519e = m11;
            this.f63520f = m12;
            this.f63521g = n10;
            this.f63522h = n11;
            this.f63523i = n12;
        }

        public final void a(int i10, long j10) {
            long j11;
            if (i10 == 1) {
                J j12 = this.f63515a;
                if (!j12.f71755a) {
                    j12.f71755a = true;
                    if (j10 >= this.f63516b) {
                        M m10 = this.f63517c;
                        long j13 = m10.f71758a;
                        if (j13 == 4294967295L) {
                            j13 = this.f63518d.r0();
                        }
                        m10.f71758a = j13;
                        M m11 = this.f63519e;
                        long j14 = 0;
                        if (m11.f71758a == 4294967295L) {
                            j11 = this.f63518d.r0();
                        } else {
                            j11 = 0;
                        }
                        m11.f71758a = j11;
                        M m12 = this.f63520f;
                        if (m12.f71758a == 4294967295L) {
                            j14 = this.f63518d.r0();
                        }
                        m12.f71758a = j14;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            } else if (i10 == 10) {
                if (j10 >= 4) {
                    this.f63518d.skip(4);
                    C5406g gVar = this.f63518d;
                    j.i(gVar, (int) (j10 - 4), new a(this.f63521g, gVar, this.f63522h, this.f63523i));
                    return;
                }
                throw new IOException("bad zip: NTFS extra too short");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5406g f63528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f63529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f63530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f63531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5406g gVar, N n10, N n11, N n12) {
            super(2);
            this.f63528a = gVar;
            this.f63529b = n10;
            this.f63530c = n11;
            this.f63531d = n12;
        }

        public final void a(int i10, long j10) {
            boolean z10;
            boolean z11;
            if (i10 == 21589) {
                long j11 = 1;
                if (j10 >= 1) {
                    byte readByte = this.f63528a.readByte();
                    boolean z12 = false;
                    if ((readByte & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((readByte & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z12 = true;
                    }
                    C5406g gVar = this.f63528a;
                    if (z10) {
                        j11 = 5;
                    }
                    if (z11) {
                        j11 += 4;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (j10 >= j11) {
                        if (z10) {
                            this.f63529b.f71759a = Integer.valueOf(gVar.m1());
                        }
                        if (z11) {
                            this.f63530c.f71759a = Integer.valueOf(this.f63528a.m1());
                        }
                        if (z12) {
                            this.f63531d.f71759a = Integer.valueOf(this.f63528a.m1());
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C6514M.f71813a;
        }
    }

    private static final Map b(List list) {
        Gh.M e10 = M.a.e(Gh.M.f63223b, "/", false, 1, (Object) null);
        Map n10 = O.n(C6502A.a(e10, new i(e10, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 65532, (DefaultConstructorMarker) null)));
        Iterator it = C6565s.U0(list, new a()).iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (((i) n10.put(iVar.b(), iVar)) == null) {
                while (true) {
                    Gh.M l10 = iVar.b().l();
                    if (l10 == null) {
                        break;
                    }
                    i iVar2 = (i) n10.get(l10);
                    if (iVar2 != null) {
                        iVar2.c().add(iVar.b());
                        break;
                    }
                    Iterator it2 = it;
                    i iVar3 = r4;
                    i iVar4 = new i(l10, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 65532, (DefaultConstructorMarker) null);
                    n10.put(l10, iVar3);
                    iVar3.c().add(iVar.b());
                    iVar = iVar3;
                    it = it2;
                }
            }
        }
        return n10;
    }

    public static final Long c(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(k.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long d(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String num = Integer.toString(i10, C5538a.a(16));
        C6496s.g(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016a, code lost:
        r3 = new Gh.Z(r1, r2, b(r5), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0173, code lost:
        if (r4 != null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0178, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r11.close();
        r5 = r5 - ((long) 20);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r5 <= 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r5 = Gh.H.d(r4.F(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r5.m1() != 117853008) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r0 = r5.m1();
        r12 = r5.r0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r5.m1() != 1) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r0 != 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r6 = Gh.H.d(r4.F(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0 = r6.m1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r0 != 101075792) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r9 = l(r6, r9);
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r6 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r12 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        throw new java.io.IOException("bad zip: expected " + e(101075792) + " but was " + e(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r6 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        lf.C6523g.a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r6 = r0;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r5 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0105, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0109, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010a, code lost:
        r5 = new java.util.ArrayList();
        r6 = Gh.H.d(r4.F(r9.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12 = r9.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0121, code lost:
        if (r7 < r12) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0123, code lost:
        r0 = g(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0131, code lost:
        if (r0.i() < r9.a()) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013d, code lost:
        if (((java.lang.Boolean) r3.invoke(r0)).booleanValue() != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013f, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0143, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0144, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0146, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0151, code lost:
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0152, code lost:
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0154, code lost:
        if (r6 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015b, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
        if (r6 != null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        lf.C6523g.a(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0168, code lost:
        if (r11 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r9 = h(r11);
        r10 = r11.z0((long) r9.b());
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd A[SYNTHETIC, Splitter:B:46:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ed A[SYNTHETIC, Splitter:B:54:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0108 A[Catch:{ all -> 0x017a, all -> 0x00fb, all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0109 A[Catch:{ all -> 0x017a, all -> 0x00fb, all -> 0x0101 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Gh.Z f(Gh.M r18, Gh.C5411l r19, yf.C6798l r20) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            Gh.j r4 = r2.n(r1)
            long r5 = r4.E()     // Catch:{ all -> 0x0101 }
            r0 = 22
            long r7 = (long) r0     // Catch:{ all -> 0x0101 }
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0194
            r9 = 65536(0x10000, double:3.2379E-319)
            long r9 = r5 - r9
            long r9 = java.lang.Math.max(r9, r7)     // Catch:{ all -> 0x0101 }
        L_0x0030:
            Gh.W r0 = r4.F(r5)     // Catch:{ all -> 0x0101 }
            Gh.g r11 = Gh.H.d(r0)     // Catch:{ all -> 0x0101 }
            int r0 = r11.m1()     // Catch:{ all -> 0x017a }
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r12) goto L_0x017c
            Hh.f r9 = h(r11)     // Catch:{ all -> 0x017a }
            int r0 = r9.b()     // Catch:{ all -> 0x017a }
            long r12 = (long) r0     // Catch:{ all -> 0x017a }
            java.lang.String r10 = r11.z0(r12)     // Catch:{ all -> 0x017a }
            r11.close()     // Catch:{ all -> 0x0101 }
            r0 = 20
            long r11 = (long) r0     // Catch:{ all -> 0x0101 }
            long r5 = r5 - r11
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r11 = 0
            if (r0 <= 0) goto L_0x010a
            Gh.W r0 = r4.F(r5)     // Catch:{ all -> 0x0101 }
            Gh.g r5 = Gh.H.d(r0)     // Catch:{ all -> 0x0101 }
            int r0 = r5.m1()     // Catch:{ all -> 0x00de }
            r6 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r0 != r6) goto L_0x00e9
            int r0 = r5.m1()     // Catch:{ all -> 0x00de }
            long r12 = r5.r0()     // Catch:{ all -> 0x00de }
            int r6 = r5.m1()     // Catch:{ all -> 0x00de }
            r14 = 1
            if (r6 != r14) goto L_0x00e1
            if (r0 != 0) goto L_0x00e1
            Gh.W r0 = r4.F(r12)     // Catch:{ all -> 0x00de }
            Gh.g r6 = Gh.H.d(r0)     // Catch:{ all -> 0x00de }
            int r0 = r6.m1()     // Catch:{ all -> 0x009d }
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r0 != r12) goto L_0x00a1
            Hh.f r9 = l(r6, r9)     // Catch:{ all -> 0x009d }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r0 = move-exception
            goto L_0x00da
        L_0x009b:
            r0 = r11
            goto L_0x00da
        L_0x009d:
            r0 = move-exception
            r12 = r9
            r9 = r0
            goto L_0x00c8
        L_0x00a1:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r14.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r15 = "bad zip: expected "
            r14.append(r15)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = e(r12)     // Catch:{ all -> 0x009d }
            r14.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = " but was "
            r14.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = e(r0)     // Catch:{ all -> 0x009d }
            r14.append(r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x009d }
            r13.<init>(r0)     // Catch:{ all -> 0x009d }
            throw r13     // Catch:{ all -> 0x009d }
        L_0x00c8:
            if (r6 == 0) goto L_0x00d8
            r6.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00d8
        L_0x00ce:
            r0 = move-exception
            r6 = r0
            lf.C6523g.a(r9, r6)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r6 = r0
            r9 = r12
            goto L_0x00f5
        L_0x00d8:
            r0 = r9
            r9 = r12
        L_0x00da:
            if (r0 != 0) goto L_0x00dd
            goto L_0x00e9
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r6 = r0
            goto L_0x00f5
        L_0x00e1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00de }
            java.lang.String r6 = "unsupported zip: spanned"
            r0.<init>(r6)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00e9:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x00de }
            if (r5 == 0) goto L_0x00f3
            r5.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00f3
        L_0x00f1:
            r0 = move-exception
            goto L_0x0106
        L_0x00f3:
            r0 = r11
            goto L_0x0106
        L_0x00f5:
            if (r5 == 0) goto L_0x0105
            r5.close()     // Catch:{ all -> 0x00fb }
            goto L_0x0105
        L_0x00fb:
            r0 = move-exception
            r5 = r0
            lf.C6523g.a(r6, r5)     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r1 = r0
            goto L_0x01af
        L_0x0105:
            r0 = r6
        L_0x0106:
            if (r0 != 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x010a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r5.<init>()     // Catch:{ all -> 0x0101 }
            long r12 = r9.a()     // Catch:{ all -> 0x0101 }
            Gh.W r0 = r4.F(r12)     // Catch:{ all -> 0x0101 }
            Gh.g r6 = Gh.H.d(r0)     // Catch:{ all -> 0x0101 }
            long r12 = r9.c()     // Catch:{ all -> 0x0143 }
        L_0x011f:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0152
            Hh.i r0 = g(r6)     // Catch:{ all -> 0x0143 }
            long r14 = r0.i()     // Catch:{ all -> 0x0143 }
            long r16 = r9.a()     // Catch:{ all -> 0x0143 }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x014a
            java.lang.Object r14 = r3.invoke(r0)     // Catch:{ all -> 0x0143 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0143 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0143 }
            if (r14 == 0) goto L_0x0146
            r5.add(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0146
        L_0x0143:
            r0 = move-exception
            r11 = r0
            goto L_0x015d
        L_0x0146:
            r14 = 1
            long r7 = r7 + r14
            goto L_0x011f
        L_0x014a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0143 }
            java.lang.String r3 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r3)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0152:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0143 }
            if (r6 == 0) goto L_0x0168
            r6.close()     // Catch:{ all -> 0x015a }
            goto L_0x0168
        L_0x015a:
            r0 = move-exception
            r11 = r0
            goto L_0x0168
        L_0x015d:
            if (r6 == 0) goto L_0x0168
            r6.close()     // Catch:{ all -> 0x0163 }
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            r3 = r0
            lf.C6523g.a(r11, r3)     // Catch:{ all -> 0x0101 }
        L_0x0168:
            if (r11 != 0) goto L_0x0179
            java.util.Map r0 = b(r5)     // Catch:{ all -> 0x0101 }
            Gh.Z r3 = new Gh.Z     // Catch:{ all -> 0x0101 }
            r3.<init>(r1, r2, r0, r10)     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x0178
            r4.close()     // Catch:{ all -> 0x0178 }
        L_0x0178:
            return r3
        L_0x0179:
            throw r11     // Catch:{ all -> 0x0101 }
        L_0x017a:
            r0 = move-exception
            goto L_0x0190
        L_0x017c:
            r11.close()     // Catch:{ all -> 0x0101 }
            r11 = -1
            long r5 = r5 + r11
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0188
            goto L_0x0030
        L_0x0188:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0190:
            r11.close()     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0194:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            r1.<init>()     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch:{ all -> 0x0101 }
            long r2 = r4.E()     // Catch:{ all -> 0x0101 }
            r1.append(r2)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0101 }
            r0.<init>(r1)     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x01af:
            if (r4 == 0) goto L_0x01ba
            r4.close()     // Catch:{ all -> 0x01b5 }
            goto L_0x01ba
        L_0x01b5:
            r0 = move-exception
            r2 = r0
            lf.C6523g.a(r1, r2)
        L_0x01ba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hh.j.f(Gh.M, Gh.l, yf.l):Gh.Z");
    }

    public static final i g(C5406g gVar) {
        long j10;
        C5406g gVar2 = gVar;
        C6496s.h(gVar2, "<this>");
        int m12 = gVar.m1();
        if (m12 == 33639248) {
            gVar2.skip(4);
            short p02 = gVar.p0();
            short s10 = p02 & 65535;
            if ((p02 & 1) == 0) {
                short p03 = gVar.p0() & 65535;
                short p04 = gVar.p0() & 65535;
                short p05 = gVar.p0() & 65535;
                long m13 = ((long) gVar.m1()) & 4294967295L;
                kotlin.jvm.internal.M m10 = new kotlin.jvm.internal.M();
                m10.f71758a = ((long) gVar.m1()) & 4294967295L;
                kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                m11.f71758a = ((long) gVar.m1()) & 4294967295L;
                short p06 = gVar.p0() & 65535;
                short p07 = gVar.p0() & 65535;
                gVar2.skip(8);
                kotlin.jvm.internal.M m14 = new kotlin.jvm.internal.M();
                m14.f71758a = ((long) gVar.m1()) & 4294967295L;
                String z02 = gVar2.z0((long) (gVar.p0() & 65535));
                if (!Sg.p.N(z02, 0, false, 2, (Object) null)) {
                    if (m11.f71758a == 4294967295L) {
                        j10 = (long) 8;
                    } else {
                        j10 = 0;
                    }
                    if (m10.f71758a == 4294967295L) {
                        j10 += (long) 8;
                    }
                    if (m14.f71758a == 4294967295L) {
                        j10 += (long) 8;
                    }
                    long j11 = j10;
                    N n10 = new N();
                    N n11 = new N();
                    N n12 = new N();
                    J j12 = new J();
                    b bVar = r0;
                    J j13 = j12;
                    N n13 = n12;
                    N n14 = n11;
                    kotlin.jvm.internal.M m15 = m11;
                    N n15 = n10;
                    String str = z02;
                    kotlin.jvm.internal.M m16 = m14;
                    short s11 = p07;
                    b bVar2 = new b(j12, j11, m11, gVar, m10, m14, n15, n14, n13);
                    i(gVar2, p06, bVar);
                    if (j11 <= 0 || j13.f71755a) {
                        String str2 = str;
                        return new i(M.a.e(Gh.M.f63223b, "/", false, 1, (Object) null).p(str2), Sg.p.u(str2, "/", false, 2, (Object) null), gVar2.z0((long) s11), m13, m10.f71758a, m15.f71758a, p03, m16.f71758a, p05, p04, (Long) n15.f71759a, (Long) n14.f71759a, (Long) n13.f71759a, (Integer) null, (Integer) null, (Integer) null, 57344, (DefaultConstructorMarker) null);
                    }
                    throw new IOException("bad zip: zip64 extra required but absent");
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + e(s10));
        }
        throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(m12));
    }

    private static final f h(C5406g gVar) {
        short p02 = gVar.p0() & 65535;
        short p03 = gVar.p0() & 65535;
        long p04 = (long) (gVar.p0() & 65535);
        if (p04 == ((long) (gVar.p0() & 65535)) && p02 == 0 && p03 == 0) {
            gVar.skip(4);
            return new f(p04, 4294967295L & ((long) gVar.m1()), gVar.p0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* access modifiers changed from: private */
    public static final void i(C5406g gVar, int i10, p pVar) {
        long j10 = (long) i10;
        while (j10 != 0) {
            if (j10 >= 4) {
                short p02 = gVar.p0() & 65535;
                long p03 = ((long) gVar.p0()) & 65535;
                long j11 = j10 - ((long) 4);
                if (j11 >= p03) {
                    gVar.u0(p03);
                    long B02 = gVar.i().B0();
                    pVar.invoke(Integer.valueOf(p02), Long.valueOf(p03));
                    long B03 = (gVar.i().B0() + p03) - B02;
                    int i11 = (B03 > 0 ? 1 : (B03 == 0 ? 0 : -1));
                    if (i11 >= 0) {
                        if (i11 > 0) {
                            gVar.i().skip(B03);
                        }
                        j10 = j11 - p03;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + p02);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final i j(C5406g gVar, i iVar) {
        C6496s.h(gVar, "<this>");
        C6496s.h(iVar, "centralDirectoryZipEntry");
        i k10 = k(gVar, iVar);
        C6496s.e(k10);
        return k10;
    }

    private static final i k(C5406g gVar, i iVar) {
        int m12 = gVar.m1();
        if (m12 == 67324752) {
            gVar.skip(2);
            short p02 = gVar.p0();
            short s10 = p02 & 65535;
            if ((p02 & 1) == 0) {
                gVar.skip(18);
                short p03 = gVar.p0() & 65535;
                gVar.skip(((long) gVar.p0()) & 65535);
                if (iVar == null) {
                    gVar.skip((long) p03);
                    return null;
                }
                N n10 = new N();
                N n11 = new N();
                N n12 = new N();
                i(gVar, p03, new c(gVar, n10, n11, n12));
                return iVar.a((Integer) n10.f71759a, (Integer) n11.f71759a, (Integer) n12.f71759a);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + e(s10));
        }
        throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(m12));
    }

    private static final f l(C5406g gVar, f fVar) {
        gVar.skip(12);
        int m12 = gVar.m1();
        int m13 = gVar.m1();
        long r02 = gVar.r0();
        if (r02 == gVar.r0() && m12 == 0 && m13 == 0) {
            gVar.skip(8);
            return new f(r02, gVar.r0(), fVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void m(C5406g gVar) {
        C6496s.h(gVar, "<this>");
        k(gVar, (i) null);
    }
}
