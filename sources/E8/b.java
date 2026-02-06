package E8;

import java.nio.ByteOrder;

public class b extends com.github.penfeizhou.animation.io.b {
    public void d(int i10) {
        super.d(i10);
        this.f42754a.order(ByteOrder.BIG_ENDIAN);
    }

    public void g(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }

    public void h(int i10) {
        b((byte) ((i10 >> 24) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) (i10 & 255));
    }
}
