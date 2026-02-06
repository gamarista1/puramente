package a3;

import W2.e;
import W2.s;
import a3.c;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import h2.C2030a;
import i2.C2073A;
import i2.C2076a;
import i2.C2082g;
import i2.L;
import i2.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;
import nb.C5110e;

public final class b implements s {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f10591g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10592a;

    /* renamed from: b  reason: collision with root package name */
    private final C1544a f10593b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f10594c = new C2073A();

    /* renamed from: d  reason: collision with root package name */
    private Map f10595d;

    /* renamed from: e  reason: collision with root package name */
    private float f10596e = -3.4028235E38f;

    /* renamed from: f  reason: collision with root package name */
    private float f10597f = -3.4028235E38f;

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f10592a = false;
            this.f10593b = null;
            return;
        }
        this.f10592a = true;
        String G10 = L.G((byte[]) list.get(0));
        C2076a.a(G10.startsWith("Format:"));
        this.f10593b = (C1544a) C2076a.e(C1544a.a(G10));
        j(new C2073A((byte[]) list.get(1)), C5110e.f61085c);
    }

    private static int d(long j10, List list, List list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (((Long) list.get(size)).longValue() == j10) {
                return size;
            } else {
                if (((Long) list.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 != 0) {
            arrayList = new ArrayList((Collection) list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 != 2) {
            return -3.4028235E38f;
        }
        return 0.95f;
    }

    private static C2030a f(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        C2030a.b o10 = new C2030a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f10600c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f10600c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f10607j == 3 && cVar.f10601d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f10601d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f10602e;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f10603f;
            if (z10 && cVar.f10604g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f10604g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f10605h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f10606i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f10623a;
        if (i10 == -1) {
            if (cVar != null) {
                i10 = cVar.f10599b;
            } else {
                i10 = -1;
            }
        }
        o10.p(p(i10)).l(o(i10)).i(n(i10));
        PointF pointF = bVar.f10624b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            o10.k(e(o10.d()));
            o10.h(e(o10.c()), 0);
        } else {
            o10.k(pointF.x / f10);
            o10.h(bVar.f10624b.y / f11, 0);
        }
        return o10.a();
    }

    private Charset g(C2073A a10) {
        Charset P10 = a10.P();
        if (P10 != null) {
            return P10;
        }
        return C5110e.f61085c;
    }

    private void h(String str, C1544a aVar, List list, List list2) {
        c cVar;
        int i10;
        C2076a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(f.f37529a, aVar.f10590e);
        if (split.length != aVar.f10590e) {
            p.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long m10 = m(split[aVar.f10586a]);
        if (m10 == -9223372036854775807L) {
            p.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long m11 = m(split[aVar.f10587b]);
        if (m11 == -9223372036854775807L) {
            p.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f10595d;
        if (map == null || (i10 = aVar.f10588c) == -1) {
            cVar = null;
        } else {
            cVar = (c) map.get(split[i10].trim());
        }
        String str2 = split[aVar.f10589d];
        C2030a f10 = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f10596e, this.f10597f);
        int d10 = d(m11, list2, list);
        for (int d11 = d(m10, list2, list); d11 < d10; d11++) {
            ((List) list.get(d11)).add(f10);
        }
    }

    private void i(C2073A a10, List list, List list2, Charset charset) {
        C1544a aVar;
        if (this.f10592a) {
            aVar = this.f10593b;
        } else {
            aVar = null;
        }
        while (true) {
            String t10 = a10.t(charset);
            if (t10 == null) {
                return;
            }
            if (t10.startsWith("Format:")) {
                aVar = C1544a.a(t10);
            } else if (t10.startsWith("Dialogue:")) {
                if (aVar == null) {
                    p.h("SsaParser", "Skipping dialogue line before complete format: " + t10);
                } else {
                    h(t10, aVar, list, list2);
                }
            }
        }
    }

    private void j(C2073A a10, Charset charset) {
        while (true) {
            String t10 = a10.t(charset);
            if (t10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(t10)) {
                k(a10, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(t10)) {
                this.f10595d = l(a10, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(t10)) {
                p.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(t10)) {
                return;
            }
        }
    }

    private void k(C2073A a10, Charset charset) {
        while (true) {
            String t10 = a10.t(charset);
            if (t10 == null) {
                return;
            }
            if (a10.a() == 0 || a10.h(charset) != '[') {
                String[] split = t10.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                if (split.length == 2) {
                    String e10 = C5108c.e(split[0].trim());
                    e10.hashCode();
                    if (e10.equals("playresx")) {
                        this.f10596e = Float.parseFloat(split[1].trim());
                    } else if (e10.equals("playresy")) {
                        try {
                            this.f10597f = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static Map l(C2073A a10, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String t10 = a10.t(charset);
            if (t10 == null || (a10.a() != 0 && a10.h(charset) == '[')) {
                return linkedHashMap;
            }
            if (t10.startsWith("Format:")) {
                aVar = c.a.a(t10);
            } else if (t10.startsWith("Style:")) {
                if (aVar == null) {
                    p.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + t10);
                } else {
                    c b10 = c.b(t10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f10598a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f10591g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) L.h(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) L.h(matcher.group(2))) * 60000000) + (Long.parseLong((String) L.h(matcher.group(3))) * 1000000) + (Long.parseLong((String) L.h(matcher.group(4))) * 10000);
    }

    private static int n(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                p.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                p.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                p.h("SsaParser", "Unknown alignment: " + i10);
                return null;
        }
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        ArrayList<e> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i12 = i10;
        s.b bVar2 = bVar;
        C2082g gVar2 = gVar;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        this.f10594c.S(bArr, i12 + i11);
        this.f10594c.U(i12);
        Charset g10 = g(this.f10594c);
        if (!this.f10592a) {
            j(this.f10594c, g10);
        }
        i(this.f10594c, arrayList4, arrayList5, g10);
        if (bVar2.f8666a == -9223372036854775807L || !bVar2.f8667b) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < arrayList4.size()) {
            List list = (List) arrayList4.get(i13);
            if (list.isEmpty() && i13 != 0) {
                arrayList3 = arrayList4;
                arrayList2 = arrayList5;
            } else if (i13 != arrayList4.size() - 1) {
                long longValue = ((Long) arrayList5.get(i13)).longValue();
                long longValue2 = ((Long) arrayList5.get(i13 + 1)).longValue() - ((Long) arrayList5.get(i13)).longValue();
                arrayList3 = arrayList4;
                arrayList2 = arrayList5;
                long j10 = bVar2.f8666a;
                if (j10 == -9223372036854775807L || longValue >= j10) {
                    gVar2.accept(new e(list, longValue, longValue2));
                } else if (arrayList != null) {
                    arrayList.add(new e(list, longValue, longValue2));
                }
            } else {
                throw new IllegalStateException();
            }
            i13++;
            arrayList4 = arrayList3;
            arrayList5 = arrayList2;
        }
        if (arrayList != null) {
            for (e accept : arrayList) {
                gVar2.accept(accept);
            }
        }
    }

    public int c() {
        return 1;
    }
}
