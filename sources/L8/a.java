package L8;

import com.github.penfeizhou.animation.io.e;
import java.nio.IntBuffer;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    protected IntBuffer f32571a;

    public a() {
        c(10240);
    }

    public IntBuffer a() {
        return this.f32571a;
    }

    public int[] b() {
        return this.f32571a.array();
    }

    public void c(int i10) {
        IntBuffer intBuffer = this.f32571a;
        if (intBuffer == null || i10 > intBuffer.capacity()) {
            this.f32571a = IntBuffer.allocate(i10);
        }
        this.f32571a.clear();
        this.f32571a.limit(i10);
        this.f32571a.position(0);
    }

    public void close() {
    }
}
