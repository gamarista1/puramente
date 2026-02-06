package androidx.appcompat.widget;

import D1.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import i.C2037a;
import i.C2042f;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

class a0 extends c implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    private final SearchView f11770l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchableInfo f11771m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f11772n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap f11773o;

    /* renamed from: p  reason: collision with root package name */
    private final int f11774p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11775q = false;

    /* renamed from: r  reason: collision with root package name */
    private int f11776r = 1;

    /* renamed from: s  reason: collision with root package name */
    private ColorStateList f11777s;

    /* renamed from: t  reason: collision with root package name */
    private int f11778t = -1;

    /* renamed from: u  reason: collision with root package name */
    private int f11779u = -1;

    /* renamed from: v  reason: collision with root package name */
    private int f11780v = -1;

    /* renamed from: w  reason: collision with root package name */
    private int f11781w = -1;

    /* renamed from: x  reason: collision with root package name */
    private int f11782x = -1;

    /* renamed from: y  reason: collision with root package name */
    private int f11783y = -1;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f11784a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f11785b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f11786c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f11787d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f11788e;

        public a(View view) {
            this.f11784a = (TextView) view.findViewById(16908308);
            this.f11785b = (TextView) view.findViewById(16908309);
            this.f11786c = (ImageView) view.findViewById(16908295);
            this.f11787d = (ImageView) view.findViewById(16908296);
            this.f11788e = (ImageView) view.findViewById(C2042f.f21385r);
        }
    }

    public a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f11770l = searchView;
        this.f11771m = searchableInfo;
        this.f11774p = searchView.getSuggestionCommitIconResId();
        this.f11772n = context;
        this.f11773o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f11773o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11773o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f11777s == null) {
            TypedValue typedValue = new TypedValue();
            this.f11772n.getTheme().resolveAttribute(C2037a.f21255J, typedValue, true);
            this.f11777s = this.f11772n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f11777s, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f11772n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f11773o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f11773o.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f11772n.getResources());
        }
        Drawable m10 = m(componentName);
        if (m10 != null) {
            constantState = m10.getConstantState();
        }
        this.f11773o.put(flattenToShortString, constantState);
        return m10;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f11771m.getSearchActivity());
        if (n10 != null) {
            return n10;
        }
        return this.f11772n.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r7 = r6.r(r7)     // Catch:{ NotFoundException -> 0x0018 }
            return r7
        L_0x0016:
            r0 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x002f:
            android.content.Context r3 = r6.f11772n     // Catch:{ FileNotFoundException -> 0x0016 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x0070
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0057 }
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0056
        L_0x0043:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0056:
            return r4
        L_0x0057:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x006f
        L_0x005c:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x006f:
            throw r4     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0070:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0087:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f11772n.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable drawable = androidx.core.content.c.getDrawable(this.f11772n, parseInt);
            A(str2, drawable);
            return drawable;
        } catch (NumberFormatException unused) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f11781w;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        if (s10 != null) {
            return s10;
        }
        return p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f11782x;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public void a(Cursor cursor) {
        if (this.f11775q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f11778t = cursor.getColumnIndex("suggest_text_1");
                this.f11779u = cursor.getColumnIndex("suggest_text_2");
                this.f11780v = cursor.getColumnIndex("suggest_text_2_url");
                this.f11781w = cursor.getColumnIndex("suggest_icon_1");
                this.f11782x = cursor.getColumnIndex("suggest_icon_2");
                this.f11783y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public CharSequence b(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (this.f11771m.shouldRewriteQueryFromData() && (o11 = o(cursor, "suggest_intent_data")) != null) {
            return o11;
        }
        if (!this.f11771m.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o10;
    }

    public Cursor c(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f11770l.getVisibility() == 0 && this.f11770l.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f11771m, str, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    public void e(View view, Context context, Cursor cursor) {
        int i10;
        CharSequence charSequence;
        a aVar = (a) view.getTag();
        int i11 = this.f11783y;
        if (i11 != -1) {
            i10 = cursor.getInt(i11);
        } else {
            i10 = 0;
        }
        if (aVar.f11784a != null) {
            z(aVar.f11784a, w(cursor, this.f11778t));
        }
        if (aVar.f11785b != null) {
            String w10 = w(cursor, this.f11780v);
            if (w10 != null) {
                charSequence = l(w10);
            } else {
                charSequence = w(cursor, this.f11779u);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f11784a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f11784a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f11784a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f11784a.setMaxLines(1);
                }
            }
            z(aVar.f11785b, charSequence);
        }
        ImageView imageView = aVar.f11786c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f11787d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f11776r;
        if (i12 == 2 || (i12 == 1 && (i10 & 1) != 0)) {
            aVar.f11788e.setVisibility(0);
            aVar.f11788e.setTag(aVar.f11784a.getText());
            aVar.f11788e.setOnClickListener(this);
            return;
        }
        aVar.f11788e.setVisibility(8);
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f11772n, d(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f11784a.setText(e10.toString());
            }
            return g10;
        }
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View h10 = h(this.f11772n, d(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f11784a.setText(e10.toString());
            }
            return h10;
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(C2042f.f21385r)).setImageResource(this.f11774p);
        return h10;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f11770l.U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable r(Uri uri) {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f11772n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f11772n.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void x(int i10) {
        this.f11776r = i10;
    }
}
