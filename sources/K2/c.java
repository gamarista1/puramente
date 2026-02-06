package K2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f4012a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f4013b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f4012a = byteArrayOutputStream;
        this.f4013b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f4012a.reset();
        try {
            b(this.f4013b, aVar.f4006a);
            String str = aVar.f4007b;
            if (str == null) {
                str = "";
            }
            b(this.f4013b, str);
            this.f4013b.writeLong(aVar.f4008c);
            this.f4013b.writeLong(aVar.f4009d);
            this.f4013b.write(aVar.f4010e);
            this.f4013b.flush();
            return this.f4012a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
