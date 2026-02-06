package Pc;

import Sc.c;
import com.google.gson.h;
import com.google.gson.internal.bind.o;
import java.io.Writer;
import java.util.Objects;

public abstract class G {
    public static void a(h hVar, c cVar) {
        o.f58296V.write(cVar, hVar);
    }

    public static Writer b(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new b(appendable);
    }

    private static final class b extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f52192a;

        /* renamed from: b  reason: collision with root package name */
        private final a f52193b = new a();

        private static class a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            private char[] f52194a;

            /* renamed from: b  reason: collision with root package name */
            private String f52195b;

            private a() {
            }

            /* access modifiers changed from: package-private */
            public void a(char[] cArr) {
                this.f52194a = cArr;
                this.f52195b = null;
            }

            public char charAt(int i10) {
                return this.f52194a[i10];
            }

            public int length() {
                return this.f52194a.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f52194a, i10, i11 - i10);
            }

            public String toString() {
                if (this.f52195b == null) {
                    this.f52195b = new String(this.f52194a);
                }
                return this.f52195b;
            }
        }

        b(Appendable appendable) {
            this.f52192a = appendable;
        }

        public void write(char[] cArr, int i10, int i11) {
            this.f52193b.a(cArr);
            this.f52192a.append(this.f52193b, i10, i11 + i10);
        }

        public Writer append(CharSequence charSequence) {
            this.f52192a.append(charSequence);
            return this;
        }

        public void write(int i10) {
            this.f52192a.append((char) i10);
        }

        public Writer append(CharSequence charSequence, int i10, int i11) {
            this.f52192a.append(charSequence, i10, i11);
            return this;
        }

        public void write(String str, int i10, int i11) {
            Objects.requireNonNull(str);
            this.f52192a.append(str, i10, i11 + i10);
        }

        public void close() {
        }

        public void flush() {
        }
    }
}
