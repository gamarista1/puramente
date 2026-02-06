package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.FontUtils;

public class IntercomErrorView extends RelativeLayout {
    private Button actionButton;
    private TextView subtitle;
    private TextView titleView;

    public IntercomErrorView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.empty_text_title);
        this.titleView = textView;
        FontUtils.setRobotoMediumTypeface(textView);
        this.subtitle = (TextView) findViewById(R.id.empty_text_subtitle);
        this.actionButton = (Button) findViewById(R.id.action_button);
    }

    public void setActionButtonClickListener(View.OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    public void setActionButtonText(int i10) {
        this.actionButton.setText(i10);
    }

    public void setActionButtonTextColor(int i10) {
        this.actionButton.setTextColor(i10);
    }

    public void setActionButtonVisibility(int i10) {
        this.actionButton.setVisibility(i10);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
    }

    public void setTitle(int i10) {
        this.titleView.setText(i10);
    }

    public IntercomErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSubtitle(int i10) {
        this.subtitle.setText(i10);
    }
}
