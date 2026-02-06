package D1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f1529i;

    /* renamed from: j  reason: collision with root package name */
    private int f1530j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f1531k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f1530j = i10;
        this.f1529i = i10;
        this.f1531k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1531k.inflate(this.f1530j, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1531k.inflate(this.f1529i, viewGroup, false);
    }
}
