package z3;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.C6496s;
import y3.k;

/* renamed from: z3.h  reason: case insensitive filesystem */
public final class C2983h extends C2982g implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f29334b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2983h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        C6496s.h(sQLiteStatement, "delegate");
        this.f29334b = sQLiteStatement;
    }

    public int C() {
        return this.f29334b.executeUpdateDelete();
    }

    public long w0() {
        return this.f29334b.executeInsert();
    }
}
