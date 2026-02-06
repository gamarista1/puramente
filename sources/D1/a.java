package D1;

import D1.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f1518a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f1519b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f1520c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f1521d;

    /* renamed from: e  reason: collision with root package name */
    protected int f1522e;

    /* renamed from: f  reason: collision with root package name */
    protected C0019a f1523f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f1524g;

    /* renamed from: h  reason: collision with root package name */
    protected b f1525h;

    /* renamed from: D1.a$a  reason: collision with other inner class name */
    private class C0019a extends ContentObserver {
        C0019a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f1518a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1518a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        f(context, cursor, i10);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public abstract CharSequence b(Cursor cursor);

    public Cursor d() {
        return this.f1520c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        int i11;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f1519b = true;
        } else {
            this.f1519b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f1520c = cursor;
        this.f1518a = z10;
        this.f1521d = context;
        if (z10) {
            i11 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i11 = -1;
        }
        this.f1522e = i11;
        if ((i10 & 2) == 2) {
            this.f1523f = new C0019a();
            this.f1524g = new b();
        } else {
            this.f1523f = null;
            this.f1524g = null;
        }
        if (z10) {
            C0019a aVar = this.f1523f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1524g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f1518a || (cursor = this.f1520c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1518a) {
            return null;
        }
        this.f1520c.moveToPosition(i10);
        if (view == null) {
            view = g(this.f1521d, this.f1520c, viewGroup);
        }
        e(view, this.f1521d, this.f1520c);
        return view;
    }

    public Filter getFilter() {
        if (this.f1525h == null) {
            this.f1525h = new b(this);
        }
        return this.f1525h;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f1518a || (cursor = this.f1520c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f1520c;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f1518a || (cursor = this.f1520c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f1520c.getLong(this.f1522e);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1518a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1520c.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f1521d, this.f1520c, viewGroup);
            }
            e(view, this.f1521d, this.f1520c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f1519b && (cursor = this.f1520c) != null && !cursor.isClosed()) {
            this.f1518a = this.f1520c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f1520c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0019a aVar = this.f1523f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1524g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1520c = cursor;
        if (cursor != null) {
            C0019a aVar2 = this.f1523f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1524g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1522e = cursor.getColumnIndexOrThrow("_id");
            this.f1518a = true;
            notifyDataSetChanged();
        } else {
            this.f1522e = -1;
            this.f1518a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
