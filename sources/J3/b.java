package J3;

import java.util.Objects;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f3958a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3959b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f3960c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3961d;

    public b(String str, c[] cVarArr) {
        this.f3959b = str;
        this.f3960c = null;
        this.f3958a = cVarArr;
        this.f3961d = 0;
    }

    private void a(int i10) {
        if (i10 != this.f3961d) {
            throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f3961d) + " expected, but got " + c(i10));
        }
    }

    private String c(int i10) {
        if (i10 == 0) {
            return "String";
        }
        if (i10 != 1) {
            return "Unknown";
        }
        return "ArrayBuffer";
    }

    public String b() {
        a(0);
        return this.f3959b;
    }

    public b(byte[] bArr, c[] cVarArr) {
        Objects.requireNonNull(bArr);
        this.f3960c = bArr;
        this.f3959b = null;
        this.f3958a = cVarArr;
        this.f3961d = 1;
    }
}
