package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    private static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        /* access modifiers changed from: package-private */
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        /* access modifiers changed from: package-private */
        public int getFormattedLength() {
            return this.value.length();
        }
    }

    private static class LeftCurlyBracketToken extends Token {
        LeftCurlyBracketToken(Token token) {
            super(token);
        }

        /* access modifiers changed from: package-private */
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        /* access modifiers changed from: package-private */
        public int getFormattedLength() {
            return 1;
        }
    }

    private static class TextToken extends Token {
        private final int textLength;

        TextToken(Token token, int i10) {
            super(token);
            this.textLength = i10;
        }

        /* access modifiers changed from: package-private */
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }

        /* access modifiers changed from: package-private */
        public int getFormattedLength() {
            return this.textLength;
        }
    }

    private static abstract class Token {
        Token next;
        private final Token prev;

        protected Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        /* access modifiers changed from: package-private */
        public abstract int getFormattedLength();

        /* access modifiers changed from: package-private */
        public final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private void consume() {
        char c10;
        int i10 = this.curCharIndex + 1;
        this.curCharIndex = i10;
        if (i10 == this.pattern.length()) {
            c10 = 0;
        } else {
            c10 = this.pattern.charAt(this.curCharIndex);
        }
        this.curChar = c10;
    }

    public static Phrase from(Fragment fragment, int i10) {
        return from(fragment.getResources(), i10);
    }

    private KeyToken key(Token token) {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        consume();
        while (true) {
            c10 = this.curChar;
            if ((c10 >= 'a' && c10 <= 'z') || ((c10 >= 'A' && c10 <= 'Z') || c10 == '_' || (c10 >= '0' && c10 <= '9'))) {
                sb2.append(c10);
                consume();
            }
        }
        if (c10 == '}') {
            consume();
            if (sb2.length() != 0) {
                String sb3 = sb2.toString();
                this.keys.add(sb3);
                return new KeyToken(token, sb3);
            }
            throw new IllegalArgumentException("Empty key: {} in '" + this.pattern + "'");
        }
        throw new IllegalArgumentException("Missing closing brace: } in '" + this.pattern + "'");
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return 0;
    }

    private TextToken text(Token token) {
        int i10 = this.curCharIndex;
        while (true) {
            char c10 = this.curChar;
            if (c10 != '{' && c10 != 0) {
                consume();
            }
        }
        return new TextToken(token, this.curCharIndex - i10);
    }

    private Token token(Token token) {
        char c10 = this.curChar;
        if (c10 == 0) {
            return null;
        }
        if (c10 != '{') {
            return text(token);
        }
        char lookahead = lookahead();
        if (lookahead == '{') {
            return leftCurlyBracket(token);
        }
        if (lookahead >= 'a' && lookahead <= 'z') {
            return key(token);
        }
        throw new IllegalArgumentException("Unexpected character '" + lookahead + "'; expected key in '" + this.pattern + "'");
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (this.keysToValues.keySet().containsAll(this.keys)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
                for (Token token = this.head; token != null; token = token.next) {
                    token.expand(spannableStringBuilder, this.keysToValues);
                }
                this.formatted = spannableStringBuilder;
            } else {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                throw new IllegalArgumentException("Missing keys: " + hashSet + " in '" + this.pattern + "'");
            }
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView != null) {
            textView.setText(format());
            return;
        }
        throw new IllegalArgumentException("TextView must not be null.");
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            throw new IllegalArgumentException("Key '" + str + "' not found in '" + this.pattern + "'");
        } else if (charSequence != null) {
            this.keysToValues.put(str, charSequence);
            this.formatted = null;
            return this;
        } else {
            throw new IllegalArgumentException("Null value for '" + str + "' in '" + this.pattern + "'");
        }
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, int i10) {
        return from(view.getResources(), i10);
    }

    public Phrase putOptional(String str, int i10) {
        return this.keys.contains(str) ? put(str, i10) : this;
    }

    public static Phrase from(Context context, int i10) {
        return from(context.getResources(), i10);
    }

    public static Phrase from(Resources resources, int i10) {
        return from(resources.getText(i10));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase put(String str, int i10) {
        return put(str, (CharSequence) Integer.toString(i10));
    }
}
