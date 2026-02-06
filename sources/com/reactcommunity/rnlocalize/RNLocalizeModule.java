package com.reactcommunity.rnlocalize;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@Q7.a(name = "RNLocalize")
public class RNLocalizeModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String MODULE_NAME = "RNLocalize";
    private final List<String> USES_FAHRENHEIT = Arrays.asList(new String[]{"BS", "BZ", "KY", "PR", "PW", "US"});
    private final List<String> USES_IMPERIAL = Arrays.asList(new String[]{"LR", "MM", "US"});
    private final List<String> USES_RTL_LAYOUT = Arrays.asList(new String[]{"ar", "ckb", "fa", "he", "ks", "lrc", "mzn", "ps", "ug", "ur", "yi"});
    private boolean emitChangeOnResume = false;
    private boolean mainActivityVisible = true;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() != null) {
                RNLocalizeModule.this.onLocalizationDidChange();
            }
        }
    }

    public RNLocalizeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        a aVar = new a();
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.registerReceiver(aVar, intentFilter);
    }

    private String createLanguageTag(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "-" + str2;
        }
        return str + "-" + str3;
    }

    private void emitLocalizationDidChange() {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("localizationDidChange", getExportedConstants());
        }
    }

    private String getCountryCode(Locale locale) {
        try {
            String country = locale.getCountry();
            if (country.equals("419")) {
                return "UN";
            }
            if (TextUtils.isEmpty(country)) {
                return "";
            }
            return country;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getCurrencyCode(Locale locale) {
        try {
            Currency instance = Currency.getInstance(locale);
            if (instance == null) {
                return "";
            }
            return instance.getCurrencyCode();
        } catch (Exception unused) {
            return "";
        }
    }

    private WritableMap getExportedConstants() {
        String str;
        List<Locale> locales = getLocales();
        Locale locale = locales.get(0);
        String regionCode = getRegionCode(locale);
        if (TextUtils.isEmpty(regionCode)) {
            regionCode = "US";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        for (Locale next : locales) {
            String languageCode = getLanguageCode(next);
            String scriptCode = getScriptCode(next);
            String countryCode = getCountryCode(next);
            String currencyCode = getCurrencyCode(next);
            if (TextUtils.isEmpty(countryCode)) {
                countryCode = regionCode;
            }
            String createLanguageTag = createLanguageTag(languageCode, scriptCode, countryCode);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("languageCode", languageCode);
            createMap.putString("countryCode", countryCode);
            createMap.putString("languageTag", createLanguageTag);
            createMap.putBoolean("isRTL", getIsRTL(next));
            if (!TextUtils.isEmpty(scriptCode)) {
                createMap.putString("scriptCode", scriptCode);
            }
            if (!arrayList.contains(createLanguageTag)) {
                arrayList.add(createLanguageTag);
                createArray.pushMap(createMap);
            }
            if (!TextUtils.isEmpty(currencyCode) && !arrayList2.contains(currencyCode)) {
                arrayList2.add(currencyCode);
                createArray2.pushString(currencyCode);
            }
        }
        if (createArray2.size() == 0) {
            createArray2.pushString("USD");
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("calendar", "gregorian");
        createMap2.putString("country", regionCode);
        createMap2.putArray("currencies", createArray2);
        createMap2.putArray("locales", createArray);
        createMap2.putMap("numberFormatSettings", getNumberFormatSettings(locale));
        if (this.USES_FAHRENHEIT.contains(regionCode)) {
            str = "fahrenheit";
        } else {
            str = "celsius";
        }
        createMap2.putString("temperatureUnit", str);
        createMap2.putString("timeZone", TimeZone.getDefault().getID());
        createMap2.putBoolean("uses24HourClock", DateFormat.is24HourFormat(getReactApplicationContext()));
        createMap2.putBoolean("usesAutoDateAndTime", getUsesAutoDateAndTime());
        createMap2.putBoolean("usesAutoTimeZone", getUsesAutoTimeZone());
        createMap2.putBoolean("usesMetricSystem", !this.USES_IMPERIAL.contains(regionCode));
        return createMap2;
    }

    private boolean getIsRTL(Locale locale) {
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            return true;
        }
        return false;
    }

    private String getLanguageCode(Locale locale) {
        String language = locale.getLanguage();
        language.hashCode();
        char c10 = 65535;
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3391:
                if (language.equals("ji")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "id";
            case 1:
                return "he";
            case 2:
                return "yi";
            default:
                return language;
        }
    }

    private List<Locale> getLocales() {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = getReactApplicationContext().getResources().getConfiguration().getLocales();
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(locales.get(i10));
        }
        return arrayList;
    }

    private WritableMap getNumberFormatSettings(Locale locale) {
        WritableMap createMap = Arguments.createMap();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        createMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        createMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        return createMap;
    }

    private String getRegionCode(Locale locale) {
        String systemProperty = getSystemProperty("ro.miui.region");
        if (!TextUtils.isEmpty(systemProperty)) {
            return systemProperty;
        }
        return getCountryCode(locale);
    }

    private String getScriptCode(Locale locale) {
        String script = locale.getScript();
        if (TextUtils.isEmpty(script)) {
            return "";
        }
        return script;
    }

    private String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName(b.at);
            return (String) cls.getMethod(b.au, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean getUsesAutoDateAndTime() {
        if (Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "auto_time", 0) != 0) {
            return true;
        }
        return false;
    }

    private boolean getUsesAutoTimeZone() {
        if (Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "auto_time_zone", 0) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void onLocalizationDidChange() {
        if (this.mainActivityVisible) {
            emitLocalizationDidChange();
        } else {
            this.emitChangeOnResume = true;
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialConstants", getExportedConstants());
        return hashMap;
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mainActivityVisible = false;
    }

    public void onHostResume() {
        this.mainActivityVisible = true;
        if (this.emitChangeOnResume) {
            emitLocalizationDidChange();
            this.emitChangeOnResume = false;
        }
    }
}
