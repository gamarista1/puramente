package D1;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f1528a;

    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    b(a aVar) {
        this.f1528a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1528a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c10 = this.f1528a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c10 != null) {
            filterResults.count = c10.getCount();
            filterResults.values = c10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d10 = this.f1528a.d();
        Object obj = filterResults.values;
        if (obj != null && obj != d10) {
            this.f1528a.a((Cursor) obj);
        }
    }
}
