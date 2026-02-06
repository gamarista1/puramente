package H8;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;
import java.nio.ByteBuffer;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f31714a = null;

    public a(Reader reader) {
        super(reader);
    }

    public ByteBuffer a() {
        if (this.f31714a == null) {
            int available = available();
            byte[] bArr = new byte[available];
            read(bArr, 0, available);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
            this.f31714a = allocateDirect;
            allocateDirect.put(bArr);
        }
        this.f31714a.flip();
        return this.f31714a;
    }
}
