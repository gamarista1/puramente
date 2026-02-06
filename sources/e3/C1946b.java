package e3;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import i2.C2073A;
import i2.C2076a;
import i2.C2080e;
import i2.L;
import i2.p;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

/* renamed from: e3.b  reason: case insensitive filesystem */
final class C1946b {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f19535c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f19536d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f19537a = new C2073A();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f19538b = new StringBuilder();

    private void a(C1947c cVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f19535c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    cVar.z((String) C2076a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] a12 = L.a1(str, "\\.");
            String str2 = a12[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                cVar.y(str2.substring(0, indexOf2));
                cVar.x(str2.substring(indexOf2 + 1));
            } else {
                cVar.y(str2);
            }
            if (a12.length > 1) {
                cVar.w((String[]) L.Q0(a12, 1, a12.length));
            }
        }
    }

    private static boolean b(C2073A a10) {
        int f10 = a10.f();
        int g10 = a10.g();
        byte[] e10 = a10.e();
        if (f10 + 2 > g10) {
            return false;
        }
        int i10 = f10 + 1;
        if (e10[f10] != 47) {
            return false;
        }
        int i11 = f10 + 2;
        if (e10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= g10) {
                a10.V(g10 - a10.f());
                return true;
            } else if (((char) e10[i11]) == '*' && ((char) e10[i12]) == '/') {
                i11 += 2;
                g10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(C2073A a10) {
        char k10 = k(a10, a10.f());
        if (k10 != 9 && k10 != 10 && k10 != 12 && k10 != 13 && k10 != ' ') {
            return false;
        }
        a10.V(1);
        return true;
    }

    private static void e(String str, C1947c cVar) {
        Matcher matcher = f19536d.matcher(C5108c.e(str));
        if (!matcher.matches()) {
            p.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C2076a.e(matcher.group(2));
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
                cVar.t(3);
                break;
            case 1:
                cVar.t(2);
                break;
            case 2:
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) C2076a.e(matcher.group(1))));
    }

    private static String f(C2073A a10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int f10 = a10.f();
        int g10 = a10.g();
        while (f10 < g10 && !z10) {
            char c10 = (char) a10.e()[f10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                f10++;
                sb2.append(c10);
            }
        }
        a10.V(f10 - a10.f());
        return sb2.toString();
    }

    static String g(C2073A a10, StringBuilder sb2) {
        n(a10);
        if (a10.a() == 0) {
            return null;
        }
        String f10 = f(a10, sb2);
        if (!"".equals(f10)) {
            return f10;
        }
        return "" + ((char) a10.H());
    }

    private static String h(C2073A a10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int f10 = a10.f();
            String g10 = g(a10, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                a10.U(f10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    private static String i(C2073A a10, StringBuilder sb2) {
        String str;
        n(a10);
        if (a10.a() < 5 || !"::cue".equals(a10.E(5))) {
            return null;
        }
        int f10 = a10.f();
        String g10 = g(a10, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            a10.U(f10);
            return "";
        }
        if ("(".equals(g10)) {
            str = l(a10);
        } else {
            str = null;
        }
        if (!")".equals(g(a10, sb2))) {
            return null;
        }
        return str;
    }

    private static void j(C2073A a10, C1947c cVar, StringBuilder sb2) {
        n(a10);
        String f10 = f(a10, sb2);
        if (!"".equals(f10) && Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(g(a10, sb2))) {
            n(a10);
            String h10 = h(a10, sb2);
            if (h10 != null && !"".equals(h10)) {
                int f11 = a10.f();
                String g10 = g(a10, sb2);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        a10.U(f11);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    cVar.q(C2080e.b(h10));
                } else if ("background-color".equals(f10)) {
                    cVar.n(C2080e.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            cVar.v(1);
                        } else if ("under".equals(h10)) {
                            cVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        cVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            cVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        cVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            cVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            cVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, cVar);
                    }
                }
            }
        }
    }

    private static char k(C2073A a10, int i10) {
        return (char) a10.e()[i10];
    }

    private static String l(C2073A a10) {
        int f10 = a10.f();
        int g10 = a10.g();
        boolean z10 = false;
        while (f10 < g10 && !z10) {
            int i10 = f10 + 1;
            if (((char) a10.e()[f10]) == ')') {
                z10 = true;
            } else {
                z10 = false;
            }
            f10 = i10;
        }
        return a10.E((f10 - 1) - a10.f()).trim();
    }

    static void m(C2073A a10) {
        do {
        } while (!TextUtils.isEmpty(a10.s()));
    }

    static void n(C2073A a10) {
        while (true) {
            boolean z10 = true;
            while (a10.a() > 0 && z10) {
                if (!c(a10) && !b(a10)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List d(C2073A a10) {
        boolean z10;
        this.f19538b.setLength(0);
        int f10 = a10.f();
        m(a10);
        this.f19537a.S(a10.e(), a10.f());
        this.f19537a.U(f10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f19537a, this.f19538b);
            if (i10 == null || !"{".equals(g(this.f19537a, this.f19538b))) {
                return arrayList;
            }
            C1947c cVar = new C1947c();
            a(cVar, i10);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int f11 = this.f19537a.f();
                String g10 = g(this.f19537a, this.f19538b);
                if (g10 == null || "}".equals(g10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f19537a.U(f11);
                    j(this.f19537a, cVar, this.f19538b);
                }
                str = g10;
                z11 = z10;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
    }
}
