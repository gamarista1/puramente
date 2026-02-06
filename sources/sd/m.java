package Sd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final List f52465a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f52466b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52467c;

    public final void a(byte[] bArr) {
        C6496s.h(bArr, "data");
        this.f52467c = true;
        this.f52465a.add(bArr);
    }

    public final byte[] b() {
        int i10 = 0;
        for (byte[] length : this.f52465a) {
            i10 += length.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        for (byte[] put : this.f52465a) {
            allocate.put(put);
        }
        this.f52465a.clear();
        this.f52467c = true;
        this.f52466b = true;
        byte[] array = allocate.array();
        C6496s.g(array, "array(...)");
        return array;
    }

    public final boolean c() {
        return this.f52467c;
    }
}
