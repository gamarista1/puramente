package M2;

import I2.b;
import I2.c;
import f2.z;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;
import nb.C5110e;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f4301c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f4302a = C5110e.f61085c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f4303b = C5110e.f61084b.newDecoder();

    /* JADX INFO: finally extract failed */
    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f4302a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f4303b.decode(byteBuffer).toString();
                this.f4303b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f4303b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f4303b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f4302a.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    public z b(b bVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new z(new c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f4301c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = C5108c.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new z(new c(bArr, str, str2));
    }
}
