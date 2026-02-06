package W5;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int c(int i10, byte[] bArr, int i11, int i12);

    boolean isClosed();

    ByteBuffer l();

    byte r(int i10);

    long s();

    int size();
}
