package da;

import aa.a;
import aa.c;
import aa.d;
import aa.e;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.ArrayDeque;
import java.util.Map;

abstract class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, d dVar, Map map, int i12) {
        d e10;
        int i13;
        g f10;
        int i14;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i10, i11, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.q()) {
            d.a(spannable, new ForegroundColorSpan(gVar.c()), i10, i11, 33);
        }
        if (gVar.p()) {
            d.a(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            d.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) C3645a.e(gVar.o());
            int i15 = bVar.f43182a;
            if (i15 == -1) {
                if (i12 == 2 || i12 == 1) {
                    i15 = 3;
                } else {
                    i15 = 1;
                }
                i14 = 1;
            } else {
                i14 = bVar.f43183b;
            }
            int i16 = bVar.f43184c;
            if (i16 == -2) {
                i16 = 1;
            }
            d.a(spannable, new e(i15, i14, i16), i10, i11, 33);
        }
        int j10 = gVar.j();
        if (j10 == 2) {
            d d10 = d(dVar, map);
            if (!(d10 == null || (e10 = e(d10, map)) == null)) {
                if (e10.g() != 1 || e10.f(0).f43203b == null) {
                    s.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) M.j(e10.f(0).f43203b);
                    g f11 = f(e10.f43207f, e10.l(), map);
                    if (f11 != null) {
                        i13 = f11.i();
                    } else {
                        i13 = -1;
                    }
                    if (i13 == -1 && (f10 = f(d10.f43207f, d10.l(), map)) != null) {
                        i13 = f10.i();
                    }
                    spannable.setSpan(new c(str, i13), i10, i11, 33);
                }
            }
        } else if (j10 == 3 || j10 == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.n()) {
            d.a(spannable, new a(), i10, i11, 33);
        }
        int f12 = gVar.f();
        if (f12 == 1) {
            d.a(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i10, i11, 33);
        } else if (f12 == 2) {
            d.a(spannable, new RelativeSizeSpan(gVar.e()), i10, i11, 33);
        } else if (f12 == 3) {
            d.a(spannable, new RelativeSizeSpan(gVar.e() / 100.0f), i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("[ \t\\x0B\f\r]+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    private static d d(d dVar, Map map) {
        while (dVar != null) {
            g f10 = f(dVar.f43207f, dVar.l(), map);
            if (f10 != null && f10.j() == 1) {
                return dVar;
            }
            dVar = dVar.f43211j;
        }
        return null;
    }

    private static d e(d dVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g f10 = f(dVar2.f43207f, dVar2.l(), map);
            if (f10 != null && f10.j() == 3) {
                return dVar2;
            }
            for (int g10 = dVar2.g() - 1; g10 >= 0; g10--) {
                arrayDeque.push(dVar2.f(g10));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.a((g) map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
