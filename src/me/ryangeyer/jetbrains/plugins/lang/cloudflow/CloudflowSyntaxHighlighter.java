/*
 * Copyright (c) 2012 Ryan J. Geyer
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package me.ryangeyer.jetbrains.plugins.lang.cloudflow;

import com.intellij.codeInsight.daemon.impl.HighlightInfoType;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ryangeyer
 * Date: 12/4/12
 * Time: 3:18 PM
 */
public class CloudflowSyntaxHighlighter extends SyntaxHighlighterBase {

  private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

  public static final TokenSet kRESWORDS = TokenSet.create(
    CloudflowTokenTypes.kMAP,
    CloudflowTokenTypes.kCONCURRENT,
    CloudflowTokenTypes.kIN,
    CloudflowTokenTypes.kRETURN,
    CloudflowTokenTypes.kIF,
    CloudflowTokenTypes.kELSE,
    CloudflowTokenTypes.kELSIF,
    CloudflowTokenTypes.kEND,
    CloudflowTokenTypes.kBEGIN,
    CloudflowTokenTypes.kFOREACH,
    CloudflowTokenTypes.kWHILE,
    CloudflowTokenTypes.kCALL,
    CloudflowTokenTypes.kRETRIEVE,
    CloudflowTokenTypes.kDEFINE
  );

  public static final TokenSet kRESOURCESANDVARS = TokenSet.create(
    CloudflowTokenTypes.resCOLLECTION,
    CloudflowTokenTypes.resGLOBALCOLLECTION,
    CloudflowTokenTypes.tVAR,
    CloudflowTokenTypes.tGLOBALVAR
  );

  static {
    SyntaxHighlighterBase.fillMap(ATTRIBUTES, kRESWORDS,
      TextAttributesKey.createTextAttributesKey("keywords",
        SyntaxHighlighterColors.KEYWORD.getDefaultAttributes()
      )
    );
    SyntaxHighlighterBase.fillMap(ATTRIBUTES, TokenSet.create(CloudflowTokenTypes.tSTRING),
      TextAttributesKey.createTextAttributesKey("string",
        SyntaxHighlighterColors.STRING.getDefaultAttributes()
      )
    );
    SyntaxHighlighterBase.fillMap(ATTRIBUTES, kRESOURCESANDVARS,
      TextAttributesKey.createTextAttributesKey("resourcesAndVars",
        HighlightInfoType.INSTANCE_FIELD.getAttributesKey().getDefaultAttributes()
      )
    );
  }

  @NotNull
  public Lexer getHighlightingLexer() {
    return new CloudflowHighlightingLexer();
  }

  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    return pack(ATTRIBUTES.get(tokenType));
  }
}
