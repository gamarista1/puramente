package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

class l extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private C3443j f42315a;

    /* renamed from: b  reason: collision with root package name */
    private EventDispatcher f42316b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f42317c;

    /* renamed from: d  reason: collision with root package name */
    private String f42318d = null;

    public l(InputConnection inputConnection, ReactContext reactContext, C3443j jVar, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.f42316b = eventDispatcher;
        this.f42315a = jVar;
    }

    private void b(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f42316b.h(new q(this.f42315a.getId(), str));
    }

    private void c(String str) {
        if (this.f42317c) {
            this.f42318d = str;
        } else {
            b(str);
        }
    }

    public boolean beginBatchEdit() {
        this.f42317c = true;
        return super.beginBatchEdit();
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            c(charSequence2);
        }
        return super.commitText(charSequence, i10);
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        b("Backspace");
        return super.deleteSurroundingText(i10, i11);
    }

    public boolean endBatchEdit() {
        this.f42317c = false;
        String str = this.f42318d;
        if (str != null) {
            b(str);
            this.f42318d = null;
        }
        return super.endBatchEdit();
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getUnicodeChar() >= 58 || keyEvent.getUnicodeChar() <= 47) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (keyEvent.getKeyCode() == 67) {
                b("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                b("Enter");
            } else if (z10) {
                b(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10;
        String str;
        int selectionStart = this.f42315a.getSelectionStart();
        int selectionEnd = this.f42315a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i10);
        int selectionStart2 = this.f42315a.getSelectionStart();
        boolean z11 = false;
        if (selectionStart == selectionEnd) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (selectionStart2 == selectionStart) {
            z11 = true;
        }
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!z10 && z11)) {
            str = "Backspace";
        } else {
            str = String.valueOf(this.f42315a.getText().charAt(selectionStart2 - 1));
        }
        c(str);
        return composingText;
    }
}
