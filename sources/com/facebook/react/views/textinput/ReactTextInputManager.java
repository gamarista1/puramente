package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.scroll.j;
import com.facebook.react.views.scroll.k;
import com.facebook.react.views.text.g;
import com.facebook.react.views.text.l;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.r;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import e8.C3500a;
import e8.C3501b;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import j8.f;
import j8.m;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import n7.C3863a;
import r0.C2502j0;
import r0.C2505k0;
import s8.q;

@Q7.a(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager<C3443j, C3428v> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected l mReactTextViewManagerCallback;

    class a extends HashMap {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    private static class b implements C3434a {

        /* renamed from: a  reason: collision with root package name */
        private final C3443j f42246a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f42247b;

        /* renamed from: c  reason: collision with root package name */
        private final int f42248c;

        /* renamed from: d  reason: collision with root package name */
        private int f42249d = 0;

        /* renamed from: e  reason: collision with root package name */
        private int f42250e = 0;

        public b(C3443j jVar) {
            this.f42246a = jVar;
            ReactContext d10 = n0.d(jVar);
            this.f42247b = ReactTextInputManager.getEventDispatcher(d10, jVar);
            this.f42248c = n0.e(d10);
        }

        public void a() {
            if (this.f42247b != null) {
                int width = this.f42246a.getWidth();
                int height = this.f42246a.getHeight();
                if (this.f42246a.getLayout() != null) {
                    width = this.f42246a.getCompoundPaddingLeft() + this.f42246a.getLayout().getWidth() + this.f42246a.getCompoundPaddingRight();
                    height = this.f42246a.getCompoundPaddingTop() + this.f42246a.getLayout().getHeight() + this.f42246a.getCompoundPaddingBottom();
                }
                if (width != this.f42249d || height != this.f42250e) {
                    this.f42250e = height;
                    this.f42249d = width;
                    this.f42247b.h(new C3435b(this.f42248c, this.f42246a.getId(), G.f((float) width), G.f((float) height)));
                }
            }
        }
    }

    private static class c implements J {

        /* renamed from: a  reason: collision with root package name */
        private final C3443j f42251a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f42252b;

        /* renamed from: c  reason: collision with root package name */
        private final int f42253c;

        /* renamed from: d  reason: collision with root package name */
        private int f42254d;

        /* renamed from: e  reason: collision with root package name */
        private int f42255e;

        public c(C3443j jVar) {
            this.f42251a = jVar;
            ReactContext d10 = n0.d(jVar);
            this.f42252b = ReactTextInputManager.getEventDispatcher(d10, jVar);
            this.f42253c = n0.e(d10);
        }

        public void a(int i10, int i11, int i12, int i13) {
            if (this.f42254d != i10 || this.f42255e != i11) {
                this.f42252b.h(j.d(this.f42253c, this.f42251a.getId(), k.SCROLL, (float) i10, (float) i11, 0.0f, 0.0f, 0, 0, this.f42251a.getWidth(), this.f42251a.getHeight()));
                this.f42254d = i10;
                this.f42255e = i11;
            }
        }
    }

    private static class d implements K {

        /* renamed from: a  reason: collision with root package name */
        private final C3443j f42256a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f42257b;

        /* renamed from: c  reason: collision with root package name */
        private final int f42258c;

        /* renamed from: d  reason: collision with root package name */
        private int f42259d;

        /* renamed from: e  reason: collision with root package name */
        private int f42260e;

        public d(C3443j jVar) {
            this.f42256a = jVar;
            ReactContext d10 = n0.d(jVar);
            this.f42257b = ReactTextInputManager.getEventDispatcher(d10, jVar);
            this.f42258c = n0.e(d10);
        }

        public void a(int i10, int i11) {
            int min = Math.min(i10, i11);
            int max = Math.max(i10, i11);
            if (this.f42259d != min || this.f42260e != max) {
                this.f42257b.h(new G(this.f42258c, this.f42256a.getId(), min, max));
                this.f42259d = min;
                this.f42260e = max;
            }
        }
    }

    private final class e implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private final C3443j f42261a;

        /* renamed from: b  reason: collision with root package name */
        private final EventDispatcher f42262b;

        /* renamed from: c  reason: collision with root package name */
        private final int f42263c;

        /* renamed from: d  reason: collision with root package name */
        private String f42264d = null;

        public e(ReactContext reactContext, C3443j jVar) {
            this.f42262b = ReactTextInputManager.getEventDispatcher(reactContext, jVar);
            this.f42261a = jVar;
            this.f42263c = n0.e(reactContext);
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f42264d = charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!this.f42261a.f42290h0) {
                if (i12 != 0 || i11 != 0) {
                    C3863a.c(this.f42264d);
                    String substring = charSequence.toString().substring(i10, i10 + i12);
                    String substring2 = this.f42264d.substring(i10, i10 + i11);
                    if (i12 != i11 || !substring.equals(substring2)) {
                        C3413g0 stateWrapper = this.f42261a.getStateWrapper();
                        if (stateWrapper != null) {
                            WritableNativeMap writableNativeMap = new WritableNativeMap();
                            writableNativeMap.putInt("mostRecentEventCount", this.f42261a.z());
                            writableNativeMap.putInt("opaqueCacheId", this.f42261a.getId());
                            stateWrapper.updateState(writableNativeMap);
                        }
                        this.f42262b.h(new m(this.f42263c, this.f42261a.getId(), charSequence.toString(), this.f42261a.z()));
                    }
                }
            }
        }
    }

    private static void checkPasswordType(C3443j jVar) {
        if ((jVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (jVar.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(jVar, 128, 16);
        }
    }

    /* access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, C3443j jVar) {
        return n0.c(reactContext, jVar.getId());
    }

    private g getReactTextUpdate(String str, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(r.b(str, r.UNSET));
        return new g(spannableStringBuilder, i10, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addEventEmitters$0(C3415h0 h0Var, C3443j jVar, View view, boolean z10) {
        int c10 = h0Var.c();
        EventDispatcher eventDispatcher = getEventDispatcher(h0Var, jVar);
        if (z10) {
            eventDispatcher.h(new p(c10, jVar.getId()));
            return;
        }
        eventDispatcher.h(new n(c10, jVar.getId()));
        eventDispatcher.h(new o(c10, jVar.getId(), jVar.getText().toString()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(C3443j jVar, C3415h0 h0Var, TextView textView, int i10, KeyEvent keyEvent) {
        if ((i10 & 255) == 0 && i10 != 0) {
            return true;
        }
        boolean A10 = jVar.A();
        boolean X10 = jVar.X();
        boolean W10 = jVar.W();
        if (X10) {
            getEventDispatcher(h0Var, jVar).h(new I(h0Var.c(), jVar.getId(), jVar.getText().toString()));
        }
        if (W10) {
            jVar.clearFocus();
        }
        if (W10 || X10 || !A10 || i10 == 5 || i10 == 7) {
            return true;
        }
        return false;
    }

    private void setAutofillHints(C3443j jVar, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            jVar.setAutofillHints(strArr);
        }
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        if (Build.VERSION.SDK_INT != 29 || !lowerCase.contains(Constants.REFERRER_API_XIAOMI)) {
            return false;
        }
        return true;
    }

    private static void updateStagedInputTypeFlag(C3443j jVar, int i10, int i11) {
        jVar.setStagedInputType(((~i10) & jVar.getStagedInputType()) | i11);
    }

    public Map<String, Integer> getCommandsMap() {
        return C7.d.e("focusTextInput", 1, "blurTextInput", 2);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(C7.d.a().b("topSubmitEditing", C7.d.d("phasedRegistrationNames", C7.d.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", C7.d.d("phasedRegistrationNames", C7.d.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topFocus", C7.d.d("phasedRegistrationNames", C7.d.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", C7.d.d("phasedRegistrationNames", C7.d.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", C7.d.d("phasedRegistrationNames", C7.d.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(C7.d.a().b(k.b(k.SCROLL), C7.d.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    public Map<String, Object> getExportedViewConstants() {
        return C7.d.d("AutoCapitalizationType", C7.d.g("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C3428v> getShadowNodeClass() {
        return H.class;
    }

    @C3500a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C3443j jVar, boolean z10) {
        jVar.setAllowFontScaling(z10);
    }

    @C3500a(name = "autoCapitalize")
    public void setAutoCapitalize(C3443j jVar, Dynamic dynamic) {
        int i10 = 0;
        if (dynamic.getType() == ReadableType.Number) {
            i10 = dynamic.asInt();
        } else {
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                asString.hashCode();
                char c10 = 65535;
                switch (asString.hashCode()) {
                    case 3387192:
                        if (asString.equals("none")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 113318569:
                        if (asString.equals("words")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 490141296:
                        if (asString.equals("sentences")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1245424234:
                        if (asString.equals("characters")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        break;
                    case 1:
                        i10 = 8192;
                        break;
                    case 3:
                        i10 = 4096;
                        break;
                }
            }
            i10 = 16384;
        }
        updateStagedInputTypeFlag(jVar, AUTOCAPITALIZE_FLAGS, i10);
    }

    @C3500a(name = "autoCorrect")
    public void setAutoCorrect(C3443j jVar, Boolean bool) {
        int i10;
        if (bool == null) {
            i10 = 0;
        } else if (bool.booleanValue()) {
            i10 = 32768;
        } else {
            i10 = 524288;
        }
        updateStagedInputTypeFlag(jVar, 557056, i10);
    }

    @C3500a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C3443j jVar, boolean z10) {
        jVar.setAutoFocus(z10);
    }

    @C3501b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C3443j jVar, int i10, Integer num) {
        C3400a.q(jVar, m.f44918b, num);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3443j jVar, int i10, float f10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(jVar, j8.d.values()[i10], xVar);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(C3443j jVar, String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(jVar, fVar);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C3443j jVar, int i10, float f10) {
        C3400a.t(jVar, m.values()[i10], Float.valueOf(f10));
    }

    @C3500a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C3443j jVar, boolean z10) {
        if (jVar.getStagedInputType() != 32 || !shouldHideCursorForEmailTextInput()) {
            jVar.setCursorVisible(!z10);
        }
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(C3443j jVar, Integer num) {
        String str;
        if (num == null) {
            ColorStateList b10 = com.facebook.react.views.text.a.b(jVar.getContext());
            if (b10 != null) {
                jVar.setTextColor(b10);
                return;
            }
            Context context = jVar.getContext();
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get default text color from View Context: ");
            if (context != null) {
                str = context.getClass().getCanonicalName();
            } else {
                str = "null";
            }
            sb2.append(str);
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException(sb2.toString()));
            return;
        }
        jVar.setTextColor(num.intValue());
    }

    @C3500a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C3443j jVar, boolean z10) {
        jVar.setContextMenuHidden(z10);
    }

    @C3500a(customType = "Color", name = "cursorColor")
    public void setCursorColor(C3443j jVar, Integer num) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Drawable a10 = jVar.getTextCursorDrawable();
            if (a10 != null) {
                if (num != null) {
                    C2505k0.a();
                    a10.setColorFilter(C2502j0.a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    a10.clearColorFilter();
                }
                jVar.setTextCursorDrawable(a10);
            }
        } else if (i10 != 28) {
            try {
                Field declaredField = jVar.getClass().getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i11 = declaredField.getInt(jVar);
                if (i11 != 0) {
                    Drawable mutate = androidx.core.content.c.getDrawable(jVar.getContext(), i11).mutate();
                    if (num != null) {
                        mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                    } else {
                        mutate.clearColorFilter();
                    }
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(jVar);
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, new Drawable[]{mutate, mutate});
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
    }

    @C3500a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C3443j jVar, boolean z10) {
        jVar.setDisableFullscreenUI(z10);
    }

    @C3500a(defaultBoolean = true, name = "editable")
    public void setEditable(C3443j jVar, boolean z10) {
        jVar.setEnabled(z10);
    }

    @C3500a(name = "fontFamily")
    public void setFontFamily(C3443j jVar, String str) {
        jVar.setFontFamily(str);
    }

    @C3500a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C3443j jVar, float f10) {
        jVar.setFontSize(f10);
    }

    @C3500a(name = "fontStyle")
    public void setFontStyle(C3443j jVar, String str) {
        jVar.setFontStyle(str);
    }

    @C3500a(name = "fontVariant")
    public void setFontVariant(C3443j jVar, ReadableArray readableArray) {
        jVar.setFontFeatureSettings(com.facebook.react.views.text.m.c(readableArray));
    }

    @C3500a(name = "fontWeight")
    public void setFontWeight(C3443j jVar, String str) {
        jVar.setFontWeight(str);
    }

    @C3500a(name = "importantForAutofill")
    public void setImportantForAutofill(C3443j jVar, String str) {
        int i10;
        if ("no".equals(str)) {
            i10 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i10 = 8;
        } else if ("yes".equals(str)) {
            i10 = 1;
        } else {
            i10 = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(jVar, i10);
    }

    @C3500a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C3443j jVar, boolean z10) {
        jVar.setIncludeFontPadding(z10);
    }

    @C3500a(name = "inlineImageLeft")
    public void setInlineImageLeft(C3443j jVar, String str) {
        jVar.setCompoundDrawablesWithIntrinsicBounds(q8.c.d().f(jVar.getContext(), str), 0, 0, 0);
    }

    @C3500a(name = "inlineImagePadding")
    public void setInlineImagePadding(C3443j jVar, int i10) {
        jVar.setCompoundDrawablePadding(i10);
    }

    @C3500a(name = "keyboardType")
    public void setKeyboardType(C3443j jVar, String str) {
        int i10;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i10 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                jVar.setCursorVisible(false);
            }
            i10 = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i10 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i10 = 144;
        } else if (KEYBOARD_TYPE_URI.equalsIgnoreCase(str)) {
            i10 = 16;
        } else {
            i10 = 1;
        }
        updateStagedInputTypeFlag(jVar, 15, i10);
        checkPasswordType(jVar);
    }

    @C3500a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C3443j jVar, float f10) {
        jVar.setLetterSpacingPt(f10);
    }

    @C3500a(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(C3443j jVar, int i10) {
        jVar.setLineHeight(i10);
    }

    @C3500a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C3443j jVar, float f10) {
        jVar.setMaxFontSizeMultiplier(f10);
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    @e8.C3500a(name = "maxLength")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMaxLength(com.facebook.react.views.textinput.C3443j r7, java.lang.Integer r8) {
        /*
            r6 = this;
            android.text.InputFilter[] r0 = r7.getFilters()
            android.text.InputFilter[] r1 = EMPTY_FILTERS
            r2 = 0
            if (r8 != 0) goto L_0x0034
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0078
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            int r3 = r0.length
        L_0x0012:
            if (r2 >= r3) goto L_0x0020
            r4 = r0[r2]
            boolean r5 = r4 instanceof android.text.InputFilter.LengthFilter
            if (r5 != 0) goto L_0x001d
            r8.add(r4)
        L_0x001d:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0020:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0078
            int r0 = r8.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r8 = r8.toArray(r0)
            r1 = r8
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            goto L_0x0078
        L_0x0034:
            int r1 = r0.length
            r3 = 1
            if (r1 <= 0) goto L_0x006b
            r1 = r2
            r4 = r1
        L_0x003a:
            int r5 = r0.length
            if (r1 >= r5) goto L_0x0052
            r5 = r0[r1]
            boolean r5 = r5 instanceof android.text.InputFilter.LengthFilter
            if (r5 == 0) goto L_0x004f
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            int r5 = r8.intValue()
            r4.<init>(r5)
            r0[r1] = r4
            r4 = r3
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0052:
            if (r4 != 0) goto L_0x0069
            int r1 = r0.length
            int r1 = r1 + r3
            android.text.InputFilter[] r1 = new android.text.InputFilter[r1]
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            int r2 = r0.length
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            int r8 = r8.intValue()
            r3.<init>(r8)
            r0[r2] = r3
            r0 = r1
        L_0x0069:
            r1 = r0
            goto L_0x0078
        L_0x006b:
            android.text.InputFilter[] r1 = new android.text.InputFilter[r3]
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            int r8 = r8.intValue()
            r0.<init>(r8)
            r1[r2] = r0
        L_0x0078:
            r7.setFilters(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setMaxLength(com.facebook.react.views.textinput.j, java.lang.Integer):void");
    }

    @C3500a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C3443j jVar, boolean z10) {
        int i10;
        int i11 = 131072;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 131072;
        }
        if (!z10) {
            i11 = 0;
        }
        updateStagedInputTypeFlag(jVar, i10, i11);
    }

    @C3500a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C3443j jVar, int i10) {
        jVar.setLines(i10);
    }

    @C3500a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C3443j jVar, boolean z10) {
        if (z10) {
            jVar.setContentSizeWatcher(new b(jVar));
        } else {
            jVar.setContentSizeWatcher((C3434a) null);
        }
    }

    @C3500a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C3443j jVar, boolean z10) {
        jVar.setOnKeyPress(z10);
    }

    @C3500a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C3443j jVar, boolean z10) {
        if (z10) {
            jVar.setScrollWatcher(new c(jVar));
        } else {
            jVar.setScrollWatcher((J) null);
        }
    }

    @C3500a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C3443j jVar, boolean z10) {
        if (z10) {
            jVar.setSelectionWatcher(new d(jVar));
        } else {
            jVar.setSelectionWatcher((K) null);
        }
    }

    @C3500a(name = "overflow")
    public void setOverflow(C3443j jVar, String str) {
        jVar.setOverflow(str);
    }

    @C3500a(name = "placeholder")
    public void setPlaceholder(C3443j jVar, String str) {
        jVar.setPlaceholder(str);
    }

    @C3500a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C3443j jVar, Integer num) {
        if (num == null) {
            jVar.setHintTextColor(com.facebook.react.views.text.a.d(jVar.getContext()));
        } else {
            jVar.setHintTextColor(num.intValue());
        }
    }

    @C3500a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C3443j jVar, String str) {
        jVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @C3500a(name = "returnKeyType")
    public void setReturnKeyType(C3443j jVar, String str) {
        jVar.setReturnKeyType(str);
    }

    @C3500a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C3443j jVar, boolean z10) {
        int i10;
        if (z10) {
            i10 = 128;
        } else {
            i10 = 0;
        }
        updateStagedInputTypeFlag(jVar, 144, i10);
        checkPasswordType(jVar);
    }

    @C3500a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C3443j jVar, boolean z10) {
        jVar.setSelectTextOnFocus(z10);
    }

    @C3500a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C3443j jVar, Integer num) {
        if (num == null) {
            jVar.setHighlightColor(com.facebook.react.views.text.a.c(jVar.getContext()));
        } else {
            jVar.setHighlightColor(num.intValue());
        }
    }

    @C3500a(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(C3443j jVar, Integer num) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Drawable mutate = jVar.getTextSelectHandle().mutate();
            Drawable mutate2 = jVar.getTextSelectHandleLeft().mutate();
            Drawable mutate3 = jVar.getTextSelectHandleRight().mutate();
            if (num != null) {
                C2505k0.a();
                BlendModeColorFilter a10 = C2502j0.a(num.intValue(), BlendMode.SRC_IN);
                mutate.setColorFilter(a10);
                mutate2.setColorFilter(a10);
                mutate3.setColorFilter(a10);
            } else {
                mutate.clearColorFilter();
                mutate2.clearColorFilter();
                mutate3.clearColorFilter();
            }
            jVar.setTextSelectHandle(mutate);
            jVar.setTextSelectHandleLeft(mutate2);
            jVar.setTextSelectHandleRight(mutate3);
        } else if (i10 != 28) {
            int i11 = 0;
            while (true) {
                String[] strArr = DRAWABLE_HANDLE_RESOURCES;
                if (i11 < strArr.length) {
                    try {
                        Field declaredField = jVar.getClass().getDeclaredField(strArr[i11]);
                        declaredField.setAccessible(true);
                        int i12 = declaredField.getInt(jVar);
                        if (i12 != 0) {
                            Drawable mutate4 = androidx.core.content.c.getDrawable(jVar.getContext(), i12).mutate();
                            if (num != null) {
                                mutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                            } else {
                                mutate4.clearColorFilter();
                            }
                            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                            declaredField2.setAccessible(true);
                            Object obj = declaredField2.get(jVar);
                            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i11]);
                            declaredField3.setAccessible(true);
                            declaredField3.set(obj, mutate4);
                            i11++;
                        } else {
                            return;
                        }
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    @C3500a(name = "submitBehavior")
    public void setSubmitBehavior(C3443j jVar, String str) {
        jVar.setSubmitBehavior(str);
    }

    @C3500a(name = "textAlign")
    public void setTextAlign(C3443j jVar, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                jVar.setJustificationMode(1);
            }
            jVar.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            jVar.setJustificationMode(0);
        }
        if (str == null || "auto".equals(str)) {
            jVar.setGravityHorizontal(0);
        } else if (BlockAlignment.LEFT.equals(str)) {
            jVar.setGravityHorizontal(3);
        } else if (BlockAlignment.RIGHT.equals(str)) {
            jVar.setGravityHorizontal(5);
        } else if ("center".equals(str)) {
            jVar.setGravityHorizontal(1);
        } else {
            U5.a.I("ReactNative", "Invalid textAlign: " + str);
            jVar.setGravityHorizontal(0);
        }
    }

    @C3500a(name = "textAlignVertical")
    public void setTextAlignVertical(C3443j jVar, String str) {
        if (str == null || "auto".equals(str)) {
            jVar.setGravityVertical(0);
        } else if (VerticalAlignment.TOP.equals(str)) {
            jVar.setGravityVertical(48);
        } else if (VerticalAlignment.BOTTOM.equals(str)) {
            jVar.setGravityVertical(80);
        } else if ("center".equals(str)) {
            jVar.setGravityVertical(16);
        } else {
            U5.a.I("ReactNative", "Invalid textAlignVertical: " + str);
            jVar.setGravityVertical(0);
        }
    }

    @C3500a(name = "autoComplete")
    public void setTextContentType(C3443j jVar, String str) {
        if (str == null) {
            setImportantForAutofill(jVar, 2);
        } else if ("off".equals(str)) {
            setImportantForAutofill(jVar, 2);
        } else {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(jVar, map.get(str));
                return;
            }
            U5.a.I("ReactNative", "Invalid autoComplete: " + str);
            setImportantForAutofill(jVar, 2);
        }
    }

    @C3500a(name = "textDecorationLine")
    public void setTextDecorationLine(C3443j jVar, String str) {
        jVar.setPaintFlags(jVar.getPaintFlags() & -25);
        if (str != null) {
            for (String str2 : str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                if (str2.equals("underline")) {
                    jVar.setPaintFlags(jVar.getPaintFlags() | 8);
                } else if (str2.equals("line-through")) {
                    jVar.setPaintFlags(jVar.getPaintFlags() | 16);
                }
            }
        }
    }

    @C3500a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C3443j jVar, Integer num) {
        Drawable background = jVar.getBackground();
        if (background != null) {
            if (background.getConstantState() != null) {
                try {
                    background = background.mutate();
                } catch (NullPointerException e10) {
                    U5.a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
                }
            }
            if (num == null) {
                background.clearColorFilter();
            } else {
                background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @C3500a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C3443j jVar, boolean z10) {
        jVar.setShowSoftInputOnFocus(z10);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, C3443j jVar) {
        jVar.setEventDispatcher(getEventDispatcher(h0Var, jVar));
        jVar.addTextChangedListener(new e(h0Var, jVar));
        jVar.setOnFocusChangeListener(new E(h0Var, jVar));
        jVar.setOnEditorActionListener(new F(jVar, h0Var));
    }

    public com.facebook.react.views.text.c createShadowNodeInstance() {
        return new H();
    }

    public C3443j createViewInstance(C3415h0 h0Var) {
        C3443j jVar = new C3443j(h0Var);
        jVar.setInputType(jVar.getInputType() & -131073);
        jVar.setReturnKeyType("done");
        jVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return jVar;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3443j jVar) {
        super.onAfterUpdateTransaction(jVar);
        jVar.P();
        jVar.x();
    }

    public void setPadding(C3443j jVar, int i10, int i11, int i12, int i13) {
        jVar.setPadding(i10, i11, i12, i13);
    }

    public void updateExtraData(C3443j jVar, Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            int f10 = (int) gVar.f();
            int h10 = (int) gVar.h();
            int g10 = (int) gVar.g();
            int e10 = (int) gVar.e();
            int i10 = -1;
            if (!(f10 == -1 && h10 == -1 && g10 == -1 && e10 == -1)) {
                if (f10 == -1) {
                    f10 = jVar.getPaddingLeft();
                }
                if (h10 == -1) {
                    h10 = jVar.getPaddingTop();
                }
                if (g10 == -1) {
                    g10 = jVar.getPaddingRight();
                }
                if (e10 == -1) {
                    e10 = jVar.getPaddingBottom();
                }
                jVar.setPadding(f10, h10, g10, e10);
            }
            if (gVar.b()) {
                q.g(gVar.i(), jVar);
            }
            int i11 = 0;
            if (jVar.getSelectionStart() == jVar.getSelectionEnd()) {
                if (jVar.getText() != null) {
                    i11 = jVar.getText().length();
                }
                i10 = gVar.i().length() - (i11 - jVar.getSelectionStart());
            }
            jVar.O(gVar);
            jVar.L(gVar.c(), i10, i10);
        }
    }

    public Object updateState(C3443j jVar, W w10, C3413g0 g0Var) {
        if (C3443j.f42275k0) {
            String str = TAG;
            U5.a.m(str, "updateState: [" + jVar.getId() + "]");
        }
        if (jVar.getStateWrapper() == null) {
            jVar.setPadding(0, 0, 0, 0);
        }
        jVar.setStateWrapper(g0Var);
        ReadableMapBuffer stateDataMapBuffer = g0Var.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(jVar, w10, stateDataMapBuffer);
        }
        return null;
    }

    public com.facebook.react.views.text.c createShadowNodeInstance(l lVar) {
        return new H(lVar);
    }

    public void receiveCommand(C3443j jVar, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            receiveCommand(jVar, "focus", readableArray);
        } else if (i10 == 2) {
            receiveCommand(jVar, "blur", readableArray);
        } else if (i10 == 4) {
            receiveCommand(jVar, "setTextAndSelection", readableArray);
        }
    }

    public Object getReactTextUpdate(C3443j jVar, W w10, com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar.getCount() == 0) {
            return null;
        }
        int i10 = 0;
        com.facebook.react.common.mapbuffer.a F10 = aVar.F(0);
        com.facebook.react.common.mapbuffer.a F11 = aVar.F(1);
        Spannable g10 = com.facebook.react.views.text.q.g(jVar.getContext(), F10, (l) null);
        int m10 = o.m(F11.getString(2));
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = jVar.getJustificationMode();
        }
        return g.a(g10, aVar.getInt(3), o.l(w10, com.facebook.react.views.text.q.l(F10), jVar.getGravityHorizontal()), m10, o.h(w10, i10));
    }

    private void setImportantForAutofill(C3443j jVar, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            jVar.setImportantForAutofill(i10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveCommand(com.facebook.react.views.textinput.C3443j r7, java.lang.String r8, com.facebook.react.bridge.ReadableArray r9) {
        /*
            r6 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r8.hashCode()
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case -1699362314: goto L_0x003d;
                case 3027047: goto L_0x0032;
                case 97604824: goto L_0x0027;
                case 1427010500: goto L_0x001c;
                case 1690703013: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r8 = r4
            goto L_0x0047
        L_0x0011:
            java.lang.String r5 = "focusTextInput"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r8 = 4
            goto L_0x0047
        L_0x001c:
            java.lang.String r5 = "setTextAndSelection"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            r8 = r0
            goto L_0x0047
        L_0x0027:
            java.lang.String r5 = "focus"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0030
            goto L_0x000f
        L_0x0030:
            r8 = r1
            goto L_0x0047
        L_0x0032:
            java.lang.String r5 = "blur"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x003b
            goto L_0x000f
        L_0x003b:
            r8 = r2
            goto L_0x0047
        L_0x003d:
            java.lang.String r5 = "blurTextInput"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0046
            goto L_0x000f
        L_0x0046:
            r8 = r3
        L_0x0047:
            switch(r8) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0076;
                case 2: goto L_0x0072;
                case 3: goto L_0x004b;
                case 4: goto L_0x0072;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0079
        L_0x004b:
            int r8 = r9.getInt(r3)
            if (r8 != r4) goto L_0x0052
            return
        L_0x0052:
            int r1 = r9.getInt(r1)
            int r0 = r9.getInt(r0)
            if (r0 != r4) goto L_0x005d
            r0 = r1
        L_0x005d:
            boolean r3 = r9.isNull(r2)
            if (r3 != 0) goto L_0x006e
            java.lang.String r9 = r9.getString(r2)
            com.facebook.react.views.text.g r9 = r6.getReactTextUpdate(r9, r8)
            r7.N(r9)
        L_0x006e:
            r7.L(r8, r1, r0)
            goto L_0x0079
        L_0x0072:
            r7.R()
            goto L_0x0079
        L_0x0076:
            r7.w()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.receiveCommand(com.facebook.react.views.textinput.j, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }
}
