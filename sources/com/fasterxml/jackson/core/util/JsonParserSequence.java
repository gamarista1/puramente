package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

public class JsonParserSequence extends JsonParserDelegate {
    protected final boolean _checkForExistingToken;
    protected boolean _hasToken;
    protected int _nextParserIndex;
    protected final JsonParser[] _parsers;

    @Deprecated
    protected JsonParserSequence(JsonParser[] jsonParserArr) {
        this(false, jsonParserArr);
    }

    public static JsonParserSequence createFlattened(boolean z10, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z11 = jsonParser instanceof JsonParserSequence;
        if (!z11 && !(jsonParser2 instanceof JsonParserSequence)) {
            return new JsonParserSequence(z10, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof JsonParserSequence) {
            ((JsonParserSequence) jsonParser2).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new JsonParserSequence(z10, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    /* access modifiers changed from: protected */
    public void addFlattenedActiveParsers(List<JsonParser> list) {
        int length = this._parsers.length;
        for (int i10 = this._nextParserIndex - 1; i10 < length; i10++) {
            JsonParser jsonParser = this._parsers[i10];
            if (jsonParser instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public void close() {
        do {
            this.delegate.close();
        } while (switchToNext());
    }

    public int containedParsersCount() {
        return this._parsers.length;
    }

    public JsonToken nextToken() {
        JsonParser jsonParser = this.delegate;
        if (jsonParser == null) {
            return null;
        }
        if (this._hasToken) {
            this._hasToken = false;
            return jsonParser.currentToken();
        }
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken == null) {
            return switchAndReturnNext();
        }
        return nextToken;
    }

    /* access modifiers changed from: protected */
    public JsonToken switchAndReturnNext() {
        JsonToken nextToken;
        do {
            int i10 = this._nextParserIndex;
            JsonParser[] jsonParserArr = this._parsers;
            if (i10 >= jsonParserArr.length) {
                return null;
            }
            this._nextParserIndex = i10 + 1;
            JsonParser jsonParser = jsonParserArr[i10];
            this.delegate = jsonParser;
            if (this._checkForExistingToken && jsonParser.hasCurrentToken()) {
                return this.delegate.getCurrentToken();
            }
            nextToken = this.delegate.nextToken();
        } while (nextToken == null);
        return nextToken;
    }

    /* access modifiers changed from: protected */
    public boolean switchToNext() {
        int i10 = this._nextParserIndex;
        JsonParser[] jsonParserArr = this._parsers;
        if (i10 >= jsonParserArr.length) {
            return false;
        }
        this._nextParserIndex = i10 + 1;
        this.delegate = jsonParserArr[i10];
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected JsonParserSequence(boolean z10, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z11 = false;
        this._checkForExistingToken = z10;
        if (z10 && this.delegate.hasCurrentToken()) {
            z11 = true;
        }
        this._hasToken = z11;
        this._parsers = jsonParserArr;
        this._nextParserIndex = 1;
    }

    @Deprecated
    public static JsonParserSequence createFlattened(JsonParser jsonParser, JsonParser jsonParser2) {
        return createFlattened(false, jsonParser, jsonParser2);
    }
}
