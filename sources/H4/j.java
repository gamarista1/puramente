package H4;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private float f31679a;

    /* renamed from: b  reason: collision with root package name */
    private int f31680b;

    public void a(float f10) {
        float f11 = this.f31679a + f10;
        this.f31679a = f11;
        int i10 = this.f31680b + 1;
        this.f31680b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f31679a = f11 / 2.0f;
            this.f31680b = i10 / 2;
        }
    }
}
