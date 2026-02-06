package w3;

import android.database.Cursor;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import mf.Y;
import w3.C2835d;
import wf.C6763c;
import y3.g;

/* renamed from: w3.e  reason: case insensitive filesystem */
public abstract class C2836e {
    private static final Map a(g gVar, String str) {
        Throwable th2;
        boolean z10;
        Cursor a12 = gVar.a1("PRAGMA table_info(`" + str + "`)");
        try {
            if (a12.getColumnCount() <= 0) {
                Map i10 = O.i();
                C6763c.a(a12, (Throwable) null);
                return i10;
            }
            int columnIndex = a12.getColumnIndex("name");
            int columnIndex2 = a12.getColumnIndex("type");
            int columnIndex3 = a12.getColumnIndex("notnull");
            int columnIndex4 = a12.getColumnIndex("pk");
            int columnIndex5 = a12.getColumnIndex("dflt_value");
            Map c10 = O.c();
            while (a12.moveToNext()) {
                String string = a12.getString(columnIndex);
                String string2 = a12.getString(columnIndex2);
                if (a12.getInt(columnIndex3) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10;
                int i11 = a12.getInt(columnIndex4);
                String string3 = a12.getString(columnIndex5);
                C6496s.g(string, "name");
                C6496s.g(string2, "type");
                C2835d.a aVar = r11;
                C2835d.a aVar2 = new C2835d.a(string, string2, z11, i11, string3, 2);
                c10.put(string, aVar);
            }
            Map b10 = O.b(c10);
            C6763c.a(a12, (Throwable) null);
            return b10;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C6763c.a(a12, th2);
            throw th4;
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TicketDetailDestinationKt.LAUNCHED_FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        List c10 = C6565s.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C6496s.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            C6496s.g(string2, "cursor.getString(toColumnIndex)");
            c10.add(new C2835d.C0464d(i10, i11, string, string2));
        }
        return C6565s.T0(C6565s.a(c10));
    }

    private static final Set c(g gVar, String str) {
        Cursor a12 = gVar.a1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("id");
            int columnIndex2 = a12.getColumnIndex("seq");
            int columnIndex3 = a12.getColumnIndex("table");
            int columnIndex4 = a12.getColumnIndex("on_delete");
            int columnIndex5 = a12.getColumnIndex("on_update");
            List b10 = b(a12);
            a12.moveToPosition(-1);
            Set b11 = Y.b();
            while (a12.moveToNext()) {
                if (a12.getInt(columnIndex2) == 0) {
                    int i10 = a12.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C2835d.C0464d> arrayList3 = new ArrayList<>();
                    for (Object next : b10) {
                        if (((C2835d.C0464d) next).c() == i10) {
                            arrayList3.add(next);
                        }
                    }
                    for (C2835d.C0464d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.e());
                    }
                    String string = a12.getString(columnIndex3);
                    C6496s.g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = a12.getString(columnIndex4);
                    C6496s.g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = a12.getString(columnIndex5);
                    C6496s.g(string3, "cursor.getString(onUpdateColumnIndex)");
                    b11.add(new C2835d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a10 = Y.a(b11);
            C6763c.a(a12, (Throwable) null);
            return a10;
        } catch (Throwable th2) {
            C6763c.a(a12, th);
            throw th2;
        }
    }

    private static final C2835d.e d(g gVar, String str, boolean z10) {
        String str2;
        Cursor a12 = gVar.a1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("seqno");
            int columnIndex2 = a12.getColumnIndex("cid");
            int columnIndex3 = a12.getColumnIndex("name");
            int columnIndex4 = a12.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (a12.moveToNext()) {
                        if (a12.getInt(columnIndex2) >= 0) {
                            int i10 = a12.getInt(columnIndex);
                            String string = a12.getString(columnIndex3);
                            if (a12.getInt(columnIndex4) > 0) {
                                str2 = "DESC";
                            } else {
                                str2 = "ASC";
                            }
                            Integer valueOf = Integer.valueOf(i10);
                            C6496s.g(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i10), str2);
                        }
                    }
                    Collection values = treeMap.values();
                    C6496s.g(values, "columnsMap.values");
                    List e12 = C6565s.e1(values);
                    Collection values2 = treeMap2.values();
                    C6496s.g(values2, "ordersMap.values");
                    C2835d.e eVar = new C2835d.e(str, z10, e12, C6565s.e1(values2));
                    C6763c.a(a12, (Throwable) null);
                    return eVar;
                }
            }
            C6763c.a(a12, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            C6763c.a(a12, th);
            throw th2;
        }
    }

    private static final Set e(g gVar, String str) {
        Cursor a12 = gVar.a1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("name");
            int columnIndex2 = a12.getColumnIndex("origin");
            int columnIndex3 = a12.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set b10 = Y.b();
                    while (a12.moveToNext()) {
                        if (C6496s.c("c", a12.getString(columnIndex2))) {
                            String string = a12.getString(columnIndex);
                            boolean z10 = true;
                            if (a12.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            C6496s.g(string, "name");
                            C2835d.e d10 = d(gVar, string, z10);
                            if (d10 == null) {
                                C6763c.a(a12, (Throwable) null);
                                return null;
                            }
                            b10.add(d10);
                        }
                    }
                    Set a10 = Y.a(b10);
                    C6763c.a(a12, (Throwable) null);
                    return a10;
                }
            }
            C6763c.a(a12, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            C6763c.a(a12, th);
            throw th2;
        }
    }

    public static final C2835d f(g gVar, String str) {
        C6496s.h(gVar, "database");
        C6496s.h(str, "tableName");
        return new C2835d(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
