package androidx.emoji2.text;

import P1.b;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import u1.o;
import x1.g;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final b f16664a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f16665b;

    /* renamed from: c  reason: collision with root package name */
    private final a f16666c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f16667d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f16668a;

        /* renamed from: b  reason: collision with root package name */
        private p f16669b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray sparseArray = this.f16668a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        /* access modifiers changed from: package-private */
        public final p b() {
            return this.f16669b;
        }

        /* access modifiers changed from: package-private */
        public void c(p pVar, int i10, int i11) {
            a a10 = a(pVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f16668a.put(pVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(pVar, i10 + 1, i11);
            } else {
                a10.f16669b = pVar;
            }
        }

        a(int i10) {
            this.f16668a = new SparseArray(i10);
        }
    }

    private n(Typeface typeface, b bVar) {
        this.f16667d = typeface;
        this.f16664a = bVar;
        this.f16665b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f16665b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public char[] c() {
        return this.f16665b;
    }

    public b d() {
        return this.f16664a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f16664a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f16666c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f16667d;
    }

    /* access modifiers changed from: package-private */
    public void h(p pVar) {
        boolean z10;
        g.g(pVar, "emoji metadata cannot be null");
        if (pVar.c() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.a(z10, "invalid metadata codepoint length");
        this.f16666c.c(pVar, 0, pVar.c() - 1);
    }
}
