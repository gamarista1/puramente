package com.reactnativecommunity.picker;

import C7.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.reactnativecommunity.picker.j;
import e8.C3500a;
import java.io.IOException;
import java.util.Map;
import n7.C3863a;

public abstract class ReactPickerManager extends BaseViewManager<j, k> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BLUR_PICKER = 2;
    private static final ReadableArray EMPTY_ARRAY = Arguments.createArray();
    private static final int FOCUS_PICKER = 1;
    private static final int SET_NATIVE_SELECTED = 3;

    private static class a implements j.c, j.b {

        /* renamed from: a  reason: collision with root package name */
        private final j f59278a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f59279b;

        public a(j jVar, EventDispatcher eventDispatcher) {
            this.f59278a = jVar;
            this.f59279b = eventDispatcher;
        }

        public void a(int i10) {
            this.f59279b.h(new d(this.f59278a.getId(), i10));
        }

        public void b() {
            this.f59279b.h(new b(this.f59278a.getId()));
        }

        public void c() {
            this.f59279b.h(new c(this.f59278a.getId()));
        }
    }

    private static class b extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final LayoutInflater f59280a;

        /* renamed from: b  reason: collision with root package name */
        private int f59281b = 1;

        /* renamed from: c  reason: collision with root package name */
        private Integer f59282c;

        /* renamed from: d  reason: collision with root package name */
        private ReadableArray f59283d;

        public b(Context context, ReadableArray readableArray) {
            this.f59283d = readableArray;
            this.f59280a = (LayoutInflater) C3863a.c(context.getSystemService("layout_inflater"));
        }

        private View b(int i10, View view, ViewGroup viewGroup, boolean z10) {
            ReadableMap readableMap;
            boolean z11;
            Integer num;
            int i11;
            ReadableMap a10 = getItem(i10);
            if (a10.hasKey("style")) {
                readableMap = a10.getMap("style");
            } else {
                readableMap = null;
            }
            if (view == null) {
                if (z10) {
                    i11 = g.f59289a;
                } else {
                    i11 = g.f59290b;
                }
                view = this.f59280a.inflate(i11, viewGroup, false);
            }
            if (a10.hasKey("enabled")) {
                z11 = a10.getBoolean("enabled");
            } else {
                z11 = true;
            }
            view.setEnabled(z11);
            view.setClickable(!z11);
            TextView textView = (TextView) view;
            textView.setText(a10.getString("label"));
            textView.setMaxLines(this.f59281b);
            if (readableMap != null) {
                if (!readableMap.hasKey("backgroundColor") || readableMap.isNull("backgroundColor")) {
                    view.setBackgroundColor(0);
                } else {
                    view.setBackgroundColor(readableMap.getInt("backgroundColor"));
                }
                if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                    textView.setTextColor(readableMap.getInt("color"));
                }
                if (readableMap.hasKey("fontSize") && !readableMap.isNull("fontSize") && readableMap.getDouble("fontSize") > 0.1d) {
                    textView.setTextSize((float) readableMap.getDouble("fontSize"));
                }
                if (readableMap.hasKey("fontFamily") && !readableMap.isNull("fontFamily") && readableMap.getString("fontFamily").length() > 0) {
                    String str = "fonts/" + readableMap.getString("fontFamily") + ".ttf";
                    try {
                        view.getContext().getAssets().open(str);
                        textView.setTypeface(Typeface.createFromAsset(view.getContext().getAssets(), str));
                    } catch (IOException unused) {
                        textView.setTypeface(Typeface.create(readableMap.getString("fontFamily"), 0));
                    }
                }
            }
            if (!z10 && (num = this.f59282c) != null) {
                textView.setTextColor(num.intValue());
            } else if (a10.hasKey("color") && !a10.isNull("color")) {
                textView.setTextColor(a10.getInt("color"));
            }
            if (a10.hasKey("contentDescription") && !a10.isNull("contentDescription")) {
                textView.setContentDescription(a10.getString("contentDescription"));
            }
            if (a10.hasKey("fontFamily") && !a10.isNull("fontFamily")) {
                textView.setTypeface(Typeface.create(a10.getString("fontFamily"), 0));
            }
            if (com.facebook.react.modules.i18nmanager.a.f().i(view.getContext())) {
                view.setLayoutDirection(1);
                view.setTextDirection(4);
            } else {
                view.setLayoutDirection(0);
                view.setTextDirection(3);
            }
            return view;
        }

        /* renamed from: a */
        public ReadableMap getItem(int i10) {
            ReadableArray readableArray = this.f59283d;
            if (readableArray == null) {
                return null;
            }
            return readableArray.getMap(i10);
        }

        public void c(ReadableArray readableArray) {
            this.f59283d = readableArray;
            notifyDataSetChanged();
        }

        public void d(int i10) {
            this.f59281b = i10;
            notifyDataSetChanged();
        }

        public void e(Integer num) {
            this.f59282c = num;
            notifyDataSetChanged();
        }

        public int getCount() {
            ReadableArray readableArray = this.f59283d;
            if (readableArray == null) {
                return 0;
            }
            return readableArray.size();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            return b(i10, view, viewGroup, true);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return b(i10, view, viewGroup, false);
        }
    }

    public void blur(j jVar) {
        jVar.clearFocus();
    }

    public void focus(j jVar) {
        jVar.performClick();
    }

    public Map<String, Integer> getCommandsMap() {
        return d.f("focus", 1, "blur", 2, "setNativeSelected", 3);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return d.a().b("topSelect", d.d("phasedRegistrationNames", d.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b("topFocus", d.d("phasedRegistrationNames", d.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", d.d("phasedRegistrationNames", d.e("bubbled", "onBlur", "captured", "onBlurCapture"))).a();
    }

    public Class<? extends k> getShadowNodeClass() {
        return k.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        int i10;
        View view;
        j jVar = new j(context);
        b bVar = new b(context, readableMap2.getArray("items"));
        int i11 = readableMap2.getInt("numberOfLines");
        if (i11 > 0) {
            bVar.d(i11);
        }
        int i12 = readableMap2.getInt("selected");
        if (i12 < 0 || i12 >= bVar.getCount()) {
            i10 = (int) TypedValue.applyDimension(1, 50.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            if ("dropdown".equals(readableMap2.getString("mode"))) {
                view = bVar.getDropDownView(i12, (View) null, jVar);
            } else {
                view = bVar.getView(i12, (View) null, jVar);
            }
            jVar.i(view, View.MeasureSpec.makeMeasureSpec(jVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight();
        }
        return q.a(0.0f, G.f((float) i10));
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(j jVar, Integer num) {
        jVar.setPrimaryColor(num);
        b bVar = (b) jVar.getAdapter();
        if (bVar != null) {
            bVar.e(num);
        }
    }

    @C3500a(name = "dropdownIconColor")
    public void setDropdownIconColor(j jVar, int i10) {
        jVar.setDropdownIconColor(i10);
    }

    @C3500a(name = "dropdownIconRippleColor")
    public void setDropdownIconRippleColor(j jVar, int i10) {
        jVar.setDropdownIconRippleColor(i10);
    }

    @C3500a(defaultBoolean = true, name = "enabled")
    public void setEnabled(j jVar, boolean z10) {
        jVar.setEnabled(z10);
    }

    @C3500a(name = "items")
    public void setItems(j jVar, ReadableArray readableArray) {
        b bVar = (b) jVar.getAdapter();
        if (bVar == null) {
            b bVar2 = new b(jVar.getContext(), readableArray);
            bVar2.e(jVar.getPrimaryColor());
            jVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.c(readableArray);
    }

    public void setNativeSelected(j jVar, int i10) {
        jVar.setStagedSelection(i10);
    }

    @C3500a(defaultInt = 1, name = "numberOfLines")
    public void setNumberOfLines(j jVar, int i10) {
        b bVar = (b) jVar.getAdapter();
        if (bVar == null) {
            b bVar2 = new b(jVar.getContext(), EMPTY_ARRAY);
            bVar2.e(jVar.getPrimaryColor());
            bVar2.d(i10);
            jVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.d(i10);
    }

    @C3500a(name = "prompt")
    public void setPrompt(j jVar, String str) {
        jVar.setPrompt(str);
    }

    @C3500a(name = "selected")
    public void setSelected(j jVar, int i10) {
        jVar.setStagedSelection(i10);
    }

    public void updateExtraData(j jVar, Object obj) {
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, j jVar) {
        EventDispatcher c10 = n0.c(h0Var, jVar.getId());
        if (c10 != null) {
            a aVar = new a(jVar, c10);
            jVar.setOnSelectListener(aVar);
            jVar.setOnFocusListener(aVar);
        }
    }

    public k createShadowNodeInstance() {
        return new k();
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(j jVar) {
        super.onAfterUpdateTransaction(jVar);
        jVar.k();
    }

    public void receiveCommand(j jVar, String str, ReadableArray readableArray) {
        C3863a.c(jVar);
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3027047:
                if (str.equals("blur")) {
                    c10 = 0;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c10 = 1;
                    break;
                }
                break;
            case 361157844:
                if (str.equals("setNativeSelected")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                blur(jVar);
                return;
            case 1:
                focus(jVar);
                return;
            case 2:
                C3863a.c(readableArray);
                setNativeSelected(jVar, readableArray.getInt(0));
                return;
            default:
                return;
        }
    }

    @C3500a(name = "backgroundColor")
    public void setBackgroundColor(j jVar, int i10) {
        jVar.setBackgroundColor(i10);
    }

    public Object updateState(j jVar, W w10, C3413g0 g0Var) {
        jVar.setStateWrapper(g0Var);
        return null;
    }
}
