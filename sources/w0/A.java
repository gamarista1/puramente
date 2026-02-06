package W0;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import yf.C6798l;

abstract class A implements C1457z {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f8480a;

    /* renamed from: b  reason: collision with root package name */
    private InputConnection f8481b;

    public A(InputConnection inputConnection, C6798l lVar) {
        this.f8480a = lVar;
        this.f8481b = inputConnection;
    }

    public final void a() {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f8481b = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(InputConnection inputConnection);

    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final InputConnection c() {
        return this.f8481b;
    }

    public boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    public final void closeConnection() {
        if (this.f8481b != null) {
            a();
            this.f8480a.invoke(this);
        }
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    public boolean finishComposingText() {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    public int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    public boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    public boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    public boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    public boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f8481b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
