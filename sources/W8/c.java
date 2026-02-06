package W8;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34921a;

    private c(String str) {
        if (str != null) {
            this.f34921a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f34921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f34921a.equals(((c) obj).f34921a);
    }

    public int hashCode() {
        return this.f34921a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f34921a + "\"}";
    }
}
