package Lb;

import Gb.c;
import Tb.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final List f51694a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f51695b;

    private D(l lVar) {
        this.f51695b = 0;
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            this.f51694a.add(((b) it.next()).b());
        }
        this.f51695b = Math.max(1, this.f51694a.size());
        for (int i10 = 0; i10 < this.f51694a.size(); i10++) {
            this.f51695b += f((CharSequence) this.f51694a.get(i10));
        }
        a();
    }

    private void a() {
        if (this.f51695b > 768) {
            throw new c("Data has a key path longer than 768 bytes (" + this.f51695b + ").");
        } else if (this.f51694a.size() > 32) {
            throw new c("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + e());
        }
    }

    private static String b(String str, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                sb2.append(str);
            }
            sb2.append((String) list.get(i10));
        }
        return sb2.toString();
    }

    private String c() {
        List list = this.f51694a;
        String str = (String) list.remove(list.size() - 1);
        this.f51695b -= f(str);
        if (this.f51694a.size() > 0) {
            this.f51695b--;
        }
        return str;
    }

    private void d(String str) {
        if (this.f51694a.size() > 0) {
            this.f51695b++;
        }
        this.f51694a.add(str);
        this.f51695b += f(str);
        a();
    }

    private String e() {
        if (this.f51694a.size() == 0) {
            return "";
        }
        return "in path '" + b("/", this.f51694a) + "'";
    }

    private static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt <= 127) {
                i11++;
            } else if (charAt <= 2047) {
                i11 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i11 += 4;
                i10++;
            } else {
                i11 += 3;
            }
            i10++;
        }
        return i11;
    }

    public static void g(l lVar, Object obj) {
        new D(lVar).h(obj);
    }

    private void h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    d(str);
                    h(map.get(str));
                    c();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i10 = 0; i10 < list.size(); i10++) {
                d(Integer.toString(i10));
                h(list.get(i10));
                c();
            }
        }
    }
}
