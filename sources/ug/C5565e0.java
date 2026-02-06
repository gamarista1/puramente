package Ug;

/* renamed from: Ug.e0  reason: case insensitive filesystem */
final class C5565e0 implements C5589q0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f65366a;

    public C5565e0(boolean z10) {
        this.f65366a = z10;
    }

    public boolean a() {
        return this.f65366a;
    }

    public J0 d() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        if (a()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
