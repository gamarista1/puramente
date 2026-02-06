package ob;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import nb.o;
import pb.d;

/* renamed from: ob.a  reason: case insensitive filesystem */
public abstract class C5120a {

    /* renamed from: a  reason: collision with root package name */
    private static final OutputStream f61187a = new C0900a();

    /* renamed from: ob.a$a  reason: collision with other inner class name */
    class C0900a extends OutputStream {
        C0900a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i10) {
        }

        public void write(byte[] bArr) {
            o.j(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            o.j(bArr);
            o.n(i10, i11 + i10, bArr.length);
        }
    }

    private static byte[] a(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        o.j(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] c(InputStream inputStream, Queue queue, int i10) {
        int i11;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = inputStream.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return a(queue, i10);
                }
                i12 += read;
                i10 += read;
            }
            if (min < 4096) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            min = d.c(min, i11);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
