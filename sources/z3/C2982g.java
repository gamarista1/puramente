package z3;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.C6496s;
import y3.i;

/* renamed from: z3.g  reason: case insensitive filesystem */
public class C2982g implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f29333a;

    public C2982g(SQLiteProgram sQLiteProgram) {
        C6496s.h(sQLiteProgram, "delegate");
        this.f29333a = sQLiteProgram;
    }

    public void C0(int i10, String str) {
        C6496s.h(str, "value");
        this.f29333a.bindString(i10, str);
    }

    public void G(int i10, double d10) {
        this.f29333a.bindDouble(i10, d10);
    }

    public void Q0(int i10, long j10) {
        this.f29333a.bindLong(i10, j10);
    }

    public void U0(int i10, byte[] bArr) {
        C6496s.h(bArr, "value");
        this.f29333a.bindBlob(i10, bArr);
    }

    public void close() {
        this.f29333a.close();
    }

    public void i1(int i10) {
        this.f29333a.bindNull(i10);
    }
}
