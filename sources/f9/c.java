package F9;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f30808a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f30809b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f30808a = byteArrayOutputStream;
        this.f30809b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f30808a.reset();
        try {
            b(this.f30809b, aVar.f30802a);
            String str = aVar.f30803b;
            if (str == null) {
                str = "";
            }
            b(this.f30809b, str);
            this.f30809b.writeLong(aVar.f30804c);
            this.f30809b.writeLong(aVar.f30805d);
            this.f30809b.write(aVar.f30806e);
            this.f30809b.flush();
            return this.f30808a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
