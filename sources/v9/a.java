package V9;

import M9.c;
import android.net.Uri;
import ja.C3645a;
import ja.K;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k9.C3717q0;
import y9.p;

public class a implements M9.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f34754a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34755b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34756c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34757d;

    /* renamed from: e  reason: collision with root package name */
    public final C0563a f34758e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f34759f;

    /* renamed from: g  reason: collision with root package name */
    public final long f34760g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34761h;

    /* renamed from: V9.a$a  reason: collision with other inner class name */
    public static class C0563a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f34762a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f34763b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f34764c;

        public C0563a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f34762a = uuid;
            this.f34763b = bArr;
            this.f34764c = pVarArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0563a aVar, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : M.O0(j11, 1000000, j10), j12 != 0 ? M.O0(j12, 1000000, j10) : -9223372036854775807L, i12, z10, aVar, bVarArr);
    }

    /* renamed from: b */
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f34759f[cVar.f32704b];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.b((C3717q0[]) arrayList3.toArray(new C3717q0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f34774j[cVar.f32705c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((C3717q0[]) arrayList3.toArray(new C3717q0[0])));
        }
        return new a(this.f34754a, this.f34755b, this.f34760g, this.f34761h, this.f34756c, this.f34757d, this.f34758e, (b[]) arrayList2.toArray(new b[0]));
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f34765a;

        /* renamed from: b  reason: collision with root package name */
        public final String f34766b;

        /* renamed from: c  reason: collision with root package name */
        public final long f34767c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34768d;

        /* renamed from: e  reason: collision with root package name */
        public final int f34769e;

        /* renamed from: f  reason: collision with root package name */
        public final int f34770f;

        /* renamed from: g  reason: collision with root package name */
        public final int f34771g;

        /* renamed from: h  reason: collision with root package name */
        public final int f34772h;

        /* renamed from: i  reason: collision with root package name */
        public final String f34773i;

        /* renamed from: j  reason: collision with root package name */
        public final C3717q0[] f34774j;

        /* renamed from: k  reason: collision with root package name */
        public final int f34775k;

        /* renamed from: l  reason: collision with root package name */
        private final String f34776l;

        /* renamed from: m  reason: collision with root package name */
        private final String f34777m;

        /* renamed from: n  reason: collision with root package name */
        private final List f34778n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f34779o;

        /* renamed from: p  reason: collision with root package name */
        private final long f34780p;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C3717q0[] q0VarArr, List list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, q0VarArr, list, M.P0(list, 1000000, j10), M.O0(j11, 1000000, j10));
            String str6 = str;
            String str7 = str2;
            int i15 = i10;
        }

        public Uri a(int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            if (this.f34774j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            if (this.f34778n != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3645a.f(z11);
            if (i11 < this.f34778n.size()) {
                z12 = true;
            }
            C3645a.f(z12);
            String num = Integer.toString(this.f34774j[i10].f45766h);
            String l10 = ((Long) this.f34778n.get(i11)).toString();
            return K.e(this.f34776l, this.f34777m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(C3717q0[] q0VarArr) {
            String str = this.f34776l;
            return new b(str, this.f34777m, this.f34765a, this.f34766b, this.f34767c, this.f34768d, this.f34769e, this.f34770f, this.f34771g, this.f34772h, this.f34773i, q0VarArr, this.f34778n, this.f34779o, this.f34780p);
        }

        public long c(int i10) {
            if (i10 == this.f34775k - 1) {
                return this.f34780p;
            }
            long[] jArr = this.f34779o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return M.i(this.f34779o, j10, true, true);
        }

        public long e(int i10) {
            return this.f34779o[i10];
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C3717q0[] q0VarArr, List list, long[] jArr, long j11) {
            this.f34776l = str;
            this.f34777m = str2;
            this.f34765a = i10;
            this.f34766b = str3;
            this.f34767c = j10;
            this.f34768d = str4;
            this.f34769e = i11;
            this.f34770f = i12;
            this.f34771g = i13;
            this.f34772h = i14;
            this.f34773i = str5;
            this.f34774j = q0VarArr;
            this.f34778n = list;
            this.f34779o = jArr;
            this.f34780p = j11;
            this.f34775k = list.size();
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0563a aVar, b[] bVarArr) {
        this.f34754a = i10;
        this.f34755b = i11;
        this.f34760g = j10;
        this.f34761h = j11;
        this.f34756c = i12;
        this.f34757d = z10;
        this.f34758e = aVar;
        this.f34759f = bVarArr;
    }
}
