package ba;

import W9.b;
import W9.g;
import W9.h;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ba.c;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

public final class a extends g {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f36338t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f36339o;

    /* renamed from: p  reason: collision with root package name */
    private final b f36340p;

    /* renamed from: q  reason: collision with root package name */
    private Map f36341q;

    /* renamed from: r  reason: collision with root package name */
    private float f36342r = -3.4028235E38f;

    /* renamed from: s  reason: collision with root package name */
    private float f36343s = -3.4028235E38f;

    public a(List list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f36339o = false;
            this.f36340p = null;
            return;
        }
        this.f36339o = true;
        String D10 = M.D((byte[]) list.get(0));
        C3645a.a(D10.startsWith("Format:"));
        this.f36340p = (b) C3645a.e(b.a(D10));
        G(new B((byte[]) list.get(1)));
    }

    private static int B(long j10, List list, List list2) {
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

    private static float C(int i10) {
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

    private static b D(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0565b o10 = new b.C0565b().o(spannableString);
        if (cVar != null) {
            if (cVar.f36351c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f36351c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f36358j == 3 && cVar.f36352d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f36352d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f36353e;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f36354f;
            if (z10 && cVar.f36355g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f36355g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f36356h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f36357i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f36374a;
        if (i10 == -1) {
            if (cVar != null) {
                i10 = cVar.f36350b;
            } else {
                i10 = -1;
            }
        }
        o10.p(M(i10)).l(L(i10)).i(K(i10));
        PointF pointF = bVar.f36375b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            o10.k(C(o10.d()));
            o10.h(C(o10.c()), 0);
        } else {
            o10.k(pointF.x / f10);
            o10.h(bVar.f36375b.y / f11, 0);
        }
        return o10.a();
    }

    private void E(String str, b bVar, List list, List list2) {
        c cVar;
        int i10;
        C3645a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(f.f37529a, bVar.f36348e);
        if (split.length != bVar.f36348e) {
            s.i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long J10 = J(split[bVar.f36344a]);
        if (J10 == -9223372036854775807L) {
            s.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long J11 = J(split[bVar.f36345b]);
        if (J11 == -9223372036854775807L) {
            s.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f36341q;
        if (map == null || (i10 = bVar.f36346c) == -1) {
            cVar = null;
        } else {
            cVar = (c) map.get(split[i10].trim());
        }
        String str2 = split[bVar.f36347d];
        b D10 = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f36342r, this.f36343s);
        int B10 = B(J11, list2, list);
        for (int B11 = B(J10, list2, list); B11 < B10; B11++) {
            ((List) list.get(B11)).add(D10);
        }
    }

    private void F(B b10, List list, List list2) {
        b bVar;
        if (this.f36339o) {
            bVar = this.f36340p;
        } else {
            bVar = null;
        }
        while (true) {
            String p10 = b10.p();
            if (p10 == null) {
                return;
            }
            if (p10.startsWith("Format:")) {
                bVar = b.a(p10);
            } else if (p10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    s.i("SsaDecoder", "Skipping dialogue line before complete format: " + p10);
                } else {
                    E(p10, bVar, list, list2);
                }
            }
        }
    }

    private void G(B b10) {
        while (true) {
            String p10 = b10.p();
            if (p10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p10)) {
                H(b10);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p10)) {
                this.f36341q = I(b10);
            } else if ("[V4 Styles]".equalsIgnoreCase(p10)) {
                s.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p10)) {
                return;
            }
        }
    }

    private void H(B b10) {
        while (true) {
            String p10 = b10.p();
            if (p10 == null) {
                return;
            }
            if (b10.a() == 0 || b10.h() != 91) {
                String[] split = p10.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                if (split.length == 2) {
                    String e10 = C5108c.e(split[0].trim());
                    e10.hashCode();
                    if (e10.equals("playresx")) {
                        this.f36342r = Float.parseFloat(split[1].trim());
                    } else if (e10.equals("playresy")) {
                        try {
                            this.f36343s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static Map I(B b10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String p10 = b10.p();
            if (p10 == null || (b10.a() != 0 && b10.h() == 91)) {
                return linkedHashMap;
            }
            if (p10.startsWith("Format:")) {
                aVar = c.a.a(p10);
            } else if (p10.startsWith("Style:")) {
                if (aVar == null) {
                    s.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + p10);
                } else {
                    c b11 = c.b(p10, aVar);
                    if (b11 != null) {
                        linkedHashMap.put(b11.f36349a, b11);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long J(String str) {
        Matcher matcher = f36338t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) M.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) M.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) M.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) M.j(matcher.group(4))) * 10000);
    }

    private static int K(int i10) {
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
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static int L(int i10) {
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
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static Layout.Alignment M(int i10) {
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
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        B b10 = new B(bArr, i10);
        if (!this.f36339o) {
            G(b10);
        }
        F(b10, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
