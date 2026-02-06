package ng;

public final class f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f72298a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72299b;

    private f(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f72298a = str;
        this.f72299b = z10;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static f f(String str) {
        if (str == null) {
            a(9);
        }
        if (str.startsWith("<")) {
            return m(str);
        }
        return i(str);
    }

    public static f i(String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean l(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f m(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f72298a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    /* renamed from: c */
    public int compareTo(f fVar) {
        return this.f72298a.compareTo(fVar.f72298a);
    }

    public String e() {
        if (!this.f72299b) {
            String b10 = b();
            if (b10 == null) {
                a(2);
            }
            return b10;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f72299b == fVar.f72299b && this.f72298a.equals(fVar.f72298a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f72298a.hashCode() * 31) + (this.f72299b ? 1 : 0);
    }

    public boolean j() {
        return this.f72299b;
    }

    public String toString() {
        return this.f72298a;
    }
}
