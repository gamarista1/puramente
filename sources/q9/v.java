package q9;

import D9.a;
import I9.e;
import I9.j;
import ja.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f47911c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f47912a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f47913b = -1;

    private boolean b(String str) {
        Matcher matcher = f47911c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) M.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) M.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f47912a = parseInt;
            this.f47913b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        if (this.f47912a == -1 || this.f47913b == -1) {
            return false;
        }
        return true;
    }

    public boolean c(a aVar) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof e) {
                e eVar = (e) c10;
                if ("iTunSMPB".equals(eVar.f31799c) && b(eVar.f31800d)) {
                    return true;
                }
            } else if (c10 instanceof j) {
                j jVar = (j) c10;
                if ("com.apple.iTunes".equals(jVar.f31811b) && "iTunSMPB".equals(jVar.f31812c) && b(jVar.f31813d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f47912a = i11;
        this.f47913b = i12;
        return true;
    }
}
