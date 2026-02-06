package zh;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5407h;
import Gh.H;
import Gh.W;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.a;
import com.intercom.reactnative.IntercomErrorCodes;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import sh.C6726e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f74035a;

    /* renamed from: b  reason: collision with root package name */
    private static final C6845c[] f74036b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f74037c;

    static {
        d dVar = new d();
        f74035a = dVar;
        C6845c cVar = r2;
        C6845c cVar2 = new C6845c(C6845c.f74031j, "");
        C6845c cVar3 = r3;
        C5407h hVar = C6845c.f74028g;
        C6845c cVar4 = new C6845c(hVar, "GET");
        C6845c cVar5 = r5;
        C6845c cVar6 = new C6845c(hVar, "POST");
        C6845c cVar7 = r5;
        C5407h hVar2 = C6845c.f74029h;
        C6845c cVar8 = new C6845c(hVar2, "/");
        C6845c cVar9 = r7;
        C6845c cVar10 = new C6845c(hVar2, "/index.html");
        C6845c cVar11 = r7;
        C5407h hVar3 = C6845c.f74030i;
        C6845c cVar12 = new C6845c(hVar3, "http");
        C6845c cVar13 = r9;
        C6845c cVar14 = new C6845c(hVar3, Constants.SCHEME);
        C6845c cVar15 = r9;
        C5407h hVar4 = C6845c.f74027f;
        C6845c cVar16 = new C6845c(hVar4, "200");
        C6845c cVar17 = r10;
        C6845c cVar18 = new C6845c(hVar4, "204");
        C6845c cVar19 = r11;
        C6845c cVar20 = new C6845c(hVar4, IntercomErrorCodes.HIDE_INTERCOM);
        C6845c cVar21 = r12;
        C6845c cVar22 = new C6845c(hVar4, "304");
        C6845c cVar23 = r13;
        C6845c cVar24 = new C6845c(hVar4, "400");
        C6845c cVar25 = r15;
        d dVar2 = dVar;
        C6845c cVar26 = new C6845c(hVar4, "404");
        C5407h hVar5 = hVar4;
        C6845c cVar27 = r0;
        C6845c cVar28 = cVar;
        C6845c cVar29 = new C6845c(hVar5, "500");
        String str = "";
        C6845c cVar30 = r0;
        C6845c cVar31 = new C6845c("accept-charset", str);
        C6845c cVar32 = r0;
        C6845c cVar33 = new C6845c("accept-encoding", "gzip, deflate");
        C6845c cVar34 = r0;
        C6845c cVar35 = new C6845c("accept-language", str);
        C6845c cVar36 = r0;
        C6845c cVar37 = new C6845c("accept-ranges", str);
        C6845c cVar38 = r0;
        C6845c cVar39 = new C6845c("accept", str);
        C6845c cVar40 = r0;
        C6845c cVar41 = new C6845c("access-control-allow-origin", str);
        C6845c cVar42 = r0;
        C6845c cVar43 = new C6845c("age", str);
        C6845c cVar44 = r0;
        C6845c cVar45 = new C6845c("allow", str);
        C6845c cVar46 = r0;
        C6845c cVar47 = new C6845c("authorization", str);
        C6845c cVar48 = r0;
        C6845c cVar49 = new C6845c("cache-control", str);
        C6845c cVar50 = r0;
        C6845c cVar51 = new C6845c("content-disposition", str);
        C6845c cVar52 = r0;
        C6845c cVar53 = new C6845c("content-encoding", str);
        C6845c cVar54 = r0;
        C6845c cVar55 = new C6845c("content-language", str);
        C6845c cVar56 = r0;
        C6845c cVar57 = new C6845c("content-length", str);
        C6845c cVar58 = r0;
        C6845c cVar59 = new C6845c("content-location", str);
        C6845c cVar60 = r0;
        C6845c cVar61 = new C6845c("content-range", str);
        C6845c cVar62 = r0;
        C6845c cVar63 = new C6845c("content-type", str);
        C6845c cVar64 = r0;
        C6845c cVar65 = new C6845c("cookie", str);
        C6845c cVar66 = r0;
        C6845c cVar67 = new C6845c(AttributeType.DATE, str);
        C6845c cVar68 = r0;
        C6845c cVar69 = new C6845c("etag", str);
        C6845c cVar70 = r0;
        C6845c cVar71 = new C6845c("expect", str);
        C6845c cVar72 = r0;
        C6845c cVar73 = new C6845c("expires", str);
        C6845c cVar74 = r0;
        C6845c cVar75 = new C6845c(TicketDetailDestinationKt.LAUNCHED_FROM, str);
        C6845c cVar76 = r0;
        C6845c cVar77 = new C6845c("host", str);
        C6845c cVar78 = r0;
        C6845c cVar79 = new C6845c("if-match", str);
        C6845c cVar80 = r0;
        C6845c cVar81 = new C6845c("if-modified-since", str);
        C6845c cVar82 = r0;
        C6845c cVar83 = new C6845c("if-none-match", str);
        C6845c cVar84 = r0;
        C6845c cVar85 = new C6845c("if-range", str);
        C6845c cVar86 = r0;
        C6845c cVar87 = new C6845c("if-unmodified-since", str);
        C6845c cVar88 = r0;
        C6845c cVar89 = new C6845c("last-modified", str);
        C6845c cVar90 = r0;
        C6845c cVar91 = new C6845c(ActionType.LINK, str);
        C6845c cVar92 = r0;
        C6845c cVar93 = new C6845c("location", str);
        C6845c cVar94 = r0;
        C6845c cVar95 = new C6845c("max-forwards", str);
        C6845c cVar96 = r0;
        C6845c cVar97 = new C6845c("proxy-authenticate", str);
        C6845c cVar98 = r0;
        C6845c cVar99 = new C6845c("proxy-authorization", str);
        C6845c cVar100 = r0;
        C6845c cVar101 = new C6845c("range", str);
        C6845c cVar102 = r0;
        C6845c cVar103 = new C6845c("referer", str);
        C6845c cVar104 = r0;
        C6845c cVar105 = new C6845c("refresh", str);
        C6845c cVar106 = r0;
        C6845c cVar107 = new C6845c("retry-after", str);
        C6845c cVar108 = r0;
        C6845c cVar109 = new C6845c("server", str);
        C6845c cVar110 = r0;
        C6845c cVar111 = new C6845c("set-cookie", str);
        C6845c cVar112 = r0;
        C6845c cVar113 = new C6845c("strict-transport-security", str);
        C6845c cVar114 = r0;
        C6845c cVar115 = new C6845c("transfer-encoding", str);
        C6845c cVar116 = r0;
        C6845c cVar117 = new C6845c("user-agent", str);
        C6845c cVar118 = r0;
        C6845c cVar119 = new C6845c("vary", str);
        C6845c cVar120 = r0;
        C6845c cVar121 = new C6845c("via", str);
        C6845c cVar122 = r0;
        C6845c cVar123 = new C6845c("www-authenticate", str);
        f74036b = new C6845c[]{cVar28, cVar3, cVar5, cVar7, cVar9, cVar11, cVar13, cVar15, cVar17, cVar19, cVar21, cVar23, cVar25, cVar27, cVar30, cVar32, cVar34, cVar36, cVar38, cVar40, cVar42, cVar44, cVar46, cVar48, cVar50, cVar52, cVar54, cVar56, cVar58, cVar60, cVar62, cVar64, cVar66, cVar68, cVar70, cVar72, cVar74, cVar76, cVar78, cVar80, cVar82, cVar84, cVar86, cVar88, cVar90, cVar92, cVar94, cVar96, cVar98, cVar100, cVar102, cVar104, cVar106, cVar108, cVar110, cVar112, cVar114, cVar116, cVar118, cVar120, cVar122};
        f74037c = dVar2.d();
    }

    private d() {
    }

    private final Map d() {
        C6845c[] cVarArr = f74036b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C6845c[] cVarArr2 = f74036b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f74032a)) {
                linkedHashMap.put(cVarArr2[i10].f74032a, Integer.valueOf(i10));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6496s.g(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final C5407h a(C5407h hVar) {
        C6496s.h(hVar, "name");
        int O10 = hVar.O();
        int i10 = 0;
        while (i10 < O10) {
            byte j10 = hVar.j(i10);
            if (65 > j10 || j10 >= 91) {
                i10++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.W());
            }
        }
        return hVar;
    }

    public final Map b() {
        return f74037c;
    }

    public final C6845c[] c() {
        return f74036b;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f74038a;

        /* renamed from: b  reason: collision with root package name */
        private int f74039b;

        /* renamed from: c  reason: collision with root package name */
        private final List f74040c;

        /* renamed from: d  reason: collision with root package name */
        private final C5406g f74041d;

        /* renamed from: e  reason: collision with root package name */
        public C6845c[] f74042e;

        /* renamed from: f  reason: collision with root package name */
        private int f74043f;

        /* renamed from: g  reason: collision with root package name */
        public int f74044g;

        /* renamed from: h  reason: collision with root package name */
        public int f74045h;

        public a(W w10, int i10, int i11) {
            C6496s.h(w10, "source");
            this.f74038a = i10;
            this.f74039b = i11;
            this.f74040c = new ArrayList();
            this.f74041d = H.d(w10);
            C6845c[] cVarArr = new C6845c[8];
            this.f74042e = cVarArr;
            this.f74043f = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f74039b;
            int i11 = this.f74045h;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        private final void b() {
            C6559l.A(this.f74042e, (Object) null, 0, 0, 6, (Object) null);
            this.f74043f = this.f74042e.length - 1;
            this.f74044g = 0;
            this.f74045h = 0;
        }

        private final int c(int i10) {
            return this.f74043f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f74042e.length;
                while (true) {
                    length--;
                    i11 = this.f74043f;
                    if (length < i11 || i10 <= 0) {
                        C6845c[] cVarArr = this.f74042e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f74044g);
                        this.f74043f += i12;
                    } else {
                        C6845c cVar = this.f74042e[length];
                        C6496s.e(cVar);
                        int i13 = cVar.f74034c;
                        i10 -= i13;
                        this.f74045h -= i13;
                        this.f74044g--;
                        i12++;
                    }
                }
                C6845c[] cVarArr2 = this.f74042e;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f74044g);
                this.f74043f += i12;
            }
            return i12;
        }

        private final C5407h f(int i10) {
            if (h(i10)) {
                return d.f74035a.c()[i10].f74032a;
            }
            int c10 = c(i10 - d.f74035a.c().length);
            if (c10 >= 0) {
                C6845c[] cVarArr = this.f74042e;
                if (c10 < cVarArr.length) {
                    C6845c cVar = cVarArr[c10];
                    C6496s.e(cVar);
                    return cVar.f74032a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, C6845c cVar) {
            this.f74040c.add(cVar);
            int i11 = cVar.f74034c;
            if (i10 != -1) {
                C6845c cVar2 = this.f74042e[c(i10)];
                C6496s.e(cVar2);
                i11 -= cVar2.f74034c;
            }
            int i12 = this.f74039b;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f74045h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f74044g + 1;
                C6845c[] cVarArr = this.f74042e;
                if (i13 > cVarArr.length) {
                    C6845c[] cVarArr2 = new C6845c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f74043f = this.f74042e.length - 1;
                    this.f74042e = cVarArr2;
                }
                int i14 = this.f74043f;
                this.f74043f = i14 - 1;
                this.f74042e[i14] = cVar;
                this.f74044g++;
            } else {
                this.f74042e[i10 + c(i10) + d10] = cVar;
            }
            this.f74045h += i11;
        }

        private final boolean h(int i10) {
            if (i10 < 0 || i10 > d.f74035a.c().length - 1) {
                return false;
            }
            return true;
        }

        private final int i() {
            return C6726e.d(this.f74041d.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f74040c.add(d.f74035a.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f74035a.c().length);
            if (c10 >= 0) {
                C6845c[] cVarArr = this.f74042e;
                if (c10 < cVarArr.length) {
                    C6845c cVar = cVarArr[c10];
                    C6496s.e(cVar);
                    this.f74040c.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new C6845c(f(i10), j()));
        }

        private final void o() {
            g(-1, new C6845c(d.f74035a.a(j()), j()));
        }

        private final void p(int i10) {
            this.f74040c.add(new C6845c(f(i10), j()));
        }

        private final void q() {
            this.f74040c.add(new C6845c(d.f74035a.a(j()), j()));
        }

        public final List e() {
            List e12 = C6565s.e1(this.f74040c);
            this.f74040c.clear();
            return e12;
        }

        public final C5407h j() {
            boolean z10;
            int i10 = i();
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long m10 = (long) m(i10, 127);
            if (!z10) {
                return this.f74041d.A0(m10);
            }
            C5404e eVar = new C5404e();
            k.f74195a.b(this.f74041d, m10, eVar);
            return eVar.o0();
        }

        public final void k() {
            while (!this.f74041d.J0()) {
                int d10 = C6726e.d(this.f74041d.readByte(), 255);
                if (d10 == 128) {
                    throw new IOException("index == 0");
                } else if ((d10 & 128) == 128) {
                    l(m(d10, 127) - 1);
                } else if (d10 == 64) {
                    o();
                } else if ((d10 & 64) == 64) {
                    n(m(d10, 63) - 1);
                } else if ((d10 & 32) == 32) {
                    int m10 = m(d10, 31);
                    this.f74039b = m10;
                    if (m10 < 0 || m10 > this.f74038a) {
                        throw new IOException("Invalid dynamic table size update " + this.f74039b);
                    }
                    a();
                } else if (d10 == 16 || d10 == 0) {
                    q();
                } else {
                    p(m(d10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(W w10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(w10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f74046a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f74047b;

        /* renamed from: c  reason: collision with root package name */
        private final C5404e f74048c;

        /* renamed from: d  reason: collision with root package name */
        private int f74049d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f74050e;

        /* renamed from: f  reason: collision with root package name */
        public int f74051f;

        /* renamed from: g  reason: collision with root package name */
        public C6845c[] f74052g;

        /* renamed from: h  reason: collision with root package name */
        private int f74053h;

        /* renamed from: i  reason: collision with root package name */
        public int f74054i;

        /* renamed from: j  reason: collision with root package name */
        public int f74055j;

        public b(int i10, boolean z10, C5404e eVar) {
            C6496s.h(eVar, "out");
            this.f74046a = i10;
            this.f74047b = z10;
            this.f74048c = eVar;
            this.f74049d = a.e.API_PRIORITY_OTHER;
            this.f74051f = i10;
            C6845c[] cVarArr = new C6845c[8];
            this.f74052g = cVarArr;
            this.f74053h = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f74051f;
            int i11 = this.f74055j;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        private final void b() {
            C6559l.A(this.f74052g, (Object) null, 0, 0, 6, (Object) null);
            this.f74053h = this.f74052g.length - 1;
            this.f74054i = 0;
            this.f74055j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f74052g.length;
                while (true) {
                    length--;
                    i11 = this.f74053h;
                    if (length < i11 || i10 <= 0) {
                        C6845c[] cVarArr = this.f74052g;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f74054i);
                        C6845c[] cVarArr2 = this.f74052g;
                        int i13 = this.f74053h;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f74053h += i12;
                    } else {
                        C6845c cVar = this.f74052g[length];
                        C6496s.e(cVar);
                        i10 -= cVar.f74034c;
                        int i14 = this.f74055j;
                        C6845c cVar2 = this.f74052g[length];
                        C6496s.e(cVar2);
                        this.f74055j = i14 - cVar2.f74034c;
                        this.f74054i--;
                        i12++;
                    }
                }
                C6845c[] cVarArr3 = this.f74052g;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f74054i);
                C6845c[] cVarArr22 = this.f74052g;
                int i132 = this.f74053h;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f74053h += i12;
            }
            return i12;
        }

        private final void d(C6845c cVar) {
            int i10 = cVar.f74034c;
            int i11 = this.f74051f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f74055j + i10) - i11);
            int i12 = this.f74054i + 1;
            C6845c[] cVarArr = this.f74052g;
            if (i12 > cVarArr.length) {
                C6845c[] cVarArr2 = new C6845c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f74053h = this.f74052g.length - 1;
                this.f74052g = cVarArr2;
            }
            int i13 = this.f74053h;
            this.f74053h = i13 - 1;
            this.f74052g[i13] = cVar;
            this.f74054i++;
            this.f74055j += i10;
        }

        public final void e(int i10) {
            this.f74046a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f74051f;
            if (i11 != min) {
                if (min < i11) {
                    this.f74049d = Math.min(this.f74049d, min);
                }
                this.f74050e = true;
                this.f74051f = min;
                a();
            }
        }

        public final void f(C5407h hVar) {
            C6496s.h(hVar, "data");
            if (this.f74047b) {
                k kVar = k.f74195a;
                if (kVar.d(hVar) < hVar.O()) {
                    C5404e eVar = new C5404e();
                    kVar.c(hVar, eVar);
                    C5407h o02 = eVar.o0();
                    h(o02.O(), 127, 128);
                    this.f74048c.k0(o02);
                    return;
                }
            }
            h(hVar.O(), 127, 0);
            this.f74048c.k0(hVar);
        }

        public final void g(List list) {
            int i10;
            int i11;
            C6496s.h(list, "headerBlock");
            if (this.f74050e) {
                int i12 = this.f74049d;
                if (i12 < this.f74051f) {
                    h(i12, 31, 32);
                }
                this.f74050e = false;
                this.f74049d = a.e.API_PRIORITY_OTHER;
                h(this.f74051f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C6845c cVar = (C6845c) list.get(i13);
                C5407h S10 = cVar.f74032a.S();
                C5407h hVar = cVar.f74033b;
                d dVar = d.f74035a;
                Integer num = (Integer) dVar.b().get(S10);
                if (num != null) {
                    int intValue = num.intValue();
                    i10 = intValue + 1;
                    if (2 <= i10 && i10 < 8) {
                        if (C6496s.c(dVar.c()[intValue].f74033b, hVar)) {
                            i11 = i10;
                        } else if (C6496s.c(dVar.c()[i10].f74033b, hVar)) {
                            i11 = i10;
                            i10 = intValue + 2;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f74053h + 1;
                    int length = this.f74052g.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        C6845c cVar2 = this.f74052g[i14];
                        C6496s.e(cVar2);
                        if (C6496s.c(cVar2.f74032a, S10)) {
                            C6845c cVar3 = this.f74052g[i14];
                            C6496s.e(cVar3);
                            if (C6496s.c(cVar3.f74033b, hVar)) {
                                i10 = d.f74035a.c().length + (i14 - this.f74053h);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f74053h) + d.f74035a.c().length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    h(i10, 127, 128);
                } else if (i11 == -1) {
                    this.f74048c.K0(64);
                    f(S10);
                    f(hVar);
                    d(cVar);
                } else if (!S10.P(C6845c.f74026e) || C6496s.c(C6845c.f74031j, S10)) {
                    h(i11, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(i11, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f74048c.K0(i10 | i12);
                return;
            }
            this.f74048c.K0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f74048c.K0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f74048c.K0(i13);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, boolean z10, C5404e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
