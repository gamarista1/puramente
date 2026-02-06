package y3;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

public interface g extends Closeable {
    k G0(String str);

    void R(String str, Object[] objArr);

    void S();

    int S0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    Cursor a1(String str);

    Cursor b0(j jVar, CancellationSignal cancellationSignal);

    void g();

    boolean isOpen();

    void j();

    Cursor j1(j jVar);

    void k();

    String m();

    boolean o1();

    boolean q1();

    List w();

    void z(String str);
}
