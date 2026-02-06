package fa;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import ja.B;
import ja.C3645a;
import ja.C3650f;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f43549c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f43550d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final B f43551a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f43552b = new StringBuilder();

    private void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f43549c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.z((String) C3645a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] R02 = M.R0(str, "\\.");
            String str2 = R02[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.y(str2.substring(0, indexOf2));
                dVar.x(str2.substring(indexOf2 + 1));
            } else {
                dVar.y(str2);
            }
            if (R02.length > 1) {
                dVar.w((String[]) M.I0(R02, 1, R02.length));
            }
        }
    }

    private static boolean b(B b10) {
        int e10 = b10.e();
        int f10 = b10.f();
        byte[] d10 = b10.d();
        if (e10 + 2 > f10) {
            return false;
        }
        int i10 = e10 + 1;
        if (d10[e10] != 47) {
            return false;
        }
        int i11 = e10 + 2;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10) {
                b10.Q(f10 - b10.e());
                return true;
            } else if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                i11 += 2;
                f10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(B b10) {
        char k10 = k(b10, b10.e());
        if (k10 != 9 && k10 != 10 && k10 != 12 && k10 != 13 && k10 != ' ') {
            return false;
        }
        b10.Q(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f43550d.matcher(C5108c.e(str));
        if (!matcher.matches()) {
            s.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C3645a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) C3645a.e(matcher.group(1))));
    }

    private static String f(B b10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int e10 = b10.e();
        int f10 = b10.f();
        while (e10 < f10 && !z10) {
            char c10 = (char) b10.d()[e10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e10++;
                sb2.append(c10);
            }
        }
        b10.Q(e10 - b10.e());
        return sb2.toString();
    }

    static String g(B b10, StringBuilder sb2) {
        n(b10);
        if (b10.a() == 0) {
            return null;
        }
        String f10 = f(b10, sb2);
        if (!"".equals(f10)) {
            return f10;
        }
        return "" + ((char) b10.D());
    }

    private static String h(B b10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e10 = b10.e();
            String g10 = g(b10, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                b10.P(e10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    private static String i(B b10, StringBuilder sb2) {
        String str;
        n(b10);
        if (b10.a() < 5 || !"::cue".equals(b10.A(5))) {
            return null;
        }
        int e10 = b10.e();
        String g10 = g(b10, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            b10.P(e10);
            return "";
        }
        if ("(".equals(g10)) {
            str = l(b10);
        } else {
            str = null;
        }
        if (!")".equals(g(b10, sb2))) {
            return null;
        }
        return str;
    }

    private static void j(B b10, d dVar, StringBuilder sb2) {
        n(b10);
        String f10 = f(b10, sb2);
        if (!"".equals(f10) && Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(g(b10, sb2))) {
            n(b10);
            String h10 = h(b10, sb2);
            if (h10 != null && !"".equals(h10)) {
                int e10 = b10.e();
                String g10 = g(b10, sb2);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        b10.P(e10);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    dVar.q(C3650f.b(h10));
                } else if ("background-color".equals(f10)) {
                    dVar.n(C3650f.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            dVar.v(1);
                        } else if ("under".equals(h10)) {
                            dVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        dVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            dVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        dVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            dVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            dVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, dVar);
                    }
                }
            }
        }
    }

    private static char k(B b10, int i10) {
        return (char) b10.d()[i10];
    }

    private static String l(B b10) {
        int e10 = b10.e();
        int f10 = b10.f();
        boolean z10 = false;
        while (e10 < f10 && !z10) {
            int i10 = e10 + 1;
            if (((char) b10.d()[e10]) == ')') {
                z10 = true;
            } else {
                z10 = false;
            }
            e10 = i10;
        }
        return b10.A((e10 - 1) - b10.e()).trim();
    }

    static void m(B b10) {
        do {
        } while (!TextUtils.isEmpty(b10.p()));
    }

    static void n(B b10) {
        while (true) {
            boolean z10 = true;
            while (b10.a() > 0 && z10) {
                if (!c(b10) && !b(b10)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List d(B b10) {
        boolean z10;
        this.f43552b.setLength(0);
        int e10 = b10.e();
        m(b10);
        this.f43551a.N(b10.d(), b10.e());
        this.f43551a.P(e10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f43551a, this.f43552b);
            if (i10 == null || !"{".equals(g(this.f43551a, this.f43552b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int e11 = this.f43551a.e();
                String g10 = g(this.f43551a, this.f43552b);
                if (g10 == null || "}".equals(g10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f43551a.P(e11);
                    j(this.f43551a, dVar, this.f43552b);
                }
                str = g10;
                z11 = z10;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
