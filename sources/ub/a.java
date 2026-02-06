package Ub;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

abstract class a {

    /* renamed from: Ub.a$a  reason: collision with other inner class name */
    static class C0809a implements b {

        /* renamed from: a  reason: collision with root package name */
        private List f53326a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private int f53327b = 0;

        C0809a() {
        }

        public boolean a(byte[] bArr) {
            this.f53326a.add(bArr);
            this.f53327b += bArr.length;
            return true;
        }

        public g b() {
            byte[] bArr = new byte[this.f53327b];
            int i10 = 0;
            for (int i11 = 0; i11 < this.f53326a.size(); i11++) {
                byte[] bArr2 = (byte[]) this.f53326a.get(i11);
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return new g(bArr);
        }
    }

    interface b {
        boolean a(byte[] bArr);

        g b();
    }

    static class c implements b {

        /* renamed from: c  reason: collision with root package name */
        private static ThreadLocal f53328c = new C0810a();

        /* renamed from: d  reason: collision with root package name */
        private static ThreadLocal f53329d = new b();

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f53330a = new StringBuilder();

        /* renamed from: b  reason: collision with root package name */
        private ByteBuffer f53331b;

        /* renamed from: Ub.a$c$a  reason: collision with other inner class name */
        class C0810a extends ThreadLocal {
            C0810a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            }
        }

        class b extends ThreadLocal {
            b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction);
                newEncoder.onUnmappableCharacter(codingErrorAction);
                return newEncoder;
            }
        }

        c() {
        }

        private String c(byte[] bArr) {
            try {
                return ((CharsetDecoder) f53328c.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        public boolean a(byte[] bArr) {
            String c10 = c(bArr);
            if (c10 == null) {
                return false;
            }
            this.f53330a.append(c10);
            return true;
        }

        public g b() {
            if (this.f53331b != null) {
                return null;
            }
            return new g(this.f53330a.toString());
        }
    }

    static b a(byte b10) {
        if (b10 == 2) {
            return new C0809a();
        }
        return new c();
    }
}
