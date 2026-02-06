package Fe;

import Fe.C3016e;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class S {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static int f30945p = 100;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static int f30946q = 2;

    /* renamed from: a  reason: collision with root package name */
    C3012a f30947a;

    /* renamed from: b  reason: collision with root package name */
    C3016e.C0512e f30948b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List f30949c;

    /* renamed from: d  reason: collision with root package name */
    private Intent f30950d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f30951e = Color.argb(60, 17, 4, 56);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f30952f = Color.argb(20, 17, 4, 56);

    /* renamed from: g  reason: collision with root package name */
    Context f30953g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f30954h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f30955i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f30956j = 50;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C3028q f30957k;

    /* renamed from: l  reason: collision with root package name */
    final int f30958l = 5;

    /* renamed from: m  reason: collision with root package name */
    final int f30959m = 100;

    /* renamed from: n  reason: collision with root package name */
    private List f30960n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private List f30961o = new ArrayList();

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f30962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f30963b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListView f30964c;

        a(List list, e eVar, ListView listView) {
            this.f30962a = list;
            this.f30963b = eVar;
            this.f30964c = listView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            String str;
            if (view != null) {
                if (view.getTag() instanceof g) {
                    List unused = S.this.f30949c = this.f30962a;
                    this.f30963b.notifyDataSetChanged();
                } else if (view.getTag() instanceof ResolveInfo) {
                    ResolveInfo resolveInfo = (ResolveInfo) view.getTag();
                    S s10 = S.this;
                    if (s10.f30948b != null) {
                        PackageManager packageManager = s10.f30953g.getPackageManager();
                        if (S.this.f30953g == null || resolveInfo.loadLabel(packageManager) == null) {
                            str = "";
                        } else {
                            str = resolveInfo.loadLabel(packageManager).toString();
                        }
                        S.this.f30957k.w().i(resolveInfo.loadLabel(packageManager).toString());
                        S.this.f30948b.d(str);
                    }
                    this.f30963b.f30973a = i10 - this.f30964c.getHeaderViewsCount();
                    this.f30963b.notifyDataSetChanged();
                    S.this.u(resolveInfo);
                    C3012a aVar = S.this.f30947a;
                    if (aVar != null) {
                        aVar.cancel();
                    }
                }
            }
        }
    }

    class b implements DialogInterface.OnDismissListener {
        b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C3016e.C0512e eVar = S.this.f30948b;
            if (eVar != null) {
                eVar.a();
                S.this.f30948b = null;
            }
            if (!S.this.f30954h) {
                S s10 = S.this;
                s10.f30953g = null;
                C3028q unused = s10.f30957k = null;
            }
            S.this.f30947a = null;
        }
    }

    class c implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f30967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListView f30968b;

        c(e eVar, ListView listView) {
            this.f30967a = eVar;
            this.f30968b = listView;
        }

        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i10 == 4) {
                S.this.f30947a.dismiss();
            } else if (i10 == 23 || i10 == 66) {
                e eVar = this.f30967a;
                int i11 = eVar.f30973a;
                if (i11 < 0 || i11 >= eVar.getCount()) {
                    return false;
                }
                ListView listView = this.f30968b;
                e eVar2 = this.f30967a;
                View view = eVar2.getView(eVar2.f30973a, (View) null, (ViewGroup) null);
                int i12 = this.f30967a.f30973a;
                listView.performItemClick(view, i12, this.f30968b.getItemIdAtPosition(i12));
                return false;
            } else if (i10 == 19) {
                e eVar3 = this.f30967a;
                int i13 = eVar3.f30973a;
                if (i13 > 0) {
                    eVar3.f30973a = i13 - 1;
                    eVar3.notifyDataSetChanged();
                }
            } else if (i10 != 20) {
                return false;
            } else {
                e eVar4 = this.f30967a;
                if (eVar4.f30973a < eVar4.getCount() - 1) {
                    e eVar5 = this.f30967a;
                    eVar5.f30973a++;
                    eVar5.notifyDataSetChanged();
                }
            }
            return true;
        }
    }

    class d implements C3016e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ResolveInfo f30970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30971b;

        d(ResolveInfo resolveInfo, String str) {
            this.f30970a = resolveInfo;
            this.f30971b = str;
        }

        public void a(String str, C3020i iVar) {
            if (iVar == null) {
                S.this.w(this.f30970a, str, this.f30971b);
                return;
            }
            String i10 = S.this.f30957k.i();
            if (i10 == null || i10.trim().length() <= 0) {
                C3016e.C0512e eVar = S.this.f30948b;
                if (eVar != null) {
                    eVar.c(str, this.f30971b, iVar);
                } else {
                    C3023l.l("Unable to share link " + iVar.b());
                }
                if (iVar.a() == -113 || iVar.a() == -117) {
                    S.this.w(this.f30970a, str, this.f30971b);
                    return;
                }
                S.this.p(false);
                boolean unused = S.this.f30954h = false;
                return;
            }
            S.this.w(this.f30970a, i10, this.f30971b);
        }
    }

    private class f extends ResolveInfo {
        private f() {
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return S.this.f30957k.h();
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return S.this.f30957k.g();
        }

        /* synthetic */ f(S s10, a aVar) {
            this();
        }
    }

    private class g extends ResolveInfo {
        private g() {
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return S.this.f30957k.p();
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return S.this.f30957k.q();
        }

        /* synthetic */ g(S s10, a aVar) {
            this();
        }
    }

    private class h extends TextView {

        /* renamed from: a  reason: collision with root package name */
        Context f30977a;

        /* renamed from: b  reason: collision with root package name */
        int f30978b;

        public h(Context context) {
            super(context);
            int i10;
            this.f30977a = context;
            setPadding(100, 5, 5, 5);
            setGravity(8388627);
            setMinWidth(this.f30977a.getResources().getDisplayMetrics().widthPixels);
            if (S.this.f30956j != 0) {
                i10 = C3031u.c(context, S.this.f30956j);
            } else {
                i10 = 0;
            }
            this.f30978b = i10;
        }

        public void a(String str, Drawable drawable, boolean z10) {
            setText("\t" + str);
            setTag(str);
            if (drawable == null) {
                setTextAppearance(this.f30977a, 16973890);
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                int i10 = this.f30978b;
                if (i10 != 0) {
                    drawable.setBounds(0, 0, i10, i10);
                    setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                setTextAppearance(this.f30977a, 16973892);
                int unused = S.f30945p = Math.max(S.f30945p, (drawable.getCurrent().getBounds().centerY() * S.f30946q) + 5);
            }
            setMinHeight(S.f30945p);
            setTextColor(this.f30977a.getResources().getColor(17170444));
            if (z10) {
                setBackgroundColor(S.this.f30951e);
            } else {
                setBackgroundColor(S.this.f30952f);
            }
        }
    }

    S() {
    }

    private void o(String str, String str2) {
        ((ClipboardManager) this.f30953g.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        Toast.makeText(this.f30953g, this.f30957k.y(), 0).show();
    }

    private void q(List list) {
        ListView listView;
        List<ResolveInfo> queryIntentActivities = this.f30953g.getPackageManager().queryIntentActivities(this.f30950d, 65536);
        ArrayList arrayList = new ArrayList(s(queryIntentActivities));
        List t10 = t(queryIntentActivities, list);
        arrayList.removeAll(t10);
        arrayList.addAll(0, t10);
        arrayList.add(new f(this, (a) null));
        t10.add(new f(this, (a) null));
        r(arrayList);
        if (t10.size() > 1) {
            if (arrayList.size() > t10.size()) {
                t10.add(new g(this, (a) null));
            }
            this.f30949c = t10;
        } else {
            this.f30949c = arrayList;
        }
        e eVar = new e(this, (a) null);
        if (this.f30955i > 1) {
            listView = new ListView(this.f30953g, (AttributeSet) null, 0, this.f30955i);
        } else {
            listView = new ListView(this.f30953g);
        }
        listView.setHorizontalFadingEdgeEnabled(false);
        listView.setBackgroundColor(-1);
        listView.setSelector(new ColorDrawable(0));
        if (this.f30957k.v() != null) {
            listView.addHeaderView(this.f30957k.v(), (Object) null, false);
        } else if (!TextUtils.isEmpty(this.f30957k.u())) {
            TextView textView = new TextView(this.f30953g);
            textView.setText(this.f30957k.u());
            textView.setBackgroundColor(this.f30952f);
            textView.setTextColor(this.f30952f);
            textView.setTextAppearance(this.f30953g, 16973892);
            textView.setTextColor(this.f30953g.getResources().getColor(17170432));
            textView.setPadding(100, 5, 5, 5);
            listView.addHeaderView(textView, (Object) null, false);
        }
        listView.setAdapter(eVar);
        if (this.f30957k.k() >= 0) {
            listView.setDividerHeight(this.f30957k.k());
        } else if (this.f30957k.o()) {
            listView.setDividerHeight(0);
        }
        listView.setOnItemClickListener(new a(arrayList, eVar, listView));
        if (this.f30957k.j() > 0) {
            this.f30947a = new C3012a(this.f30953g, this.f30957k.j());
        } else {
            this.f30947a = new C3012a(this.f30953g, this.f30957k.o());
        }
        this.f30947a.setContentView(listView);
        this.f30947a.show();
        C3016e.C0512e eVar2 = this.f30948b;
        if (eVar2 != null) {
            eVar2.b();
        }
        this.f30947a.setOnDismissListener(new b());
        this.f30947a.setOnKeyListener(new c(eVar, listView));
    }

    private void r(List list) {
        ActivityInfo activityInfo;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (!(resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || !this.f30961o.contains(activityInfo.packageName))) {
                it.remove();
            }
        }
    }

    private List s(List list) {
        ArrayList arrayList = new ArrayList();
        if (this.f30960n.size() <= 0) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (this.f30960n.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    private List t(List list, List list2) {
        ActivityInfo activityInfo;
        T t10;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (!(resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null)) {
                String str = activityInfo.packageName;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = (T) it2.next();
                    if (str.toLowerCase().contains(t10.toString().toLowerCase())) {
                        break;
                    }
                }
                if (t10 != null) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void u(ResolveInfo resolveInfo) {
        this.f30954h = true;
        this.f30957k.w().e(new d(resolveInfo, resolveInfo.loadLabel(this.f30953g.getPackageManager()).toString()));
    }

    /* access modifiers changed from: private */
    public void w(ResolveInfo resolveInfo, String str, String str2) {
        C3016e.C0512e eVar = this.f30948b;
        if (eVar != null) {
            eVar.c(str, str2, (C3020i) null);
        } else {
            C3023l.l("Shared link with " + str2);
        }
        if (resolveInfo instanceof f) {
            o(str, this.f30957k.s());
            return;
        }
        this.f30950d.setPackage(resolveInfo.activityInfo.packageName);
        String t10 = this.f30957k.t();
        String s10 = this.f30957k.s();
        if (t10 != null && t10.trim().length() > 0) {
            this.f30950d.putExtra("android.intent.extra.SUBJECT", t10);
        }
        Intent intent = this.f30950d;
        intent.putExtra("android.intent.extra.TEXT", s10 + "\n" + str);
        this.f30953g.startActivity(this.f30950d);
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        C3012a aVar = this.f30947a;
        if (aVar != null && aVar.isShowing()) {
            if (z10) {
                this.f30947a.cancel();
            } else {
                this.f30947a.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Dialog v(C3028q qVar) {
        this.f30957k = qVar;
        this.f30953g = qVar.d();
        this.f30948b = qVar.e();
        qVar.f();
        Intent intent = new Intent("android.intent.action.SEND");
        this.f30950d = intent;
        intent.setType("text/plain");
        this.f30955i = qVar.x();
        this.f30960n = qVar.n();
        this.f30961o = qVar.l();
        this.f30956j = qVar.m();
        try {
            q(qVar.r());
        } catch (Exception e10) {
            C3023l.b("Caught Exception" + e10.getMessage());
            C3016e.C0512e eVar = this.f30948b;
            if (eVar != null) {
                eVar.c((String) null, (String) null, new C3020i("Trouble sharing link", -110));
            } else {
                C3023l.m("Unable create share options. Couldn't find applications on device to share the link.");
            }
        }
        return this.f30947a;
    }

    private class e extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f30973a;

        private e() {
            this.f30973a = -1;
        }

        public int getCount() {
            return S.this.f30949c.size();
        }

        public Object getItem(int i10) {
            return S.this.f30949c.get(i10);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            h hVar;
            boolean z10;
            if (view == null) {
                S s10 = S.this;
                hVar = new h(s10.f30953g);
            } else {
                hVar = (h) view;
            }
            ResolveInfo resolveInfo = (ResolveInfo) S.this.f30949c.get(i10);
            if (i10 == this.f30973a) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.a(resolveInfo.loadLabel(S.this.f30953g.getPackageManager()).toString(), resolveInfo.loadIcon(S.this.f30953g.getPackageManager()), z10);
            hVar.setTag(resolveInfo);
            return hVar;
        }

        public boolean isEnabled(int i10) {
            if (this.f30973a < 0) {
                return true;
            }
            return false;
        }

        /* synthetic */ e(S s10, a aVar) {
            this();
        }
    }
}
