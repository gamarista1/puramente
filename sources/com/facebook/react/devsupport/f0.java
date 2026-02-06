package com.facebook.react.devsupport;

import I7.i;
import I7.j;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.react.C3367m;
import com.facebook.react.C3369o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import n7.C3863a;
import org.json.JSONObject;
import rh.C;
import rh.C6703A;
import rh.D;
import rh.y;

public class f0 extends LinearLayout implements AdapterView.OnItemClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public I7.e f40789a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f40790b;

    /* renamed from: c  reason: collision with root package name */
    private Button f40791c;

    /* renamed from: d  reason: collision with root package name */
    private Button f40792d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40793e = false;

    /* renamed from: f  reason: collision with root package name */
    private i.a f40794f = new a();

    /* renamed from: g  reason: collision with root package name */
    private View.OnClickListener f40795g = new b();

    class a implements i.a {
        a() {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            i unused = f0.this.getClass();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((I7.e) C3863a.c(f0.this.f40789a)).z();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            ((I7.e) C3863a.c(f0.this.f40789a)).p();
        }
    }

    private static class e extends AsyncTask {

        /* renamed from: b  reason: collision with root package name */
        private static final y f40800b = y.g("application/json; charset=utf-8");

        /* renamed from: a  reason: collision with root package name */
        private final I7.e f40801a;

        private static JSONObject b(j jVar) {
            return new JSONObject(C7.d.g("file", jVar.getFile(), "methodName", jVar.b(), "lineNumber", Integer.valueOf(jVar.a()), "column", Integer.valueOf(jVar.getColumn())));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(j... jVarArr) {
            try {
                String uri = Uri.parse(this.f40801a.u()).buildUpon().path("/open-stack-frame").query((String) null).build().toString();
                C6703A a10 = new C6703A();
                for (j b10 : jVarArr) {
                    FirebasePerfOkHttpClient.execute(a10.a(new C.a().l(uri).h(D.create(f40800b, b(b10).toString())).b()));
                }
            } catch (Exception e10) {
                U5.a.n("ReactNative", "Could not open stack frame", e10);
            }
            return null;
        }

        private e(I7.e eVar) {
            this.f40801a = eVar;
        }
    }

    private static class f extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final String f40802a;

        /* renamed from: b  reason: collision with root package name */
        private final j[] f40803b;

        private static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public final TextView f40804a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final TextView f40805b;

            private a(View view) {
                this.f40804a = (TextView) view.findViewById(C3367m.f40946v);
                this.f40805b = (TextView) view.findViewById(C3367m.f40945u);
            }
        }

        public f(String str, j[] jVarArr) {
            this.f40802a = str;
            this.f40803b = jVarArr;
            C3863a.c(str);
            C3863a.c(jVarArr);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public int getCount() {
            return this.f40803b.length + 1;
        }

        public Object getItem(int i10) {
            if (i10 == 0) {
                return this.f40802a;
            }
            return this.f40803b[i10 - 1];
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public int getItemViewType(int i10) {
            return i10 == 0 ? 0 : 1;
        }

        /* JADX WARNING: type inference failed for: r3v13, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L_0x002b
                if (r4 == 0) goto L_0x0008
                android.widget.TextView r4 = (android.widget.TextView) r4
                goto L_0x0019
            L_0x0008:
                android.content.Context r3 = r5.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                int r4 = com.facebook.react.C3369o.f41136f
                android.view.View r3 = r3.inflate(r4, r5, r0)
                r4 = r3
                android.widget.TextView r4 = (android.widget.TextView) r4
            L_0x0019:
                java.lang.String r3 = r2.f40802a
                if (r3 != 0) goto L_0x001f
                java.lang.String r3 = "<unknown title>"
            L_0x001f:
                java.lang.String r5 = "\\x1b\\[[0-9;]*m"
                java.lang.String r0 = ""
                java.lang.String r3 = r3.replaceAll(r5, r0)
                r4.setText(r3)
                return r4
            L_0x002b:
                if (r4 != 0) goto L_0x0044
                android.content.Context r4 = r5.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r1 = com.facebook.react.C3369o.f41135e
                android.view.View r4 = r4.inflate(r1, r5, r0)
                com.facebook.react.devsupport.f0$f$a r5 = new com.facebook.react.devsupport.f0$f$a
                r0 = 0
                r5.<init>(r4)
                r4.setTag(r5)
            L_0x0044:
                I7.j[] r5 = r2.f40803b
                int r3 = r3 + -1
                r3 = r5[r3]
                java.lang.Object r5 = r4.getTag()
                com.facebook.react.devsupport.f0$f$a r5 = (com.facebook.react.devsupport.f0.f.a) r5
                android.widget.TextView r0 = r5.f40804a
                java.lang.String r1 = r3.b()
                r0.setText(r1)
                android.widget.TextView r0 = r5.f40805b
                java.lang.String r1 = com.facebook.react.devsupport.l0.c(r3)
                r0.setText(r1)
                android.widget.TextView r0 = r5.f40804a
                boolean r1 = r3.c()
                if (r1 == 0) goto L_0x0074
                r1 = -5592406(0xffffffffffaaaaaa, float:NaN)
                goto L_0x0075
            L_0x0074:
                r1 = -1
            L_0x0075:
                r0.setTextColor(r1)
                android.widget.TextView r5 = r5.f40805b
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x0086
                r3 = -8355712(0xffffffffff808080, float:NaN)
                goto L_0x0089
            L_0x0086:
                r3 = -5000269(0xffffffffffb3b3b3, float:NaN)
            L_0x0089:
                r5.setTextColor(r3)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.f0.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i10) {
            return i10 > 0;
        }
    }

    public f0(Context context) {
        super(context);
    }

    public void c() {
        LayoutInflater.from(getContext()).inflate(C3369o.f41137g, this);
        ListView listView = (ListView) findViewById(C3367m.f40949y);
        this.f40790b = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(C3367m.f40948x);
        this.f40791c = button;
        button.setOnClickListener(new c());
        Button button2 = (Button) findViewById(C3367m.f40947w);
        this.f40792d = button2;
        button2.setOnClickListener(new d());
    }

    public void d() {
        String m10 = this.f40789a.m();
        j[] x10 = this.f40789a.x();
        this.f40789a.s();
        Pair q10 = this.f40789a.q(Pair.create(m10, x10));
        f((String) q10.first, (j[]) q10.second);
        this.f40789a.v();
    }

    public f0 e(I7.e eVar) {
        this.f40789a = eVar;
        return this;
    }

    public void f(String str, j[] jVarArr) {
        this.f40790b.setAdapter(new f(str, jVarArr));
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        new e((I7.e) C3863a.c(this.f40789a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new j[]{(j) this.f40790b.getAdapter().getItem(i10)});
    }

    public f0 g(i iVar) {
        return this;
    }
}
