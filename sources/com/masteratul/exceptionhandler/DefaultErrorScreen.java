package com.masteratul.exceptionhandler;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DefaultErrorScreen extends Activity {

    /* renamed from: e  reason: collision with root package name */
    private static String f59152e = "RN_ERROR_HANDLER";

    /* renamed from: a  reason: collision with root package name */
    private Button f59153a;

    /* renamed from: b  reason: collision with root package name */
    private Button f59154b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Button f59155c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TextView f59156d;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (DefaultErrorScreen.this.f59156d.getVisibility() == 0) {
                DefaultErrorScreen.this.f59156d.setVisibility(8);
                DefaultErrorScreen.this.f59155c.setText("SHOW DETAILS");
                return;
            }
            DefaultErrorScreen.this.f59156d.setVisibility(0);
            DefaultErrorScreen.this.f59155c.setText("HIDE DETAILS");
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            DefaultErrorScreen.c(DefaultErrorScreen.this.getApplicationContext());
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            System.exit(0);
        }
    }

    public static void c(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(67108864);
                        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(context, 654311, launchIntentForPackage, 268435456));
                        System.exit(0);
                        return;
                    }
                    throw new Exception("Was not able to restart application, mStartActivity null");
                }
                throw new Exception("Was not able to restart application, PM null");
            } catch (Exception unused) {
                Log.e(f59152e, "Was not able to restart application");
            }
        } else {
            throw new Exception("Was not able to restart application, Context null");
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            str = getIntent().getExtras().getString("stack_trace_string");
        } catch (Exception e10) {
            Log.e(f59152e, String.format("Was not able to get StackTrace: %s", new Object[]{e10.getMessage()}));
            str = "StackTrace unavailable";
        }
        setContentView(c.f59167a);
        this.f59153a = (Button) findViewById(b.f59163a);
        this.f59154b = (Button) findViewById(b.f59164b);
        this.f59155c = (Button) findViewById(b.f59165c);
        TextView textView = (TextView) findViewById(b.f59166d);
        this.f59156d = textView;
        textView.setText(str);
        this.f59155c.setOnClickListener(new a());
        this.f59154b.setOnClickListener(new b());
        this.f59153a.setOnClickListener(new c());
    }
}
