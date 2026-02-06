package z2;

import N2.e;
import N2.k;
import f2.z;
import i2.L;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class B {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f29072c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f29073a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f29074b = -1;

    private boolean b(String str) {
        Matcher matcher = f29072c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) L.h(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) L.h(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f29073a = parseInt;
            this.f29074b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        if (this.f29073a == -1 || this.f29074b == -1) {
            return false;
        }
        return true;
    }

    public boolean c(z zVar) {
        for (int i10 = 0; i10 < zVar.e(); i10++) {
            z.b d10 = zVar.d(i10);
            if (d10 instanceof e) {
                e eVar = (e) d10;
                if ("iTunSMPB".equals(eVar.f4407c) && b(eVar.f4408d)) {
                    return true;
                }
            } else if (d10 instanceof k) {
                k kVar = (k) d10;
                if ("com.apple.iTunes".equals(kVar.f4420b) && "iTunSMPB".equals(kVar.f4421c) && b(kVar.f4422d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
