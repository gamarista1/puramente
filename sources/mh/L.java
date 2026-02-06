package mh;

import Ef.m;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class L implements C6608z {

    /* renamed from: a  reason: collision with root package name */
    private char[] f72126a = C6593j.f72212c.d();

    /* renamed from: b  reason: collision with root package name */
    private int f72127b;

    private final void e(int i10, int i11, String str) {
        int i12;
        int length = str.length();
        while (i10 < length) {
            int g10 = g(i11, 2);
            char charAt = str.charAt(i10);
            if (charAt < a0.a().length) {
                byte b10 = a0.a()[charAt];
                if (b10 == 0) {
                    i12 = g10 + 1;
                    this.f72126a[g10] = (char) charAt;
                } else {
                    if (b10 == 1) {
                        String str2 = a0.b()[charAt];
                        C6496s.e(str2);
                        int g11 = g(g10, str2.length());
                        str2.getChars(0, str2.length(), this.f72126a, g11);
                        i11 = g11 + str2.length();
                        this.f72127b = i11;
                    } else {
                        char[] cArr = this.f72126a;
                        cArr[g10] = '\\';
                        cArr[g10 + 1] = (char) b10;
                        i11 = g10 + 2;
                        this.f72127b = i11;
                    }
                    i10++;
                }
            } else {
                i12 = g10 + 1;
                this.f72126a[g10] = (char) charAt;
            }
            i11 = i12;
            i10++;
        }
        int g12 = g(i11, 1);
        this.f72126a[g12] = '\"';
        this.f72127b = g12 + 1;
    }

    private final void f(int i10) {
        g(this.f72127b, i10);
    }

    private final int g(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f72126a;
        if (cArr.length <= i12) {
            char[] copyOf = Arrays.copyOf(cArr, m.d(i12, i10 * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f72126a = copyOf;
        }
        return i10;
    }

    public void a(char c10) {
        f(1);
        char[] cArr = this.f72126a;
        int i10 = this.f72127b;
        this.f72127b = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(String str) {
        C6496s.h(str, AttributeType.TEXT);
        f(str.length() + 2);
        char[] cArr = this.f72126a;
        int i10 = this.f72127b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            if (c10 >= a0.a().length || a0.a()[c10] == 0) {
                i13++;
            } else {
                e(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f72127b = i12 + 1;
    }

    public void c(long j10) {
        d(String.valueOf(j10));
    }

    public void d(String str) {
        C6496s.h(str, AttributeType.TEXT);
        int length = str.length();
        if (length != 0) {
            f(length);
            str.getChars(0, str.length(), this.f72126a, this.f72127b);
            this.f72127b += length;
        }
    }

    public void h() {
        C6593j.f72212c.c(this.f72126a);
    }

    public String toString() {
        return new String(this.f72126a, 0, this.f72127b);
    }
}
