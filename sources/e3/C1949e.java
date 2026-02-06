package e3;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.Constants;
import h2.C2030a;
import h2.C2033d;
import h2.C2034e;
import h2.C2035f;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e3.e  reason: case insensitive filesystem */
public abstract class C1949e {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f19559a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f19560b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map f19561c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f19562d;

    /* renamed from: e3.e$b */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator f19563c = new C1950f();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f19564a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f19565b;

        private b(c cVar, int i10) {
            this.f19564a = cVar;
            this.f19565b = i10;
        }
    }

    /* renamed from: e3.e$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f19566a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19567b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19568c;

        /* renamed from: d  reason: collision with root package name */
        public final Set f19569d;

        private c(String str, int i10, String str2, Set set) {
            this.f19567b = i10;
            this.f19566a = str;
            this.f19568c = str2;
            this.f19569d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            C2076a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a12 = L.a1(trim, "\\.");
            String str3 = a12[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < a12.length; i11++) {
                hashSet.add(a12[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: e3.e$d */
    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final int f19570a;

        /* renamed from: b  reason: collision with root package name */
        public final C1947c f19571b;

        public d(int i10, C1947c cVar) {
            this.f19570a = i10;
            this.f19571b = cVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f19570a, dVar.f19570a);
        }
    }

    /* renamed from: e3.e$e  reason: collision with other inner class name */
    private static final class C0342e {

        /* renamed from: a  reason: collision with root package name */
        public long f19572a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f19573b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f19574c;

        /* renamed from: d  reason: collision with root package name */
        public int f19575d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f19576e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f19577f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f19578g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f19579h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f19580i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f19581j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f19582k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            int i11 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
            if (i11 != 0 && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (i11 != 0) {
                return f10;
            }
            if (i10 == 0) {
                return 1.0f;
            }
            return -3.4028235E38f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            p.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    return f10;
                }
                throw new IllegalStateException(String.valueOf(i10));
            } else if (f10 <= 0.5f) {
                return f10 * 2.0f;
            } else {
                return (1.0f - f10) * 2.0f;
            }
        }

        private static float e(int i10) {
            if (i10 == 4) {
                return 0.0f;
            }
            if (i10 != 5) {
                return 0.5f;
            }
            return 1.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 == 4) {
                return 0;
            }
            if (i10 != 5) {
                return 1;
            }
            return 2;
        }

        public C1948d a() {
            return new C1948d(g().a(), this.f19572a, this.f19573b);
        }

        public C2030a.b g() {
            float f10 = this.f19579h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f19575d);
            }
            int i10 = this.f19580i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f19575d);
            }
            C2030a.b r10 = new C2030a.b().p(c(this.f19575d)).h(b(this.f19576e, this.f19577f), this.f19577f).i(this.f19578g).k(f10).l(i10).n(Math.min(this.f19581j, d(i10, f10))).r(this.f19582k);
            CharSequence charSequence = this.f19574c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19561c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19562d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f19561c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f19562d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                p.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f19563c);
        int i11 = cVar.f19567b;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f19564a.f19566a)) {
                b bVar = (b) arrayList.get(i13);
                int g10 = g(i(list2, str, bVar.f19564a), i10, 1);
                int i14 = bVar.f19564a.f19567b - i12;
                int d10 = bVar.f19565b - i12;
                CharSequence subSequence = spannableStringBuilder.subSequence(i14, d10);
                spannableStringBuilder.delete(i14, d10);
                spannableStringBuilder.setSpan(new C2034e(subSequence.toString(), g10), i11, i14, 33);
                i12 += subSequence.length();
                i11 = i14;
            }
        }
    }

    private static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = cVar.f19567b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f19566a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /*117*/:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f19569d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List h10 = h(list2, str, cVar);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            e(spannableStringBuilder, ((d) h10.get(i11)).f19571b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, C1947c cVar, int i10, int i11) {
        if (cVar != null) {
            if (cVar.i() != -1) {
                C2035f.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
            }
            if (cVar.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (cVar.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (cVar.k()) {
                C2035f.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
            }
            if (cVar.j()) {
                C2035f.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
            }
            if (cVar.d() != null) {
                C2035f.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
            }
            int f10 = cVar.f();
            if (f10 == 1) {
                C2035f.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
            } else if (f10 == 2) {
                C2035f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
            } else if (f10 == 3) {
                C2035f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
            }
            if (cVar.b()) {
                spannableStringBuilder.setSpan(new C2033d(), i10, i11, 33);
            }
        }
    }

    private static int f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        if (indexOf == -1) {
            return str.length();
        }
        return indexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1947c cVar2 = (C1947c) list.get(i10);
            int h10 = cVar2.h(str, cVar.f19566a, cVar.f19569d, cVar.f19568c);
            if (h10 > 0) {
                arrayList.add(new d(h10, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List list, String str, c cVar) {
        List h10 = h(list, str, cVar);
        for (int i10 = 0; i10 < h10.size(); i10++) {
            C1947c cVar2 = ((d) h10.get(i10)).f19571b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        C2076a.a(!trim.isEmpty());
        return L.b1(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /*117*/:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static C2030a l(CharSequence charSequence) {
        C0342e eVar = new C0342e();
        eVar.f19574c = charSequence;
        return eVar.g().a();
    }

    public static C1948d m(C2073A a10, List list) {
        String s10 = a10.s();
        if (s10 == null) {
            return null;
        }
        Pattern pattern = f19559a;
        Matcher matcher = pattern.matcher(s10);
        if (matcher.matches()) {
            return n((String) null, matcher, a10, list);
        }
        String s11 = a10.s();
        if (s11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(s11);
        if (matcher2.matches()) {
            return n(s10.trim(), matcher2, a10, list);
        }
        return null;
    }

    private static C1948d n(String str, Matcher matcher, C2073A a10, List list) {
        C0342e eVar = new C0342e();
        try {
            eVar.f19572a = C1952h.c((String) C2076a.e(matcher.group(1)));
            eVar.f19573b = C1952h.c((String) C2076a.e(matcher.group(2)));
            p((String) C2076a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String s10 = a10.s();
            while (!TextUtils.isEmpty(s10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(s10.trim());
                s10 = a10.s();
            }
            eVar.f19574c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            p.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static C2030a.b o(String str) {
        C0342e eVar = new C0342e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, C0342e eVar) {
        Matcher matcher = f19560b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C2076a.e(matcher.group(1));
            String str3 = (String) C2076a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f19575d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f19581j = C1952h.b(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f19582k = w(str3);
                } else {
                    p.h("WebvttCueParser", "Unknown cue setting " + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str3);
                }
            } catch (NumberFormatException unused) {
                p.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString q(String str, String str2, List list) {
        boolean z10;
        boolean z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    int i12 = 1;
                    if (str2.charAt(i11) == '/') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i11 = f(str2, i11);
                    int i13 = i11 - 2;
                    if (str2.charAt(i13) == '/') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        i12 = 2;
                    }
                    int i14 = i10 + i12;
                    if (!z11) {
                        i13 = i11 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    if (!substring.trim().isEmpty()) {
                        String j10 = j(substring);
                        if (k(j10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f19566a.equals(j10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(OpsMetricTracker.START)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                p.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, C0342e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f19578g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f19576e = C1952h.b(str);
            eVar.f19577f = 0;
            return;
        }
        eVar.f19576e = (float) Integer.parseInt(str);
        eVar.f19577f = 1;
    }

    private static int t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(OpsMetricTracker.START)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                p.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, C0342e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f19580i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f19579h = C1952h.b(str);
    }

    private static int v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(BlockAlignment.LEFT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(BlockAlignment.RIGHT)) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(OpsMetricTracker.START)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                p.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        p.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
