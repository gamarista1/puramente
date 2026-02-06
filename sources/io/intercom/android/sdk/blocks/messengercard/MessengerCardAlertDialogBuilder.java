package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.c;
import androidx.core.view.C1680b0;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

class MessengerCardAlertDialogBuilder extends c.a {
    MessengerCardAlertDialogBuilder(Context context, Map<String, Object> map, int i10, WebView webView) {
        super(context);
        setUp(context, map, i10, webView);
    }

    private void setUp(Context context, final Map<String, Object> map, int i10, final WebView webView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.intercom_webview_card_input, (ViewGroup) null, false);
        setTitle((CharSequence) map.get("label"));
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(R.id.input);
        autoCompleteTextView.setText((CharSequence) map.get("currentValue"));
        autoCompleteTextView.setHint((CharSequence) map.get("placeholder"));
        C1680b0.t0(autoCompleteTextView, ColorStateList.valueOf(i10));
        setView(inflate);
        setPositiveButton(17039370, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                MessengerCardAlertDialogBuilder.this.sendResultToWebview(webView, autoCompleteTextView.getText().toString(), map);
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.dismiss();
            }
        });
        setNegativeButton(17039360, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.cancel();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void sendResultToWebview(WebView webView, String str, Map<String, Object> map) {
        String str2;
        try {
            str2 = URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            str2 = "";
        }
        webView.evaluateJavascript("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'" + str2 + "', id:'" + map.get("id") + "'})", (ValueCallback) null);
    }
}
