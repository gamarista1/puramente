package w3;

import Sg.p;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import wf.C6763c;
import yf.C6798l;

/* renamed from: w3.a  reason: case insensitive filesystem */
public abstract class C2832a {
    public static final Cursor a(Cursor cursor) {
        C6496s.h(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = cursor.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor.getString(i10);
                    } else if (type == 4) {
                        objArr[i10] = cursor.getBlob(i10);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            C6763c.a(cursor, (Throwable) null);
            return matrixCursor;
        } catch (Throwable th2) {
            C6763c.a(cursor, th);
            throw th2;
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        C6496s.g(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] strArr, String str) {
        C6496s.h(strArr, "columnNames");
        C6496s.h(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str4 = strArr[i10];
            int i12 = i11 + 1;
            if (str4.length() >= str.length() + 2) {
                if (p.u(str4, str2, false, 2, (Object) null)) {
                    return i11;
                }
                if (str4.charAt(0) == '`' && p.u(str4, str3, false, 2, (Object) null)) {
                    return i11;
                }
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String str) {
        C6496s.h(cursor, "c");
        C6496s.h(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return b(cursor, str);
    }

    public static final int e(Cursor cursor, String str) {
        String str2;
        C6496s.h(cursor, "c");
        C6496s.h(str, "name");
        int d10 = d(cursor, str);
        if (d10 >= 0) {
            return d10;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C6496s.g(columnNames, "c.columnNames");
            str2 = C6559l.M0(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
