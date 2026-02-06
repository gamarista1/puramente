package da;

import W9.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import ja.C3645a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f43202a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43203b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f43204c;

    /* renamed from: d  reason: collision with root package name */
    public final long f43205d;

    /* renamed from: e  reason: collision with root package name */
    public final long f43206e;

    /* renamed from: f  reason: collision with root package name */
    public final g f43207f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f43208g;

    /* renamed from: h  reason: collision with root package name */
    public final String f43209h;

    /* renamed from: i  reason: collision with root package name */
    public final String f43210i;

    /* renamed from: j  reason: collision with root package name */
    public final d f43211j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap f43212k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap f43213l;

    /* renamed from: m  reason: collision with root package name */
    private List f43214m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.f43202a = str;
        this.f43203b = str2;
        this.f43210i = str4;
        this.f43207f = gVar;
        this.f43208g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43204c = z10;
        this.f43205d = j10;
        this.f43206e = j11;
        this.f43209h = (String) C3645a.e(str3);
        this.f43211j = dVar;
        this.f43212k = new HashMap();
        this.f43213l = new HashMap();
    }

    private void b(Map map, b.C0565b bVar, int i10, int i11, int i12) {
        g f10 = f.f(this.f43207f, this.f43208g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f43211j, map, i12);
            if ("p".equals(this.f43202a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    bVar.m((f10.k() * -90.0f) / 100.0f);
                }
                if (f10.m() != null) {
                    bVar.p(f10.m());
                }
                if (f10.h() != null) {
                    bVar.j(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, (String) null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d((String) null, f.b(str), -9223372036854775807L, -9223372036854775807L, (g) null, (String[]) null, "", (String) null, (d) null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == 10) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == 10) {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean z11;
        boolean equals = "p".equals(this.f43202a);
        boolean equals2 = "div".equals(this.f43202a);
        if (z10 || equals || (equals2 && this.f43210i != null)) {
            long j10 = this.f43205d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f43206e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f43214m != null) {
            for (int i10 = 0; i10 < this.f43214m.size(); i10++) {
                d dVar = (d) this.f43214m.get(i10);
                if (z10 || equals) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.i(treeSet, z11);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            b.C0565b bVar = new b.C0565b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C3645a.e(((b.C0565b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f43209h)) {
            str = this.f43209h;
        }
        if (!m(j10) || !"div".equals(this.f43202a) || this.f43210i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f43210i));
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        String str2;
        int i10;
        if (m(j10)) {
            if ("".equals(this.f43209h)) {
                str2 = str;
            } else {
                str2 = this.f43209h;
            }
            Iterator it = this.f43213l.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (this.f43212k.containsKey(str3)) {
                    i10 = ((Integer) this.f43212k.get(str3)).intValue();
                }
                int i11 = i10;
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i11 != intValue) {
                    Map map4 = map;
                    b(map4, (b.C0565b) C3645a.e((b.C0565b) map3.get(str3)), i11, intValue, ((e) C3645a.e((e) map2.get(str2))).f43224j);
                } else {
                    Map map5 = map2;
                    Map map6 = map3;
                }
            }
            Map map7 = map2;
            Map map8 = map3;
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
                Map map9 = map2;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        boolean z11;
        this.f43212k.clear();
        this.f43213l.clear();
        if (!"metadata".equals(this.f43202a)) {
            if (!"".equals(this.f43209h)) {
                str = this.f43209h;
            }
            if (this.f43204c && z10) {
                k(str, map).append((CharSequence) C3645a.e(this.f43203b));
            } else if ("br".equals(this.f43202a) && z10) {
                k(str, map).append(10);
            } else if (m(j10)) {
                for (Map.Entry entry : map.entrySet()) {
                    this.f43212k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) C3645a.e(((b.C0565b) entry.getValue()).e())).length()));
                }
                boolean equals = "p".equals(this.f43202a);
                for (int i10 = 0; i10 < g(); i10++) {
                    d f10 = f(i10);
                    if (z10 || equals) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f10.p(j10, z11, str, map);
                }
                if (equals) {
                    f.c(k(str, map));
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    this.f43213l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) C3645a.e(((b.C0565b) entry2.getValue()).e())).length()));
                }
            }
        }
    }

    public void a(d dVar) {
        if (this.f43214m == null) {
            this.f43214m = new ArrayList();
        }
        this.f43214m.add(dVar);
    }

    public d f(int i10) {
        List list = this.f43214m;
        if (list != null) {
            return (d) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f43214m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        n(j10, this.f43209h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j11 = j10;
        p(j11, false, this.f43209h, treeMap);
        o(j11, map, map2, this.f43209h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) C3645a.e((e) map2.get(pair.first));
                arrayList2.add(new b.C0565b().f(decodeByteArray).k(eVar.f43216b).l(0).h(eVar.f43217c, 0).i(eVar.f43219e).n(eVar.f43220f).g(eVar.f43221g).r(eVar.f43224j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) C3645a.e((e) map2.get(entry.getKey()));
            b.C0565b bVar = (b.C0565b) entry.getValue();
            e((SpannableStringBuilder) C3645a.e(bVar.e()));
            bVar.h(eVar2.f43217c, eVar2.f43218d);
            bVar.i(eVar2.f43219e);
            bVar.k(eVar2.f43216b);
            bVar.n(eVar2.f43220f);
            bVar.q(eVar2.f43223i, eVar2.f43222h);
            bVar.r(eVar2.f43224j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f43208g;
    }

    public boolean m(long j10) {
        long j11 = this.f43205d;
        if ((j11 != -9223372036854775807L || this.f43206e != -9223372036854775807L) && ((j11 > j10 || this.f43206e != -9223372036854775807L) && ((j11 != -9223372036854775807L || j10 >= this.f43206e) && (j11 > j10 || j10 >= this.f43206e)))) {
            return false;
        }
        return true;
    }
}
